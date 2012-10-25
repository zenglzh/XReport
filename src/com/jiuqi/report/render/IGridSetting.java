/*
 * @(#)IGridSetting.java  2012-4-11	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.render;

import com.jiuqi.dna.ui.wt.grid.GridEnums;

/**
 * <p>Title:表样展示默初始值设置定义接口</p>
 * <p>Description:定义表样展示的初始设置
 * 对外公开的行为提供<set*>方法</p>
 * @author:  zenglizhi
 * @time:    2012-4-11
 * @version:  v1.0
 * @since:    SR5.0.1
 */
public interface IGridSetting {
	/**
	 * 是否允许整行选择
	 */
	public boolean isRowSelectEnabled();
	/**
	 * 是否允许改变行宽
	 */
	public boolean isRowResizeEnabled();
	
	/**
	 * 是否允许整列选择
	 */
	public boolean isColSelectEnabled();
	
	/**
	 * 是否允许改变列宽
	 */
	public boolean isColResizeEnabled();
	
	/**
	 * 是否隐藏表头
	 */
	public boolean isHiddenHeader();
	
	/**
	 * 设置隐藏表头
	 */
	public void setHiddenHeader(boolean isHiddenHeader);
	
	/**
	 * 回车移动方向
	 */
	public GridEnums.EnterNext getEnterNext();
	
	
}
