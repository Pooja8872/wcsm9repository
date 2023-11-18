package readExelDataNew;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
 
	public String readExcelData(String excelPath, String sheetName,int rowNo,int cellNo ) {
		
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		String data = cell.getStringCellValue();
		return data;
		
	}	
		public void writeExcelData(String excelPath, String sheetName,int rowNo,int cellNo,String data) {
			
			FileInputStream fis = new FileInputStream(excelPath);//Provide path of excel file
			
			Workbook wb = WorkbookFactory.create(fis);//Make the file read to read
			
			Sheet sheet = wb.getSheet(sheetName);//Get into the Sheet
			Row row = sheet.getRow(rowNo);//Get into the desired row
			Cell cell = row.getCell(cellNo);//Create the desired Cell
			cell.setCellValue(data);
			
			FileOutputStream fos = new FileOutputStream(excelPath);//Provide the path of excel file 
			wb.write(fos);// Write the data in excel file
	} 
		public int rowCount(String excelPath, String sheetName)  {
			FileInputStream fis = new FileInputStream(excelPath);//Provide path of excel file
			Workbook wb=WorkbookFactory.create(fis);//Get into the Sheet
			Sheet sheet = wb.getSheet(sheetName);//Get into the sheet
			int rc=sheet.getLastRowNum();//Get the No. of rows present in the sheet
			return rc;
			
		}
		

       }



}























