/*
 * @(#)PFloatRange.java  2012-9-27	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.para;

import java.util.List;

import com.jiuqi.dna.core.type.GUID;

/**
 * <p>Title:浮动行区域定义</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-9-27
 * @version:  v1.0
 * @since:    SR5.0.1
 */
public interface PFloatRange extends PRange {
	/**
	 * 父区域定义 
	 * @return PRange
	 */
	public PRange parent();
	
	/**
	 * 子区域列表
	 * @return List<PRange>
	 */
	public List<PRange> childrens();
	
	/**
	 * 区域过滤条件
	 * @return String
	 */
	public String getFilter();
	
	/**
	 * 获得分页显示条数
	 */
	public int getPagination();
	
	/**
	 * 获得区域编码字段GUID
	 */
	public List<GUID> getCodeFields();

	
	/**
	 * 编码是否唯一
	 */
	public boolean isCodeUnique();
	
	/**
	 * 编码结构
	 * TODO： 暂未使用
	 */
	public String getCodeStructure();
	
	/**
	 * 获得区域汇总类型
	 */
	public int getSummeryType();
	
	
	/**
	 * 获得排序信息
	 */
	public SortingInfo getSortingInfo();
	
	/**
	 * 获得行次栏信息
	 */
	public LineTimesColumn getLineTimesColumn();

	
	/**
	 * 获取区域行为
	 * @return RangeBehaviour
	 */
	public RangeBehaviour getBehaviour();
	
	
	
	

	
	
	
	
	
}




