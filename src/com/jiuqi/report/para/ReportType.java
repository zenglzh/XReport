/*
 * @(#)ReportType.java  2012-9-27	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.para;

import com.jiuqi.dna.ui.wt.widgets.Composite;

/**
 * <p>Title:报表类型</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-9-27
 * @version:  v1.0
 * @since:    SR5.0.1
 */
public enum ReportType {

	GRID,			//普通表格
	GRID2,			//第二代表格
	ANNAL,			//分析表
	DOCUMENT,		//文档
	MODULE,			//单据
	REMARK,			//备注
	ATTACH,			//附件
	OTHER,
	
	
	;
	
	enum RANGE{
		
	}
	
	public void display(Composite composite){
		
	}
	
}
