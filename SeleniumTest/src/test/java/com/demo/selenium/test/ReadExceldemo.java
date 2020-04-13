package com.demo.selenium.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExceldemo {

	public static void readData() throws IOException{
		File file =new File("D:\\rough\\First\\SeleniumTest\\src\\excelExportAndFileIO\\Datasheet.xlsx"); //path is not correct
		FileInputStream fis =new FileInputStream(file);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sh= wb.getSheet("name");
		int rowcount = sh.getLastRowNum() -sh.getFirstRowNum();
		for(int i=0;i<=rowcount;i++)
		{
			Row row =sh.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			{
				System.out.println(row.getCell(j).getStringCellValue()+ "!!");
			}
			System.out.println();
		}

	}
	
	public static void main(String[] args) throws IOException {
		readData();
	}
	
}
