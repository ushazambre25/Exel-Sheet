package com.ExelOperatiorn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelDataConfig {

	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet1;

	public ExelDataConfig(String exelpath) {
		File src = new File("TestData.xlsx");
		try {
			fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
			
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public String getData(int sheetnumber, int row, int column) {
		sheet1 = wb.getSheetAt(sheetnumber);

		String data0 = sheet1.getRow(row).getCell(column).getStringCellValue();
		return data0;

	}

}
