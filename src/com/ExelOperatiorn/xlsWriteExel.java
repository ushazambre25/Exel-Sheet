package com.ExelOperatiorn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class xlsWriteExel {
	private static final String exelpath = "login1.xls";

	public static void main(String[] args) throws Exception {
		WritableWorkbook wwb = null;
		wwb = Workbook.createWorkbook(new File(exelpath));// file
		WritableSheet exelsheet = wwb.createSheet("Sheet1", 0);
		Label label = new Label(0, 0, "TestCount");
		exelsheet.addCell(label);

		Number number = new Number(0, 1, 1);
		exelsheet.addCell(number);
		
		label=new Label(1, 1, "Usha");
		exelsheet.addCell(label);
		
		number=new Number(0, 2, 2);
		exelsheet.addCell(number);
		
		label=new Label(1, 2, "Ajay");
		exelsheet.addCell(label);
		
		wwb.write();

	}

}
