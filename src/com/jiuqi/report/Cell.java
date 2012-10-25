/*
 * @(#)Cell.java  2012-7-13	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report;



/**
 * <p>Title:单元格</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-7-13
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */
public interface Cell {
	  /**
	   * 返回单元格的行号
	   * @return the row number of this cell
	   */
	  public int getRow();

	  /**
	   * 返回单元格的列号
	   * @return the column number of this cell
	   */
	  public int getColumn();
	  
	  
	  /**
	   * 单元格所在区域
	   * @return Range
	   */
	  public Range getRange();
	  
	  /**
	   * 返回单元格所属的表
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
	   * 表明该单元格是否隐藏，可能隐藏行，隐藏列
	   * @return TRUE if this cell is hidden, FALSE otherwise
	   */
	  public boolean isHidden();
	  
	  /**
	   * 返回单元格的格式化器
	   * 注意有些的哪一个的是没有格式化信息，该方法将返回null，有些空（EMPTY）单元格
	   * 有格式化信息，见返回具体格式化器
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














