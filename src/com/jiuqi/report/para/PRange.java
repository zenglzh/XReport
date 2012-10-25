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
 * <p>Title:区域定义</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-9-27
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */
public interface PRange extends Comparable<PRange>{

	/**
	 * 区域guid
	 * @return GUID
	 */
	public GUID getGuid();
	
	/**
	 * 区域标题
	 */
	public String getTitle();
	
	/**
	 * @return GUID 区域主体Guid
	 */
	public GUID getMainBodyGuid();
	
	/**
	 * 区域所属报表
	 * @return PReport
	 */
	public PReport getReport();
	
	/**
	 * 获取区域保护的单元列表 
	 * @return List<PNode>
	 */
	public List<PNode> getNodes();
	
	

	
	
	
	
	
	
	
	
	
	
	
}



