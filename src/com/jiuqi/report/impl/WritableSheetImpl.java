/*
 * @(#)WritableSheetImpl.java  2012-8-1	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.impl;

import com.jiuqi.report.Cell;
import com.jiuqi.report.Range;
import com.jiuqi.report.render.RenderException;
import com.jiuqi.report.render.WritableSheet;

/**
 * <p>Title:</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-8-1
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */
public class WritableSheetImpl implements WritableSheet {

	@Override
	public Cell getCell(int column, int row) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cell getCell(String loc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getColumns() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Cell[] getRow(int row) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cell[] getColumn(int col) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cell[][] getCells() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertRow(int row) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertColumn(int col) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeColumn(int col) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeRow(int row) {
		// TODO Auto-generated method stub

	}

	@Override
	public Range mergeCells(int col1, int row1, int col2, int row2)
			throws RenderException {
		// TODO Auto-generated method stub
		return null;
	}

}
