package SelemiumExample.SeleniumExampleProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadEx {

	public static void main(String[] args) throws IOException {
		File file = new File("./ExcelFile/Users.xlsx");
		FileInputStream fio = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fio);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		  XSSFRow row = sheet.getRow(0); XSSFCell cell = row.getCell(0);
		  System.out.println(cell.getStringCellValue());
		  //To read singe cell value
		  XSSFCell cell1 = row.getCell(1);
		  System.out.println(cell1.getStringCellValue());
		  
		  XSSFCell cell2 = row.getCell(2);
		  System.out.println(cell2.getNumericCellValue());
		 

		
		//To read extire data
		  int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum(); 
		  for(int i=0;i<=rowCount;i++) 
		  { 
			  int cellCount = sheet.getRow(i).getLastCellNum();
		  for(int j = 0;j<cellCount;j++)
		  {
		  System.out.println(sheet.getRow(i).getCell(j)); 
		  } 
		  
		  }		 
	
		System.out.println("Test complete");
	}

}
