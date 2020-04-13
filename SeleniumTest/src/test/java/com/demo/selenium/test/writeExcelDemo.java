package com.demo.selenium.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExcelDemo {

	public static void writeExcel(String dataToWrite) throws IOException {

		File file = new File("D:\\rough\\First\\SeleniumTest\\src\\excelExportAndFileIO\\Datasheet.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook guru99Workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = guru99Workbook.getSheet("name");
		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		Row row = sheet.getRow(0);
		Row newRow = sheet.createRow(rowCount + 1);
		for (int j = 0; j < row.getLastCellNum(); j++) {
			Cell cell = newRow.createCell(j);
			cell.setCellValue(dataToWrite);
		}
		inputStream.close();
		FileOutputStream outputStream = new FileOutputStream(file);
		guru99Workbook.write(outputStream);
		outputStream.close();
	}
	public static void main(String args[]) throws IOException {
		writeExcel("mukeshkjfhdsjfhk");
	}
}
