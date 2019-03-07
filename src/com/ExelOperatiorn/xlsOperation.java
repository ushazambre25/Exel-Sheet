package com.ExelOperatiorn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import jxl.Workbook;

public class xlsOperation {
	public static void main(String[] args) throws Exception {
		String fpath="H:\\UshaData\\Selenium\\ExelSheet\\login1.xls";
		File src = new File(fpath);
		FileInputStream fis = new FileInputStream(src);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		/*
		 * String data = wb.getSheet(0).getCell(0, 1).getContents();
		 * System.out.println(data);
		 */
		int row = wb.getSheet(0).getRows();
		int col = wb.getSheet(0).getColumns(); 
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {
				String data = wb.getSheet(0).getCell(j,i).getContents();
				System.out.println(data);

			}

		}

	}

}
