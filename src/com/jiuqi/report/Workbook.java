/*
 * @(#)Workbook.java  2012-7-27	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report;



/**
 * <p>Title:¹¤×÷±¡Àà</p>
 * <p>Description:Represents a Workbook</p>
 * @author:  zenglizhi
 * @time:    2012-7-27
 * @version:  v1.0
 * @since:    SR5.0.1
 */
public abstract class Workbook {
	  
	/**he current version of the software*/
	private static final String VERSION = "1.0.0";
	  
	
	
	  
	  /**
	   * The constructor
	   */
	  protected Workbook(){
	  }

	  /**
	   * Gets the sheets within this workbook
	   * @return an array of the individual sheets
	   */
	  public abstract Sheet[] getSheets();

	  /**
	   * Gets the sheet names
	   */
	  public abstract String[] getSheetNames();

	  /**
	   * Gets the specified sheet within this workbook
	   * As described in the accompanying technical notes, each call
	   * to getSheet forces a reread of the sheet (for memory reasons).
	   * Therefore, do not make unnecessary calls to this method.  Furthermore,
	   * do not hold unnecessary references to Sheets in client code, as
	   * this will prevent the garbage collector from freeing the memory
	   *
	   * @param index the zero based index of the reQuired sheet
	   * @return The sheet specified by the index
	   * @exception IndexOutOfBoundException when index refers to a non-existent
	   *            sheet
	   */
	  public abstract Sheet getSheet(int index)
	    throws IndexOutOfBoundsException;

	  /**
	   * Gets the sheet with the specified name from within this workbook.
	   * As described in the accompanying technical notes, each call
	   * to getSheet forces a reread of the sheet (for memory reasons).
	   * Therefore, do not make unnecessary calls to this method.  Furthermore,
	   * do not hold unnecessary references to Sheets in client code, as
	   * this will prevent the garbage collector from freeing the memory
	   *
	   * @param name the sheet name
	   * @return The sheet with the specified name, or null if it is not found
	   */
	  public abstract Sheet getSheet(String name);  
	  
	  
	  
	  
	  
	/**
	  * @return Accessor for the software
	  */
	public static String getVersion() {
		return VERSION;
	}
	  
	 /**
	   * Gets the named cell from this workbook.  If the name refers to a
	   * range of cells, then the cell on the top left is returned.  If
	   * the name cannot be found, null is returned.
	   * This is a convenience function to quickly access the contents
	   * of a single cell.  If you need further information (such as the
	   * sheet or adjacent cells in the range) use the functionally
	   * richer method, findByName which returns a list of ranges
	   *
	   * @param  name the name of the cell/range to search for
	   * @return the cell in the top left of the range if found, NULL
	   *         otherwise
	   */
	  public abstract Cell findCellByName(String name);

	  /**
	   * Returns the cell for the specified location eg. "Sheet1!A4".
	   * This is identical to using the CellReferenceHelper with its
	   * associated performance overheads, consequently it should
	   * be use sparingly
	   *
	   * @param loc the cell to retrieve
	   * @return the cell at the specified location
	   */
	  public abstract Cell getCell(String loc);

	  /**
	   * Gets the named range from this workbook.  The Range object returns
	   * contains all the cells from the top left to the bottom right
	   * of the range.
	   * If the named range comprises an adjacent range,
	   * the Range[] will contain one object; for non-adjacent
	   * ranges, it is necessary to return an array of length greater than
	   * one.
	   * If the named range contains a single cell, the top left and
	   * bottom right cell will be the same cell
	   *
	   * @param  name the name of the cell/range to search for
	   * @return the range of cells, or NULL if the range does not exist
	   */
	  public abstract Range[] findByName(String name);

	  /**
	   * Gets the named ranges
	   *
	   * @return the list of named cells within the workbook
	   */
	  public abstract String[] getRangeNames();

	
	
}
