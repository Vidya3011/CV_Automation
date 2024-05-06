package Pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ForDataDriven {
	
	
		
	
	public  static void main(String[] args) throws IOException {
		
		
		File f= new File("C:\\Users\\nisha.r\\Documents\\Downloads\\CVS_Auto\\data\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet mySht = wb.getSheet("SearchTab");
		Row row = mySht.getRow(1);
		Cell cell = row.getCell(3);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
