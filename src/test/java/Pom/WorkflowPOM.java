package Pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.graph.ElementOrder;

import Generic.BaseClass;
import Generic.ExcelSheet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkflowPOM extends ExcelSheet {

	public WorkflowPOM() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("//a[@id='myTaskMenu']"))
	private WebElement TodolistTab;

	@FindBy(xpath = ("(//a[@id='createDocument'])[1]"))
	private WebElement newDocumentTab;

	@FindBy(xpath = ("//*[@id=\"createDocuemtnLocation\"]"))
	private WebElement DocumentLocation;

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li[1]/ins")) // Nav tree icon test cab
	private WebElement cabinet;

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li/ul/li[3]/ins")) // Auot drawer
	private WebElement drawer;

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li/ul/li[3]/ul/li/a"))
	private WebElement folder;

	@FindBy(xpath = ("(//button[@id='navigatorTreeOk'])[1]"))
	private WebElement OKbtn;

	@FindBy(xpath = ("(//select[@id='docTypeList'])[1]"))
	private WebElement docTypeDropDown;

	@FindBy(xpath = ("//*[@id=\"docTypeList\"]"))
	private WebElement DocDropDownSelect;

	public void SelectDocumentType() throws IOException {

		Select sel = new Select(DocDropDownSelect);
		sel.selectByVisibleText(SidbiWF(2, 0));

	}

	@FindBy(xpath = ("//*[@id=\"docIndicesDiv\"]//tbody/tr[3]/td[2]/dl/dt/div/div[1]/input"))
	private WebElement TypOfNte;

	public WebElement getTypOfNte() {
		return TypOfNte;
	}

	// *[@id="docIndicesDiv"]//tbody/tr[4]/td[2]/input

	@FindBy(xpath = ("//*[@id=\"docIndicesDiv\"]//tbody/tr[4]/td[2]/input")) // change the number tr4 to next input
	private WebElement Comments;

	// *[@id="docIndicesDiv"]//tbody/tr[5]/td[2]/input

	@FindBy(xpath = "//*[@id='docIndicesDiv']//tbody/tr[1]/td[2]/input")
	private WebElement Subject;

	@FindBy(xpath = "//*[@id='docIndicesDiv']//tbody/tr[5]/td[2]/input")
	private WebElement User_1;

	@FindBy(xpath = "//*[@id='docIndicesDiv']//tbody/tr[6]/td[2]/input")
	private WebElement User_2;

	@FindBy(xpath = "//*[@id='docIndicesDiv']//tbody/tr[7]/td[2]/input")
	private WebElement User_3;

	@FindBy(xpath = "//*[@id='docIndicesDiv']//tbody/tr[8]/td[2]/input")
	private WebElement User_4;
	

	@FindBy(xpath = "//*[@id='docIndicesDiv']//tbody/tr[9]/td[2]/input")
	private WebElement User_5;
	
	@FindBy(xpath = "//*[@id='docIndicesDiv']//tbody/tr[10]/td[2]/input")
	private WebElement User_6;
	
	@FindBy(xpath = "//*[@id='docIndicesDiv']//tbody/tr[11]/td[2]/input")
	private WebElement User_7;
	
	
	@FindBy(xpath = "//*[@id='docIndicesDiv']//tbody/tr[12]/td[2]/input")
	private WebElement User_8;
	
	@FindBy(xpath = "//*[@id='docIndicesDiv']//tbody/tr[13]/td[2]/input")
	private WebElement User_9;
	
	
	@FindBy(xpath = "//*[@id='docIndicesDiv']//tbody/tr[14]/td[2]/input")
	private WebElement User_10;
	
	

	@FindBy(xpath = "//button[@id='searchDynamicUserForSidbi']")
	private WebElement FindBTN;

	@FindBy(xpath = "//*[@id='searchDynamicUserForSidbi']")
	private WebElement SearchTextBox;

	@FindBy(xpath = "//ul[@id='ULAllUserandCustomuser']//input[2]") // u can change this input as 1 for all users
	private WebElement CustomUser;

	@FindBy(xpath = "//ul[@id='ULAllUserandCustomuser']//input[1]") // u can change this input as 1 for all users
	private WebElement AllUser;

	@FindBy(xpath = "//*[@id='dynamicUsersDlgULForSidbi']//li[100]/span[2]")
	private WebElement SelectUserArora;
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//*[@id='spanCheckDynamicUser_aarora']")
	private WebElement AllUserarora;
	
	
	@FindBy(xpath = "//*[@id='spanCheckDynamicUser_alkas']")
	private WebElement AllUseralkas;
	
	
	
	

	@FindBy(xpath = "//*[@id=\"spanCheckDynamicUser_AXXX_SXXXXXXX\"]")
	private WebElement SelectUserAlkas;

	@FindBy(xpath = "//*[@id=\"spanCheckDynamicUser_ajitkumar\"]")
	private WebElement SelectUserAjithKumar;

	@FindBy(xpath = "//*[@id=\"spanCheckDynamicUser_amarnath\"]")
	private WebElement SelectUserAmarnath;

	@FindBy(xpath = "//*[@id='SidbiUserGroupOk']")
	private WebElement UserGRPOKBTN;
	
	@FindBy(xpath = "//*[@id='reject']")
	private WebElement ReWork;
	
	
	
	
	
	
	@FindBy(xpath = "//*[@id='movedoctotaskSelectionWorkflow']")
	private WebElement RejectUserSel;
	
	
	public void Approver1() throws Exception{
		Select sel= new Select(RejectUserSel);
		sel.selectByVisibleText("Approver1");
	}
	
	
	public void Approver2() throws Exception{
		Select sel= new Select(RejectUserSel);
		sel.selectByVisibleText("Approver2");
	}
	
	
	public void Approver3() throws Exception{
		Select sel= new Select(RejectUserSel);
		sel.selectByVisibleText("Approver3");
	}
	
	
	public void Approver4() throws Exception{
		Select sel= new Select(RejectUserSel);
		sel.selectByVisibleText("Approver4");
	}
	
	
	public void Approver5() throws Exception{
		Select sel= new Select(RejectUserSel);
		sel.selectByVisibleText("Approver5");
	}
	
	
	
	public void Approver6() throws Exception{
		Select sel= new Select(RejectUserSel);
		sel.selectByVisibleText("Approver6");
	}
	
	public void Approver7() throws Exception{
		Select sel= new Select(RejectUserSel);
		sel.selectByVisibleText("Approver7");
	}
	
	
	public void SelectApprover6() throws Exception{
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		try {
		act.moveToElement(RejectUserSel).click(RejectUserSel).build().perform();
		}
		catch(JavascriptException e) {
			Reporter.log("JavascriptException Handled");
		}
		Thread.sleep(3000);
		Approver6();
		Thread.sleep(2000);
		driver.manage().timeouts().setScriptTimeout(1000, TimeUnit.MILLISECONDS);
		act.moveToElement(UserGRPOKBTN).click(UserGRPOKBTN).build().perform();
		Thread.sleep(3000);
	}
	
	public void SelectApprover5() throws Exception{
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		try {
		act.moveToElement(RejectUserSel).click(RejectUserSel).build().perform();
	}
	catch(JavascriptException e) {
		Reporter.log("Exception Handled");
	}
		Thread.sleep(3000);
		Approver5();
		Thread.sleep(2000);
		driver.manage().timeouts().setScriptTimeout(1000, TimeUnit.MILLISECONDS);
		act.moveToElement(UserGRPOKBTN).click(UserGRPOKBTN).build().perform();
		Thread.sleep(3000);
	}
	
	
	@FindBy(xpath = "//*[@id='spanCheckDynamicUser_srikanth']")
	private WebElement SelectUserSrikanth;
	
	
	public void SelectApprover4() throws Exception{
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.moveToElement(RejectUserSel).click(RejectUserSel).build().perform();
		Thread.sleep(3000);
		Approver4();
		Thread.sleep(2000);
		driver.manage().timeouts().setScriptTimeout(1000, TimeUnit.MILLISECONDS);
		act.moveToElement(UserGRPOKBTN).click(UserGRPOKBTN).build().perform();
		Thread.sleep(3000);
	}
	
	
	public void SelectApprover3() throws Exception{
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.moveToElement(RejectUserSel).click(RejectUserSel).build().perform();
		Thread.sleep(3000);
		Approver3();
		Thread.sleep(2000);
		driver.manage().timeouts().setScriptTimeout(1000, TimeUnit.MILLISECONDS);
		act.moveToElement(UserGRPOKBTN).click(UserGRPOKBTN).build().perform();
		Thread.sleep(3000);
	}
	
	
	public void SelectApprover2() throws Exception{
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.moveToElement(RejectUserSel).click(RejectUserSel).build().perform();
		Thread.sleep(3000);
		Approver2();
		Thread.sleep(2000);
		driver.manage().timeouts().setScriptTimeout(1000, TimeUnit.MILLISECONDS);
		act.moveToElement(UserGRPOKBTN).click(UserGRPOKBTN).build().perform();
		Thread.sleep(3000);
	}
	
	
	
	
	public void SelectApprover1() throws Exception{
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.moveToElement(RejectUserSel).click(RejectUserSel).build().perform();
		Thread.sleep(3000);
		Approver1();
		Thread.sleep(2000);
		driver.manage().timeouts().setScriptTimeout(1000, TimeUnit.MILLISECONDS);
		act.moveToElement(UserGRPOKBTN).click(UserGRPOKBTN).build().perform();
		Thread.sleep(3000);
	}
	
	
	
	
	
	
	
	
	public WebElement getUserGRPOKBTN() {
		
		return UserGRPOKBTN;
		
		
		
	}
	

	@FindBy(xpath = ("//*[@id=\"dorpDownMain_1\"]/dd/div/ul/li[4]")) // change number 4 to other options
	private WebElement TypOfNteGeneral;

	public void selectUser_1() throws Exception {

		Thread.sleep(3000);
		Actions act = new Actions(driver);
		Reporter.log("Select Task User for dynamic workflow");
		act.moveToElement(User_1).click(User_1).build().perform();
		Thread.sleep(3000);
		Reporter.log("Click on Task User textbox");

		Thread.sleep(2000);
		// act.moveToElement(SearchTextBox).click().sendKeys(SidbiWF(7,
		// 0)).build().perform();

		Thread.sleep(5000);
		Reporter.log("It should open 'Dynamic User and Groups' for workflow dialog");
		jsclick(AllUser);
		
		Thread.sleep(4000);
		SearchTextBox.sendKeys(SidbiWF(7, 0));//aarora7,0
		Reporter.log("Enter Username into 'Search' text box");
		Thread.sleep(7000);
		jsclick(FindBTN);
		Reporter.log("Click on find button");
		Thread.sleep(3000);
		Reporter.log("Select the Task User");
		jsclick(AllUserarora);
	
		Thread.sleep(4000);
		jsclick(CustomUser);
		
		Reporter.log("Click on OK button");
		Thread.sleep(3000);
		jsclick(UserGRPOKBTN);
		Reporter.log("Workflow Task User added successfully...");
		Thread.sleep(3000);
		Reporter.log("==========================================================================================================================");
	}

	public void selectUser_2() throws Exception {

		Thread.sleep(3000);
		Actions act = new Actions(driver);
		Reporter.log("Select Task User for dynamic workflow");
		act.moveToElement(User_2).click(User_2).build().perform();
		Thread.sleep(3000);
		Reporter.log("Click on User textbox");

		Thread.sleep(2000);

		Thread.sleep(5000);
		Reporter.log("It will open 'Dynamic User and Groups for workflow' dialog");
		jsclick(AllUser);
		
		Thread.sleep(4000);
		SearchTextBox.sendKeys(SidbiWF(8, 0));//alkas8,0
		Reporter.log("Enter Username into 'Search' text box");
		Thread.sleep(7000);
		jsclick(FindBTN);
		Reporter.log("Click on find button");
		Thread.sleep(3000);
		Reporter.log("Select the Task User");
		jsclick(AllUseralkas);
		
		Thread.sleep(3000);
		/*String UserHRMS = SelectUserAlkas.getText();
		Reporter.log("Select a User");
		Reporter.log("User HRMS Name:" + UserHRMS, true);*/
		Reporter.log("Click on OK button");
		Thread.sleep(3000);
		jsclick(UserGRPOKBTN);
		Reporter.log("Workflow Task User added successfully...");
		Thread.sleep(3000);
		Reporter.log("==========================================================================================================================");

	}

	public void selectUser_3() throws Exception {

		Thread.sleep(3000);
		Actions act = new Actions(driver);
		Reporter.log("Select Task User for dynamic workflow");
		act.moveToElement(User_3).click(User_3).build().perform();
		Thread.sleep(3000);
		Reporter.log("Click on User textbox");

		Thread.sleep(2000);

		Reporter.log("It should open 'Dynamic User and Groups for workflow' dialog");

		jsclick(AllUser);
		

		Thread.sleep(4000);
		Reporter.log("Enter UserName into 'Search' textbox");
		SearchTextBox.sendKeys(SidbiWF(7, 1));
		Thread.sleep(8000);
		Reporter.log("Click on Find button");
		jsclick(FindBTN);
		Thread.sleep(3000);
		Reporter.log("Select the Task User");
		jsclick(SelectUserAjithKumar);
		

		Reporter.log("Click on OK button");
		Thread.sleep(3000);
		jsclick(UserGRPOKBTN);
		Reporter.log("Workflow Task User added successfully...");
		Reporter.log("==========================================================================================================================");

	}

	public void selectUser_4() throws Exception {
		Reporter.log("Select Task User for dynamic workflow");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		Reporter.log("Click on User textbox");
		act.moveToElement(User_4).click(User_4).build().perform();
		Thread.sleep(3000);
		Reporter.log("It should open 'Dynamic User and Groups for workflow' dialog");
		Thread.sleep(2000);

		

		jsclick(AllUser);

		Thread.sleep(4000);
		Reporter.log("Enter User name into 'Search' textbox");
		SearchTextBox.sendKeys(SidbiWF(8, 1));//amar
		Thread.sleep(8000);

		Reporter.log("Click on Find button");
		jsclick(FindBTN);
		
		Thread.sleep(3000);

		jsclick(SelectUserAmarnath);
		Reporter.log("Select a Task User");
		Thread.sleep(3000);
		Reporter.log("Click on OK button");

		jsclick(UserGRPOKBTN);
		Thread.sleep(3000);
		Reporter.log("Workflow Task User added successfully...");
		Reporter.log("==========================================================================================================================");
	}

	
	public void selectUserON_6() throws Exception {
		Reporter.log("Select Task User for dynamic workflow");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		Reporter.log("Click on User textbox");
		act.moveToElement(User_6).click(User_6).build().perform();
		Thread.sleep(3000);
		Reporter.log("It should open 'Dynamic User and Groups for workflow' dialog");
		Thread.sleep(2000);


		jsclick(AllUser);

		Thread.sleep(4000);
		Reporter.log("Enter UserName into 'Search' textbox");
		SearchTextBox.sendKeys(SidbiWF(7, 0));//aarora
		Thread.sleep(8000);

		Reporter.log("Click on Find button");
		jsclick(FindBTN);
//		Reporter.log("It should display the UserName on the page");
		Thread.sleep(3000);

		jsclick(AllUserarora);
		Reporter.log("Select a Task User");
		Thread.sleep(3000);
		Reporter.log("Click on OK button");

		jsclick(UserGRPOKBTN);
		Thread.sleep(3000);
		Reporter.log("Workflow Task User added successfully...");
		Reporter.log("==========================================================================================================================");
	}

	public void selectUserON_7() throws Exception {
		Reporter.log("Select Task User for dynamic workflow");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		Reporter.log("Click on User textbox");
		act.moveToElement(User_7).click(User_7).build().perform();
		Thread.sleep(3000);
		Reporter.log("It should open'Dynamic User and Groups for workflow' dialog");
		Thread.sleep(2000);

	

		jsclick(AllUser);

		Thread.sleep(4000);
		Reporter.log("Enter UserName into 'Search' textbox");
		SearchTextBox.sendKeys(SidbiWF(8, 0));//alkas
		Thread.sleep(8000);

		Reporter.log("Click on Find button");
		jsclick(FindBTN);
	//	Reporter.log("It should display the User name on the page");
		Thread.sleep(3000);

		jsclick(AllUseralkas);
		Reporter.log("Select a Task User");
		Thread.sleep(3000);
		Reporter.log("Click on OK button");

		jsclick(UserGRPOKBTN);
		Thread.sleep(3000);
		Reporter.log("Workflow Task User added successfully...");
		Reporter.log("==========================================================================================================================");
	}
	public void selectUserON_8() throws Exception {
		Reporter.log("Select Task User for dynamic workflow");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		Reporter.log("Click on User textbox");
		act.moveToElement(User_8).click(User_8).build().perform();
		Thread.sleep(3000);
		Reporter.log("It should open 'Dynamic User and Groups for workflow' dialog");
		Thread.sleep(2000);

		

		jsclick(AllUser);

		Thread.sleep(4000);
		Reporter.log("Enter UserName into 'Search'textbox");
		SearchTextBox.sendKeys(SidbiWF(8, 1));//amarnath
		Thread.sleep(8000);

		Reporter.log("Click on Find button");
		jsclick(FindBTN);
	//	Reporter.log("It should display the User name on the page");
		Thread.sleep(3000);

		jsclick(SelectUserAmarnath);
		Reporter.log("Select a Task User");
		Thread.sleep(3000);
		Reporter.log("Click on OK button");

		jsclick(UserGRPOKBTN);
		Thread.sleep(3000);
		Reporter.log("Workflow Task User added successfully...");
		Reporter.log("==========================================================================================================================");
	}
	public void selectUserON_9() throws Exception {
		Reporter.log("Select Task User for dynamic workflow");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		Reporter.log("Click on User textbox");
		act.moveToElement(User_9).click(User_9).build().perform();
		Thread.sleep(3000);
		Reporter.log("It should open 'Dynamric User and Groups for workflow' dialog");
		Thread.sleep(2000);

	
		jsclick(AllUser);

		Thread.sleep(4000);
		Reporter.log("Enter User name into 'Search' textbox");
		SearchTextBox.sendKeys(SidbiWF(9, 1));//sri
		Thread.sleep(8000);

		Reporter.log("Click on Find button");
		jsclick(FindBTN);
	//	Reporter.log("It should display the User name on the page");
		Thread.sleep(3000);

		jsclick(SelectUserSrikanth);
		Reporter.log("Select the Task User");
		Thread.sleep(3000);
		Reporter.log("Click on  OK button");

		jsclick(UserGRPOKBTN);
		Thread.sleep(3000);
		Reporter.log("Workflow Task User added successfully...");
		Reporter.log("==========================================================================================================================");
	}
	public void selectUserON_10() throws Exception {
		Reporter.log("Select Task User for dynamic workflow");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		Reporter.log("Click on User textbox");
		act.moveToElement(User_10).click(User_10).build().perform();
		Thread.sleep(3000);
		Reporter.log("It should open 'Dynamic User and Groups for workflow' dialog");
		Thread.sleep(2000);



		jsclick(AllUser);

		Thread.sleep(4000);
		Reporter.log("Enter UserName into 'Search' textbox");
		SearchTextBox.sendKeys(SidbiWF(7, 1));//ajikumar
		Thread.sleep(8000);

		Reporter.log("Click on Find button");
		jsclick(FindBTN);
		//Reporter.log("It should display the User name on the page");
		Thread.sleep(3000);

		jsclick(SelectUserAjithKumar);
		Reporter.log("Select the Task User");
		Thread.sleep(3000);
		Reporter.log("Click on OK button");

		jsclick(UserGRPOKBTN);
		Thread.sleep(3000);
		Reporter.log("Workflow Task User added successfully...");
		Reporter.log("==========================================================================================================================");
	}
	public void selectUser_5() throws Exception {
		Reporter.log("Select Task User for dynamic workflow");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		Reporter.log("Click on User textbox");
		act.moveToElement(User_5).click(User_5).build().perform();
		Thread.sleep(3000);
		Reporter.log("It should open 'Dynamic User and Groups for workflow' dialog");
		Thread.sleep(2000);

	

		jsclick(AllUser);

		Thread.sleep(4000);
		Reporter.log("Enter User name into 'Search' textbox");
		SearchTextBox.sendKeys(SidbiWF(9, 1));//sri
		Thread.sleep(8000);

		Reporter.log("Click on Find button");
		jsclick(FindBTN);
		Reporter.log("Select the Task User");
		Thread.sleep(3000);

		jsclick(SelectUserSrikanth);
		//Reporter.log("Select a User");
		Thread.sleep(3000);
		Reporter.log("Click on OK button");

		jsclick(UserGRPOKBTN);
		Thread.sleep(3000);
		Reporter.log("Workflow Task User added successfully...");
		Reporter.log("==========================================================================================================================");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void selectUser_6() throws Exception {

		Thread.sleep(3000);
		Actions act = new Actions(driver);
		Reporter.log("Select Task User for dynamic workflow");
	

		Thread.sleep(3000);

		Reporter.log("It should open 'Dynamic User and Groups for workflow' dialog");

		jsclick(AllUser);
		

		Thread.sleep(4000);
		Reporter.log("Enter UserName into 'Search' textbox");
		SearchTextBox.sendKeys(SidbiWF(7, 1));//ajitkumar
		Thread.sleep(8000);
		Reporter.log("Click on Find button");
		jsclick(FindBTN);
		Thread.sleep(3000);
	//	Reporter.log("It should display the User name on the page");
		jsclick(SelectUserAjithKumar);
		Reporter.log("Select a User");

		Reporter.log("Click on OK button");
		Thread.sleep(5000);
		driver.manage().timeouts().setScriptTimeout(1000, TimeUnit.MILLISECONDS);
		movingclkElement(UserGRPOKBTN);
		Thread.sleep(3000);
		Reporter.log("Workflow Task User added successfully...");
		Reporter.log("==========================================================================================================================");

	}


public void selectUser_7() throws Exception {

	Thread.sleep(3000);
	

	Reporter.log("It should open Dynamic User and Groups for workflow dialog");

	jsclick(AllUser);
	

	Thread.sleep(4000);
	Reporter.log("Enter UserName into 'Search' textbox");
	SearchTextBox.sendKeys(SidbiWF(8, 1));//amarnath
	Thread.sleep(8000);
	Reporter.log("Click on Find button");
	jsclick(FindBTN);
	Thread.sleep(3000);
//	Reporter.log("It should display the User name on the page");
	jsclick(SelectUserAmarnath);
	Reporter.log("Select a User");

	Reporter.log("Click on OK button");
	Thread.sleep(5000);
	driver.manage().timeouts().setScriptTimeout(1000, TimeUnit.MILLISECONDS);
	movingclkElement(UserGRPOKBTN);
	Thread.sleep(2000);
	Reporter.log("Workflow Task User added successfully...");
	Reporter.log("==========================================================================================================================");

}

public void selectUser_8() throws Exception {

	Thread.sleep(3000);
	

	Reporter.log("It should open Dynamic User and Groups for workflow dialog");

	jsclick(AllUser);
	

	Thread.sleep(4000);
	Reporter.log("Enter UserName into 'Search' textbox");
	SearchTextBox.sendKeys(SidbiWF(8, 0));//alkas
	Thread.sleep(8000);
	Reporter.log("Click on Find button");
	jsclick(FindBTN);
	Thread.sleep(3000);
//	Reporter.log("It should display the User name on the page");
	jsclick(AllUseralkas);
	Reporter.log("Select a User");

	Reporter.log("Click on OK button");
	Thread.sleep(5000);
	driver.manage().timeouts().setScriptTimeout(1000, TimeUnit.MILLISECONDS);
	movingclkElement(UserGRPOKBTN);
	Thread.sleep(3000);
	Reporter.log("Workflow Task User added successfully...");
	Reporter.log("==========================================================================================================================");

}
	



public void selectTaskUser_2() throws Exception {

	Thread.sleep(3000);
	

	Reporter.log("It should open Dynamic User and Groups for workflow dialog");

	jsclick(AllUser);
	

	Thread.sleep(4000);
	Reporter.log("Enter UserName into 'Search' textbox");
	SearchTextBox.sendKeys(SidbiWF(8, 0));//alkas
	Thread.sleep(8000);
	Reporter.log("Click on Find button");
	jsclick(FindBTN);
	Thread.sleep(3000);
//	Reporter.log("It should display the User name on the page");
	jsclick(AllUseralkas);
	Reporter.log("Select a User");

	Reporter.log("Click on OK button");
	Thread.sleep(5000);
	driver.manage().timeouts().setScriptTimeout(1000, TimeUnit.MILLISECONDS);
	movingclkElement(UserGRPOKBTN);
	Thread.sleep(3000);
	Reporter.log("Workflow Task User added successfully...");
	Reporter.log("==========================================================================================================================");

}












public void selectUser_9() throws Exception {

	Thread.sleep(3000);
	Reporter.log("Select Task user for Dynamic workflow");

	Reporter.log("It should open Dynamic User and Groups for workflow dialog");

	jsclick(AllUser);
	

	Thread.sleep(4000);
	Reporter.log("Enter UserName into 'Search' textbox");
	SearchTextBox.sendKeys(SidbiWF(7, 0));//arora
	Thread.sleep(8000);
	Reporter.log("Click on Find button");
	jsclick(FindBTN);
	Thread.sleep(3000);
	//Reporter.log("It should display the User name on the page ");
	jsclick(AllUserarora);
	Reporter.log("Select a User");

	Reporter.log("Click on OK button");
	Thread.sleep(5000);
	driver.manage().timeouts().setScriptTimeout(1000, TimeUnit.MILLISECONDS);
	movingclkElement(UserGRPOKBTN);
	Thread.sleep(3000);
	Reporter.log("Workflow Task User added successfully...");
	Reporter.log("==========================================================================================================================");

}
	
	
public void selectUser_10() throws Exception {
	Reporter.log("Select Task User for Dynamic Workflow");
	Thread.sleep(3000);
	
	Reporter.log("It should open Dynamic User and Groups for workflow dialog");
	Thread.sleep(2000);



	jsclick(AllUser);

	Thread.sleep(4000);
	Reporter.log("Enter User name into 'Search' textbox");
	SearchTextBox.sendKeys(SidbiWF(9, 1));//sri
	Thread.sleep(8000);

	Reporter.log("Click on Find button");
	jsclick(FindBTN);
//	Reporter.log("It should display the User name on the page ");
	Thread.sleep(3000);

	jsclick(SelectUserSrikanth);
	Reporter.log("Select a User");
	Thread.sleep(3000);
	driver.manage().timeouts().setScriptTimeout(1000, TimeUnit.MILLISECONDS);
	movingclkElement(UserGRPOKBTN);
	
	Thread.sleep(3000);
	Reporter.log("Workflow Task User added successfully...");
	Reporter.log("==========================================================================================================================");
}











	
	public void TypesOfNotes() throws Exception {
		Thread.sleep(3000);
		movingclkElement(TypOfNte);
		Thread.sleep(2000);
		jsclick(TypOfNteGeneral);

	}

	@FindBy(xpath = ("//*[@id=\"docTypeDivElements\"]/select/option[22]"))
	private WebElement DynamicDocumentWF;// u can change the document type by changing the number

	@FindBy(xpath = ("//*[@id=\"docTypeIndicesTable\"]/tbody/tr[1]/td[2]/input"))
	private WebElement User1;

	@FindBy(xpath = ("//*[@id=\"searchDynamicUser\"]"))
	private WebElement findbtn;
	
	@FindBy(xpath = ("//*[@id='wfcomments']"))
	private WebElement TextAreaCommentBX;
	
	
	
	
	@FindBy(xpath = ("//*[@id='wfactionOk']"))
	private WebElement CommentOKBTN;

	@FindBy(xpath = ("//*[@id=\"spanCheckDynamicUser_vidya\"]"))
	private WebElement User1Vidya;

	@FindBy(xpath = ("//*[@id=\"navigatorTreeCancle5\"]"))
	private WebElement usergrpOKBtn;

	@FindBy(xpath = ("//*[@id=\"spanCheckDynamicUser_RNisha\"]"))
	private WebElement RNishaUser;

	@FindBy(xpath = ("//*[@id=\"docTypeIndicesTable\"]/tbody/tr[2]/td[2]/input"))
	private WebElement User2;

	@FindBy(xpath = ("//*[@id=\"docTypeIndicesTable\"]/tbody/tr[3]/td[2]/input"))
	private WebElement User3;

	@FindBy(xpath = ("//*[@id=\"textForUserSearch\"]"))
	private WebElement TextBoxSearch;

	@FindBy(xpath = ("//*[@id=\"spanCheckDynamicUser_dipak\"]"))
	private WebElement dipakUser;

	@FindBy(xpath = ("//*[@id=\"docTypeIndicesTable\"]/tbody/tr[5]/td[2]/input")) // doc key indices
	private WebElement KeyValue;

	@FindBy(xpath = ("//*[@id=\"addPagesDropDown\"]"))
	private WebElement moveToPlusIcon;

	@FindBy(xpath = ("//*[@id='viewDocumentAddPages']"))
	private WebElement browseOption;

	@FindBy(xpath = ("(//button[normalize-space()='Create'])[1]"))
	private WebElement CreateBTN;

	@FindBy(xpath = ("(//button[normalize-space()='View'])[1]"))
	private WebElement viewOption;

	@FindBy(xpath = ("//a[@id='newItems']"))
	private WebElement NewItems;

	@FindBy(xpath = ("//*[@id=\"todoListTable\"]/tbody/tr[1]/td[1]"))
	private WebElement Metadata;

	public WebElement getTodolistTab() {
		return TodolistTab;
	}

	public WebElement getNewItems() {
		return NewItems;
	}

	public WebElement getMetadata() {
		return Metadata;
	}

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li[1]/a"))
	private WebElement TestCabinet;// Fisrt cabinet

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li[1]/ul/li[1]/a"))
	private WebElement dynamicWfDrawer;// drawer here u can change the last li[1]

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li/ul/li[1]/ul/li[6]/a"))
	private WebElement DynamicWfAutoFolder;

	@FindBy(xpath = ("(//span[@id='viewSendToWrkflw'])[1]"))
	private WebElement sendToWf;

	@FindBy(xpath = ("(//td[contains(text(),'Dynamic workflow')])[1]"))
	private WebElement dynamicwfnew;

	@FindBy(xpath = ("(//button[@id='sidbisendworkflowOk'])[1]"))
	private WebElement applyBTN;

	@FindBy(xpath = ("(//button[@id='CommentsMessageModelOk'])[1]"))
	private WebElement sendwfsuccessdialogOKBTN;

	@FindBy(xpath = ("//*[@id=\"todoListTable\"]/tbody/tr[1]/td[2]"))
	private WebElement Open1stDocument;

	@FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[6]/td[3]"))
	private WebElement OpenDocument;

	@FindBy(xpath = ("/html/body/div[58]/div[48]/div[12]/div[1]/div[5]/div[1]/div[3]"))
	private WebElement RefreshButton;

	@FindBy(xpath = "//div[@id='addPagesDropDown']//span[1]")
	private WebElement Move_To_PlusIcon;

	public void getMove_To_PlusIcon() {

		Actions action = new Actions(driver);
		action.moveToElement(Move_To_PlusIcon).perform();

	}

	@FindBy(xpath = "//*[@id=\"viewDocumentAddPages\"]")
	private WebElement Browse_Option;

	public void getBrowse_Option() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Browse_Option);

	}

	
	
	//*[@id="SelectActionMenuDropDownUl"]//li[1]
	
	
	@FindBy(xpath = "//*[@id='SelectActionMenuDropDownUl']//li[1]")
	private WebElement AcceptAndForward;

	@FindBy(xpath = "//*[@id='SelectActionMenuDropDownUl']//li[2]")
	private WebElement ApproveAndEndWF;

	
	@FindBy(xpath = "//*[@id='SelectActionMenuDropDownUl']//li[3]")
	private WebElement ApproveAndPSR;
	
	@FindBy(xpath = "//*[@id='SelectActionMenuDropDownUl']//li[4]")
	private WebElement PSRAndEndWF;

	
	
	
	@FindBy(xpath = "//*[@id='sidbiEndworkflowOk']")
	private WebElement WarningidlaogOKBTN;	
	
	
	
	
	@FindBy(xpath = "//*[@id='commentMessage47']")
	private WebElement WarningDialogEndWF;
	
	

	@FindBy(xpath = "//*[@id='todobuttons']/li/a")
	private WebElement SelectAction;
	
	@FindBy(xpath = "//*[@id=\"workflowOTP\"]")
	private WebElement EnterOTP;

	@FindBy(xpath = "//*[@id=\"workflowotpSubmit\"]")
	private WebElement ClickOTPokBTN;

	@FindBy(xpath = "//*[@id=\"sidbiassignedWfTable\"]/tbody/tr/td")
	private WebElement OfficeNotesWF;

	public void WorkflowOTP() throws Exception {
	Actions act= new Actions(driver);
	
	
		Thread.sleep(3000);
		driver.manage().timeouts().setScriptTimeout(2000, TimeUnit.MILLISECONDS);
		Reporter.log("It Should Open OTP validation dialog... ");
		try {
		jsclick(EnterOTP);
	}
	catch(JavascriptException e) {
		System.out.println("Javascript Exception Handled Successfully, Ignored Javascript Exception");
	}
		System.out.println("OTP valiadation dialog opened successfully...");
		try {
		EnterOTP.sendKeys(SidbiWF(3, 1));//Oi5FQS  pword
	}
	catch(JavascriptException e) {
		System.out.println("Javascript Exception Handled Successfully, Ignored Javascript Exception");
	}
		Reporter.log("Enter valid OTP");
		Thread.sleep(4000);
		act.moveToElement(ClickOTPokBTN).click(ClickOTPokBTN).build().perform();
		
		Reporter.log("Click on OK button");
		Thread.sleep(2000);
		Reporter.log("OTP validation verified successfully...");
	  

	}
	
	
	
	
	
	
	
	
	
	public void OpenWFNewItemsWFDocument() throws Exception{
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(Open1stDocument).click(Open1stDocument).build().perform();
		Thread.sleep(5000);
		try {
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		}
		catch(Exception e) {
			System.out.println("Page Alert is Not Present!!!");
		}
		
	}
	
	
	
	
	public void ApproveAndEndWF() throws Exception{
		Thread.sleep(3000);
	
		Reporter.log("Go to ToDo-list tab and Select 'NewItems'");
		movingElement(TodolistTab);
		Thread.sleep(3000);
		VisiblityOf(NewItems);
		jsclick(NewItems);
		Reporter.log("Open workflow Document");
		Thread.sleep(5000);
		OpenWFNewItemsWFDocument();
	
		Thread.sleep(2000);
		VisiblityOf(SelectAction);
		movingElement(SelectAction);
		Reporter.log("Select'Accept and Endworkflow'");
		Thread.sleep(2000);
		movingclkElement(ApproveAndEndWF);
		Reporter.log("It will show the Confirmation dialog :"+WarningDialogEndWF.getText(),true);
		
		Thread.sleep(5000);
		jsclick(WarningidlaogOKBTN);
		Reporter.log("Click on OK button");
		
	}
	
	
	
	
	public void ApproveAndEndPSRWF() throws Exception{
		Thread.sleep(3000);
	
		Reporter.log("Go to ToDo-List tab select 'New Items'");
		movingElement(TodolistTab);
		Thread.sleep(2000);
		VisiblityOf(NewItems);
		jsclick(NewItems);
		Reporter.log("Open workflow Document");
		Thread.sleep(5000);
		OpenWFNewItemsWFDocument();
	
		Thread.sleep(2000);
		VisiblityOf(SelectAction);
		movingElement(SelectAction);
		Reporter.log("Select 'Accept and PSR'");
		Thread.sleep(2000);
		movingclkElement(PSRAndEndWF);
		Reporter.log("It will open the Confirmation dialog :"+WarningDialogEndWF.getText(),true);
		
		Thread.sleep(5000);
		jsclick(WarningidlaogOKBTN);
		Reporter.log("Click on OK button");
		
	}
	
	
	
	
	
	
	public void ApproveAndForward() throws Exception{
		Thread.sleep(3000);
		Reporter.log("Go to ToDo-Tab Select 'New Items'");
		movingElement(TodolistTab);
		Thread.sleep(2000);
		VisiblityOf(NewItems);
		jsclick(NewItems);
		Reporter.log("Expand Metadata from a workflow document");
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		try {
		driver.manage().timeouts().setScriptTimeout(2000, TimeUnit.MILLISECONDS);
		act.moveToElement(Metadata).click(Metadata).build().perform();
		
		}
		catch(JavascriptException e) {
			Reporter.log("Exception Handled");
		}
		Thread.sleep(3000);
		
		movingElement(SelectAction);
		Reporter.log("Select 'Accept and Forward '");
		Thread.sleep(2000);
		movingclkElement(AcceptAndForward);
		Reporter.log("It will open ENTER OTP dialog");
		Thread.sleep(5000);
	
		}
	
	public void ApproveAndPSRDocument() throws Exception{
		Thread.sleep(3000);
		Reporter.log("Go to To-Do list tab 'New Items'");
		movingElement(TodolistTab);
		Thread.sleep(5000);
		VisiblityOf(NewItems);
		jsclick(NewItems);
		Reporter.log("Expand Metadata ");
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		
		act.moveToElement(Metadata).click(Metadata).build().perform();
	
		Thread.sleep(2000);
		movingElement(SelectAction);
		Reporter.log("Select 'Approve and PSR' ");
		Thread.sleep(2000);
		movingclkElement(ApproveAndPSR);
		Reporter.log("It will open ENTER OTP dialog ");
		Thread.sleep(5000);
	
		}
	
	
	
	
	
	
	

	public void SendToWorkflowOfficeNote() throws Exception {
	
		Thread.sleep(3000);
		movingElement(OfficeNotesWF);
	
		Thread.sleep(2000);
		Reporter.log("Select 'OFFICE NOTES' workflow from 'Available Workflow' list");
		jsclick(OfficeNotesWF);
		Thread.sleep(2000);
		Reporter.log("Click on Apply button");
		jsclick(applyBTN);
		Thread.sleep(8000);
		
       jsclick(sendwfsuccessdialogOKBTN);
       Thread.sleep(2000);
	
		jsclick(RefreshButton);
	
		Reporter.log("The document will be sent to workflow successfully...");
		
	}

	public void DynamicWorkFlowTodoListFunctionality() throws Exception {

		Thread.sleep(4000);
		Reporter.log("Scenario 01: Create Document with 'OFFICE NOTES' document type- 'Approved And Forward' by 9 Task Users and 10th Task User 'Approve and Endworkflow'");
		WebDriverWait wait = new WebDriverWait(driver, 20);

		Reporter.log("Click on New document tab");
		// jsclick(newDocumentTab);
		Thread.sleep(4000);
		Reporter.log("Select Document location textbox");
		wait.until(ExpectedConditions.elementToBeClickable(cabinet));
		jsclick(cabinet);
	
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOf(drawer));
		jsclick(drawer);
	
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(folder));
		jsclick(folder);
		Reporter.log("Select a folder location for creating a document");

		Thread.sleep(3000);
		jsclick(newDocumentTab);
		//Reporter.log("Click on 'Destination folder' dialog OK button");
		Thread.sleep(6000);
		Actions act = new Actions(driver);

		wait.until(ExpectedConditions.elementToBeClickable(DocDropDownSelect));
		act.moveToElement(DocDropDownSelect).click(DocDropDownSelect).build().perform();
		SelectDocumentType();
		Reporter.log("Select OFFICE NOTES document type");
		Thread.sleep(4000);
		act.click(Comments).sendKeys(SidbiWF(2, 2)).build().perform();
		Thread.sleep(3000);
		Reporter.log("Enter all Required details");
		TypesOfNotes();
		
		Subject.clear();
		Thread.sleep(2000);
		act.moveToElement(Subject).click(Subject).sendKeys(SidbiWF(3, 2)).build().perform();
		Reporter.log("====================================================================================================================================================================");
		selectUser_1();//arora
		selectUser_2();//alkas
		selectUser_3();//ajith
		selectUser_4();//amarnath
		selectUser_5();//srikanth
		selectUserON_6();//aarora
		selectUserON_7();//alkas
		selectUserON_8();//amarnath
		selectUserON_9();//srikant
		selectUserON_10();//ajith
		Thread.sleep(7000);
		
		getMove_To_PlusIcon();

		Thread.sleep(6000);
		Reporter.log("Select a browse option");
	
		movingclkElement(browseOption);

		Reporter.log("Add a file by using AutoIT script");
		Thread.sleep(10000);
		Runtime.getRuntime().exec("D:\\RNishaAutoIt\\SIDBIAuto.exe");
		Thread.sleep(7000);
		try {

			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {

			Reporter.log("Page Alert is not present");
		}

		Thread.sleep(5000);
		jsclick(CreateBTN);
		Reporter.log("Click on create and view button");
		Thread.sleep(15000);
		jsclick(viewOption);
	
		Thread.sleep(8000);
		Reporter.log("OFFICE NOTES Document created successfully....");
		jsclick(sendToWf);
		Reporter.log("Click SendtoWorkflow button");
		
	}
	

	
	
	
	
	
	
	public void AcceptAndForWardCommentBox()  throws Exception{
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		driver.manage().timeouts().setScriptTimeout(2000, TimeUnit.MILLISECONDS);
		Reporter.log("Add comment into comment box");
		try {
		act.moveToElement(TextAreaCommentBX).click(TextAreaCommentBX).sendKeys(SidbiWF(4, 2)).build().perform();
		}
		catch(JavascriptException e) {
			Reporter.log("Javascript Exception Handled Successfully, Ignored Javascript Exception");
		}
		
		Thread.sleep(3000);
		Reporter.log("Click On OK button");
		driver.manage().timeouts().setScriptTimeout(2000, TimeUnit.MILLISECONDS);
		try {
		act.moveToElement(CommentOKBTN).click(CommentOKBTN).build().perform();
		}
		catch(JavascriptException e) {
			Reporter.log("Javascript Exception Handled Successfully, Ignored Javascript Exception");
		}
		Thread.sleep(3000);
		Reporter.log(
				"Comments added successfully...");
		
		Reporter.log("Document move to Next Task User Successfully...");
	}
	
	
	
	public void AcceptAndForWardCommentBoxRework()  throws Exception{
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		driver.manage().timeouts().setScriptTimeout(2000, TimeUnit.MILLISECONDS);
		Reporter.log("Add comment into comment box");
		try {
		act.moveToElement(TextAreaCommentBX).click(TextAreaCommentBX).sendKeys(SidbiWF(4, 2)).build().perform();
		}
		catch(JavascriptException e) {
			Reporter.log("Javascript Exception Handled Successfully, Ignored Javascript Exception");
		}
		
		Thread.sleep(3000);
		Reporter.log("Click On OK button");
		driver.manage().timeouts().setScriptTimeout(2000, TimeUnit.MILLISECONDS);
		try {
		act.moveToElement(CommentOKBTN).click(CommentOKBTN).build().perform();
		}
		catch(JavascriptException e) {
			Reporter.log("Javascript Exception Handled Successfully, Ignored Javascript Exception");
		}
		Thread.sleep(3000);
		Reporter.log(
				"Comments added successfully...");
		
		
	}
	
	
	
	
	
	
	
	
	
	public void DynamicWorkFlow_OFFICENOTES_ApproveAndPSR() throws Exception {

		Thread.sleep(4000);
		Reporter.log("Scenario 01: Create Document with 'OFFICE NOTES' document type");
		WebDriverWait wait = new WebDriverWait(driver, 20);

		Reporter.log("Click on New document tab");
		// jsclick(newDocumentTab);
		Thread.sleep(4000);
		Reporter.log("Select folder location for creating a document");
		wait.until(ExpectedConditions.elementToBeClickable(cabinet));
		jsclick(cabinet);
		
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOf(drawer));
		jsclick(drawer);
		
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(folder));
		jsclick(folder);

		Thread.sleep(3000);
		jsclick(newDocumentTab);
		Reporter.log("Click on 'Destination folder' dialog OK button");
		Thread.sleep(6000);
		Actions act = new Actions(driver);

		wait.until(ExpectedConditions.elementToBeClickable(DocDropDownSelect));
		act.moveToElement(DocDropDownSelect).click(DocDropDownSelect).build().perform();
		SelectDocumentType();
		Reporter.log("Select OFFICE NOTES document type");
		Thread.sleep(4000);
		act.click(Comments).sendKeys("ApproveAndPSR").build().perform();
		Thread.sleep(3000);
		
		TypesOfNotes();
		Reporter.log("Enter all Required details");
		Subject.clear();
		Thread.sleep(2000);
		act.moveToElement(Subject).click(Subject).sendKeys(SidbiWF(5, 2)).build().perform();
		Reporter.log("====================================================================================================================================================================");
		selectUser_1();
		selectUser_2();
		selectUser_3();
		selectUser_4();
		selectUser_5();
		Thread.sleep(7000);
		
		getMove_To_PlusIcon();

		Thread.sleep(5000);
		Reporter.log("Select a browse option");
		movingclkElement(browseOption);

		Reporter.log("Add a file by using AutoIT script");
		Thread.sleep(10000);
		Runtime.getRuntime().exec("D:\\RNishaAutoIt\\SIDBIAuto.exe");
		Thread.sleep(10000);
		try {

			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {

			Reporter.log("Page Alert is not present");
		}

		Thread.sleep(5000);
		jsclick(CreateBTN);
		Reporter.log("Click on Create and View button");
		Thread.sleep(15000);
		jsclick(viewOption);
	
		Thread.sleep(8000);
		Reporter.log("OFFICE NOTES Document created successfully....");
		jsclick(sendToWf);
		Reporter.log("Click SendToWorkflow button");
		
	}
	
	
	public void ReworkWF() throws Exception {
		
		
		Thread.sleep(3000);
		Reporter.log("Go to To-Do list tab 'New Items'");
		movingElement(TodolistTab);
		Thread.sleep(2000);
		VisiblityOf(NewItems);
		jsclick(NewItems);
		Reporter.log("Expand Metadata ");
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		
		driver.manage().timeouts().setScriptTimeout(1000, TimeUnit.MILLISECONDS);
		act.moveToElement(Metadata).click(Metadata).build().perform();
		Reporter.log("Select Rework ");
		Thread.sleep(3000);
		try {
		act.moveToElement(ReWork).click(ReWork).build().perform();
		}
		catch(JavascriptException e) {
			Reporter.log("Exception Handled");
		}
		
	
		Reporter.log("It should open ENTER OTP dialog on the page");
		Thread.sleep(5000);
		
		
	}
	
	
	
	

	
	
	public void DynamicWorkFlow_OFFICENOTES_ApproveAndReWork() throws Exception {

		Thread.sleep(4000);
		Reporter.log("Scenario 01: Create Document with 'OFFICE NOTES' document type - Rework Workflow");
		WebDriverWait wait = new WebDriverWait(driver, 20);

		Reporter.log("Click on New document tab");
		// jsclick(newDocumentTab);
		Thread.sleep(4000);
		Reporter.log("Click on Document location textbox");
		wait.until(ExpectedConditions.elementToBeClickable(cabinet));
		jsclick(cabinet);
		
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOf(drawer));
		jsclick(drawer);
				Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(folder));
		jsclick(folder);
		Reporter.log("Select a folder for creating Document");
		Reporter.log("Select OFFICE NOTES document type and Enter all Required Details");

		Thread.sleep(3000);
		jsclick(newDocumentTab);
		
		Thread.sleep(6000);
		Actions act = new Actions(driver);

		wait.until(ExpectedConditions.elementToBeClickable(DocDropDownSelect));
		act.moveToElement(DocDropDownSelect).click(DocDropDownSelect).build().perform();
		SelectDocumentType();
		
		Thread.sleep(4000);
		act.click(Comments).sendKeys(SidbiWF(5, 0)).build().perform();
		Thread.sleep(3000);
		
		TypesOfNotes();
	
		Subject.clear();
		Thread.sleep(2000);
		act.moveToElement(Subject).click(Subject).sendKeys(SidbiWF(5, 0)).build().perform();
		Reporter.log("====================================================================================================================================================================");
		selectUser_1();
		selectUser_2();
		selectUser_3();
		selectUser_4();
		
		Thread.sleep(7000);
		
		getMove_To_PlusIcon();

		Thread.sleep(5000);
		Reporter.log("Select a browse option");
		movingclkElement(browseOption);

		Reporter.log("Add a file by using AutoIT script");
		Thread.sleep(10000);
		Runtime.getRuntime().exec("D:\\RNishaAutoIt\\SIDBIAuto.exe");
		Thread.sleep(10000);
		try {

			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {

			Reporter.log("Page Alert is not present");
		}

		Thread.sleep(5000);
		jsclick(CreateBTN);
		Reporter.log("Click on create and view button");
		Thread.sleep(15000);
		jsclick(viewOption);
	
		Thread.sleep(8000);
		Reporter.log("OFFICE NOTES Document created successfully....");
		jsclick(sendToWf);
		Reporter.log("Click SendtoWorkflow button");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public void DynamicWorkFlow_With_5Users() throws Exception {

		Thread.sleep(4000);
		Reporter.log("Scenario 01: Create Document with 'OFFICE NOTES' document type and Add All Task Users - 'Approved and PSR' by all users");
		WebDriverWait wait = new WebDriverWait(driver, 20);

		Reporter.log("Click on New document tab");
		// jsclick(newDocumentTab);
		Thread.sleep(4000);
		Reporter.log("Click on Document location textbox");
		wait.until(ExpectedConditions.elementToBeClickable(cabinet));
		jsclick(cabinet);
		Reporter.log("Select folder for creating document");
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOf(drawer));
		jsclick(drawer);
	
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(folder));
		jsclick(folder);
		

		Thread.sleep(3000);
		jsclick(newDocumentTab);
	
		Thread.sleep(6000);
		Actions act = new Actions(driver);

		wait.until(ExpectedConditions.elementToBeClickable(DocDropDownSelect));
		act.moveToElement(DocDropDownSelect).click(DocDropDownSelect).build().perform();
		SelectDocumentType();
		Reporter.log("Select OFFICE NOTES document type and Enter all Required details");
		Thread.sleep(4000);
		act.click(Comments).sendKeys(SidbiWF(4,1)).build().perform();
		Thread.sleep(3000);
		
		TypesOfNotes();
		
		Subject.clear();
		Thread.sleep(2000);
		act.moveToElement(Subject).click(Subject).sendKeys(SidbiWF(4,1)).build().perform();
		Reporter.log("====================================================================================================================================================================");
		selectUser_1();
		
		Thread.sleep(7000);
	
		getMove_To_PlusIcon();

		Thread.sleep(4000);
		Reporter.log("Select a browse option");
		movingclkElement(browseOption);

		Reporter.log("Add a file by using AutoIT script");
		Thread.sleep(10000);
		Process proc=Runtime.getRuntime().exec("D:\\RNishaAutoIt\\SIDBIAuto.exe");
		
      InputStream is= proc.getInputStream();
		
		int ret=0;
		while(ret != -1)
		{
			ret=is.read();
			
		}
		
		System.out.println("Now Exist");
		
		Thread.sleep(10000);
		try {

			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {

			Reporter.log("Page Alert is not present");
		}

		Thread.sleep(5000);
		jsclick(CreateBTN);
		Reporter.log("Click on Create and view button");
		Thread.sleep(15000);
		jsclick(viewOption);
		
		Thread.sleep(8000);
		Reporter.log("OFFICE NOTES document created successfully...");
		
		jsclick(sendToWf);
		Reporter.log("Click SendtoWorkflow button");
		
	}
	public void DynamicWorkFlow_With_All_Users() throws Exception {

		Thread.sleep(4000);
		Reporter.log("Scenario 01: Create Document with 'OFFICE NOTES' document type and Add all Task User - 'Approved and Forward' by all users'");
		WebDriverWait wait = new WebDriverWait(driver, 20);

		Reporter.log("Click on New document tab");
		// jsclick(newDocumentTab);
		Thread.sleep(4000);
		Reporter.log("Click on Document location textbox");
		wait.until(ExpectedConditions.elementToBeClickable(cabinet));
		jsclick(cabinet);
		
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOf(drawer));
		jsclick(drawer);
	
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(folder));
		jsclick(folder);
		

		Thread.sleep(3000);
		jsclick(newDocumentTab);
		Reporter.log("Select Folder Location for creating a document");
		Thread.sleep(6000);
		Actions act = new Actions(driver);

		wait.until(ExpectedConditions.elementToBeClickable(DocDropDownSelect));
		act.moveToElement(DocDropDownSelect).click(DocDropDownSelect).build().perform();
		SelectDocumentType();
		Reporter.log("Select OFFICE NOTES document type and Enter all Required details");
		Thread.sleep(4000);
		act.click(Comments).sendKeys(SidbiWF(4,1)).build().perform();
		Thread.sleep(3000);
	
		TypesOfNotes();
	
		Subject.clear();
		Thread.sleep(2000);
		act.moveToElement(Subject).click(Subject).sendKeys(SidbiWF(4,1)).build().perform();
		Reporter.log("====================================================================================================================================================================");
		selectUser_1();
		
		Thread.sleep(7000);
		
		getMove_To_PlusIcon();

		Thread.sleep(4000);
		Reporter.log("Select a browse option");
		movingclkElement(browseOption);

		Reporter.log("Add a file by using AutoIT scirpt");
		Thread.sleep(10000);
		Process proc=Runtime.getRuntime().exec("D:\\RNishaAutoIt\\SIDBIAuto.exe");
		
      InputStream is= proc.getInputStream();
		
		int ret=0;
		while(ret != -1)
		{
			ret=is.read();
			
		}
		
		System.out.println("Now Exist");
		
		Thread.sleep(10000);
		try {

			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {

			Reporter.log("Page Alert is not present");
		}

		Thread.sleep(5000);
		jsclick(CreateBTN);
		Reporter.log("Click on create and view button");
		Thread.sleep(15000);
		jsclick(viewOption);
	
		Thread.sleep(8000);
		Reporter.log("OFFICE NOTES Document created successfully....");
		
		jsclick(sendToWf);
		Reporter.log("Click SendtoWorkflow button");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
