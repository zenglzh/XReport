/*
 * @(#)PReport.java  2012-9-27	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.para;

import com.jiuqi.dna.core.type.GUID;

/**
 * <p>Title:报表定义</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-9-27
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */
public interface PReport {

	/**
	 * 报表名称
	 */
	public String getName();

	/**
	 * 报表标题
	 */
	public String getTitle();
	
	/**
	 * 报表ID
	 * @return GUID
	 */
	public GUID getGuid();

	/**
	 * 报表类型 
	 * @return ReportType
	 */
	public ReportType getType();
	
	
	/**
	 * 报表数据
	 * @return byte[]
	 */
	public byte[] getData();
	
	
	

	
	
	
}

























