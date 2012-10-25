/*
 * @(#)Sheet.java  2012-7-27	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report;


/**
 * <p>Title:������</p>
 * <p>Description:��Ԫ��ļ��ϣ���ά��</p>
 * @author:  zenglizhi
 * @time:    2012-7-27
 * @version:  v1.0
 * @since:    SR5.0.1
 */
public interface Sheet {
	 /**
	   * ����ָ�������кŷ��ص�Ԫ��
	   * ��� column/row ָ�����Ǻϲ���Ԫ�񣬽��᷵��һ���յ�Ԫ�񣨳����ǵ�һ�����ӣ�
	   * @param �к�
	   * @param �к�
	   * @return һ��ָ������ĵ�Ԫ�����
	   */
	  public Cell getCell(int column, int row);

	  /**
	   * ���������ַ������ص�Ԫ�� ��eg."A4"
	   * @param loc the cell reference
	   * @return the cell at the specified co-ordinates
	   */
	  public Cell getCell(String loc);

	  /**
	   * ����������
	   * @return the number of rows in this sheet
	   */
	  public int getRows();

	  /**
	   * ����������
	   * @return the number of columns in this sheet
	   */
	  public int getColumns();

	  /**
	   * ����ָ���еĵ�Ԫ������
	   * @param row the rows whose cells are to be returned
	   * @return the cells on the given row
	   */
	  public Cell[] getRow(int row);

	  /**
	   * ����ָ���еĵ�Ԫ���б�
	   * @param col the column whose cells are to be returned
	   * @return the cells on the specified column
	   */
	  public Cell[] getColumn(int col);

	  /**
	   * �������е�Ԫ����� 
	   * @return Cell[][]
	   */
	  public Cell[][] getCells();
	  
	  /**
	   * Gets the name of this sheet
	   * @return the name of the sheet
	   */
	  public String getName();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}













