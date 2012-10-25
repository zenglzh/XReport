/*
 * @(#)PRange.java  2012-9-27	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.para;

import java.util.List;

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
public interface PRange extends Comparable<PRange>{

	/**
	 * ����guid
	 * @return GUID
	 */
	public GUID getGuid();
	
	/**
	 * �������
	 */
	public String getTitle();
	
	/**
	 * @return GUID ��������Guid
	 */
	public GUID getMainBodyGuid();
	
	/**
	 * ������������
	 * @return PReport
	 */
	public PReport getReport();
	
	/**
	 * ��ȡ���򱣻��ĵ�Ԫ�б� 
	 * @return List<PNode>
	 */
	public List<PNode> getNodes();
	
	

	
	
	
	
	
	
	
	
	
	
	
}



