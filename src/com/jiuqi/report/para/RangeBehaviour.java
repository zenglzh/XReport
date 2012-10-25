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

	
	/*获得是否自动增行*/
	public boolean isAutoAddRow();
	/*获得自动增行的 行跨度*/
	public int getAutoAddRowSpan();
	/*获得是否允许增删行*/
	public boolean isAllowAddDelRow();
	/*是否开启最小行数限制*/
	public boolean isMinRowNumActive();
	/*最小行数限制的行数*/	
	public int getMinRowNum();
	
	
	
}
