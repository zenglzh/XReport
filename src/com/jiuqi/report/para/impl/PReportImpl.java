/*
 * @(#)PReportImpl.java  2012-9-27	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.para.impl;

import com.jiuqi.dna.core.type.GUID;
import com.jiuqi.report.para.PReport;
import com.jiuqi.report.para.ReportType;

/**
 * <p>Title:</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-9-27
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */
public abstract class PReportImpl implements PReport{

	private String name;
	private String title;
	private GUID guid;
	private final ReportType type;
	private byte[] data;
	
	public PReportImpl(ReportType type) {
		this.type = type;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public GUID getGuid() {
		return this.guid;
	}

	@Override
	public ReportType getType() {
		return this.type;
	}

	@Override
	public byte[] getData() {
		return this.data;
	}
	
	
	
	
	
	
	

}

