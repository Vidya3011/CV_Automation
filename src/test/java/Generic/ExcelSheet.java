package Generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Pom.WorkflowPOM;



public class ExcelSheet extends BaseClass {
	
	public static String SidbiWF(int rw,int cl) throws IOException{
		File f= new File("./data/TestData.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet mySht = wb.getSheet("SIDBI");
		Row row = mySht.getRow(rw);
		Cell cell = row.getCell(cl);
		String name = cell.getStringCellValue();
		return name;
		}
	
  

}
