/*
 * @(#)RangeNodeTest.java  2012-8-23	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.test;

import java.util.Iterator;

import com.jiuqi.dna.core.TreeNode;
import com.jiuqi.report.data.TreeNodeImpl;

import junit.framework.TestCase;

/**
 * <p>Title:</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-8-23
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */
public class RangeNodeTest extends TestCase{
	private static  TreeNode<StringBuilder> root;
	public RangeNodeTest(){
		root = createRangeTree();
	}
	

	
	public TreeNode<StringBuilder> createRangeTree(){
		TreeNode<StringBuilder> root =TreeNodeImpl.helper.newRootNode(null);
		root.append(new StringBuilder("root"));
		return root;
	}
	

	
	public void testInsertRow(){
		TreeNode<StringBuilder> child = root.getChild(0);
		child.append(new StringBuilder("1,2"));
		child.append(new StringBuilder("3,4"));
		child.append(new StringBuilder("5,6"));
		System.out.println("insert Row");
		traverse();
	}
	public void testDeleteRow(){
		TreeNode<StringBuilder> child = root.getChild(0);
		
		child.remove(2);
		System.out.println("delete Row");
		traverse();
	}
	
	public void testInsertCol(){
		Iterator<StringBuilder> i = root.iterator();
		while (i.hasNext()) {
			i.next().append(new StringBuilder(",0"));
		}
		
		System.out.println("insert column");
		traverse();
	}
	
	public void testDeleteCol(){
//		Iterator<StringBuilder> i = root.iterator();
//		while (i.hasNext()) {
//			StringBuilder next = i.next();
//		}
//		
//		System.out.println("delete column");
//		traverse();
	}
	
	
	
	
	public void traverse(){
		Iterator<StringBuilder> i = root.iterator();
		while (i.hasNext()) {
			StringBuilder next = i.next();
			System.out.println(next);
		}
	}

}
