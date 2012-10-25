/*
 * @(#)NumberCellImpl.java  2012-8-23	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.impl;

import java.text.NumberFormat;

import com.jiuqi.report.CellFeatures;
import com.jiuqi.report.CellFormat;
import com.jiuqi.report.CellType;
import com.jiuqi.report.NumberCell;
import com.jiuqi.report.Range;
import com.jiuqi.report.Sheet;

/**
 * <p>Title:</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-8-23
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */
public class NumberCellImpl implements NumberCell {

	@Override
	public int getRow() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getColumn() {
		// TODO Auto-generated method stub
		return 0;
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CellFormat getCellFormat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CellFeatures getCellFeatures() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public NumberFormat getNumberFormat() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		return String.format("[%s,%s]%s", getRow(),getColumn(),getValue());
	}

}
