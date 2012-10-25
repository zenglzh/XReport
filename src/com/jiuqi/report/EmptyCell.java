/*
 * @(#)EmptyCell.java  2012-8-1	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report;

/**
 * <p>Title:空单元格类</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-8-1
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */
public class EmptyCell implements Cell {
	/**
	 * The row of this empty cell
	 */
	private int row;
	/**
	 * The column number of this empty cell
	 */
	private int col;

	public EmptyCell(int r,int c){
		this.row = r;
		this.col = c;
	}
	
	@Override
	public int getRow() {
		return row;
	}

	@Override
	public int getColumn() {
		return col;
	}

	@Override
	public Range getRange() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sheet getSheet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CellType getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isHidden() {
		return false;
	}

	@Override
	public CellFormat getCellFormat() {
		return null;
	}

	@Override
	public CellFeatures getCellFeatures() {
		// TODO Auto-generated method stub
		return null;
	}

}
