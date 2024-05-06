package Script;

import org.openqa.selenium.WebDriver;

import Pom.ViewerToolbar;

public class SendToExport {
	private WebDriver driver;

	SendToExport() {

	}

	SendToExport(WebDriver driver) {
		this.driver = driver;
	}
	
	public void testSendToExport() throws Exception {
		ViewerToolbar export = new ViewerToolbar(driver);
		export.SetExport();
	
	}

}
