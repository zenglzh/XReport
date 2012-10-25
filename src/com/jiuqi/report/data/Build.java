/*
 * @(#)Build.java  2012-8-3	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.data;

import com.jiuqi.dna.data.engine.extention.intf.IDataQueryResult;
import com.jiuqi.report.RangeSet;

/**
 * <p>Title:数据键值接口</p>
 * <p>Description:将数据集转换成RangeSet</p>
 * @author:  zenglizhi
 * @time:    2012-8-3
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */
public interface Build {
	
	/**
	 * 将出数据结果集构造成区域集合对象
	 * @param result
	 * @return RangeSet
	 */
	public RangeSet building(IDataQueryResult result);

	
	
}
