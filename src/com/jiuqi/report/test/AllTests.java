/*
 * @(#)AllTests.java  2012-8-23	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.test;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * <p>Title:</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-8-23
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$

		//$JUnit-END$
		return suite;
	}

}
