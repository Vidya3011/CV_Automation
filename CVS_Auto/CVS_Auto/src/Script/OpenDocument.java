package Script;

import org.openqa.selenium.WebDriver;

import Pom.OpenDoc;
import Pom.ViewerToolbar;

public class OpenDocument {
	
	private WebDriver driver;

	OpenDocument(WebDriver driver) {
		this.driver = driver;
	}

	public void testOpenDocument() throws Exception{
		
		OpenDoc OC=new OpenDoc(driver);
		OC.SetExpandNode();
		OC.DocumentOpen();
		Thread.sleep(8000);
//		SendToMail mail=new SendToMail(driver);		
//		mail.testSendToMail();
		Thread.sleep(5000);
//		SendToExport export=new SendToExport(driver);
//		export.testSendToExport();
//		Thread.sleep(5000);
//		SendToPrint print=new SendToPrint(driver);
//		print.testSendToPrint();
//		Thread.sleep(5000);
		ViewerToolbar view = new ViewerToolbar(driver);
//		view.setConvToPDF();
		view.SetCopyPaste();
//		Thread.sleep(8000);
//		view.SetDeletePage();
//		Thread.sleep(5000);
//		view.SetSavePage();
		//view.SetCloseViewer();
	//	Thread.sleep(5000);
		//LogoutPage logout=new LogoutPage(driver);
		//logout.testLogout();

	}

}
