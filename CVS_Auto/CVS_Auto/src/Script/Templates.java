package Script;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.TemplatePage;

public class Templates extends Generic.BaseClass {
	

/*	@BeforeClass
	public void LandBrowser() {
	   
	   loadBrowser("Chrome");
	   launchUrl();
		
	}

	@Test(priority = 01)
	public void Login_EWA() throws InterruptedException {
		loginCVS();

     }*/
	
	 @Test(priority = 01)
		public void Verify_to_Create_Template() throws InterruptedException, IOException {

			Generic.BaseClass.Refresh_Button(driver).click();
			Thread.sleep(6000);
			TemplatePage.Templates_MenuOption(driver).click();
			Thread.sleep(3000);
			TemplatePage.Destination_Folder_Textbox(driver).click();
			Thread.sleep(4000);
			jsclick(Pom.TemplatePage.Template_Test_Cabinet(driver));
			Thread.sleep(4000);
			jsclick(Pom.TemplatePage.Template_Test_Drawer(driver));
			Thread.sleep(4000);
			jsclick(Pom.TemplatePage.Template_Folder(driver));
			Reporter.log("Folder is selected for Templates", true);
			TemplatePage.OK_Button_BrowseforFolder(driver).click();
			Thread.sleep(4000);
			jsclick(TemplatePage.Click_Document_Type_Dropdown(driver));
			Thread.sleep(4000);
			TemplatePage.Select_Dropdown_Value(driver);
			Thread.sleep(4000);
			TemplatePage.Select_ReportName_Test(driver).click();
			Thread.sleep(4000);
			TemplatePage.Select_ReportName_Test(driver).sendKeys("New_Templates1");
			Thread.sleep(3000);
			TemplatePage.Move_To_PlusIcon(driver);
			TemplatePage.Browse_Option(driver);
			Thread.sleep(3000);
			Runtime.getRuntime().exec("C:\\AutoImage\\FilesAuto_x64.exe");
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.alertIsPresent());

			Alert alt = driver.switchTo().alert();
			alt.accept();

			Reporter.log("Page is uploaded successfully", true);
			Thread.sleep(6000);
			TemplatePage.Select_Retain_Checkbox(driver).click();
			TemplatePage.Save_Template_Button(driver).click();
			Reporter.log("Save Template button clicked successfully", true);
			TemplatePage.Template_Description_No_button(driver).click();
			Thread.sleep(3000);
			TemplatePage.Save_Template_Button(driver).click();
			TemplatePage.Template_NameTextbox(driver).click();
			Thread.sleep(3000);
			TemplatePage.Template_NameTextbox(driver).sendKeys("Template_Automation_Test1");
			TemplatePage.Template_Description_Messagebox(driver).click();
			Thread.sleep(4000);
			TemplatePage.Template_Description_Messagebox(driver).sendKeys("New Template for Automation Created");
			Thread.sleep(3000);
			TemplatePage.Template_Description_OK_button(driver).click();
			TemplatePage.Template_Created_Message_Verify(driver);
			Thread.sleep(4000);
			jsclick(TemplatePage.Template_Created_OK_button(driver));
			Reporter.log("New Template created successfully!!", true);
			Thread.sleep(3000);
			TemplatePage.Moveto_Templates_Option(driver);
			Thread.sleep(4000);
			jsclick(TemplatePage.Select_Created_Template(driver));
			Thread.sleep(4000);
			jsclick(TemplatePage.Created_button(driver));
			Thread.sleep(4000);
			Reporter.log("Document created successfully", true);
			TemplatePage.Navigate_button(driver).click();
			Thread.sleep(4000);
		}

		@Test(priority = 02)
		public void Verify_to_Edit_and_Delete_Template() throws InterruptedException, IOException {

			jsclick(TemplatePage.Select_Home_Templatedoc(driver));
			Thread.sleep(4000);
			jsclick(TemplatePage.Click_Edit_Template_Button(driver));
			Thread.sleep(4000);
			TemplatePage.EditTemplate_Description_Messagebox(driver).clear();
			Thread.sleep(4000);
			TemplatePage.EditTemplate_Description_Messagebox(driver).sendKeys("Template Edited successfully");
			Thread.sleep(4000);
			TemplatePage.EditTemplate_Description_OK_button(driver).click();
			Thread.sleep(4000);
			TemplatePage.EditTemplate_Created_Message_Verify(driver);
			Reporter.log("Template edited successfully", true);
			jsclick(TemplatePage.EditTemplate_Created_OK_button(driver));
			Thread.sleep(4000);
			TemplatePage.EditTemplate_Description_No_button(driver).click();
			Thread.sleep(4000);
			jsclick(TemplatePage.Delete_Template_Button(driver));
			Thread.sleep(4000);
			jsclick(TemplatePage.Delete_Template_OK_Button(driver));
			Reporter.log("Template Deleted Successfully", true);
		}
		}
