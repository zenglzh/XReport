/*
 * @(#)IClientScript.java  2012-9-28	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.para;

/**
 * <p>Title:客户端脚本定义</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-9-28
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */
public interface IClientScript {

	/**
	 * 获取原始单元格脚本 ，用于服务端解析
	 */
	public String getScript();
	/**
	 * 获取精简后的单元格脚本，用于输出到客户端
	 * 如果是服务端执行脚本，客户端仅输出服务端标记"#"
	 */
	public String getCScript();

}
