package Script;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import Generic.IAutoConst;
import Generic.Lib;
import Pom.ViewerToolbar;

public class SendToMail {
	private WebDriver driver;

	SendToMail() {

	}

	SendToMail(WebDriver driver) {
		this.driver = driver;
	}
	
	public void testSendToMail() throws Exception {
		String xlpath = IAutoConst.xlpath;
		int rc1 = Lib.getRowCount(xlpath, "Mail");
		for (int i = 1; i <= rc1; i++)
			try {
				{

					String Email_ID = Lib.getCellValue(xlpath, "Mail", i, 0);
					Reporter.log("Email ID:" + Email_ID, true);

					String Subject = Lib.getCellValue(xlpath, "Mail", i, 1);
					Reporter.log("Subject:" + Subject, true);
					
					ViewerToolbar mail = new ViewerToolbar(driver);
					mail.SetMail(Email_ID,Subject);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	
}
