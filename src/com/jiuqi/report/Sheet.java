/*
 * @(#)Sheet.java  2012-7-27	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report;


/**
 * <p>Title:表格对象</p>
 * <p>Description:单元格的集合，二维表</p>
 * @author:  zenglizhi
 * @time:    2012-7-27
 * @version:  v1.0
 * @since:    SR5.0.1
 */
public interface Sheet {
	 /**
	   * 根据指定的行列号返回单元格
	   * 如果 column/row 指定的是合并单元格，将会返回一个空单元格（除非是第一个格子）
	   * @param 列号
	   * @param 行号
	   * @return 一个指定坐标的单元格对象
	   */
	  public Cell getCell(int column, int row);

	  /**
	   * 根据坐标字符串返回单元格 ：eg."A4"
	   * @param loc the cell reference
	   * @return the cell at the specified co-ordinates
	   */
	  public Cell getCell(String loc);

	  /**
	   * 返回总行数
	   * @return the number of rows in this sheet
	   */
	  public int getRows();

	  /**
	   * 返回总列数
	   * @return the number of columns in this sheet
	   */
	  public int getColumns();

	  /**
	   * 返回指定行的单元格数组
	   * @param row the rows whose cells are to be returned
	   * @return the cells on the given row
	   */
	  public Cell[] getRow(int row);

	  /**
	   * 返回指定列的单元格列表
	   * @param col the column whose cells are to be returned
	   * @return the cells on the specified column
	   */
	  public Cell[] getColumn(int col);

	  /**
	   * 返回所有单元格对象 
	   * @return Cell[][]
	   */
	  public Cell[][] getCells();
	  
	  /**
	   * Gets the name of this sheet
	   * @return the name of the sheet
	   */
	  public String getName();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}













