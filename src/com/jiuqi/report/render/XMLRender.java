/*
 * @(#)XMLRander.java  2012-7-31	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.render;

import java.io.IOException;
import java.io.OutputStream;

import com.jiuqi.report.Workbook;

/**
 * <p>Title:</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-7-31
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */
public class XMLRender {
	  /**
	   * The output stream to write to
	   */
	  private OutputStream out;

	  /** 
	   * The encoding to write
	   */
	  private String encoding;

	  /**
	   * The workbook we are reading from
	   */
	  private Workbook workbook;
	  
	 public XMLRender(Workbook w, OutputStream out, String enc, boolean f) throws IOException{
	    encoding = enc;
	    workbook = w;
	    this.out = out;

	    if (encoding == null || !encoding.equals("UnicodeBig")){
	    	encoding = "UTF8";
	    }
	    
	    if (f){
	      writeFormattedXML();
	    }else{
	      writeXML();
	    }

	 }

	private void writeXML() {
		// TODO Auto-generated method stub
		
	}

	private void writeFormattedXML() {
		// TODO Auto-generated method stub
		
	}
}






