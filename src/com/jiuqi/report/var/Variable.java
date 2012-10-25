/*
 * @(#)Variable.java  2012-8-16	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.var;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>Title:变量描述</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-8-16
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Variable {

	/**
	 * 变量标志
	 * @return String
	 */
	public String name();
	
}

