/*
 * @(#)IGridSetting.java  2012-4-11	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.render;

import com.jiuqi.dna.ui.wt.grid.GridEnums;

/**
 * <p>Title:����չʾĬ��ʼֵ���ö���ӿ�</p>
 * <p>Description:�������չʾ�ĳ�ʼ����
 * ���⹫������Ϊ�ṩ<set*>����</p>
 * @author:  zenglizhi
 * @time:    2012-4-11
 * @version:  v1.0
 * @since:    SR5.0.1
 */
public interface IGridSetting {
	/**
	 * �Ƿ���������ѡ��
	 */
	public boolean isRowSelectEnabled();
	/**
	 * �Ƿ�����ı��п�
	 */
	public boolean isRowResizeEnabled();
	
	/**
	 * �Ƿ���������ѡ��
	 */
	public boolean isColSelectEnabled();
	
	/**
	 * �Ƿ�����ı��п�
	 */
	public boolean isColResizeEnabled();
	
	/**
	 * �Ƿ����ر�ͷ
	 */
	public boolean isHiddenHeader();
	
	/**
	 * �������ر�ͷ
	 */
	public void setHiddenHeader(boolean isHiddenHeader);
	
	/**
	 * �س��ƶ�����
	 */
	public GridEnums.EnterNext getEnterNext();
	
	
}
