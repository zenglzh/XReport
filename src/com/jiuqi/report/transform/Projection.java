/*
 * @(#)Projection.java  2012-7-13	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.transform;

import java.util.Iterator;

import com.jiuqi.report.Range;
import com.jiuqi.report.RangeSet;
import com.jiuqi.report.Sheet;
import com.jiuqi.report.impl.WritableSheetImpl;
import com.jiuqi.report.render.WritableSheet;

/**
 * <p>Title:ͶӰ</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-7-13
 * @version:  v1.0
 * @since:    SR5.0.1
 */
public class Projection {

	
	
	
	public Sheet project(RangeSet set){
		WritableSheet sheet = new WritableSheetImpl();
		Iterator<Range> it = set.iterator();
		while (it.hasNext()) {
			
			
			System.out.println(it.next());
		}
		return sheet;
	}
	
	
	
	
	
	
}
