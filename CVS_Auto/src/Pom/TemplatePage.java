package Pom;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import Generic.BaseClass;

public class TemplatePage extends BaseClass {
	public static WebElement element;
	
	
	// 1.
		public static WebElement Templates_MenuOption(WebDriver driver) {
			element = driver.findElement(By.id("documentTemplates"));
			return element;
		}

		// 2.
		public static WebElement Destination_Folder_Textbox(WebDriver driver) {
			element = driver.findElement(By.xpath("//input[@id='createDocuemtnLocation']"));
			return element;
		}

		// 2.
		public static WebElement Template_Test_Cabinet(WebDriver driver) {
			element = driver.findElement(By.xpath("(//a[text()='CVApp Test'])[1]"));
			return element;
		}

		// 3.
		public static WebElement Template_Test_Drawer(WebDriver driver) {
			element = driver.findElement(By.xpath("//a[text()='CVMobile App 2022']"));
			return element;
		}

		// 4.
		public static WebElement Template_Folder(WebDriver driver) {
			element = driver.findElement(By.xpath("//a[text()='Test apk']"));
			return element;
		}

		// 6.
		public static WebElement Cancel_Button_BrowseforFolder(WebDriver driver) {
			element = driver.findElement(By.id("navigatorTreeCancle"));
			return element;
		}

		// 7.
		public static WebElement OK_Button_BrowseforFolder(WebDriver driver) {
			element = driver.findElement(By.xpath("//button[@id='navigatorTreeOk']"));
			return element;
		}

		// 8.
		public static WebElement OK_Button_Permission_Denied(WebDriver driver) {
			element = driver.findElement(By.cssSelector("#deleteVslidationModelCloseTemplate1"));
			return element;
		}

		// 9.
		public static WebElement Click_Cross_Button_Browse_Folder_Dialog(WebDriver driver) {
			element = driver.findElement(By.xpath("//span[@id='navigatorModelClose']"));
			return element;
		}

		// 10.
		public static WebElement Select_Cabinet(WebDriver driver) {
			element = driver.findElement(By.linkText("New Cabinet"));
			return element;
		}

		// 11.
		public static WebElement Select_Drawer(WebDriver driver) {
			element = driver.findElement(By.linkText("New_Template"));
			return element;
		}

		// 12.
		public static WebElement Select_Folder(WebDriver driver) {
			element = driver.findElement(By.linkText("Template_Document"));
			return element;
		}

		// 13.
		public static WebElement Click_Document_Type_Dropdown(WebDriver driver) {
			element = driver.findElement(By.id("docTypeList"));
			return element;
		}

		// 14.
		public static WebElement Select_Dropdown_Value(WebDriver driver) {

			WebElement dropdown = driver.findElement(By.id("docTypeList"));
			dropdown.findElement(By.xpath("//option[. = 'CVReports']")).click();
			return dropdown;

		}

		// 15.
		public static WebElement Select_ReportName_Textbox(WebDriver driver) {
			element = driver.findElement(By.id("indices_15"));
			return element;

		}

		// 16.
		public static WebElement Enter_Report_Name(WebDriver driver) {
			element = driver.findElement(By.id("indices_15"));
			return element;
		}

		// 17.
		public static WebElement Select_Retain_Checkbox(WebDriver driver) {
			element = driver.findElement(By.id("retainBtn"));
			return element;
		}

		// 18.
		public static WebElement Save_Template_Button(WebDriver driver) {
			element = driver.findElement(By.id("createTemplateBtn"));
			return element;
		}

		// 19.
		public static WebElement Modify_Permission_OK_Button(WebDriver driver) {
			element = driver.findElement(By.id("CommentsMessageModelOk40"));
			return element;
		}// 20

		public static WebElement PageCreation_Alert_OK_Button(WebDriver driver) {
			element = driver.findElement(By.id("messageButtonOK"));
			return element;
		}

		// 21
		public static WebElement Clear_Button(WebDriver driver) {
			element = driver.findElement(By.id("createDocumentClear"));
			return element;
		}

		// 22.
		public static WebElement Select_Folder_Alert_OK_Button(WebDriver driver) {
			element = driver.findElement(By.xpath("//button[@id='CommentsMessageModelOk']"));
			return element;
		}

		// 23.
		public static WebElement Move_To_PlusIcon(WebDriver driver) {
			WebElement ele = driver.findElement(By.xpath(
					"/html[1]/body[1]/div[55]/div[59]/div[7]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]"));
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
			return ele;
		}

		// 24.
		public static WebElement Browse_Option(WebDriver driver) {
			WebElement ele1 = driver.findElement(By.id("viewDocumentAddPages"));
			// driver.findElement(By.cssSelector("#viewDocumentAddPages"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ele1);
			return ele1;
		}

		// 24/a
		public static WebElement Browse(WebDriver driver) {
			WebElement ele1 = driver.findElement(By.id("viewDocumentAddPages"));
			return ele1;

		}

		// 25.
		public static WebElement Folder_ErrorMessage(WebDriver driver) {
			SoftAssert softassert = new SoftAssert();
			String expectedtext = "Please add pages to the template before creating!";
			String actualtext = driver.findElement(By.xpath("//span[@id='commentMessage']")).getAttribute("value");
			softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
			return element;
			
		}

		// 26.
		public static WebElement Cabinet_Plus_button(WebDriver driver) {
			element = driver.findElement(By.cssSelector("#createDocuemntNavigator #\\33 5 > .jstree-icon"));
			return element;

		}

		// 27.
		public static WebElement Drawer_Plus_button(WebDriver driver) {
			element = driver.findElement(By.cssSelector("#\\31 037 > .jstree-icon"));
			return element;
		}

		// 28.
		public static WebElement Template_Description_No_button(WebDriver driver) {
			element = driver.findElement(By.id("createTemplateCancel"));
			return element;

		}

		// 29.
		public static WebElement Template_NameTextbox(WebDriver driver) {
			element = driver.findElement(By.id("templateName"));
			return element;

		}

		// 30.
		public static WebElement Template_Description_Messagebox(WebDriver driver) {
			element = driver.findElement(By.id("templateDescription"));
			return element;
		}

		// 31
		public static WebElement Template_Description_OK_button(WebDriver driver) {
			element = driver.findElement(By.id("createTemplateOk"));
			return element;
		}

		// 32.
		public static WebElement Template_Created_Message_Verify(WebDriver driver) {
			
			SoftAssert softassert = new SoftAssert();
			String expectedtext = "Template Created Successfully!";
			String actualtext = driver.findElement(By.xpath("//span[@id='messageContent']")).getAttribute("value");
			softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
			return element;
		}

		// 33.
		public static WebElement Template_Created_OK_button(WebDriver driver) {
			element = driver.findElement(By.id("messageButtonOK"));
			return element;
		}

		// 34.
		public static WebElement Moveto_Templates_Option(WebDriver driver) {
			WebElement ele = driver.findElement(By.xpath("//a[@id='documentTemplates']"));
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
			return ele;
		}

		// 35.
		public static WebElement Select_Template_Automation_Test_Option(WebDriver driver) {
			element = driver.findElement(By.id("Template_Automation_Test"));
			return element;
		}
		// 36. Testing POM 60 server

		// 1.
		public static WebElement Select_Cabinet_Test(WebDriver driver) {
			element = driver.findElement(By.cssSelector("#\\31 2103 > .jstree-icon"));
			return element;
		}

		// 2.
		public static WebElement Select_Drawer_Test(WebDriver driver) {
			element = driver.findElement(By.cssSelector("#\\31 2104 > .jstree-icon"));
			return element;
		}

		// 3.
		public static WebElement Select_Folder_Test(WebDriver driver) {
			element = driver.findElement(By.partialLinkText("Test a"));
			return element;
		}

		// 4.
		public static WebElement Select_ReportName_Test(WebDriver driver) {
			element = driver.findElement(By.id("indices_33"));
			return element;

		}

		// 5.
		public static WebElement Enter_Report_Name_Test(WebDriver driver) {
			element = driver.findElement(By.id("indices_33"));
			return element;

		}

		// 37
		public static WebElement Select_Created_Template(WebDriver driver) {
			element = driver.findElement(By.id("Template_Automation_Test1"));
			return element;
		}

		// 38
		public static WebElement Created_button(WebDriver driver) {
			element = driver.findElement(By.id("createDocumentSubmit"));
			return element;
		}

		// 39.
		public static WebElement Navigate_button(WebDriver driver) {
			element = driver.findElement(By.id("modelHome"));
			return element;
		}

		// 40.
		public static WebElement Click_Edit_Template_Button(WebDriver driver) {
			element = driver.findElement(By.id("editTemplate1"));
			return element;

		}

		// 41.
		public static WebElement EditTemplate_Description_Messagebox(WebDriver driver) {
			element = driver.findElement(By.id("editTemplateDescription"));
			return element;
		}

		// 42
		public static WebElement EditTemplate_Description_OK_button(WebDriver driver) {
			element = driver.findElement(By.id("editTemplateOk"));
			return element;
		}

		// 43.
		public static WebElement EditTemplate_Created_Message_Verify(WebDriver driver) {
			
			SoftAssert softassert = new SoftAssert();
			String expectedtext = "Template Edited Successfully!";
			String actualtext = driver.findElement(By.xpath("//span[@id='messageContent']")).getAttribute("value");
			softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
			return element;
			
		}

		// 44.
		public static WebElement EditTemplate_Created_OK_button(WebDriver driver) {
			element = driver.findElement(By.id("messageButtonOK"));
			return element;
		}

		// 45.
		public static WebElement Delete_Template_Button(WebDriver driver) {
			element = driver.findElement(By.id("delTemp"));
			return element;
		}

		// 46.
		public static WebElement Delete_Template_OK_Button(WebDriver driver) {
			element = driver.findElement(By.id("deleteTemplateOk"));
			return element;
		}

		// 47.
		public static WebElement Select_Home_Templatedoc(WebDriver driver) {
			element = driver.findElement(By.cssSelector(".odd:nth-child(1) > .customDocName"));
			return element;
		}
		//48.
		public static WebElement EditTemplate_Description_No_button(WebDriver driver) {
			element = driver.findElement(By.xpath("//button[@id='editTemplateCancel']"));
			return element;
		}
	}
