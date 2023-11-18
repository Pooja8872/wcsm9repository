package readExelDataNew;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToMultipleDataFromExel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		 for(int i=1;i<=10;i++) {
		
	        	//To provide the file path
				FileInputStream fis = new FileInputStream("./src/main/resources/Demo.xlsx");
		         
				//Make the file Read to Read
				Workbook wb = WorkbookFactory.create(fis);
				
				//Read Method
				Sheet sheet = wb.getSheet("IPL");
				Row row = sheet.getRow(i);
				Cell cell = row.getCell(0);
				String data = cell.getStringCellValue();
				System.out.println(data);
		 }
	}

}
