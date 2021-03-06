package Rough;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import poiOperation.ReadGuru99ExcelFile;

public class p4 {

	public void readExcel(String sheetname,String filepath, String filename) throws IOException{
		File file= new File(filepath+ "\\" +filename);
		FileInputStream inputStream = new FileInputStream(file);

	    Workbook guru99Workbook = null;
	    
	    String fileExtensionName = filename.substring(filename.indexOf("."));

	    if(fileExtensionName.equals(".xlsx")){

	     guru99Workbook = new XSSFWorkbook(inputStream);

	    }
	    else if(fileExtensionName.equals(".xls")){

	        guru99Workbook = new HSSFWorkbook(inputStream);

	    }

	    Sheet guru99Sheet = guru99Workbook.getSheet(sheetname);

	    int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();

	    for (int i = 0; i < rowCount+1; i++) {

	        Row row = guru99Sheet.getRow(i);

	        for (int j = 0; j < row.getLastCellNum(); j++) {

	            System.out.print(row.getCell(j).getStringCellValue()+"|| ");

	        }

	        System.out.println();
	    } 

	    }  

	    public static void main(String...strings) throws IOException{

	    ReadGuru99ExcelFile objExcelFile = new ReadGuru99ExcelFile();

	    String filePath = System.getProperty("user.dir")+"\\src\\excelExportAndFileIO";

	    objExcelFile.readExcel(filePath,"ExportExcel.xlsx","ExcelGuru99Demo");

	}

}
