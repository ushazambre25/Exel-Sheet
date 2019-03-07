package com.ExelOperatiorn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadOperation {
	public static void main(String[] args) throws Exception {
		File src = new File("TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		/*
		 * String data = sheet1.getRow(0).getCell(0).getStringCellValue();
		 * System.out.println(data); String data1 =
		 * sheet1.getRow(0).getCell(1).getStringCellValue(); System.out.println(data1);
		 */

		
		for (int i = 0; i < sheet1.getLastRowNum(); i++) {
			for(int k=0;k<sheet1.getRow(0).getLastCellNum();k++) {
				
		
			String data0 = sheet1.getRow(i+1).getCell(k).toString();
			System.out.println(data0);
		}
		}
		wb.close();

	}

}
