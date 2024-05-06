package Script;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Lib;
import Pom.LoginPage;

import Pom.NewDocument;

public class AdminLogin extends BaseTest {
	@Test(priority = 1)
	public void testValidLogin() throws Exception {
		int rc = Lib.getRowCount(xlpath, "AdminLogin");
		Reporter.log("Excel Row Count: "+rc);
		for (int i = 1; i < rc; i++) {
			String un = Lib.getCellValue(xlpath, "AdminLogin", i, 0);
			Reporter.log("Username:" + un, true);			
			String pw = Lib.getCellValue(xlpath, "AdminLogin", i, 1);
			Reporter.log("Password:" + pw, true);
			String roomname = Lib.getCellValue(xlpath, "AdminLogin", i, 2);
			Reporter.log("Room:" + roomname, true);
			LoginPage login = new LoginPage(driver);
			login.SetUserName(un);
			login.SetPassword(pw);
			login.SetSelectRooms(roomname);
			Thread.sleep(3000);
			login.CheckRememberMe(un, pw);
			Thread.sleep(2000);
			login.ClickLoginButton(un, pw, roomname);
			
		

		}
	}
}
