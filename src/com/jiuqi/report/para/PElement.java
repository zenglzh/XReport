/*
 * @(#)PElement.java  2012-9-27	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.para;

import com.jiuqi.dna.core.type.GUID;

/**
 * <p>Title:Ԫ��</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-9-27
 * @version:  v1.0
 * @see: com.jiuqi.report.para.intf.facade.FZB
 * @since:    SR5.0.1
 */
public interface PElement {
	/**
	 * @return GUID ָ���guid
	 */
	public GUID getGuid();
	
	/**
	 * @return String ����
	 */
	public String getCode();
	
	/**
	 * @return String ����
	 */
	public String getName();
	
	/**
	 * @return String ����
	 */
	public String getDesc();

	/**
	 * @return boolean �Ƿ�������Ԫ��
	 */
	public boolean isKeyElement();
	
	/**
	 * @return boolean ����Ϊ��
	 */
	public boolean leaveNull();
	
	
	
	
	

	
	/**  ��ȡָ�����������*/
	public abstract int getZbDataType();
	/** ��ȡָ�����������guid*/
	public abstract GUID getMbID();
	/**  ��ȡָ������Ļ������������guid*/
	public abstract GUID getBasicDataMBID();
	/** ��ȡָ���Ĭ��ֵ*/
	public abstract String getZbDefaultValue();
	/** ��ȡָ��ĳ��� */
	public abstract int getZbPrecision();
	/** ��ȡָ���С��λ*/
	public abstract int getZbDecimal();

	/** �Ƿ������ظ�*/
	public abstract boolean isZbAllowEcho();
	/** �Ƿ�����Ϊ�� */
	public abstract boolean isZbCanNull();
	/** ��ȡָ���Ӧ������*/
	public abstract int getZbAppType();
	/**  ��ȡָ��Ļ��ܷ�ʽ*/
	public abstract int getZbSumMode();
	/** ��ȡָ����۰��������*/
	public abstract String getZbHalfColCondition();
	/**  ��ȡ�۰�Ӧ�÷�Χ*/
	public abstract int getZbHalfAppScope();
	/** ��ȡ�����ֶ�*/
	public abstract String getZbOrder();
	/** ��ȡָ��״̬ */
	public abstract int getZbState();
	/** �Ƿ�������ָ�� */
	public abstract boolean isKeyZB();
	/** �Ƿ���ϵͳָ��*/
	public abstract boolean isSystemZB();
	/** ��ȡ������λ��guid*/
	public abstract GUID getMuID();
	
	public abstract int getSRZbDataType();
	
	public String getExtAttributes();
	
	
	
	

}
