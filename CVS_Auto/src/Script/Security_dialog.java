package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Security_dialog extends Generic.BaseClass {

	

	@BeforeClass
	public void LoadBrowser() {
		loadBrowser("Chrome");
		launchUrl();
	}

   @Test(priority=1)
	
	public void Login_EWA() throws Exception {
		loginCVS();
	}
	
	@Test(priority=2)
	public void Open_Security_Dialog_And_Verify_Title() throws InterruptedException {
		movingDoublecli(Pom.Security.Select_Cabinet(driver), Pom.Customcolumns.Select_Cabinet(driver));
		Thread.sleep(3000);
		movingDoublecli(Pom.Security.Select_Drawer(driver), Pom.Customcolumns.Select_Drawer(driver));
		Thread.sleep(3000);
		movingDoublecli(Pom.Security.Select_Folder(driver), Pom.Customcolumns.Select_Folder(driver));
		Thread.sleep(3000);
		Pom.Security.MoveTo_Menu_RoomName(driver);
		Thread.sleep(4000);
		Pom.Security.security_option(driver).click();
		Pom.Security.titelvalidation(driver);
		Reporter.log("Security dialog Title Verified", true);
	}

	@Test(priority=3)
	public void Verify_Add_User_And_Give_Permissions() throws InterruptedException {
		jsclick(Pom.Security.Add_Button(driver));
		Thread.sleep(3000);
		Pom.Security.cvnamed(driver).click();
		Thread.sleep(3000);
		jsclick(Pom.Security.Select_User(driver));
		Pom.Security.OK_Button_UserDialog(driver).click();
		Thread.sleep(4000);
		Pom.Security.DoubleClick_CrossBar(driver);
		Pom.Security.Apply_Button_SecurityDialog(driver).click();
		Pom.Security.Ok_Button_SecurityDialog(driver).click();
		Reporter.log("User Added with Access all Security permission", true);
	}

	@Test(priority=4)
	public void Verify_Remove_User() throws InterruptedException {
		Thread.sleep(3000);
		Pom.Security.MoveTo_Menu_RoomName(driver);
		jsclick(Pom.Security.security_option(driver));
		Thread.sleep(3000);
		Pom.Security.Select_Added_User(driver).click();
		Thread.sleep(3000);
		Pom.Security.Remove_Button(driver).click();
		Thread.sleep(3000);
		Pom.Security.Ok_Button_SecurityDialog(driver).click();
		Reporter.log("Added User Remove Successfully", true);
	}

	@Test(priority=5)
	public void Verify_The_Cancel_Button() throws InterruptedException {
		jsclick(Pom.Security.MoveTo_Menu_RoomName(driver));
		Thread.sleep(3000);
		jsclick(Pom.Security.security_option(driver));
		Thread.sleep(3000);
		jsclick(Pom.Security.Cancel_Button_SecurityDialog(driver));
		Thread.sleep(3000);
		Reporter.log("Cancel button is Clickable", true);
	}

	@Test(priority=6)
	public void Verify_The_Cross_Button_Of_Security_Dialog() throws InterruptedException {
		jsclick(Pom.Security.MoveTo_Menu_RoomName(driver));
		Thread.sleep(4000);
		jsclick(Pom.Security.security_option(driver));
		Thread.sleep(3000);
		jsclick(Pom.Security.Cross_Button_SecurityDialog(driver));
		Thread.sleep(3000);
		Reporter.log("Cross button of Security Dialog Verified", true);
	}

	@Test(priority=7)
	public void Verify_The_Reset_Functionality() throws InterruptedException {
		Pom.Security.MoveTo_Menu_RoomName(driver);
		Thread.sleep(3000);
		jsclick(Pom.Security.security_option(driver));
		Thread.sleep(3000);
		jsclick(Pom.Security.Reset_Button_SecurityDialog(driver));
		Thread.sleep(3000);
		Pom.Security.No_Button_Securitypopup(driver).click();
		Thread.sleep(3000);
		jsclick(Pom.Security.Reset_Button_SecurityDialog(driver));
		Thread.sleep(3000);
		Pom.Security.Yes_Button_Securitypopup(driver).click();
		Thread.sleep(3000);
		Pom.Security.Ok_Button_SecurityDialog(driver).click();
		Reporter.log("Functionality is Reset Successfully", true);
	}
}

