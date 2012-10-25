/*
 * @(#)TreeNodeTest.java  2012-8-1	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.test;

import java.util.Iterator;

import com.jiuqi.dna.core.TreeNode;
import com.jiuqi.report.data.TreeNodeImpl;


/**
 * <p>Title:</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-8-1
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */
public class TreeNodeTest {

	public void test() {
		
	}
	/**
	 * Test DataRecursiveIterator
	 * 
	 * <pre>
	 *  root
	 *      d1
	 *          f11
	 *          f12
	 *          f13
	 *      d2
	 *          d21
	 *              f211
	 *          f21
	 *          f22
	 *      d3
	 *          f31
	 *          d31
	 *              f311
	 *              d311
	 *                  f3111
	 * </pre>
	 */
	public static void main(String[] args) {
		TreeNode<String> root =TreeNodeImpl.helper.newRootNode(null);
		TreeNode<String> node = root.append("root");
		node = node.append("d1");
		node.append("f11");
		node.append("f12");
		node.append("f13");
		node = node.getParent();
		node = node.append("d2");
		node = node.append("d21");
		node.append("f211");
		node = node.getParent();
		node.append("f21");
		node.append("f22");
		node = node.getParent();
		node = node.append("d3");
		node.append("f31");
		node = node.append("d31");
		node.append("f311");
		node = node.append("d311");
		node.append("f3111");

		Iterator<String> i = root.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
