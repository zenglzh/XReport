/*
 * @(#)RangeSetImpl.java  2012-8-1	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.impl;

import java.util.Iterator;

import com.jiuqi.dna.core.ReadOnlyTreeNode;
import com.jiuqi.dna.core.TreeNode;
import com.jiuqi.report.Range;
import com.jiuqi.report.RangeSet;

/**
 * <p>Title:</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-8-1
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */
public class RangeSetImpl implements RangeSet {

	
	
	@Override
	public TreeNode<Range> getChild(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TreeNode<Range> getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setElement(Range data) {
		// TODO Auto-generated method stub

	}

	@Override
	public TreeNode<Range> append(Range data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TreeNode<Range> remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public Range getElement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getChildCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int indexOf(ReadOnlyTreeNode<Range> node) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isLeaf() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<Range> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
