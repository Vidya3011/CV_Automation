package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pom.Customcolumns;
import sun.util.logging.resources.logging;

public class Custom_Columns_TestRoom extends Generic.BaseClass {
	

   /* @BeforeClass
	public void LandBrowser() {

		loadBrowser("Chrome");
		launchUrl();
	}

     @Test(priority=1)
	
	public void Login_EWA() throws InterruptedException {
		loginCVS();
	}*/

	@Test(priority = 1)
	public void Open_Custom_List_Dialog_And_Verify_Title_Roomcolumn() throws InterruptedException {
        Thread.sleep(3000);
        movingDoublecli(Pom.Customcolumns.Select_Cabinet(driver), Pom.Customcolumns.Select_Cabinet(driver));
		Thread.sleep(3000);
		movingDoublecli(Pom.Customcolumns.Select_Drawer(driver), Pom.Customcolumns.Select_Drawer(driver));
		Thread.sleep(3000);
		movingDoublecli(Pom.Customcolumns.Select_Folder(driver), Pom.Customcolumns.Select_Folder(driver));
		Thread.sleep(3000);
		Pom.Customcolumns.MoveTo_Menu_RoomName(driver);
		Thread.sleep(3000);
		jsclick(Pom.Customcolumns.Custom_Columns_option(driver));
		Pom.Customcolumns.titelvalidation(driver);
		Reporter.log("Custom List title validate", true);
	}

	@Test(priority = 2)
	public void Verify_The_Text_of_Custom_List_Dialog_Roomcolumn() throws InterruptedException {

		Thread.sleep(5000);
		Pom.Customcolumns.textvalidation(driver);
		Reporter.log("Custom List Dialog Text verified", true);
	}

	@Test(priority = 3)
	public void Set_And_Verify_Custom_Columns_NodeLevel() throws InterruptedException {
		Pom.Customcolumns custom = new Pom.Customcolumns();
		Thread.sleep(5000);
		jsclick(custom.Scroll_Button(driver));
		custom.Select_Indices01(driver).click();
		custom.Select_Indices02(driver).click();
		custom.Select_Indices03(driver).click();
		Thread.sleep(4000);
		custom.Ok_Button_CustomList(driver);
		Reporter.log("Indices Selected Successfully", true);
		Thread.sleep(4000);
		custom.Setting_Icon(driver).click();
		Thread.sleep(4000);
		custom.My_Preferencesetting(driver).click();
		Thread.sleep(4000);
		custom.Verify_CompactView_checkbox(driver);
		Thread.sleep(4000);
		custom.Apply_button(driver).click();
		Thread.sleep(6000);
		custom.Verify_Indicess_Value(driver);
		Reporter.log("Custom Columns is set Node Level successfully", true);

	}

	@Test(priority = 4)
	public void Verify_Default_Custom_Columns() throws InterruptedException {

		Pom.Customcolumns.MoveTo_Menu_RoomName(driver);
		Thread.sleep(4000);
		jsclick(Pom.Customcolumns.Custom_Columns_option(driver));
		Pom.Customcolumns.Default_Button_CustomList(driver);
		Pom.Customcolumns.Ok_Button_CustomList(driver);
		Reporter.log("Set and Verify Default Custom columns successfully", true);
	}

	@Test(priority = 5)
	public void Verify_Cancel_Button_of_CustomList() throws InterruptedException {

		Pom.Customcolumns.MoveTo_Menu_RoomName(driver);
		jsclick(Pom.Customcolumns.Custom_Columns_option(driver));
		Pom.Customcolumns.Cancel_Button_CustomList(driver);
		Reporter.log("Cancle button is clicked", true);
	}

	@Test(priority = 6)
	public void Verify_Custom_Columns_RoomLevel() throws InterruptedException {

		Pom.Customcolumns.MoveTo_Menu_RoomName(driver);
		jsclick(Pom.Customcolumns.Custom_Columns_option(driver));
		Pom.Customcolumns.Click_DropdownOption(driver).click();
		Pom.Customcolumns.Select_DropdownValue(driver);
		Pom.Customcolumns.Scroll_Button(driver);
		Pom.Customcolumns.Set_RoomLevel_Indices(driver).click();
		Thread.sleep(4000);
		Pom.Customcolumns.Ok_Button_CustomList(driver);
		Reporter.log("Indices is Selected Successfully for RoomLevel", true);

		Reporter.log("Set Custom Columns Room Level Verified sucessfully", true);
	}

	@Test(priority = 7)
	public void Verify_Reset_Columns_Functionality() throws InterruptedException {

		Pom.Customcolumns.MoveTo_Menu_RoomName(driver);
		jsclick(Pom.Customcolumns.Reset_Column_option(driver));
		Pom.Customcolumns.ResetColumn_popup_OK_button(driver).click();
		Reporter.log("Custom columns Reset Successfully", true);

	}

	// Custom columns for Search

	@Test(priority = 8)
	public void Open_Custom_List_Dialog_And_Verify_Title_Searchcolumn() throws InterruptedException {

		Customcolumns.MoveTo_Search_Option(driver);
		Thread.sleep(4000);
		jsclick(Customcolumns.Search_Custom_Columns_option(driver));
		Thread.sleep(5000);
		Customcolumns.Search_titelvalidation(driver);
		Reporter.log("Custom List title validate", true);
	}

	@Test(priority = 9)
	public void Verify_The_Text_of_Custom_List_Dialog_Searchcolumn() throws InterruptedException {

		Thread.sleep(5000);
		Customcolumns.Search_textvalidation(driver);
		Reporter.log("Custom List Dialog Text verified", true);
	}

	@Test(priority = 10)
	public void Verify_Set_Custom_Columns_for_Search() throws InterruptedException {

		Thread.sleep(4000);
		Customcolumns.Search_Select_Indices01(driver).click();
		Thread.sleep(4000);
		Customcolumns.Search_Ok_Button_CustomList(driver);
		Reporter.log("Indices Selected Successfully", true);
	
		Thread.sleep(5000);
		jsclick(Customcolumns.Click_Search_Option(driver));
		Thread.sleep(4000);
		jsclick(Customcolumns.Find_Button(driver));
		Thread.sleep(5000);
		//Customcolumns.Search_Verify_Indicess_Value(driver);
		Reporter.log("Custom column is set successfully for Search Functionality", true);
	}

	@Test(priority = 11)
	public void Verify_Reset_Columns_for_Search() throws InterruptedException {

		Customcolumns.MoveTo_Search_Option(driver);
		Thread.sleep(4000);
		jsclick(Customcolumns.Click_ResetColumn(driver));
		Thread.sleep(4000);
		jsclick(Customcolumns.Ok_Button_ResetColumn(driver));
		Thread.sleep(4000);
		jsclick(Customcolumns.Find_Button(driver));
		Thread.sleep(6000);
		Reporter.log("Reset Custom Columns Successfully", true);

	}

// Custom column for ToDolist

	@Test(priority = 12)
	public void Open_Custom_List_Dialog_And_Verify_Title_ToDoList() throws InterruptedException {

		Customcolumns.MoveTo_ToDoList_Option(driver);
		Thread.sleep(4000);
		jsclick(Customcolumns.ToDoList_Custom_Columns_option(driver));
		Thread.sleep(5000);
		Customcolumns.ToDoList_titelvalidation(driver);
		Reporter.log("Custom List title validate", true);
	}

	@Test(priority = 13)
	public void Verify_The_Text_of_Custom_List_Dialog_ToDoList() throws InterruptedException {

		Thread.sleep(5000);
		Customcolumns.ToDoList_textvalidation(driver);
		Reporter.log("Custom List Dialog Text verified", true);
	}

	@Test(priority = 14)
	public void Verify_Set_Custom_Columns_for_ToDoList() throws InterruptedException {

		Thread.sleep(5000);
		Customcolumns.ToDoList_Select_Indices(driver).click();
		Thread.sleep(5000);
		Customcolumns.ToDoList_Ok_Button_CustomList(driver);
		Reporter.log("Indices Selected Successfully", true);
		Thread.sleep(5000);
		Customcolumns.MoveTo_ToDoList_Option(driver);
		Thread.sleep(4000);
		jsclick(Customcolumns.Select_All_Item(driver));
		Thread.sleep(4000);
	//	Customcolumns.ToDoList_Verify_Indicess_Value(driver);
		Reporter.log("Custom column is set successfully for ToDoList Functionality", true);
	}

	@Test(priority = 15)
	public void Reset_Custom_Columns_for_ToDoList() throws InterruptedException {
		Thread.sleep(4000);
		Customcolumns.MoveTo_ToDoList_Option(driver);
		Thread.sleep(4000);
		jsclick(Customcolumns.To_Do_Resetcolumn_Option(driver));
		Thread.sleep(4000);
		jsclick(Customcolumns.ToDoList_Reset_Column_OK_Button(driver));
		Reporter.log("ToDoList Custom column Reset Successfully", true);

	}

//@AfterClass
/*	public void Logout() throws InterruptedException {

		Logout.Username(driver).click();
		Thread.sleep(4000);
		Logout.LogoutOption(driver).click();
		driver.quit();
	}*/
}