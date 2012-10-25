/*
 * @(#)WritableSheet.java  2012-8-1	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.render;

import com.jiuqi.report.Range;
import com.jiuqi.report.Sheet;

/**
 * <p>Title:worksheet接口。</p>
 * <p>Description:提供可写方法</p>
 * @author:  zenglizhi
 * @time:    2012-8-1
 * @version:  v1.0
 * @since:    SR5.0.1
 */
public interface WritableSheet extends Sheet {

	  public void setName(String name);
	
	  /**
	   * Inserts a blank row into this spreadsheet.  If the row is out of range
	   * of the rows in the sheet, then no action is taken
	   *
	   * @param row the row to insert
	   */
	  public void insertRow(int row);

	  /**
	   * Inserts a blank column into this spreadsheet.  If the column is out of
	   * range of the columns in the sheet, then no action is taken
	   *
	   * @param col the column to insert
	   */
	  public void insertColumn(int col);

	  /**
	   * Removes a column from this spreadsheet.  If the column is out of range
	   * of the columns in the sheet, then no action is taken
	   *
	   * @param col the column to remove
	   */
	  public void removeColumn(int col);

	  /**
	   * Removes a row from this spreadsheet.  If the row is out of
	   * range of the columns in the sheet, then no action is taken
	   *
	   * @param row the row to remove
	   */
	  public void removeRow(int row);

	  /**
	   * Merges the specified cells.  Any clashes or intersections between
	   * merged cells are resolved when the spreadsheet is written out
	   *
	   * @param col1 the column number of the top left cell
	   * @param row1 the row number of the top left cell
	   * @param col2 the column number of the bottom right cell
	   * @param row2 the row number of the bottom right cell
	   * @return the Range object representing the merged cells
	   * @exception com.jiuqi.report.render.RenderException
	   */
	  public Range mergeCells(int col1, int row1, int col2, int row2) throws RenderException;
	
}
