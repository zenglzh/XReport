/*
 * @(#)Range.java  2012-7-13	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report;


/**
 * <p>Title:ÇøÓò</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-7-13
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */
public interface Range {

	  /**
	   * Gets the cell at the top left of this range
	   *
	   * @return the cell at the top left
	   */
	  public Cell getTopLeft();

	  /**
	   * Gets the cell at the bottom right of this range
	   *
	   * @return the cell at the bottom right
	   */
	  public Cell getBottomRight();

	  /**
	   * Gets the index of the first sheet in the range
	   *
	   * @return the index of the first sheet in the range
	   */
	  public int getFirstSheetIndex();

	  /**
	   * Gets the index of the last sheet in the range
	   *
	   * @return the index of the last sheet in the range
	   */
	  public int getLastSheetIndex();
	  
	  
}
