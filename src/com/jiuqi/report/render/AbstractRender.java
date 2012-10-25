/*
 * @(#)DefaultRander.java  2012-7-31	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.render;

import com.jiuqi.report.Sheet;
import com.jiuqi.report.para.intf.facade.FReportData;

/**
 * <p>Title:抽象数据渲染器</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-7-31
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */
public abstract class AbstractRender implements IDataRender {
	
	/**
	 * 表样
	 */
	private FReportData reportData;

	public AbstractRender(FReportData reportData){
		this.reportData = reportData;		
	}
	

	/**
	 * 获取表样 
	 * @return FReportData
	 */
	final protected FReportData getReportData() {
		return reportData;
	}
	
	
	@Override
	public void rendering(Sheet root) {

	}

	
	
	
	
	
	
}
