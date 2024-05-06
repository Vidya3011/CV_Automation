package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import Generic.BaseClass;

public class Customcolumns extends BaseClass {
	
	public static WebElement element;

	 // 1.
		public static WebElement Select_Cabinet(WebDriver driver) {
			element = driver.findElement(By.cssSelector("#\\31 2103 > .jstree-icon"));
			return element;
		}

		// 2.
		public static WebElement Select_Drawer(WebDriver driver) {
			element = driver.findElement(By.cssSelector("#\\31 2104 > .jstree-icon"));
			return element;
		}

		// 3.
		public static WebElement Select_Folder(WebDriver driver) {
			element =     driver.findElement(By.linkText("Test apk"));
			return element;
		}

	//4.
		public static WebElement MoveTo_Menu_RoomName(WebDriver driver) {

			element = driver.findElement(By.id("navigationMenuBtn"));
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
			return element;
		}

	//5.
		public static WebElement Custom_Columns_option(WebDriver driver) {

			element = driver.findElement(By.id("CustomList"));
			return element;
		}

	//6.
		public static WebElement titelvalidation(WebDriver driver) {

			SoftAssert softassert = new SoftAssert();
			String expectedtext = "Custom List";
			String actualtext = driver.findElement(By.cssSelector("div[id='CustomUserTitle'] h2[class='headerText']"))
					.getAttribute("value");
			softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
			return element;
		}

	//7.
		public static WebElement textvalidation(WebDriver driver) {

			SoftAssert softassert = new SoftAssert();
			String expectedtext = "Set custom columns";
			String actualtext = driver.findElement(By.xpath("/html[1]/body[1]/div[32]/div[1]/label[1]"))
					.getAttribute("value");
			softassert.assertEquals(actualtext, expectedtext, "Text verification failed");

			String expectedtext2 = "Select the indices you want display for documents";
			String actualtext2 = driver.findElement(By.xpath("/html[1]/body[1]/div[32]/div[1]/div[2]/h2[1]"))
					.getAttribute("value");
			softassert.assertEquals(actualtext2, expectedtext2, "Text verification failed");

			return element;
		}

	//8.
		public static WebElement Select_Indices01(WebDriver driver) {

			element = driver.findElement(By.xpath("/html[1]/body[1]/div[32]/div[1]/ul[1]/li[34]/span[2]"));
			return element;
		}

		public static WebElement Select_Indices02(WebDriver driver) {
			element = driver.findElement(By.xpath("/html[1]/body[1]/div[32]/div[1]/ul[1]/li[39]/span[2]"));
			return element;
		}

		public static WebElement Select_Indices03(WebDriver driver) {
			element = driver.findElement(By.xpath("/html[1]/body[1]/div[32]/div[1]/ul[1]/li[26]/span[2]"));
			return element;
		}

	// 9.
		public static WebElement Ok_Button_CustomList(WebDriver driver) throws InterruptedException {
			WebElement ele = driver.findElement(By.id("CustomListOK"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ele);
			return ele;
		}

	//10.
		public static WebElement Scroll_Button(WebDriver driver) {
			{
				WebElement element = driver.findElement(By.id("CustomListDlgUL"));
				Actions builder = new Actions(driver);
				builder.moveToElement(element).clickAndHold().perform();
			}
			{
				WebElement element = driver.findElement(By.id("CustomListDlgUL"));
				Actions builder = new Actions(driver);
				builder.moveToElement(element).perform();
			}
			{
				WebElement element = driver.findElement(By.id("CustomListDlgUL"));
				Actions builder = new Actions(driver);
				builder.moveToElement(element).release().perform();
			}
			return element;

		}

	//11.
		public static WebElement Verify_Indicess_Value(WebDriver driver) throws InterruptedException {
			Thread.sleep(4000);
			SoftAssert softassert = new SoftAssert();

			String expectedtext = "ADDRESS";
			String actualtext = driver.findElement(By.xpath("//th[contains(text(),'ADDRESS')]")).getAttribute("value");
			softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
			System.out.println("Indices01 value displayed successfully");

			String expectedtext1 = "BANK";
			String actualtext1 = driver.findElement(By.xpath("//th[contains(text(),'BANK')]")).getAttribute("value");
			softassert.assertEquals(actualtext1, expectedtext1, "Text verification failed");
			System.out.println("Indices02 value displayed successfully");

			String expectedtext2 = "BIRTHDATE";
			String actualtext2 = driver.findElement(By.xpath("//th[contains(text(),'BIRTHDATE')]")).getAttribute("value");
			softassert.assertEquals(actualtext2, expectedtext2, "Text verification failed");
			System.out.println("Indices03 value displayed successfully");

			return element;

		}

		// 12.
		public static WebElement Default_Button_CustomList(WebDriver driver) throws InterruptedException {
			WebElement ele = driver.findElement(By.id("DefaultCustomList"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ele);
			return ele;
		}

		// 13.
		public static WebElement Cancel_Button_CustomList(WebDriver driver) throws InterruptedException {
			WebElement ele = driver.findElement(By.xpath("//button[@id='CustomListCancel']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ele);
			return ele;
		}

		// 14.
		public static WebElement Click_DropdownOption(WebDriver driver) {
			element = driver.findElement(By.id("setCustomListdropdown"));
			return element;
		}

		// 15.
		public static WebElement Select_DropdownValue(WebDriver driver) {
			WebElement dropdown = driver.findElement(By.id("setCustomListdropdown"));
			dropdown.findElement(By.xpath("//option[. = 'Room level']")).click();
			return element;
		}

		// 16.
		public static WebElement Set_RoomLevel_Indices(WebDriver driver) {

			element = driver.findElement(By.id("spanCheckCustomValues_Bill Number"));
			return element;
		}

	//17.
		public static WebElement Reset_Column_option(WebDriver driver) {

			element = driver.findElement(By.id("Resetcolumns"));
			return element;
		}

	//18.
		public static WebElement ResetColumn_popup_OK_button(WebDriver driver) {

			element = driver.findElement(By.id("resetColumsOk"));
			return element;
		}

	//19.
		public static WebElement Setting_Icon(WebDriver driver) {
			element = driver.findElement(By.id("imgSettings"));
			return element;

		}

		// 20.
		public static WebElement My_Preferencesetting(WebDriver driver) {
			element = driver.findElement(By.cssSelector("#myPreferencesSettingsNav > p"));
			return element;
		}

		// 21.
		public static WebElement Verify_CompactView_checkbox(WebDriver driver) {
			if (driver.findElement(By.id("displayCompactViewOfList")).isSelected() == true) {
				driver.findElement(By.id("displayCompactViewOfList")).click();
			}
			return element;
		}

		// 22.
		public static WebElement Apply_button(WebDriver driver) {
			element = driver.findElement(By.id("myPreferencesSubmit"));
			return element;
		}

		// Search *

		// 23.
		public static WebElement MoveTo_Search_Option(WebDriver driver) {

			element = driver.findElement(By.xpath("//a[@id='advSearchMenuBtn']"));
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
			return element;

		}

		// 24.
		public static WebElement Search_Custom_Columns_option(WebDriver driver) {

			element = driver.findElement(By.id("culstomcolsearch"));
			return element;
		}

		// 25.
		public static WebElement Search_titelvalidation(WebDriver driver) {

			SoftAssert softassert = new SoftAssert();
			String expectedtext = "Custom List";
			String actualtext = driver.findElement(By.xpath("/html[1]/body[1]/div[32]/div[1]/div[1]/h2[1]"))
					.getAttribute("value");
			softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
			return element;
		}

		// 26.
		public static WebElement Search_textvalidation(WebDriver driver) {

			SoftAssert softassert = new SoftAssert();
			String expectedtext = "Select the indices you want display for documents";
			String actualtext = driver
					.findElement(By.xpath("//h2[contains(text(),'Select the indices you want display for documents')]"))
					.getAttribute("value");
			softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
			return element;

		}

		// 27.
		public static WebElement Search_Scroll_Button(WebDriver driver) {
			{
				WebElement element = driver.findElement(By.id("CustomListDlgUL"));
				Actions builder = new Actions(driver);
				builder.moveToElement(element).clickAndHold().perform();
			}
			{
				WebElement element = driver.findElement(By.id("CustomListDlgUL"));
				Actions builder = new Actions(driver);
				builder.moveToElement(element).perform();
			}
			{
				WebElement element = driver.findElement(By.id("CustomListDlgUL"));
				Actions builder = new Actions(driver);
				builder.moveToElement(element).release().perform();
			}
			return element;
		}

		// 28.
		public static WebElement Search_Select_Indices01(WebDriver driver) {

			element = driver.findElement(By.xpath("/html[1]/body[1]/div[32]/div[1]/ul[1]/li[34]/span[2]"));
			return element;
		}

		// 29.
		public static WebElement Search_Ok_Button_CustomList(WebDriver driver) throws InterruptedException {
			WebElement ele = driver.findElement(By.id("CustomListOK"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ele);
			return ele;
		}

		// 30.
		public static WebElement Search_Verify_Indicess_Value(WebDriver driver) throws InterruptedException {

			Thread.sleep(4000);
			SoftAssert softassert = new SoftAssert();
			String expectedtext = "BANK";
			String actualtext = driver.findElement(By.xpath("//th[contains(text(),'BANK')]")).getAttribute("value");
			softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
			System.out.println("Indices01 value displayed successfully");
			return element;

		}

		// 31.
		public static WebElement Click_Search_Option(WebDriver driver) {

			element = driver.findElement(By.xpath("//a[@id='advSearchMenuBtn']"));
			return element;
		}

		// 32.
		public static WebElement Find_Button(WebDriver driver) {

			element = driver.findElement(By.id("advFindBtnLabel"));
			return element;
		}

		// 33.
		public static WebElement Click_ResetColumn(WebDriver driver) {

			element = driver.findElement(By.id("Defaultcolsearch"));
			return element;
		}

		// 34.
		public static WebElement Ok_Button_ResetColumn(WebDriver driver) {

			element = driver.findElement(By.id("resetColumsOk"));
			return element;
		}

		// ToDoList *

		// 35.
		public static WebElement MoveTo_ToDoList_Option(WebDriver driver) {

			element = driver.findElement(By.xpath("//a[@id='myTaskMenu']"));
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
			return element;

		}

		// 36.
		public static WebElement ToDoList_Custom_Columns_option(WebDriver driver) {

			element = driver.findElement(By.id("todoCustomColumns"));
			return element;
		}

		// 37.
		public static WebElement ToDoList_titelvalidation(WebDriver driver) {

			SoftAssert softassert = new SoftAssert();
			String expectedtext = "Custom List";
			String actualtext = driver.findElement(By.xpath("/html[1]/body[1]/div[33]/div[1]/div[1]/h2[1]"))
					.getAttribute("value");
			softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
			return element;
		}

		// 38 .
		public static WebElement ToDoList_textvalidation(WebDriver driver) {

			SoftAssert softassert = new SoftAssert();
			String expectedtext = "Select the indices you want display for documents";
			String actualtext = driver.findElement(By.xpath("/html[1]/body[1]/div[33]/div[1]/div[2]/h2[1]"))
					.getAttribute("value");
			softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
			return element;
		}

		// 39 .
		public static WebElement ToDoList_Scroll_Button(WebDriver driver) {
			{
				WebElement element = driver.findElement(By.id("CustomListDlgUL"));
				Actions builder = new Actions(driver);
				builder.moveToElement(element).clickAndHold().perform();
			}
			{
				WebElement element = driver.findElement(By.id("CustomListDlgUL"));
				Actions builder = new Actions(driver);
				builder.moveToElement(element).perform();
			}
			{
				WebElement element = driver.findElement(By.id("CustomListDlgUL"));
				Actions builder = new Actions(driver);
				builder.moveToElement(element).release().perform();
			}
			return element;
		}

		// 40.
		public static WebElement ToDoList_Select_Indices(WebDriver driver) {

			element = driver.findElement(By.xpath("/html[1]/body[1]/div[33]/div[1]/ul[1]/li[26]/span[2]"));
			return element;
		}

		// 41.
		public static WebElement ToDoList_Ok_Button_CustomList(WebDriver driver) throws InterruptedException {
			WebElement ele = driver.findElement(By.id("CustomListTodoOK"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ele);
			return ele;
		}

		// 42.
		public static WebElement ToDoList_Verify_Indicess_Value(WebDriver driver) throws InterruptedException {
			Thread.sleep(4000);

			SoftAssert softassert = new SoftAssert();
			String expectedtext = "AMOUNT";
			String actualtext = driver.findElement(By.xpath("//th[contains(text(),'AMOUNT')]")).getAttribute("value");
			softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
			System.out.println("Indices01 value displayed successfully");
			return element;
		}

		// 43.
		public static WebElement Select_All_Item(WebDriver driver) {
			element = driver.findElement(By.id("todoAll"));
			return element;
		}

		// 44.
		public static WebElement To_Do_Resetcolumn_Option(WebDriver driver) {
			element = driver.findElement(By.id("todoResetColumns"));
			return element;
		}

		// 45.
		public static WebElement ToDoList_Reset_Column_OK_Button(WebDriver driver) {
			element = driver.findElement(By.id("resetColumsOk"));
			return element;

		}
	}

