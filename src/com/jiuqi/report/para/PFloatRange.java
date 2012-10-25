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
 * <p>Title:������������</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-9-27
 * @version:  v1.0
 * @since:    SR5.0.1
 */
public interface PFloatRange extends PRange {
	/**
	 * �������� 
	 * @return PRange
	 */
	public PRange parent();
	
	/**
	 * �������б�
	 * @return List<PRange>
	 */
	public List<PRange> childrens();
	
	/**
	 * �����������
	 * @return String
	 */
	public String getFilter();
	
	/**
	 * ��÷�ҳ��ʾ����
	 */
	public int getPagination();
	
	/**
	 * �����������ֶ�GUID
	 */
	public List<GUID> getCodeFields();

	
	/**
	 * �����Ƿ�Ψһ
	 */
	public boolean isCodeUnique();
	
	/**
	 * ����ṹ
	 * TODO�� ��δʹ��
	 */
	public String getCodeStructure();
	
	/**
	 * ��������������
	 */
	public int getSummeryType();
	
	
	/**
	 * ���������Ϣ
	 */
	public SortingInfo getSortingInfo();
	
	/**
	 * ����д�����Ϣ
	 */
	public LineTimesColumn getLineTimesColumn();

	
	/**
	 * ��ȡ������Ϊ
	 * @return RangeBehaviour
	 */
	public RangeBehaviour getBehaviour();
	
	
	
	

	
	
	
	
	
}




