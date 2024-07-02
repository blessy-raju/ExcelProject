package com.excelPackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static FileInputStream f;

	public static String getStringData(int a, int b) throws IOException {
		f = new FileInputStream("D:\\SeleniumAutomation\\Book1.xlsx");
		wb = new XSSFWorkbook(f);
		sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(a);
		Cell cell = row.getCell(b);
		String value = cell.getStringCellValue();
		return value;

	}

	public static int getNumericData(int a, int b) throws IOException {
		f = new FileInputStream("D:\\SeleniumAutomation\\Book1.xlsx");
		wb = new XSSFWorkbook(f);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(a);
		Cell cell = row.getCell(b);
		int value = (int) cell.getNumericCellValue();
		// OR (change the method return type to double as getNumericCellValue() always
		// returns double
		// double value=cell.getNumericCellValue();
		return value;
	}

}
