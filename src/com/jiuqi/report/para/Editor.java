/*
 * @(#)Editor.java  2012-9-27	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.para;

/**
 * <p>Title:�༭��</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-9-27
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */
public interface Editor {

	/**
	 * ֻ��ѡ��Ҷ��
	 * @return boolean
	 */
	public boolean isOnlyCanChooseLeaves();
	/**
	 * ֻ��ѡ��Ҷ��
	 * @return boolean
	 */
	public int getOnlyCanChooseLeaves();
	/**
	 * ��ѡ
	 * @return boolean
	 */
	public boolean isMoreChoose();
	/**
	 * ��ѡ
	 * @return boolean
	 */
	public int getMoreChoose();
	/**
	 * ö����ʾ��ʽ
	 * @return int
	 */
	public int getEnumShowWay();
	/**
	 * ö��¼�뷽ʽ
     * @return the enumEnteringWay
     */
    public int getEnumEnteringWay();
	/**
	 * ��ȡö�ٹ��˱��ʽ
	 */
	public String getEnumFilter();
}
