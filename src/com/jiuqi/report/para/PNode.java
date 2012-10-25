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
 * <p>Title:�ڵ㶨��</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-9-27
 * @version:  v1.0
 * @see:com.jiuqi.report.para.intf.facade.FMapCell
 * @since:    SR5.0.1
 */
public interface PNode {

	/**
	 * �ڵ�Guid 
	 * @return GUID
	 */
	public GUID getGuid();
	
	/**
	 * �ڵ�����
	 */
	public String getTitle();

	/**
	 * �ڵ���������
	 * @return PRange
	 */
	public PRange getRange();

	/**
	 * ���ص�Ԫ����������
	 * @return int ��Ԫ��������������0��ʼ
	 */
	public int getCol();
	/**
	 * ���ص�Ԫ����������
	 * @return int ��Ԫ��������������0��ʼ
	 */
	public int getRow();
	/**
	 * ���ص�Ԫ��������������
	 * @return int ��Ԫ��������������1��ʼ
	 */
	public int getDataCol();
	/**
	 * ���ص�Ԫ��������������
	 * @return int ��Ԫ��������������1��ʼ
	 */
	public int getDataRow();
	
	/**
	 * @return PElement ����ָ���Ӧ��Ԫ��
	 */
	public PElement getElement();
	
	/**
	 * @return Editor �ڵ���صı༭��
	 */
	public Editor getEditor();
	
	/**
	 * getFormula
	 * @return String ӳ����ʽ
	 */
	public String getExpression();
	
	/**
	 * @return DimensionValueSet ��ȡ�ڵ������õ�ά����Ϣ
	 */
	public DimensionValueSet getDimensionValueSet();
	
	/**
	 * @return IClientScript ��ȡ�ͻ��˽ű�����
	 */
	public IClientScript getClientScript();
    
    /**
     * ��Ԫ��Ĭ��ֵ
     * @return String
     */
    public String getDefaultValue();

    
    
	
	//////
//	/**
//	 * ���ص�Ԫ��ӳ������
//	 * @return ReportForm.MapType ��Ԫ��ӳ�����ͣ�ZB��ָ��ӳ�䡢FORMULA����ʽӳ�䣩
//	 */
//	public int getMapCellType();
//    
//    /**
//	 * @return boolean �Ƿ�Ϊ��ʽӳ��
//	 */
//	public boolean isFormulaMapCell();
//	/**
//	 * @return boolean �Ƿ�Ϊָ��ӳ��
//	 */
//	public boolean isZBMapCell();
//	
	/**
	 * �ϼƷ�ʽ.
	 * δ����ʱ������ -1.ͨ�������ָ��Ļ��ܷ�ʽ
	 * Ŀǰ�����ڸ����зּ��ϼ���
	 * @return com.jiuqi.report.reportform.intf.consts.SumType
	 */
//	public int getSumType();

	
	
}
