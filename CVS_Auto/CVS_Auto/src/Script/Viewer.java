package Script;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import Generic.IAutoConst;
import Generic.Lib;
import Pom.NewDocument;
import Pom.ViewerToolbar;

public class Viewer {

	private String[] fileNames;
	// private int count;
	private WebDriver driver;

	Viewer() {

	}

	Viewer(WebDriver driver) {
		this.driver = driver;
	}

	public void testViewerToolbar() throws Exception {
		ViewerToolbar view = new ViewerToolbar(driver);
		//view.setConvToPDF();
		  view.SetFullScreen(); 
		  Thread.sleep(2000);
		  view.SetCopyPaste();
		  view.SetDeletePage(); 
		  view.SetSavePage();		 
		  String xlpath = IAutoConst.xlpath;
			int rc = Lib.getRowCount(xlpath, "SplitRange");
			for (int i = 1; i <= rc; i++) {

				String StartPage = Lib.getCellValue(xlpath, "SplitRange", i, 0);
				StartPage = StartPage.substring(0, StartPage.length()-2);
				Reporter.log("StartRange:" + StartPage, true);

				String EndPage = Lib.getCellValue(xlpath, "SplitRange", i, 1);
				EndPage = EndPage.substring(0, EndPage.length()-2);
				Reporter.log("EndRange:" + EndPage, true);
				

				for (int j = 0; j < fileNames.length; j++) {
					String fileName = fileNames[j];
					String fileExt = fileName.substring(fileName.length() - 4, fileName.length());
					if (".tif".equalsIgnoreCase(fileExt) || ".tiff".equalsIgnoreCase(fileExt)) {
						Reporter.log("FileName Ext : " + fileName.substring(fileName.length() - 4, fileName.length()),
								true);
						view.SetSplitPageTiff(fileNames[j] , 3);
						// System.out.println("FileName Ext : "+fileName.substring(fileName.length()-4),
						// fileName.length()));
					} else if (".pdf".equalsIgnoreCase(fileExt)) {
						view.SetSplitPagePdf(fileName, StartPage, EndPage,j);
					}
				}
				
			}
			 view.SetCloseViewer();
			
			
	}
	

	/*
	 * public int getCount() { return count; }
	 * 
	 * public void setCount(int count) { this.count = count; }
	 */

	public String[] getFilenames() {
		return fileNames;
	}

	public void setFilenames(String[] filenames) {
		this.fileNames = filenames;
	}

}
