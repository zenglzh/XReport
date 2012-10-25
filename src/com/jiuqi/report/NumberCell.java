/*
 * @(#)NumberCell.java  2012-7-31	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report;

import java.text.NumberFormat;

/**
 * <p>Title:</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-7-31
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */
public interface NumberCell extends Cell{

	  /**
	   * Gets the double contents for this cell.
	   *
	   * @return the cell contents
	   */
	  public double getValue();

	  /**
	   * Gets the NumberFormat used to format this cell.  This is the java
	   * equivalent of the Excel format
	   *
	   * @return the NumberFormat used to format the cell
	   */
	  public NumberFormat getNumberFormat();
	  
	  
	  
	  
}
