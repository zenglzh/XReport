/*
 * @(#)Cell.java  2012-7-13	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report;



/**
 * <p>Title:��Ԫ��</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-7-13
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */
public interface Cell {
	  /**
	   * ���ص�Ԫ����к�
	   * @return the row number of this cell
	   */
	  public int getRow();

	  /**
	   * ���ص�Ԫ����к�
	   * @return the column number of this cell
	   */
	  public int getColumn();
	  
	  
	  /**
	   * ��Ԫ����������
	   * @return Range
	   */
	  public Range getRange();
	  
	  /**
	   * ���ص�Ԫ�������ı�
	   * @return Sheet
	   */
	  public Sheet getSheet();
	  
	  /**
	   * Returns the content type of this cell
	   *
	   * @return the content type for this cell
	   */
	  public CellType getType();

	  /**
	   * �����õ�Ԫ���Ƿ����أ����������У�������
	   * @return TRUE if this cell is hidden, FALSE otherwise
	   */
	  public boolean isHidden();
	  
	  /**
	   * ���ص�Ԫ��ĸ�ʽ����
	   * ע����Щ����һ������û�и�ʽ����Ϣ���÷���������null����Щ�գ�EMPTY����Ԫ��
	   * �и�ʽ����Ϣ�������ؾ����ʽ����
	   * @return the cell format applied to this cell, or NULL if this is an
	   *         empty cell
	   */
	  public CellFormat getCellFormat();

	  /**
	   * Gets any special cell features, such as comments (notes) or cell
	   * validation present for this cell
	   *
	   * @return the cell features, or NULL if this cell has no special features
	   */
	  public CellFeatures getCellFeatures();
	 
	  
	  
	  
	  
	  
}














