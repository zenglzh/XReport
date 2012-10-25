/*
 * @(#)PReport.java  2012-9-27	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.para;

import com.jiuqi.dna.core.type.GUID;

/**
 * <p>Title:������</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-9-27
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */
public interface PReport {

	/**
	 * ��������
	 */
	public String getName();

	/**
	 * �������
	 */
	public String getTitle();
	
	/**
	 * ����ID
	 * @return GUID
	 */
	public GUID getGuid();

	/**
	 * �������� 
	 * @return ReportType
	 */
	public ReportType getType();
	
	
	/**
	 * ��������
	 * @return byte[]
	 */
	public byte[] getData();
	
	
	

	
	
	
}

























