package com.jiuqi.report.data;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

import com.jiuqi.dna.core.ReadOnlyTreeNode;
import com.jiuqi.dna.core.TreeNode;
import com.jiuqi.dna.core.TreeNodeFilter;
import com.jiuqi.dna.core.TreeNodeFilter.Acception;
import com.jiuqi.dna.core.def.obja.StructClass;
import com.jiuqi.dna.core.misc.SortUtil;
import com.jiuqi.report.common.utils.ITreeNode;

@StructClass
public class TreeNodeImpl<TData> implements ITreeNode<TData> {
	public final static Helper helper = new Helper() {
		public <E> ITreeNode<E> newRootNode(E e) {
			return new TreeNodeImpl<E>(null, e);
		}
	};
	private TData data;
	private TreeNodeImpl<TData>[] children;
	private int childrenCount;
	private final TreeNodeImpl<TData> parent;
	private final static TreeNodeImpl[] emptyNodeArray = {};

	final boolean isEmpty() {
		return this.data == null && this.childrenCount == 0;
	}

	TreeNodeImpl(TreeNodeImpl<TData> parent, TData data) {
		this.parent = parent;
		this.data = data;
		this.children = emptyNodeArray;
	}

	final void appendChild(TreeNodeImpl<TData> child) {
		if (this.indexOf(child) >= 0) {
			throw new IllegalArgumentException("子结点已经存在");
		}
		this.ensureCapacity(this.childrenCount + 1);
		this.children[this.childrenCount++] = child;
	}

	public final void clear() {
		this.childrenCount = 0;
		this.children = emptyNodeArray;
	}

	public final TreeNodeImpl<TData> append(TData data) {
		this.ensureCapacity(this.childrenCount + 1);
		TreeNodeImpl<TData> treeNode = new TreeNodeImpl<TData>(this, data);
		this.children[this.childrenCount++] = treeNode;
		return treeNode;
	}

	public final TreeNodeImpl<TData> getParent() {
		return this.parent;
	}

	public final TreeNodeImpl<TData> remove(int index) {
		if (index < 0 || this.childrenCount <= index) {
			return null;
		}
		TreeNodeImpl<TData> oldValue = this.children[index];
		int numMoved = this.childrenCount - index - 1;
		if (numMoved > 0) {
			System.arraycopy(this.children, index + 1, this.children, index,
					numMoved);
		}
		this.children[--this.childrenCount] = null;
		return oldValue;
	}

	public final void setElement(TData data) {
		this.data = data;
	}

	public final TreeNodeImpl<TData> getChild(int index)
			throws IndexOutOfBoundsException {
		this.rangeCheck(index);
		return this.children[index];
	}

	public final int getChildCount() {
		return this.childrenCount;
	}

	public final TData getElement() {
		return this.data;
	}

	public final int indexOf(ReadOnlyTreeNode<TData> node) {
		if (node != null) {
			for (int i = 0; i < this.childrenCount; i++) {
				if (node == this.children[i]) {
					return i;
				}
			}
		}
		return -1;
	}

	public final boolean isLeaf() {
		return this.childrenCount == 0;
	}

	// 遍历整棵树，深度优先
	@SuppressWarnings("unchecked")
	public final Iterator<TData> iterator() {
		return this.isEmpty() ? EMPTY : new DataRecursiveIterator();
	}

	// 遍历整棵树，深度优先
	private class DataRecursiveIterator implements Iterator<TData> {
		private TreeNodeImpl<TData> current;
		private IntArrayStack indexInParent;

		DataRecursiveIterator() {
			TreeNodeImpl<TData> node = TreeNodeImpl.this;
			if (node.parent == null && node.data == null) {
				if (node.childrenCount > 0) {
					this.indexInParent = new IntArrayStack(5);
					this.current = node.children[0];
					this.indexInParent.push(0);
				}
			} else {
				this.current = node;
				if (node.childrenCount > 0) {
					this.indexInParent = new IntArrayStack(5);
				}
			}
		}

		public boolean hasNext() {
			return this.current != null;
		}

		public TData next() {
			if (this.current == null) {
				throw new NoSuchElementException();
			}
			TData result = this.current.data;
			TreeNodeImpl<TData> parent = this.current.parent;
			if (this.current.childrenCount > 0) { // has child/children
				this.current = this.current.children[0];
				this.indexInParent.push(0);
			} else { // no child
				do {
					// 如果是从根结点遍历的，第一个条件会生效，否则第二个生效
					if (parent == null || this.current == TreeNodeImpl.this) {
						this.current = null;
						this.indexInParent = null;
						break;
					} else {
						int index = this.indexInParent.pop();
						if (index == parent.childrenCount - 1) {
							this.current = parent;
							parent = parent.parent;
						} else {
							this.current = parent.children[++index];
							this.indexInParent.push(index);
							break;
						}
					}
				} while (true);
			}
			return result;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}
	}


	private  final Iterator<TData>  EMPTY = new Iterator<TData> () {
		public boolean hasNext() {
			return false;
		}

		public TData next() {
			throw new NoSuchElementException();
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}
	};

	private final void ensureCapacity(int minCapacity) {
		int oldCapacity = this.children.length;
		if (minCapacity > oldCapacity) {
			int newCapacity = (oldCapacity * 3) / 2 + 1;
			if (newCapacity < minCapacity) {
				newCapacity = minCapacity;
			}
			TreeNodeImpl<TData>[] newData = new TreeNodeImpl[newCapacity];
			System.arraycopy(this.children, 0, newData, 0, this.childrenCount);
			this.children = newData;
		}
	}

	private final void rangeCheck(int index) {
		if (index < 0 || this.childrenCount <= index) {
			throw new IndexOutOfBoundsException("Index:" + index
					+ "childrenCount:" + this.childrenCount);
		}
	}

	final void sortChildren(final Comparator<? super TData> sortComparator) {
		if (sortComparator != null && this.childrenCount > 0) {
			SortUtil.sort(this.children, 0, this.childrenCount,
					new Comparator<TreeNodeImpl<TData>>() {
						public int compare(TreeNodeImpl<TData> a,
								TreeNodeImpl<TData> b) {
							return sortComparator.compare(a.data, b.data);
						}
					});
		}
	}

	final void filterAndSortRecursively(TreeNodeFilter<? super TData> filter,
			int absoluteLevel, int relativeLevel,
			Comparator<? super TData> sortComparator) {
		this.recursivelyFilterAndSort(filter, absoluteLevel, relativeLevel,
				sortComparator);
	}

	/**
	 * @return 是否从父节点中删除本节点
	 */
	private boolean recursivelyFilterAndSort(
			TreeNodeFilter<? super TData> filter, int absoluteLevel,
			int relativeLevel, Comparator<? super TData> sortComparator) {
		if (filter != null) {
			if (this.parent != null || this.data != null) {
				Acception acc = filter.accept(this.data, absoluteLevel,
						relativeLevel);
				if (acc == null) {
					this.data = null;
					this.clear();
					return true;
				} else if (acc == Acception.NO_CHILDREN) {
					this.clear();
					return false;
				} else if (acc != Acception.ALL) {
					throw new IllegalStateException("unknown acception");
				}
			}
		}
		if (this.childrenCount > 0) {
			absoluteLevel++;
			relativeLevel++;
			for (int i = this.childrenCount - 1; i >= 0; i--) {
				if (this.children[i].recursivelyFilterAndSort(filter,
						absoluteLevel, relativeLevel, sortComparator)) {
					this.remove(i);
				}
			}
		}
		if (sortComparator != null) {
			this.sortChildren(sortComparator);
		}
		return false;
	}

	
	//TODO not-test method should throw exception 
	@Override
	public TreeNode<TData> add(int index, TData Data) {
		this.ensureCapacity(this.childrenCount + 1);
		for (int i = childrenCount; i > index; i--) {
			this.children[i] = this.children[i-1];
		}
		TreeNodeImpl<TData> treeNode = new TreeNodeImpl<TData>(this, data);
		this.children[index] = treeNode;
		return treeNode;
	}
	
	
	@Override
	public TreeNode<TData>[] getChildrens() {
		return this.children;
	}
}




