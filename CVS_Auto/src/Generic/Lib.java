package Generic;

	import java.io.FileInputStream;

	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class Lib {
		public static String getCellValue(String xlpath,String Sheet,int r,int c){
			String value=" ";
			try{
				
				Workbook wb=WorkbookFactory.create(new FileInputStream(xlpath));
				value=wb.getSheet(Sheet).getRow(r).getCell(c).toString();
			}
			catch(Exception e){
				System.out.println("Excel value is not entered");
		}
			return value;
		}
		
		public static int getRowCount(String xlpath, String sheet){
			
			int rc=0;
			try{
				Workbook wb=WorkbookFactory.create(new FileInputStream(xlpath));
				rc=wb.getSheet(sheet).getLastRowNum();
			}
			catch(Exception e){
				System.out.println("Invalid row number");
			}
			return rc;


			}
	
}
