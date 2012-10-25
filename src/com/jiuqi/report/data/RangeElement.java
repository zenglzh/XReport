/*
 * @(#)RangeElement.java  2012-8-1	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.data;

import java.util.List;

/**
 * <p>Title:</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-8-1
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */
public interface RangeElement<E> {
	
	
//	private int x;
//	private int y;
//	private int widght;
//	private int height;
	
	
	public int count();
	
	public List<E> getElements();
	
	
	public E getElement(int index) throws IndexOutOfBoundsException;
	
	
	

}
