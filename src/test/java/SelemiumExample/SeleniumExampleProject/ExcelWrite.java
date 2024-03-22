package SelemiumExample.SeleniumExampleProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		//File file = new File("./ExcelFile/Users.xlsx");
		FileInputStream fio = new FileInputStream("./ExcelFile/Users.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fio);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		XSSFRow row6 = sheet.getRow(6); 
		
		row6.createCell(0).setCellValue("MyUsername");
		row6.createCell(1).setCellValue("MyPassword");
		row6.createCell(2).setCellValue("MyAddress");
		
		FileOutputStream fo = new FileOutputStream("./ExcelFile/Users.xlsx");
		workbook.write(fo);
		//workbook.close();
		fo.close();
		 
		System.out.println("Test complete");
	}

}
