package Script;


import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import Generic.IAutoConst;
import Generic.Lib;
import Pom.NewDocument;

public class CreateDocument {
	private WebDriver driver;

	CreateDocument() {

	}
	String path="D:\\Automationimages";
	CreateDocument(WebDriver driver) {
		this.driver = driver;
	}

	public void testCreateDocument() throws Exception  {
		String xlpath = IAutoConst.xlpath;
		int rc = Lib.getRowCount(xlpath, "DocumentType");
		for (int i = 1; i <= rc; i++) {
			String Documenttypename = Lib.getCellValue(xlpath, "DocumentType", i, 0);
			Reporter.log("DocumentType is:" + Documenttypename, true);
			String IndexVal = Lib.getCellValue(xlpath, "DocumentType", i, 1);
			Reporter.log("IndexValue is:" + IndexVal, true);

			NewDocument newdoc = new NewDocument(driver);
			newdoc.SetCreateNewDocument();			
			Viewer view1=new Viewer(driver);
			newdoc.SetFileuploadmenu(path, view1);			
			newdoc.SetDestinationfolder();
			newdoc.SetDocType(Documenttypename, IndexVal);
			newdoc.SetClickCreateButton();
			Thread.sleep(5000);
//			Viewer view1=new Viewer(driver);
			view1.testViewerToolbar();

		}
	}
}
