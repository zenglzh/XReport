/*
 * @(#)PElement.java  2012-9-27	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.para;

import com.jiuqi.dna.core.type.GUID;

/**
 * <p>Title:元素</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-9-27
 * @version:  v1.0
 * @see: com.jiuqi.report.para.intf.facade.FZB
 * @since:    SR5.0.1
 */
public interface PElement {
	/**
	 * @return GUID 指标的guid
	 */
	public GUID getGuid();
	
	/**
	 * @return String 代码
	 */
	public String getCode();
	
	/**
	 * @return String 名称
	 */
	public String getName();
	
	/**
	 * @return String 描述
	 */
	public String getDesc();

	/**
	 * @return boolean 是否是主键元素
	 */
	public boolean isKeyElement();
	
	/**
	 * @return boolean 允许为空
	 */
	public boolean leaveNull();
	
	
	
	
	

	
	/**  获取指标的数据类型*/
	public abstract int getZbDataType();
	/** 获取指标所属主体的guid*/
	public abstract GUID getMbID();
	/**  获取指标关联的基础数据主体的guid*/
	public abstract GUID getBasicDataMBID();
	/** 获取指标的默认值*/
	public abstract String getZbDefaultValue();
	/** 获取指标的长度 */
	public abstract int getZbPrecision();
	/** 获取指标的小数位*/
	public abstract int getZbDecimal();

	/** 是否允许重复*/
	public abstract boolean isZbAllowEcho();
	/** 是否允许为空 */
	public abstract boolean isZbCanNull();
	/** 获取指标的应用类型*/
	public abstract int getZbAppType();
	/**  获取指标的汇总方式*/
	public abstract int getZbSumMode();
	/** 获取指标的折半汇总条件*/
	public abstract String getZbHalfColCondition();
	/**  获取折半应用范围*/
	public abstract int getZbHalfAppScope();
	/** 获取排序字段*/
	public abstract String getZbOrder();
	/** 获取指标状态 */
	public abstract int getZbState();
	/** 是否是主键指标 */
	public abstract boolean isKeyZB();
	/** 是否是系统指标*/
	public abstract boolean isSystemZB();
	/** 获取度量单位的guid*/
	public abstract GUID getMuID();
	
	public abstract int getSRZbDataType();
	
	public String getExtAttributes();
	
	
	
	

}
