/*
 * @(#)AbstractPReportImpl.java  2012-9-27	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.para.impl;

import java.util.List;

import com.jiuqi.report.para.PRange;
import com.jiuqi.report.para.ReportType;

/**
 * <p>Title:表格类报表</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-9-27
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */
public abstract class AbstractGridReport extends PReportImpl {

	
	private List<PRange> pRanges; 
	
	
	
	public AbstractGridReport(ReportType type) {
		super(type);
	}

	
	
	public List<PRange> getpRanges() {
		return pRanges;
	}
	
	
	
	
	
	
}
