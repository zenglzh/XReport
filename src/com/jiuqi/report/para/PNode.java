/*
 * @(#)PNode.java  2012-9-27	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.para;

import com.jiuqi.dna.core.type.GUID;
import com.jiuqi.dna.data.engine.extention.common.DimensionValueSet;

/**
 * <p>Title:节点定义</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-9-27
 * @version:  v1.0
 * @see:com.jiuqi.report.para.intf.facade.FMapCell
 * @since:    SR5.0.1
 */
public interface PNode {

	/**
	 * 节点Guid 
	 * @return GUID
	 */
	public GUID getGuid();
	
	/**
	 * 节点名称
	 */
	public String getTitle();

	/**
	 * 节点所属区域
	 * @return PRange
	 */
	public PRange getRange();

	/**
	 * 返回单元格所在列数
	 * @return int 单元格所在列数，从0开始
	 */
	public int getCol();
	/**
	 * 返回单元格所在行数
	 * @return int 单元格所在行数，从0开始
	 */
	public int getRow();
	/**
	 * 返回单元格所在数据列数
	 * @return int 单元格所在列数，从1开始
	 */
	public int getDataCol();
	/**
	 * 返回单元格所在数据行数
	 * @return int 单元格所在行数，从1开始
	 */
	public int getDataRow();
	
	/**
	 * @return PElement 返回指标对应的元素
	 */
	public PElement getElement();
	
	/**
	 * @return Editor 节点相关的编辑器
	 */
	public Editor getEditor();
	
	/**
	 * getFormula
	 * @return String 映射表达式
	 */
	public String getExpression();
	
	/**
	 * @return DimensionValueSet 获取节点是设置的维度信息
	 */
	public DimensionValueSet getDimensionValueSet();
	
	/**
	 * @return IClientScript 获取客户端脚本定义
	 */
	public IClientScript getClientScript();
    
    /**
     * 单元格默认值
     * @return String
     */
    public String getDefaultValue();

    
    
	
	//////
//	/**
//	 * 返回单元格映射类型
//	 * @return ReportForm.MapType 单元格映射类型（ZB：指标映射、FORMULA：公式映射）
//	 */
//	public int getMapCellType();
//    
//    /**
//	 * @return boolean 是否为公式映射
//	 */
//	public boolean isFormulaMapCell();
//	/**
//	 * @return boolean 是否为指标映射
//	 */
//	public boolean isZBMapCell();
//	
	/**
	 * 合计方式.
	 * 未设置时，返回 -1.通常会调用指标的汇总方式
	 * 目前仅用于浮动行分级合计中
	 * @return com.jiuqi.report.reportform.intf.consts.SumType
	 */
//	public int getSumType();

	
	
}
