/*
 * @(#)RangeBehaviour.java  2012-9-27	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.para;

/**
 * <p>Title:</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-9-27
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */
public interface RangeBehaviour {

	
	/*����Ƿ��Զ�����*/
	public boolean isAutoAddRow();
	/*����Զ����е� �п��*/
	public int getAutoAddRowSpan();
	/*����Ƿ�������ɾ��*/
	public boolean isAllowAddDelRow();
	/*�Ƿ�����С��������*/
	public boolean isMinRowNumActive();
	/*��С�������Ƶ�����*/	
	public int getMinRowNum();
	
	
	
}
