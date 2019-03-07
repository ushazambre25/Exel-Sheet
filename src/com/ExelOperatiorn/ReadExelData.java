package com.ExelOperatiorn;

public class ReadExelData {
	public static void main(String[] args) {
		ExelDataConfig exel = new ExelDataConfig("TestData.xlsx");

		System.out.println(exel.getData(0, 1, 1));
	}

}
