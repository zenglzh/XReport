/*
 * @(#)IClientScript.java  2012-9-28	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.para;

/**
 * <p>Title:�ͻ��˽ű�����</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-9-28
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */
public interface IClientScript {

	/**
	 * ��ȡԭʼ��Ԫ��ű� �����ڷ���˽���
	 */
	public String getScript();
	/**
	 * ��ȡ�����ĵ�Ԫ��ű�������������ͻ���
	 * ����Ƿ����ִ�нű����ͻ��˽��������˱��"#"
	 */
	public String getCScript();

}
