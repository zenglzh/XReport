/*
 * @(#)GridSetting.java  2012-8-1	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.impl;

import com.jiuqi.dna.ui.wt.grid.GridEnums.EnterNext;
import com.jiuqi.report.render.IGridSetting;

/**
 * <p>Title:</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-8-1
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */
public class GridSetting implements IGridSetting{
	boolean isHiddenHeader = false;
	EnterNext enterNext;
	public GridSetting(){
		this(EnterNext.DOWN);
	}
	public GridSetting(EnterNext enterNext){
		this.enterNext = enterNext;
	}
	public EnterNext getEnterNext() {
		return enterNext;
	}
	public void setEnterNext(EnterNext enterNext) {
		this.enterNext = enterNext;
	}
	
	public boolean isColResizeEnabled() {
		return true;
	}

	public boolean isColSelectEnabled() {
		return true;
	}

	public boolean isHiddenHeader() {
		return isHiddenHeader;
	}
	public void setHiddenHeader(boolean isHiddenHeader) {
		this.isHiddenHeader = isHiddenHeader;
	}
	public boolean isRowResizeEnabled() {
		return true;
	}

	public boolean isRowSelectEnabled() {
		return true;
	}
	
}
