package com.excelPackage;

import java.io.IOException;

public class ReadCellValue {

	public static void main(String[] args) {
		try {
			System.out.println(ReadExcel.getStringData(1, 0));
			System.out.println(ReadExcel.getNumericData(1, 1));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
