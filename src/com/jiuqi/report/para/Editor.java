/*
 * @(#)Editor.java  2012-9-27	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.para;

/**
 * <p>Title:编辑器</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-9-27
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */
public interface Editor {

	/**
	 * 只能选中叶子
	 * @return boolean
	 */
	public boolean isOnlyCanChooseLeaves();
	/**
	 * 只能选中叶子
	 * @return boolean
	 */
	public int getOnlyCanChooseLeaves();
	/**
	 * 多选
	 * @return boolean
	 */
	public boolean isMoreChoose();
	/**
	 * 多选
	 * @return boolean
	 */
	public int getMoreChoose();
	/**
	 * 枚举显示方式
	 * @return int
	 */
	public int getEnumShowWay();
	/**
	 * 枚举录入方式
     * @return the enumEnteringWay
     */
    public int getEnumEnteringWay();
	/**
	 * 获取枚举过滤表达式
	 */
	public String getEnumFilter();
}
