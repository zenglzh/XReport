/*
 * @(#)GridRander.java  2012-7-31	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.render;


import com.jiuqi.dna.ui.common.constants.JWT;
import com.jiuqi.dna.ui.wt.grid.Grid;
import com.jiuqi.dna.ui.wt.grid.GridDataAccessor;
import com.jiuqi.dna.ui.wt.grid.GridEnums.EnterNext;
import com.jiuqi.dna.ui.wt.widgets.Composite;
import com.jiuqi.report.Sheet;
import com.jiuqi.report.impl.GridSetting;
import com.jiuqi.report.para.intf.facade.FReportData;

/**
 * <p>Title:grid数据渲染器</p>
 * <p>Description:将RangeSet渲染到grid中</p>
 * @author:  zenglizhi
 * @time:    2012-7-31
 * @version:  v1.0
 * @since:    SR5.0.1
 */
public class GridRender extends AbstractRender {
	
	/**
	 * 渲染容器
	 */
	final private Composite parent;
	
	
	private Grid grid ;
	
	public GridRender(FReportData reportData,Composite parent){
		super(reportData);
		this.parent = parent;
	}

	
	@Override
	public void rendering(Sheet root) {
		this.grid = new Grid(parent,getReportData().getData(),JWT.NONE);
		_initGridSetting(new GridSetting(getNextEnter()));
		
		
		
		
	}
	private EnterNext getNextEnter() {
		if(null !=getReportData().getGridEnterNext()){
			return Enum.valueOf(EnterNext.class, getReportData().getGridEnterNext());
		}else
			return EnterNext.DOWN;
	}
	
	/**
	 * 初始化表格属性
	 * @param gset
	 */
	private void _initGridSetting(IGridSetting gset) {
		this.grid.setEnterNext(gset.getEnterNext());
		this.grid.setColumnResizeEnabled(gset.isColResizeEnabled());
		this.grid.setColSelectEnabled(gset.isColSelectEnabled());
		this.grid.setRowResizeEnabled(gset.isRowResizeEnabled());
		this.grid.setRowSelectEnabled(gset.isRowSelectEnabled());
		this.getGridDataAccessor().setColumnHidden(0, gset.isHiddenHeader());
		this.getGridDataAccessor().setRowHidden(0, gset.isHiddenHeader());
	}
	
	/**
	 * 返回表格数据的访问器
	 * @return
	 */
	private GridDataAccessor getGridDataAccessor() {
		return this.grid.getGridDataAccessor();
	}
	
}
