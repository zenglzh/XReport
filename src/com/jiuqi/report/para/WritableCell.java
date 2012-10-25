/*
 * @(#)WritableCell.java  2012-8-3	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.para;

import com.jiuqi.report.Cell;
import com.jiuqi.report.CellFormat;
/**
 * <p>Title:</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-8-3
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */
public interface WritableCell extends Cell {
	  /**
	   * Sets the cell format for this cell
	   *
	   * @param cf the cell format
	   */
	  public void setCellFormat(CellFormat cf);

	  /**
	   * A deep copy.  The returned cell still needs to be added to the sheet.
	   * By not automatically adding the cell to the sheet, the client program
	   * may change certain attributes, such as the value or the format
	   *
	   * @param col the column which the new cell will occupy
	   * @param row the row which the new cell will occupy
	   * @return  a copy of this cell, which can then be added to the sheet
	   */
	  public WritableCell copyTo(int col, int row);

	  /**
	   * Accessor for the cell features
	   *
	   * @return the cell features or NULL if this cell doesn't have any
	   */
	  public WritableCellFeatures getWritableCellFeatures();

	  /**
	   * Sets the cell features
	   *
	   * @param cf the cell features
	   */
	  public void setCellFeatures(WritableCellFeatures cf);
}
