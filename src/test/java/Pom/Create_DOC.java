package Pom;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Create_DOC extends Generic.BaseClass {

	public Create_DOC() {
		PageFactory.initElements(driver, this);

	}

	// Create document datadriven

	public String CreateDOC_excelRead(int rowNo, int cellNo) throws Exception {

		File src = new File("./data/TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			XSSFSheet s = wb.getSheet("CreateDOC");
			XSSFRow row = s.getRow(rowNo);
			XSSFCell cll = row.getCell(cellNo);
			String cellType = cll.getStringCellValue();
			return cellType;
		}
	}

	@FindBy(xpath = ".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	private WebElement Select_Cabinet;

	public WebElement getSelect_Cabinet() {
		return Select_Cabinet;
	}

	@FindBy(xpath = ".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	private WebElement Select_Drawer;

	public WebElement getSelect_Drawer() {
		return Select_Drawer;
	}

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]"))
	private WebElement Select_Folder;

	public WebElement getSelect_Folder() {
		return Select_Folder;

	}

	@FindBy(xpath = "//a[@id='createDocument']")
	private WebElement Click_New_Document;

	public WebElement getClick_New_Document() {
		return Click_New_Document;
	}

	@FindBy(xpath = "//input[@id='createDocuemtnLocation']")
	private WebElement Destination_Folder_Textbox;

	public WebElement getDestination_Folder_Textbox() {
		return Destination_Folder_Textbox;
	}

	@FindBy(xpath = "//*[@id=\"navigatorTreeOk\"]")
	private WebElement OK_Button_BrowseforFolder;

	public WebElement getOK_Button_BrowseforFolder() {
		return OK_Button_BrowseforFolder;
	}

	@FindBy(id = "docTypeList")
	private WebElement Click_Document_Type_Dropdown;

	public WebElement getSelect_Document_Type_INWARD_EXTERNAL() {
		Select drop = new Select(Click_Document_Type_Dropdown);
		drop.selectByIndex(85);
		return Click_Document_Type_Dropdown;
	}

	@FindBy(id = "docTypeList")
	private WebElement Click_Document_Type_Dropdown_Internal;

	public WebElement getSelect_Document_Type_INWARD_INTERNAL() {
		Select drop = new Select(Click_Document_Type_Dropdown_Internal);
		drop.selectByIndex(86);
		return Click_Document_Type_Dropdown_Internal;
	}

	@FindBy(xpath = "//*[@id=\"addPagesDropDown\"]")
	private WebElement Move_To_PlusIcon;

	public WebElement getMove_To_PlusIcon() {
			WebElement ele = Move_To_PlusIcon;
			Actions action = new Actions(driver);
			action.moveToElement(ele).build().perform();
			return ele;
	}

	@FindBy(id = "viewDocumentAddPages")
	private WebElement Browse_Option;

	public WebElement getBrowse_Option() {
		WebElement ele = Browse_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
		return ele;
	}

	@FindBy(xpath = "//button[@id='createDocumentSubmit']")
	private WebElement Create_button;

	public WebElement getCreate_button() {
		return Create_button;
	}

	@FindBy(xpath = "//*[@id=\"viewCreatedDocument\"]")
	private WebElement ViewDocument_Button;

	public WebElement getViewDocument_Button() {
		Reporter.log("This message showul show: " + Createdocmessage.getText());
		return ViewDocument_Button;
	}

	@FindBy(xpath = "//*[@id=\"createDocumentMessage\"]")
	private WebElement Createdocmessage;

	public WebElement getCreatedocmessage() {
		Reporter.log("This message should show: " + Createdocmessage.getText(), true);
		return Createdocmessage;
	}

	@FindBy(xpath = "/html/body/div[58]/div[64]/div[4]/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[2]/input")
	private WebElement INWARD_ID;

	public void getINWARD_ID() {
		String text = INWARD_ID.getAttribute("value");
		Reporter.log("The Inword ID is :" + text, true);

	}

	@FindBy(xpath = "//div[@id='homeMenuBtn']")
	private WebElement Refreshbutton;

	public WebElement getRefreshbutton() {
		return Refreshbutton;
	}

	@FindBy(xpath = "//span[@title='Document Close']")
	private WebElement Close_Document;

	public WebElement getClose_Documentpage() {
		return Close_Document;

	}

	@FindBy(xpath = "//table[1]/tbody[1]/tr[8]/td[2]/input[1]")
	private WebElement User1;

	public WebElement getUser1() {
		return User1;
	}

	@FindBy(xpath = "//table[1]/tbody[1]/tr[18]/td[2]/input[1]") 
	private WebElement User;

	public WebElement getUser() {
		return User;
	}

	@FindBy(xpath = "//table[1]/tbody[1]/tr[9]/td[2]/input[1]")
	private WebElement User2;

	public WebElement getUser2() {
		return User2;
	}

	@FindBy(xpath = "//table[1]/tbody[1]/tr[10]/td[2]/input[1]")
	private WebElement User3;

	public WebElement getUser3() {
		return User3;
	}

	@FindBy(xpath = "//table[1]/tbody[1]/tr[11]/td[2]/input[1]")
	private WebElement User4;

	public WebElement getUser4() {
		return User4;
	}

	@FindBy(xpath = "//table[1]/tbody[1]/tr[12]/td[2]/input[1]")
	private WebElement User5;

	public WebElement getUser5() {
		return User5;
	}

	@FindBy(xpath = "//table[1]/tbody[1]/tr[13]/td[2]/input[1]")
	private WebElement User6;

	public WebElement getUser6() {
		return User6;
	}

	@FindBy(xpath = "//table[1]/tbody[1]/tr[14]/td[2]/input[1]")
	private WebElement User7;

	public WebElement getUser7() {
		return User7;
	}

	@FindBy(xpath = "//table[1]/tbody[1]/tr[15]/td[2]/input[1]")
	private WebElement User8;

	public WebElement getUser8() {
		return User8;
	}

	@FindBy(xpath = "//table[1]/tbody[1]/tr[16]/td[2]/input[1]")
	private WebElement User9;

	public WebElement getUser9() {
		return User9;
	}

	@FindBy(xpath = "//table[1]/tbody[1]/tr[17]/td[2]/input[1]")
	private WebElement User10;

	public WebElement getUser10() {
		return User10;
	}

	@FindBy(xpath = "//*[@id=\"searchDynamicUserForSidbi\"]")
	private WebElement FindBTN;

	public WebElement getFindBTN() {
		return FindBTN;
	}

	@FindBy(xpath = "//*[@id=\"textForsidbiUserSearch\"]")
	private WebElement SearchTextBox;

	public WebElement getSearchTextBox() {
		return SearchTextBox;
	}

	@FindBy(xpath = "//*[@id=\"sidbicustomuser\"]")
	private WebElement CustomUser;

	public WebElement getCustomUser() {
		return CustomUser;
	}

	@FindBy(xpath = "//body[1]/div[36]/div[1]/div[4]/div[1]/button[2]")
	private WebElement okBTN;

	public WebElement okBTN() {
		return okBTN;
	}

	// Task User

	@FindBy(xpath = "//body[1]/div[36]/div[1]/ul[2]/li[1]/span[2]")
	private WebElement TaskUser_;

	public void Select_TaskUser() throws InterruptedException {
		Thread.sleep(8000);
		Actions act = new Actions(driver);
		Reporter.log("Select Task User for dynamic workflow", true);
		act.moveToElement(TaskUser_).click(TaskUser_).build().perform();
		Thread.sleep(8000);
		jsclick(getCustomUser());
		Thread.sleep(8000);
		Reporter.log("Click on Custom user Radio button");
		Reporter.log("HRMS User name is : " + TaskUser_.getText(), true);
		jsclick(okBTN());
		Reporter.log("Click on User and Group dialog OK button");
		Reporter.log("Workflow task user added successfully");

	}

	@FindBy(xpath = ("//tbody/tr[1]/td[1]/label[1]/span[1]"))
	private WebElement Select_Document;

	public WebElement getSelect_Document() {
		return Select_Document;
	}

	@FindBy(xpath = "//a[@id='documentListSubMenu']")
	private WebElement MoveTo_Menu_Documents;

	public void getMoveTo_Menu_Documents() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_Documents).build().perform();

	}

	@FindBy(id = "sendtoworkflow")
	private WebElement Workflow;

	public WebElement Workflow() {
		return Workflow;
	}

	@FindBy(xpath = "//*[@id=\"sidbiassignedWfTable\"]/tbody/tr/td")
	private WebElement SelectWorkflow;

	public WebElement SelectWorkflow() {
		return SelectWorkflow;
	}

	@FindBy(xpath = "//*[@id=\"sidbisendworkflowOk\"]")
	private WebElement Apply;

	public WebElement Apply() {
		return Apply;
	}

	@FindBy(id = "logedinusername")
	private WebElement Username;

	public WebElement getUsername() {
		return Username;
	}

	@FindBy(linkText = "Logout")
	private WebElement Logout;

	public WebElement getLogout() {
		return Logout;
	}

	@FindBy(id = "imgSettings")
	private WebElement Setting_Icon;

	public WebElement getSetting_Icon() {
		return Setting_Icon;
	}

	@FindBy(css = "#myPreferencesSettingsNav > p")
	private WebElement My_Preferencesetting;

	public WebElement getMy_Preferencesetting() {
		return My_Preferencesetting;
	}

	@FindBy(xpath = "//button[@id='myPreferencesSubmit']")
	private WebElement Apply_button;

	public WebElement getApply_button() {
		return Apply_button;
	}

	@FindBy(xpath = "//select[@id='defaultOfficeDocViewListNo']")
	private WebElement Select_Office_document_Defaultviewing;

	public void getSelect_Office_document_Defaultviewing() {
		Select sel = new Select(Select_Office_document_Defaultviewing);
		sel.selectByVisibleText("Default viewing");

	}

	@FindBy(xpath = "//select[@id='defaultPdfDocViewListNo']")
	private WebElement Pdf_document_Defaultviewing;

	public void getPdf_document_Defaultviewing() {
		Select drop = new Select(Pdf_document_Defaultviewing);
		drop.selectByVisibleText("Default viewing");

	}

	@FindBy(xpath = "//a[@id='myTaskMenu']")
	private WebElement MoveTo_ToDoList_Option;

	public WebElement MoveTo_ToDoList_Option() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_ToDoList_Option).perform();
		return MoveTo_ToDoList_Option;
	}

	@FindBy(id = "todoAll")
	private WebElement Select_All_Item;

	public WebElement getSelect_All_Item() {
		return Select_All_Item;
	}

	@FindBy(xpath = "//*[@id=\"todoListTable\"]/tbody/tr[1]/td[2]")
	private WebElement Open_ToDoDocument;

	public WebElement getOpen_ToDoDocument() {
		return Open_ToDoDocument;
	}

	@FindBy(xpath = "//a[@id='SelectAction']")
	private WebElement Select_Action;

	public WebElement Select_Action() {
		return Select_Action;
	}
	
	@FindBy(linkText = "Intimate")
	private WebElement Intimate;

	public WebElement Intimate_WF() {
		return Intimate;
	}

	@FindBy(linkText = "Accept and Forward")
	private WebElement Accept_Forward_WF;

	public WebElement Accept_Forward_WF() {
		return Accept_Forward_WF;
	}
	
	@FindBy(xpath = "//*[@id=\"endwf\"]")
	private WebElement StopWorkflow;

	public WebElement StopWorkflow() {
		return StopWorkflow;
	}

	@FindBy(linkText = "Approve and PSR")
	private WebElement Approve_and_PSR;

	public WebElement Approve_and_PSR() {
		return Approve_and_PSR;
	}

	@FindBy(linkText = "Approve and EndWorkflow")
	private WebElement Approve_and_End_WF;

	public WebElement Approve_and_End_WF() {
		return Approve_and_End_WF;
	}

	@FindBy(linkText = "PSR and EndWorkflow")
	private WebElement PSR_and_End_WF;

	public WebElement PSR_and_End_WF() {
		return PSR_and_End_WF;
	}

	@FindBy(xpath = "//*[@id=\"wfcomments\"]")
	private WebElement Enter_Comment;

	public WebElement Enter_Comment() {
		return Enter_Comment;
	}

	@FindBy(xpath = "//*[@id=\"wfactionOk\"]")
	private WebElement WF_OKBTN;

	public WebElement WF_OKBTN() {
		return WF_OKBTN;
	}

	@FindBy(xpath = "//*[@id=\"reject\"]")
	private WebElement Rework;

	public WebElement Rework() {
		return Rework;
	}

	@FindBy(xpath = "//body[1]/div[41]/div[1]/div[2]/span[1]")
	private WebElement messageContent;
	@FindBy(xpath = "//*[@id=\"sidbiEndworkflowOk\"]")
	private WebElement messageok;

	public void getmessagevalidation() {
		Reporter.log(messageContent.getText() + " this message should show", true);
		jsclick(messageok);
	}

	@FindBy(xpath = "//*[@id=\"indices_69\"]")
	private WebElement Subject;

	public WebElement Subject() {
		Subject.clear();
		return Subject;
	}

	// Create inward External document

	public void Create_INWARD_External_Document() throws Exception {

		Reporter.log("Test Scenario 1 :Verifying Create new INWARD - EXTERNAL document", true);
		Thread.sleep(8000);
		jsclick(getSetting_Icon());
		Thread.sleep(8000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(getMy_Preferencesetting());
		Thread.sleep(8000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Office document and set as Default View", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Pdf document and set as Default View", true);
		jsclick(getApply_button());
		Thread.sleep(8000);
		Reporter.log("Click on Apply button", true);
		jsclick(getClick_New_Document());
		Thread.sleep(2000);
		Reporter.log("Click on New Document Tab", true);
		jsclick(getDestination_Folder_Textbox());
		Thread.sleep(2000);
		Reporter.log("Click on Destination Folder Textbox", true);
		selectElement(getSelect_Cabinet());
		Thread.sleep(2000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(getSelect_Drawer());
		Thread.sleep(8000);
		Reporter.log("Expand a Drawer", true);
		selectElement(getSelect_Folder());
		Thread.sleep(2000);
		Reporter.log("select a Folder", true);
		jsclick(getOK_Button_BrowseforFolder());
		Thread.sleep(8000);
		Reporter.log("Click on Ok button", true);
		getSelect_Document_Type_INWARD_EXTERNAL();
		Thread.sleep(8000);
		Reporter.log("Select Inward External document type", true);
		Subject().sendKeys(CreateDOC_excelRead(10, 1));
		Thread.sleep(3000);
		jsclick(getMove_To_PlusIcon());
		getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse a Document Page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\SIDBI\\InwardExternal.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(8000);
		Reporter.log("Accept alert message", true);
		jsclick(getCreate_button());
		Thread.sleep(8000);
		Reporter.log("Click on Create button", true);
		getCreatedocmessage();
		Thread.sleep(8000);
		jsclick(getViewDocument_Button());
		Reporter.log("Click on view button", true);
		Reporter.log("INWARD - EXTERNAL Document created successfully ", true);
		Thread.sleep(8000);
		getINWARD_ID();
		Thread.sleep(8000);
	}

//Create inward Internal document

	public void Create_INWARD_INTERNAL_Document() throws Exception {

		Reporter.log("Test Scenario 2 :Verifying Create new INWARD - INTERNAL document ", true);
		Thread.sleep(8000);
		jsclick(getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(getSetting_Icon());
		Thread.sleep(8000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(getMy_Preferencesetting());
		Thread.sleep(8000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Office document and set as Default View", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Pdf document and set as Default View", true);
		jsclick(getApply_button());
		Thread.sleep(8000);
		Reporter.log("Click on Apply button", true);
		jsclick(getClick_New_Document());
		Thread.sleep(2000);
		Reporter.log("Click on New Document Tab", true);
		jsclick(getDestination_Folder_Textbox());
		Thread.sleep(2000);
		Reporter.log("Click on Destination Folder Textbox", true);
		selectElement(getSelect_Cabinet());
		Thread.sleep(2000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(getSelect_Drawer());
		Thread.sleep(8000);
		Reporter.log("Expand a Drawer", true);
		selectElement(getSelect_Folder());
		Thread.sleep(8000);
		Reporter.log("select a Folder", true);
		jsclick(getOK_Button_BrowseforFolder());
		Thread.sleep(8000);
		Reporter.log("Click on Destination folder dialogue Ok button", true);
		getSelect_Document_Type_INWARD_INTERNAL();
		Thread.sleep(8000);
		Subject().sendKeys(CreateDOC_excelRead(11, 1));
		Thread.sleep(3000);
		Reporter.log("Select Inward Internal document type", true);
		jsclick(getMove_To_PlusIcon());
		getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Click on browse Option", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\SIDBI\\InwardInternal.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(8000);
		Reporter.log("Accept alert message", true);
		jsclick(getCreate_button());
		Thread.sleep(8000);
		Reporter.log("Click on Create button", true);
		getCreatedocmessage();
		Thread.sleep(8000);
		jsclick(getViewDocument_Button());
		Reporter.log("Click on view button", true);
		Reporter.log("INWARD - INTERNAL Document created successfully ", true);
		Thread.sleep(8000);
		getINWARD_ID();
		Thread.sleep(8000);
	}

	// Create_INWARD_External_Document_and_sendTo_Inward_Workflow (Accept and
	// Forward)

	public void Create_INWARD_Document_and_sendTo_Inward_Workflow() throws Exception {

		Reporter.log("Test Scenario 1 : Create INWARD Document and send To Inward workflow", true);
		Thread.sleep(8000);
		jsclick(getSetting_Icon());
		Thread.sleep(8000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(getMy_Preferencesetting());
		Thread.sleep(8000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Office document and set as Default View", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Pdf document and set as Default View", true);
		jsclick(getApply_button());
		Thread.sleep(8000);
		Reporter.log("Click on Apply button", true);
		Thread.sleep(2000);
		jsclick(getClick_New_Document());
		Thread.sleep(2000);
		Reporter.log("Click on New Document Tab", true);
		jsclick(getDestination_Folder_Textbox());
		Thread.sleep(2000);
		Reporter.log("Click on Destination Folder Textbox", true);
		selectElement(getSelect_Cabinet());
		Thread.sleep(8000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(getSelect_Drawer());
		Thread.sleep(8000);
		Reporter.log("Expand a Drawer", true);
		selectElement(getSelect_Folder());
		Thread.sleep(8000);
		Reporter.log("select a Folder", true);
		jsclick(getOK_Button_BrowseforFolder());
		Thread.sleep(8000);
		Reporter.log("Click on Destination folder dialogue Ok button", true);
		getSelect_Document_Type_INWARD_EXTERNAL();
		Thread.sleep(8000);
		Subject().sendKeys(CreateDOC_excelRead(12, 1));
		Thread.sleep(3000);
		Reporter.log("Select Inward External document type", true);
		jsclick(getMove_To_PlusIcon());
		getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Click on Browse option", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\SIDBI\\InwardExternal.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(8000);
		Reporter.log("Accept alert message", true);
		// Add User 1
		jsclick(getUser1());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(1, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 2
		jsclick(getUser2());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(2, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 3
		jsclick(getUser3());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(3, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 4
		jsclick(getUser4());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(4, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 5
		jsclick(getUser5());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(5, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 6
		jsclick(getUser6());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(1, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 7
		jsclick(getUser7());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(2, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 8
		jsclick(getUser8());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(3, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 9
		jsclick(getUser9());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(4, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 10
		jsclick(getUser10());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(5, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		jsclick(getCreate_button());
		Thread.sleep(8000);
		Reporter.log("Click on Create button", true);
		getCreatedocmessage();
		Thread.sleep(8000);
		jsclick(getViewDocument_Button());
		Reporter.log("Click on view button", true);
		Reporter.log("INWARD - EXTERNAL Document created successfully ", true);
		Thread.sleep(10000);
		getINWARD_ID();
		Thread.sleep(8000);
		jsclick(getClose_Documentpage());
		Thread.sleep(9000);
		Reporter.log("Close document page");
		jsclick(getSelect_Document());
		Thread.sleep(8000);
		Reporter.log("Check Document from Document List", true);
		getMoveTo_Menu_Documents();
		Thread.sleep(8000);
		Reporter.log("Mousehover on Documents Tab", true);
		jsclick(Workflow);
		Thread.sleep(8000);
		Reporter.log("Click on Send to Workflow option", true);
		jsclick(SelectWorkflow());
		Thread.sleep(8000);
		Reporter.log("Select Workflow name", true);
		jsclick(Apply());
		Thread.sleep(8000);
		Reporter.log("Click on the Apply button", true);
		Reporter.log("The originator sent the document to workflow successfully...", true);

	}

	// Create_INWARD_Internal_Document_and_sendTo_Inward_Workflow (Accept and
	// Forward)

	public void Create_INWARD_Document_and_sendTo_Inward_Internal_Workflow() throws Exception {

		Thread.sleep(8000);
		jsclick(getSetting_Icon());
		Thread.sleep(8000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(getMy_Preferencesetting());
		Thread.sleep(8000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Office document and set as Default View", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Pdf document and set as Default View", true);
		jsclick(getApply_button());
		Thread.sleep(8000);
		Reporter.log("Click on Apply button", true);
		Thread.sleep(2000);
		jsclick(getClick_New_Document());
		Thread.sleep(2000);
		Reporter.log("Click on New Document Tab", true);
		jsclick(getDestination_Folder_Textbox());
		Thread.sleep(2000);
		Reporter.log("Click on Destination Folder Textbox", true);
		selectElement(getSelect_Cabinet());
		Thread.sleep(8000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(getSelect_Drawer());
		Thread.sleep(8000);
		Reporter.log("Expand a Drawer", true);
		selectElement(getSelect_Folder());
		Thread.sleep(8000);
		Reporter.log("select a Folder", true);
		jsclick(getOK_Button_BrowseforFolder());
		Thread.sleep(8000);
		Reporter.log("Click on Destination folder dialogue Ok button", true);
		getSelect_Document_Type_INWARD_INTERNAL();
		Thread.sleep(8000);
		Subject().sendKeys(CreateDOC_excelRead(12, 1));
		Thread.sleep(3000);
		Reporter.log("Select Inward External document type", true);
		jsclick(getMove_To_PlusIcon());
		getBrowse_Option();
		Thread.sleep(3000);
		Reporter.log("Browse document", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\SIDBI\\InwardInternal.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(8000);
		Reporter.log("Accept alert message", true);
		// Add User 1
		jsclick(getUser2());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(1, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 2
		jsclick(getUser3());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(2, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 3
		jsclick(getUser4());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(3, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 4
		jsclick(getUser5());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(4, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 5
		jsclick(getUser6());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(5, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 6
		jsclick(getUser7());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(1, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 7
		jsclick(getUser8());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(2, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 8
		jsclick(getUser9());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(3, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 9
		jsclick(getUser10());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(4, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 10
		jsclick(getUser());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(5, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		jsclick(getCreate_button());
		Thread.sleep(8000);
		Reporter.log("Click on Create button", true);
		getCreatedocmessage();
		Thread.sleep(4000);
		jsclick(getViewDocument_Button());
		Reporter.log("Click on view button", true);
		Reporter.log("INWARD - EXTERNAL Document created successfully ", true);
		Thread.sleep(10000);
		getINWARD_ID();
		Thread.sleep(8000);
		jsclick(getClose_Documentpage());
		Thread.sleep(9000);
		Reporter.log("Close document page");
		jsclick(getSelect_Document());
		Thread.sleep(8000);
		Reporter.log("Check Document from Document List", true);
		getMoveTo_Menu_Documents();
		Thread.sleep(4000);
		Reporter.log("Mousehover on Documents Tab", true);
		jsclick(Workflow);
		Thread.sleep(8000);
		Reporter.log("Click on Send to Workflow option", true);
		jsclick(SelectWorkflow());
		Thread.sleep(8000);
		Reporter.log("Select Workflow name", true);
		jsclick(Apply());
		Thread.sleep(8000);
		Reporter.log("Click on the Apply button", true);
		Reporter.log("The originator sent the document to workflow successfully...", true);

	}

	// Create_INWARD_External_Document_and_sendTo_Inward_Workflow (Approve and PSR)

	public void Create_INWARD_Document_and_sendTo_Inward_Workflow_Approve_and_PSR() throws Exception {

		Reporter.log(
				"Test Scenario 12 :Create INWARD Document and sendTo Inward workflow Approve and PSR",
				true);
		Thread.sleep(8000);
		jsclick(getClick_New_Document());
		Thread.sleep(2000);
		Reporter.log("Click on New Document Tab", true);
		jsclick(getDestination_Folder_Textbox());
		Thread.sleep(2000);
		Reporter.log("Click on Destination Folder Textbox", true);
		selectElement(getSelect_Cabinet());
		Thread.sleep(8000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(getSelect_Drawer());
		Thread.sleep(8000);
		Reporter.log("Expand a Drawer", true);
		selectElement(getSelect_Folder());
		Thread.sleep(8000);
		Reporter.log("select a Folder", true);
		jsclick(getOK_Button_BrowseforFolder());
		Thread.sleep(8000);
		Reporter.log("Click on Destination folder dialogue Ok button", true);
		getSelect_Document_Type_INWARD_EXTERNAL();
		Thread.sleep(8000);
		Subject().sendKeys(CreateDOC_excelRead(13, 1));
		Thread.sleep(3000);
		Reporter.log("Select Inward External document type", true);
		jsclick(getMove_To_PlusIcon());
		getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse a Document Page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\SIDBI\\InwardInternal.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(8000);
		// Add User 1
		jsclick(getUser1());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(1, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 2
		jsclick(getUser2());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(2, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 3
		jsclick(getUser3());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(3, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 4
		jsclick(getUser4());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(4, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 5
		jsclick(getUser5());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(5, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 6
		jsclick(getUser6());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(1, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 7
		jsclick(getUser7());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(2, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 8
		jsclick(getUser8());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(3, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 9
		jsclick(getUser9());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(4, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 10
		jsclick(getUser10());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(5, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		jsclick(getCreate_button());
		Thread.sleep(8000);
		Reporter.log("Click on Create button", true);
		getCreatedocmessage();
		Thread.sleep(8000);
		jsclick(getViewDocument_Button());
		Reporter.log("Click on view button", true);
		Reporter.log("INWARD - EXTERNAL Document created successfully ", true);
		Thread.sleep(12000);
		getINWARD_ID();
		Thread.sleep(8000);
		jsclick(getClose_Documentpage());
		Thread.sleep(9000);
		Reporter.log("Close document page", true);
		jsclick(getSelect_Document());
		Thread.sleep(8000);
		Reporter.log("Check Document from Document List", true);
		getMoveTo_Menu_Documents();
		Thread.sleep(8000);
		Reporter.log("Mousehover on Documents Tab", true);
		jsclick(Workflow);
		Thread.sleep(8000);
		Reporter.log("Click on send to workflow option", true);
		jsclick(SelectWorkflow());
		Thread.sleep(8000);
		Reporter.log("Select workflow name", true);
		jsclick(Apply());
		Thread.sleep(8000);
		Reporter.log("Click on Apply button", true);
		Reporter.log("The originator sent the document to workflow successfully...", true);

	}

	// Create_INWARD_Internal_Document_and_sendTo_Inward_Workflow (Approve and PSR)

	public void Create_INWARD_Internal_Document_and_sendTo_Inward_Workflow_Approve_and_PSR() throws Exception {

		Thread.sleep(8000);
		jsclick(getClick_New_Document());
		Thread.sleep(2000);
		Reporter.log("Click on New Document Tab", true);
		jsclick(getDestination_Folder_Textbox());
		Thread.sleep(2000);
		Reporter.log("Click on Destination Folder Textbox", true);
		selectElement(getSelect_Cabinet());
		Thread.sleep(8000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(getSelect_Drawer());
		Thread.sleep(8000);
		Reporter.log("Expand a Drawer", true);
		selectElement(getSelect_Folder());
		Thread.sleep(8000);
		Reporter.log("select a Folder", true);
		jsclick(getOK_Button_BrowseforFolder());
		Thread.sleep(8000);
		Reporter.log("Click on Destination folder dialogue Ok button", true);
		getSelect_Document_Type_INWARD_INTERNAL();
		Thread.sleep(8000);
		Subject().sendKeys(CreateDOC_excelRead(13, 1));
		Thread.sleep(3000);
		Reporter.log("Select Inward Internal document type", true);
		jsclick(getMove_To_PlusIcon());
		getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse a Document Page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\SIDBI\\InwardInternal.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(10000);
		// Add User 1
		jsclick(getUser2());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(1, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 2
		jsclick(getUser3());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(2, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 3
		jsclick(getUser4());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(3, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 4
		jsclick(getUser5());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(4, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 5
		jsclick(getUser6());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(5, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 6
		jsclick(getUser7());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(1, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 7
		jsclick(getUser8());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(2, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 8
		jsclick(getUser9());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(3, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 9
		jsclick(getUser10());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(4, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 10
		jsclick(getUser());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(5, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		jsclick(getCreate_button());
		Thread.sleep(8000);
		Reporter.log("Click on Create button", true);
		getCreatedocmessage();
		Thread.sleep(8000);
		jsclick(getViewDocument_Button());
		Reporter.log("Click on view button", true);
		Reporter.log("INWARD - EXTERNAL Document created successfully ", true);
		Thread.sleep(10000);
		getINWARD_ID();
		Thread.sleep(8000);
		jsclick(getClose_Documentpage());
		Thread.sleep(9000);
		Reporter.log("Close document page", true);
		jsclick(getSelect_Document());
		Thread.sleep(8000);
		Reporter.log("Check Document from Document List", true);
		getMoveTo_Menu_Documents();
		Thread.sleep(8000);
		Reporter.log("Mousehover on Documents Tab", true);
		jsclick(Workflow);
		Thread.sleep(8000);
		Reporter.log("Click on send to workflow option", true);
		jsclick(SelectWorkflow());
		Thread.sleep(8000);
		Reporter.log("Select workflow name", true);
		jsclick(Apply());
		Thread.sleep(8000);
		Reporter.log("Click on Apply button", true);
		Reporter.log("The originator sent the document to workflow successfully...", true);

	}
	// Accept and Forward Workflow for User 1

	public void Accept_and_Forward_INWARD_Workflow_Document_from_User1() throws Exception {

		Reporter.log("Test Scenario 2 : Accept and Forward INWARD workflow Document from User1", true);
		Thread.sleep(2000);
		jsclick(getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		Thread.sleep(8000);
		jsclick(getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username option", true);
		jsclick(getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout option", true);
		loginUser1();
		Thread.sleep(8000);
		Reporter.log("Task User-1 Log into SIDBIDMSRoom", true);
		jsclick(getSetting_Icon());
		Thread.sleep(8000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(getMy_Preferencesetting());
		Thread.sleep(8000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Office document and set as Default View", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Pdf document and set as Default View", true);
		jsclick(getApply_button());
		Thread.sleep(8000);
		Reporter.log("Click on Apply button", true);
		MoveTo_ToDoList_Option();
		Reporter.log("Move to To Do List Tab", true);
		jsclick(getSelect_All_Item());
		Thread.sleep(8000);
		Reporter.log("Click on All Item Option", true);
		jsclick(getOpen_ToDoDocument());
		Thread.sleep(7000);
		Reporter.log("Select and Open To Do List Document", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Reporter.log("Document open successfully", true);
		Thread.sleep(8000);
		Actions actor = new Actions(driver);
		actor.moveToElement(Select_Action).perform();
		Thread.sleep(8000);
		Reporter.log("Move to Select Action option", true);
		jsclick(Accept_Forward_WF());
		Thread.sleep(8000);
		Reporter.log("Click on Accept and Forward option", true);
		Enter_Comment().sendKeys(CreateDOC_excelRead(6, 1));
		Thread.sleep(8000);
		Reporter.log("Enter comment 'Accept and Forward Workflow' into comment box", true);
		jsclick(WF_OKBTN());
		Reporter.log("Click on comment box Ok button", true);
		Reporter.log(
				"Task User-1 Add comments 'Accept and Forward Workflow' the document move to Next Task User Succssfully",
				true);
	}

	// Accept and Forward Workflow for User 2

	public void Accept_and_Forward_INWARD_Workflow_Document_from_User2() throws Exception {

		Reporter.log("Test Scenario 3 : Accept and Forward INWARD workflow Document from User2", true);
		Thread.sleep(2000);
		jsclick(getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username option", true);
		jsclick(getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout option", true);
		loginUser2();
		Thread.sleep(8000);
		Reporter.log("Task User-2 Log into SIDBIDMSRoom", true);
		jsclick(getSetting_Icon());
		Thread.sleep(8000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(getMy_Preferencesetting());
		Thread.sleep(8000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Office document and set as Default View", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Pdf document and set as Default View", true);
		jsclick(getApply_button());
		Thread.sleep(8000);
		Reporter.log("Click on Apply button", true);
		MoveTo_ToDoList_Option();
		Reporter.log("Move to To Do List Tab", true);
		jsclick(getSelect_All_Item());
		Thread.sleep(8000);
		Reporter.log("Click on All Item Option", true);
		jsclick(getOpen_ToDoDocument());
		Thread.sleep(7000);
		Reporter.log("Select and Open To Do List Document", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Reporter.log("Document open successfully ", true);
		Thread.sleep(8000);
		Actions actor = new Actions(driver);
		actor.moveToElement(Select_Action).perform();
		Thread.sleep(8000);
		Reporter.log("Move to Select Action option", true);
		jsclick(Accept_Forward_WF());
		Thread.sleep(8000);
		Reporter.log("Click on Accept and Forward option", true);
		Enter_Comment().sendKeys(CreateDOC_excelRead(6, 1));
		Thread.sleep(8000);
		Reporter.log("Enter comment 'Accept and Forward Workflow' into comment box", true);
		jsclick(WF_OKBTN());
		Reporter.log("Click on comment box Ok button", true);
		Reporter.log(
				"Task User-2 Add comments 'Accept and Forward Workflow' the document move to Next Task User Succssfully",
				true);
	}

	// Accept and Forward Workflow for User 3

	public void Accept_and_Forward_INWARD_Workflow_Document_from_User3() throws Exception {

		Reporter.log("Test Scenario 4 : Accept and Forward INWARD workflow Document from User3", true);
		Thread.sleep(2000);
		jsclick(getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username option", true);
		jsclick(getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout option", true);
		loginUser3();
		Thread.sleep(8000);
		Reporter.log("Task User-3 Log into SIDBIDMSRoom", true);
		jsclick(getSetting_Icon());
		Thread.sleep(8000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(getMy_Preferencesetting());
		Thread.sleep(8000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Office document and set as Default View", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Pdf document and set as Default View", true);
		jsclick(getApply_button());
		Thread.sleep(8000);
		Reporter.log("Click on Apply button", true);
		MoveTo_ToDoList_Option();
		Reporter.log("Move to To Do List Tab", true);
		jsclick(getSelect_All_Item());
		Thread.sleep(8000);
		Reporter.log("Click on All Item Option", true);
		jsclick(getOpen_ToDoDocument());
		Thread.sleep(7000);
		Reporter.log("Select and Open To Do List Document", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Reporter.log("Document open successfully ", true);
		Thread.sleep(8000);
		Actions actor = new Actions(driver);
		actor.moveToElement(Select_Action).perform();
		Thread.sleep(8000);
		Reporter.log("Move to Select Action option", true);
		jsclick(Accept_Forward_WF());
		Thread.sleep(8000);
		Reporter.log("Click on Accept and Forward option", true);
		Enter_Comment().sendKeys(CreateDOC_excelRead(6, 1));
		Thread.sleep(8000);
		Reporter.log("Enter comment 'Accept and Forward Workflow' into comment box", true);
		jsclick(WF_OKBTN());
		Reporter.log("Click on comment box Ok button", true);
		Reporter.log(
				"Task User-3 Add comments 'Accept and Forward Workflow' the document move to Next Task User Succssfully",
				true);
	}

	// Accept and Forward Workflow for User 4

	public void Accept_and_Forward_INWARD_Workflow_Document_from_User4() throws Exception {

		Reporter.log("Test Scenario 5 : Accept and Forward INWARD workflow Document from User4", true);
		Thread.sleep(2000);
		jsclick(getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username option", true);
		jsclick(getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout option", true);
		loginUser4();
		Thread.sleep(8000);
		Reporter.log("Task User-4 Log into SIDBIDMSRoom", true);
		jsclick(getSetting_Icon());
		Thread.sleep(8000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(getMy_Preferencesetting());
		Thread.sleep(8000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Office document and set as Default View", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Pdf document and set as Default View", true);
		jsclick(getApply_button());
		Thread.sleep(8000);
		Reporter.log("Click on Apply button", true);
		MoveTo_ToDoList_Option();
		Reporter.log("Move to To Do List Tab", true);
		jsclick(getSelect_All_Item());
		Thread.sleep(8000);
		Reporter.log("Click on All Item Option", true);
		jsclick(getOpen_ToDoDocument());
		Thread.sleep(7000);
		Reporter.log("Select and Open To Do List Document", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Reporter.log("Document open successfully ", true);
		Thread.sleep(8000);
		Actions actor = new Actions(driver);
		actor.moveToElement(Select_Action).perform();
		Thread.sleep(8000);
		Reporter.log("Move to Select Action option", true);
		jsclick(Accept_Forward_WF());
		Thread.sleep(8000);
		Reporter.log("Click on Accept and Forward option", true);
		Enter_Comment().sendKeys(CreateDOC_excelRead(6, 1));
		Thread.sleep(8000);
		Reporter.log("Enter comment 'Accept and Forward Workflow' into comment box", true);
		jsclick(WF_OKBTN());
		Reporter.log("Click on comment box Ok button", true);
		Reporter.log(
				"Task User-4 Add comments 'Accept and Forward Workflow' the document move to Next Task User Succssfully",
				true);
	}

	// Accept and Forward Workflow for User 5

	public void Accept_and_Forward_INWARD_Workflow_Document_from_User5() throws Exception {

		Reporter.log("Test Scenario 6 : Accept and Forward INWARD workflow Document from User5", true);
		Thread.sleep(2000);
		jsclick(getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username option", true);
		jsclick(getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout option", true);
		loginUser5();
		Thread.sleep(8000);
		Reporter.log("Task User-5 Log into SIDBIDMSRoom", true);
		jsclick(getSetting_Icon());
		Thread.sleep(8000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(getMy_Preferencesetting());
		Thread.sleep(8000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Office document and set as Default View", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Pdf document and set as Default View", true);
		jsclick(getApply_button());
		Thread.sleep(8000);
		Reporter.log("Click on Apply button", true);
		MoveTo_ToDoList_Option();
		Reporter.log("Move to To Do List Tab", true);
		jsclick(getSelect_All_Item());
		Thread.sleep(8000);
		Reporter.log("Click on All Item Option", true);
		jsclick(getOpen_ToDoDocument());
		Thread.sleep(7000);
		Reporter.log("Select and Open To Do List Document", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Reporter.log("Document open successfully ", true);
		Thread.sleep(8000);
		Actions actor = new Actions(driver);
		actor.moveToElement(Select_Action).perform();
		Thread.sleep(8000);
		Reporter.log("Move to Select Action option", true);
		jsclick(Accept_Forward_WF());
		Thread.sleep(8000);
		Reporter.log("Click on Accept and Forward option", true);
		Enter_Comment().sendKeys(CreateDOC_excelRead(6, 1));
		Thread.sleep(8000);
		Reporter.log("Enter comment 'Accept and Forward Workflow' into comment box", true);
		jsclick(WF_OKBTN());
		Reporter.log("Click on comment box Ok button", true);
		Reporter.log(
				"Task User-5 Add comments 'Accept and Forward Workflow' the document move to Next Task User Succssfully",
				true);
	}

	// Accept and Forward Workflow for User 6

	public void Accept_and_Forward_INWARD_Workflow_Document_from_User6() throws Exception {

		Reporter.log("Test Scenario 7 : Accept and Forward INWARD workflow Document from User6", true);
		Thread.sleep(2000);
		jsclick(getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username option", true);
		jsclick(getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout option", true);
		loginUser1();
		Thread.sleep(8000);
		Reporter.log("Task User-6 Log into SIDBIDMSRoom", true);
		MoveTo_ToDoList_Option();
		Reporter.log("Move to To Do List Tab", true);
		jsclick(getSelect_All_Item());
		Thread.sleep(8000);
		Reporter.log("Click on All Item Option", true);
		jsclick(getOpen_ToDoDocument());
		Thread.sleep(7000);
		Reporter.log("Select and Open To Do List Document", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Reporter.log("Document open successfully ", true);
		Thread.sleep(8000);
		Actions actor = new Actions(driver);
		actor.moveToElement(Select_Action).perform();
		Thread.sleep(8000);
		Reporter.log("Move to Select Action option", true);
		jsclick(Accept_Forward_WF());
		Thread.sleep(8000);
		Reporter.log("Click on Accept and Forward option", true);
		Enter_Comment().sendKeys(CreateDOC_excelRead(6, 1));
		Thread.sleep(8000);
		Reporter.log("Enter comment 'Accept and Forward Workflow' into comment box", true);
		jsclick(WF_OKBTN());
		Reporter.log("Click on comment box Ok button", true);
		Reporter.log(
				"Task User-6 Add comments 'Accept and Forward Workflow' the document move to Next Task User Succssfully",
				true);
	}

	// Accept and Forward Workflow for User 7

	public void Accept_and_Forward_INWARD_Workflow_Document_from_User7() throws Exception {

		Reporter.log("Test Scenario 8 : Accept and Forward INWARD workflow Document from User7", true);
		Thread.sleep(2000);
		jsclick(getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username option", true);
		jsclick(getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout option", true);
		loginUser2();
		Thread.sleep(8000);
		Reporter.log("Task User-7 Log into SIDBIDMSRoom", true);
		MoveTo_ToDoList_Option();
		Reporter.log("Move to To Do List Tab", true);
		jsclick(getSelect_All_Item());
		Thread.sleep(8000);
		Reporter.log("Click on All Item Option", true);
		jsclick(getOpen_ToDoDocument());
		Thread.sleep(7000);
		Reporter.log("Select and Open To Do List Document", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Reporter.log("Document open successfully ", true);
		Thread.sleep(8000);
		Actions actor = new Actions(driver);
		actor.moveToElement(Select_Action).perform();
		Thread.sleep(8000);
		Reporter.log("Move to Select Action option", true);
		jsclick(Accept_Forward_WF());
		Thread.sleep(8000);
		Reporter.log("Click on Accept and Forward option", true);
		Enter_Comment().sendKeys(CreateDOC_excelRead(6, 1));
		Thread.sleep(8000);
		Reporter.log("Enter comment 'Accept and Forward Workflow' into comment box", true);
		jsclick(WF_OKBTN());
		Reporter.log("Click on comment box Ok button", true);
		Reporter.log(
				"Task User-7 Add comments 'Accept and Forward Workflow' the document move to Next Task User Succssfully",
				true);
	}

	// Accept and Forward Workflow for User 8

	public void Accept_and_Forward_INWARD_Workflow_Document_from_User8() throws Exception {

		Reporter.log("Test Scenario 9 : Accept and Forward INWARD workflow Document from User8", true);
		Thread.sleep(2000);
		jsclick(getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username option", true);
		jsclick(getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout option", true);
		loginUser3();
		Thread.sleep(8000);
		Reporter.log("Task User-8 Log into SIDBIDMSRoom", true);
		MoveTo_ToDoList_Option();
		Reporter.log("Move to To Do List Tab", true);
		jsclick(getSelect_All_Item());
		Thread.sleep(8000);
		Reporter.log("Click on All Item Option", true);
		jsclick(getOpen_ToDoDocument());
		Thread.sleep(7000);
		Reporter.log("Select and Open To Do List Document", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Reporter.log("Document open successfully ", true);
		Thread.sleep(8000);
		Actions actor = new Actions(driver);
		actor.moveToElement(Select_Action).perform();
		Thread.sleep(8000);
		Reporter.log("Move to Select Action option", true);
		jsclick(Accept_Forward_WF());
		Thread.sleep(8000);
		Reporter.log("Click on Accept and Forward option", true);
		Enter_Comment().sendKeys(CreateDOC_excelRead(6, 1));
		Thread.sleep(8000);
		Reporter.log("Enter comment 'Accept and Forward Workflow' into comment box", true);
		jsclick(WF_OKBTN());
		Reporter.log("Click on comment box Ok button", true);
		Reporter.log(
				"Task User-8 Add comments 'Accept and Forward Workflow' the document move to Next Task User Succssfully",
				true);
	}

	// Accept and Forward Workflow for User 9

	public void Accept_and_Forward_INWARD_Workflow_Document_from_User9() throws Exception {

		Reporter.log("Test Scenario 10 : Accept and Forward INWARD workflow Document from User9", true);
		Thread.sleep(2000);
		jsclick(getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username option", true);
		jsclick(getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout option", true);
		loginUser4();
		Thread.sleep(8000);
		Reporter.log("Task User-9 Log into SIDBIDMSRoom", true);
		MoveTo_ToDoList_Option();
		Reporter.log("Move to To Do List Tab", true);
		jsclick(getSelect_All_Item());
		Thread.sleep(8000);
		Reporter.log("Click on All Item Option", true);
		jsclick(getOpen_ToDoDocument());
		Thread.sleep(7000);
		Reporter.log("Select and Open To Do List Document", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Reporter.log("Document open successfully ", true);
		Thread.sleep(8000);
		Actions actor = new Actions(driver);
		actor.moveToElement(Select_Action).perform();
		Thread.sleep(8000);
		Reporter.log("Move to Select Action option", true);
		jsclick(Accept_Forward_WF());
		Thread.sleep(8000);
		Reporter.log("Click on Accept and Forward option", true);
		Enter_Comment().sendKeys(CreateDOC_excelRead(6, 1));
		Thread.sleep(8000);
		Reporter.log("Enter comment 'Accept and Forward Workflow' into comment box", true);
		jsclick(WF_OKBTN());
		Reporter.log("Click on comment box Ok button", true);
		Reporter.log(
				"Task User-9 Add comments 'Accept and Forward Workflow' the document move to Next Task User Succssfully",
				true);
	}

	// Approve and End Workflow for User 10

	public void Approve_and_EndWorkflow_INWARD_Workflow_Document_from_User10() throws Exception {

		Reporter.log("Test Scenario 11 : Approve and End INWARD workflow Document from User10", true);
		Thread.sleep(2000);
		jsclick(getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username option", true);
		jsclick(getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout option", true);
		loginUser5();
		Thread.sleep(8000);
		Reporter.log("Task User-10 Log into SIDBIDMSRoom", true);
		Reporter.log("Click on Apply button", true);
		MoveTo_ToDoList_Option();
		Reporter.log("Move to To Do List Tab", true);
		jsclick(getSelect_All_Item());
		Thread.sleep(8000);
		Reporter.log("Click on All Item Option", true);
		jsclick(getOpen_ToDoDocument());
		Thread.sleep(7000);
		Reporter.log("Select and Open To Do List Document", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Reporter.log("Document open successfully ", true);
		Thread.sleep(8000);
		Actions actor = new Actions(driver);
		actor.moveToElement(Select_Action).perform();
		Thread.sleep(8000);
		jsclick(Approve_and_End_WF());
		Thread.sleep(8000);
		Reporter.log("Click on Approve and EndWorkflow option", true);
		getmessagevalidation();
		Thread.sleep(8000);
		Enter_Comment().sendKeys(CreateDOC_excelRead(7, 1));
		Thread.sleep(8000);
		Reporter.log("Enter comment 'Approve and End Workflow' into comment box", true);
		jsclick(WF_OKBTN());
		Thread.sleep(8000);
		Reporter.log("Click on comment box Ok button", true);
		Reporter.log("Task User-10 Add comments 'Approve and End Workflow' Succssfully", true);
		driver.close();
	}

	// Approve and PSR Workflow for User 1

	public void Approve_and_PSR_INWARD_Workflow_Document_from_User1() throws Exception {

		Reporter.log("Test Scenario 13 : Approve and PSR INWARD workflow Document from User1", true);
		Thread.sleep(2000);
		jsclick(getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username option", true);
		jsclick(getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout option", true);
		loginUser1();
		Thread.sleep(8000);
		Reporter.log("Task User-1 Log into SIDBIDMSRoom", true);
		MoveTo_ToDoList_Option();
		Reporter.log("Move to To Do List Tab", true);
		jsclick(getSelect_All_Item());
		Thread.sleep(8000);
		Reporter.log("Click on All Item Option", true);
		jsclick(getOpen_ToDoDocument());
		Thread.sleep(7000);
		Reporter.log("Select and Open To Do List Document", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Reporter.log("Document open successfully ", true);
		Thread.sleep(8000);
		Actions actor = new Actions(driver);
		actor.moveToElement(Select_Action).perform();
		Thread.sleep(8000);
		Reporter.log("Move to Select Action option", true);
		jsclick(Approve_and_PSR());
		Thread.sleep(8000);
		Reporter.log("Click on Approve and PSR option", true);
		Enter_Comment().sendKeys(CreateDOC_excelRead(8, 1));
		Thread.sleep(8000);
		Reporter.log("Enter comment 'Approve and PSR Workflow' into comment box", true);
		jsclick(WF_OKBTN());
		Reporter.log("Click on comment box Ok button", true);
		Reporter.log(
				"Task User-1 Add comments 'Approve and PSR Workflow' the document move to next Task User Succssfully",
				true);
	}

	// Approve and PSR Workflow for User 2

	public void Approve_and_PSR_INWARD_Workflow_Document_from_User2() throws Exception {

		Reporter.log("Test Scenario 14 : Approve and PSR INWARD workflow Document from User2", true);
		Thread.sleep(2000);
		jsclick(getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username option", true);
		jsclick(getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout option", true);
		loginUser2();
		Thread.sleep(8000);
		Reporter.log("Task User-2 Log into SIDBIDMSRoom", true);
		jsclick(getSetting_Icon());
		Thread.sleep(8000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(getMy_Preferencesetting());
		Thread.sleep(8000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Office document and set as Default View", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Pdf document and set as Default View", true);
		jsclick(getApply_button());
		Thread.sleep(8000);
		Reporter.log("Click on Apply button", true);
		MoveTo_ToDoList_Option();
		Reporter.log("Move to To Do List Tab", true);
		jsclick(getSelect_All_Item());
		Thread.sleep(8000);
		Reporter.log("Click on All Item Option", true);
		jsclick(getOpen_ToDoDocument());
		Thread.sleep(7000);
		Reporter.log("Select and Open To Do List Document", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Reporter.log("Document open successfully ", true);
		Thread.sleep(8000);
		Actions actor = new Actions(driver);
		actor.moveToElement(Select_Action).perform();
		Thread.sleep(8000);
		Reporter.log("Move to Select Action option", true);
		jsclick(Approve_and_PSR());
		Thread.sleep(8000);
		Reporter.log("Click on Approve and PSR option", true);
		Enter_Comment().sendKeys(CreateDOC_excelRead(8, 1));
		Thread.sleep(8000);
		Reporter.log("Enter comment 'Approve and PSR Workflow' into comment box", true);
		jsclick(WF_OKBTN());
		Reporter.log("Click on comment box Ok button", true);
		Reporter.log(
				"Task User-2 Add comments 'Approve and PSR Workflow' the document move to next Task User Succssfully",
				true);
	}

	// Approve and PSR Workflow for User 3

	public void Approve_and_PSR_INWARD_Workflow_Document_from_User3() throws Exception {

		Reporter.log("Test Scenario 15 : Approve and PSR INWARD workflow Document from User3", true);
		Thread.sleep(2000);
		jsclick(getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username option", true);
		jsclick(getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout option", true);
		loginUser3();
		Thread.sleep(8000);
		Reporter.log("Task User-3 Log into SIDBIDMSRoom", true);
		jsclick(getSetting_Icon());
		Thread.sleep(8000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(getMy_Preferencesetting());
		Thread.sleep(8000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Office document and set as Default View", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Pdf document and set as Default View", true);
		jsclick(getApply_button());
		Thread.sleep(8000);
		Reporter.log("Click on Apply button", true);
		MoveTo_ToDoList_Option();
		Reporter.log("Move to To Do List Tab", true);
		jsclick(getSelect_All_Item());
		Thread.sleep(8000);
		Reporter.log("Click on All Item Option", true);
		jsclick(getOpen_ToDoDocument());
		Thread.sleep(7000);
		Reporter.log("Select and Open To Do List Document", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Reporter.log("Document open successfully ", true);
		Thread.sleep(8000);
		Actions actor = new Actions(driver);
		actor.moveToElement(Select_Action).perform();
		Thread.sleep(8000);
		Reporter.log("Move to Select Action option", true);
		jsclick(Approve_and_PSR());
		Thread.sleep(8000);
		Reporter.log("Click on Approve and PSR option", true);
		Enter_Comment().sendKeys(CreateDOC_excelRead(8, 1));
		Thread.sleep(8000);
		Reporter.log("Enter comment 'Approve and PSR Workflow' into comment box", true);
		jsclick(WF_OKBTN());
		Reporter.log("Click on comment box Ok button", true);
		Reporter.log(
				"Task User-3 Add comments 'Approve and PSR Workflow' the document move to next Task User Succssfully",
				true);
	}

	// Approve and PSR Workflow for User 4

	public void Approve_and_PSR_INWARD_Workflow_Document_from_User4() throws Exception {

		Reporter.log("Test Scenario 16 : Approve and PSR INWARD workflow Document from User4", true);
		Thread.sleep(2000);
		jsclick(getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username option", true);
		jsclick(getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout option", true);
		loginUser4();
		Thread.sleep(8000);
		Reporter.log("Task User-4 Log into SIDBIDMSRoom", true);
		jsclick(getSetting_Icon());
		Thread.sleep(8000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(getMy_Preferencesetting());
		Thread.sleep(8000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Office document and set as Default View", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Pdf document and set as Default View", true);
		jsclick(getApply_button());
		Thread.sleep(8000);
		Reporter.log("Click on Apply button", true);
		MoveTo_ToDoList_Option();
		Reporter.log("Move to To Do List Tab", true);
		jsclick(getSelect_All_Item());
		Thread.sleep(8000);
		Reporter.log("Click on All Item Option", true);
		jsclick(getOpen_ToDoDocument());
		Thread.sleep(7000);
		Reporter.log("Select and Open To Do List Document", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Reporter.log("Document open successfully ", true);
		Thread.sleep(8000);
		Actions actor = new Actions(driver);
		actor.moveToElement(Select_Action).perform();
		Thread.sleep(8000);
		Reporter.log("Move to Select Action option", true);
		jsclick(Approve_and_PSR());
		Thread.sleep(8000);
		Reporter.log("Click on Approve and PSR option", true);
		Enter_Comment().sendKeys(CreateDOC_excelRead(8, 1));
		Thread.sleep(8000);
		Reporter.log("Enter comment 'Approve and PSR Workflow' into comment box", true);
		jsclick(WF_OKBTN());
		Reporter.log("Click on comment box Ok button", true);
		Reporter.log(
				"Task User-4 Add comments 'Approve and PSR Workflow' the document move to next Task User Succssfully",
				true);
	}

	// Approve and PSR Workflow for User 5

	public void Approve_and_PSR_INWARD_Workflow_Document_from_User5() throws Exception {

		Reporter.log("Test Scenario 17 : Approve and PSR INWARD workflow Document from User5", true);
		Thread.sleep(2000);
		jsclick(getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username option", true);
		jsclick(getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout option", true);
		loginUser5();
		Thread.sleep(8000);
		Reporter.log("Task User-5 Log into SIDBIDMSRoom", true);
		jsclick(getSetting_Icon());
		Thread.sleep(8000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(getMy_Preferencesetting());
		Thread.sleep(8000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Office document and set as Default View", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Pdf document and set as Default View", true);
		jsclick(getApply_button());
		Thread.sleep(8000);
		Reporter.log("Click on Apply button", true);
		MoveTo_ToDoList_Option();
		Reporter.log("Move to To Do List Tab", true);
		jsclick(getSelect_All_Item());
		Thread.sleep(8000);
		Reporter.log("Click on All Item Option", true);
		jsclick(getOpen_ToDoDocument());
		Thread.sleep(7000);
		Reporter.log("Select and Open To Do List Document", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Reporter.log("Document open successfully ", true);
		Thread.sleep(8000);
		Actions actor = new Actions(driver);
		actor.moveToElement(Select_Action).perform();
		Thread.sleep(8000);
		Reporter.log("Move to Select Action option", true);
		jsclick(Approve_and_PSR());
		Thread.sleep(8000);
		Reporter.log("Click on Approve and PSR option", true);
		Enter_Comment().sendKeys(CreateDOC_excelRead(8, 1));
		Thread.sleep(8000);
		Reporter.log("Enter comment 'Approve and PSR Workflow' into comment box", true);
		jsclick(WF_OKBTN());
		Reporter.log("Click on comment box Ok button", true);
		Reporter.log(
				"Task User-5 Add comments 'Approve and PSR Workflow' the document move to next Task User Succssfully",
				true);
	}

	// Approve and PSR Workflow for User 6

	public void Approve_and_PSR_INWARD_Workflow_Document_from_User6() throws Exception {

		Reporter.log("Test Scenario 18 : Approve and PSR INWARD workflow Document from User7", true);
		Thread.sleep(2000);
		jsclick(getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username option", true);
		jsclick(getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout option", true);
		loginUser1();
		Thread.sleep(8000);
		Reporter.log("Task User-6 Log into SIDBIDMSRoom", true);
		MoveTo_ToDoList_Option();
		Reporter.log("Move to To Do List Tab", true);
		jsclick(getSelect_All_Item());
		Thread.sleep(8000);
		Reporter.log("Click on All Item Option", true);
		jsclick(getOpen_ToDoDocument());
		Thread.sleep(7000);
		Reporter.log("Select and Open To Do List Document", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Reporter.log("Document open successfully ", true);
		Thread.sleep(8000);
		Actions actor = new Actions(driver);
		actor.moveToElement(Select_Action).perform();
		Thread.sleep(8000);
		Reporter.log("Move to Select Action option", true);
		jsclick(Approve_and_PSR());
		Thread.sleep(8000);
		Reporter.log("Click on Approve and PSR option", true);
		Enter_Comment().sendKeys(CreateDOC_excelRead(8, 1));
		Thread.sleep(8000);
		Reporter.log("Enter comment 'Approve and PSR Workflow' into comment box", true);
		jsclick(WF_OKBTN());
		Reporter.log("Click on comment box Ok button", true);
		Reporter.log(
				"Task User-6 Add comments 'Approve and PSR Workflow' the document move to next Task User Succssfully",
				true);
	}

	// Approve and PSR Workflow for User 7

	public void Approve_and_PSR_INWARD_Workflow_Document_from_User7() throws Exception {

		Reporter.log("Test Scenario 19 : Approve and PSR INWARD workflow Document from User7", true);
		Thread.sleep(2000);
		jsclick(getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username option", true);
		jsclick(getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout option", true);
		loginUser2();
		Thread.sleep(8000);
		Reporter.log("Task User-7 Log into SIDBIDMSRoom", true);
		MoveTo_ToDoList_Option();
		Reporter.log("Move to To Do List Tab", true);
		jsclick(getSelect_All_Item());
		Thread.sleep(8000);
		Reporter.log("Click on All Item Option", true);
		jsclick(getOpen_ToDoDocument());
		Thread.sleep(7000);
		Reporter.log("Select and Open To Do List Document", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Reporter.log("Document open successfully ", true);
		Thread.sleep(8000);
		Actions actor = new Actions(driver);
		actor.moveToElement(Select_Action).perform();
		Thread.sleep(8000);
		Reporter.log("Move to Select Action option", true);
		jsclick(Approve_and_PSR());
		Thread.sleep(8000);
		Reporter.log("Click on Approve and PSR option", true);
		Enter_Comment().sendKeys(CreateDOC_excelRead(8, 1));
		Thread.sleep(8000);
		Reporter.log("Enter comment 'Approve and PSR Workflow' into comment box", true);
		jsclick(WF_OKBTN());
		Reporter.log("Click on comment box Ok button", true);
		Reporter.log(
				"Task User-7 Add comments 'Approve and PSR Workflow' the document move to next Task User Succssfully",
				true);
	}

	// Approve and PSR Workflow for User 8

	public void Approve_and_PSR_INWARD_Workflow_Document_from_User8() throws Exception {

		Reporter.log("Test Scenario 20 : Approve and PSR INWARD workflow Document from User8", true);
		Thread.sleep(2000);
		jsclick(getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username option", true);
		jsclick(getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout option", true);
		loginUser3();
		Thread.sleep(8000);
		Reporter.log("Task User-8 Log into SIDBIDMSRoom", true);
		MoveTo_ToDoList_Option();
		Reporter.log("Move to To Do List Tab", true);
		jsclick(getSelect_All_Item());
		Thread.sleep(8000);
		Reporter.log("Click on All Item Option", true);
		jsclick(getOpen_ToDoDocument());
		Thread.sleep(7000);
		Reporter.log("Select and Open To Do List Document", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Reporter.log("Document open successfully ", true);
		Thread.sleep(8000);
		Actions actor = new Actions(driver);
		actor.moveToElement(Select_Action).perform();
		Thread.sleep(8000);
		Reporter.log("Move to Select Action option", true);
		jsclick(Approve_and_PSR());
		Thread.sleep(8000);
		Reporter.log("Click on Approve and PSR option", true);
		Enter_Comment().sendKeys(CreateDOC_excelRead(8, 1));
		Thread.sleep(8000);
		Reporter.log("Enter comment 'Approve and PSR Workflow' into comment box", true);
		jsclick(WF_OKBTN());
		Reporter.log("Click on comment box Ok button", true);
		Reporter.log(
				"Task User-8 Add comments 'Approve and PSR Workflow' the document move to next Task User Succssfully",
				true);
	}

	// Approve and PSR Workflow for User 9

	public void Approve_and_PSR_INWARD_Workflow_Document_from_User9() throws Exception {

		Reporter.log("Test Scenario 21 : Approve and PSR INWARD workflow Document from User9", true);
		Thread.sleep(2000);
		jsclick(getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username option", true);
		jsclick(getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout option", true);
		loginUser4();
		Thread.sleep(8000);
		Reporter.log("Task User-9 Log into SIDBIDMSRoom", true);
		MoveTo_ToDoList_Option();
		Reporter.log("Move to To Do List Tab", true);
		jsclick(getSelect_All_Item());
		Thread.sleep(8000);
		Reporter.log("Click on All Item Option", true);
		jsclick(getOpen_ToDoDocument());
		Thread.sleep(7000);
		Reporter.log("Select and Open To Do List Document", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Reporter.log("Document open successfully ", true);
		Thread.sleep(8000);
		Actions actor = new Actions(driver);
		actor.moveToElement(Select_Action).perform();
		Thread.sleep(8000);
		Reporter.log("Move to Select Action option", true);
		jsclick(Approve_and_PSR());
		Thread.sleep(8000);
		Reporter.log("Click on Approve and PSR option", true);
		Enter_Comment().sendKeys(CreateDOC_excelRead(8, 1));
		Thread.sleep(8000);
		Reporter.log("Enter comment 'Approve and PSR Workflow' into comment box", true);
		jsclick(WF_OKBTN());
		Reporter.log("Click on comment box Ok button", true);
		Reporter.log(
				"Task User-9 Add comments 'Approve and PSR Workflow' the document move to next Task User Succssfully",
				true);
	}

	// PSR and End Workflow for User 10

	public void PSR_and_End_INWARD_Workflow_Document_from_User10() throws Exception {

		Reporter.log("Test Scenario 22 : PSR and END Workflow INWARD workflow Document from User10", true);
		Thread.sleep(2000);
		jsclick(getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		Thread.sleep(8000);
		jsclick(getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username option", true);
		jsclick(getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout option", true);
		loginUser5();
		Thread.sleep(8000);
		Reporter.log("Task User-10 Log into SIDBIDMSRoom", true);
		MoveTo_ToDoList_Option();
		Reporter.log("Move to To Do List Tab", true);
		jsclick(getSelect_All_Item());
		Thread.sleep(8000);
		Reporter.log("Click on All Item Option", true);
		jsclick(getOpen_ToDoDocument());
		Thread.sleep(7000);
		Reporter.log("Select and Open To Do List Document", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Reporter.log("Document open successfully ", true);
		Thread.sleep(8000);
		Actions actor = new Actions(driver);
		actor.moveToElement(Select_Action).perform();
		Thread.sleep(8000);
		Reporter.log("Move to Select Action option", true);
		jsclick(PSR_and_End_WF());
		Thread.sleep(8000);
		Reporter.log("Click on PSR and EndWorkflow option", true);
		getmessagevalidation();
		Thread.sleep(8000);
		Enter_Comment().sendKeys(CreateDOC_excelRead(9, 1));
		Thread.sleep(8000);
		Reporter.log("Enter comment 'PSR and End Workflow' into comment box", true);
		jsclick(WF_OKBTN());
		Thread.sleep(8000);
		Reporter.log("Click on comment box Ok button", true);
		Reporter.log("Task User-10 Add comments 'PSR and End Workflow' Succssfully", true);
		driver.close();
		Reporter.log("Close the Browser", true);
	}

	// Accept and Forward Workflow for User 7

	public void Rework_INWARD_Workflow_Document_from_User7() throws Exception {

		Reporter.log("Test Scenario 8 :Rework INWARD workflow Document from User7", true);
		Thread.sleep(2000);
		jsclick(getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		Thread.sleep(8000);
		jsclick(getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username option", true);
		jsclick(getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout option", true);
		loginUser2();
		Thread.sleep(8000);
		Reporter.log("Task User-7 Log into SIDBIDMSRoom", true);
		MoveTo_ToDoList_Option();
		Reporter.log("Move to To Do List Tab", true);
		jsclick(getSelect_All_Item());
		Thread.sleep(8000);
		Reporter.log("Click on All Item Option", true);
		jsclick(getOpen_ToDoDocument());
		Thread.sleep(7000);
		Reporter.log("Select and Open To Do List Document", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Reporter.log("Accept alert message and document page open successfully", true);
		Thread.sleep(8000);
		jsclick(Rework());
		Thread.sleep(8000);
		Reporter.log("Click on Rework Option", true);
		Enter_Comment().sendKeys(CreateDOC_excelRead(14, 1));
		Thread.sleep(8000);
		Reporter.log("Enter comment 'Workflow Rework successfully'into comment box", true);
		jsclick(WF_OKBTN());
		Reporter.log("Click on comment box Ok button", true);
		Reporter.log("Task User-7 Add comments 'Workflow Rework successfully'", true);
		driver.close();
		Reporter.log("Close the browser", true);
	}
	
	// Intimation External
	
	public void Create_INWARD_Document_and_sendTo_Inward_Workflow_For_Intimation () throws Exception {

		Reporter.log("Test Scenario 1 : Create INWARD Document and send To Inward workflow", true);
		Thread.sleep(8000);
		jsclick(getClick_New_Document());
		Thread.sleep(2000);
		Reporter.log("Click on New Document Tab", true);
		jsclick(getDestination_Folder_Textbox());
		Thread.sleep(2000);
		Reporter.log("Click on Destination Folder Textbox", true);
		selectElement(getSelect_Cabinet());
		Thread.sleep(8000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(getSelect_Drawer());
		Thread.sleep(8000);
		Reporter.log("Expand a Drawer", true);
		selectElement(getSelect_Folder());
		Thread.sleep(8000);
		Reporter.log("select a Folder", true);
		jsclick(getOK_Button_BrowseforFolder());
		Thread.sleep(8000);
		Reporter.log("Click on Destination folder dialogue Ok button", true);
		getSelect_Document_Type_INWARD_EXTERNAL();
		Thread.sleep(8000);
		Subject().sendKeys(CreateDOC_excelRead(18, 1));
		Thread.sleep(3000);
		Reporter.log("Select Inward External document type", true);
		jsclick(getMove_To_PlusIcon());
		getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Click on Browse option", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\SIDBI\\InwardExternal.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(8000);
		Reporter.log("Accept alert message", true);
		// Add User 1
		jsclick(getUser1());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(15, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 2
		jsclick(getUser2());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(5, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		// Add User 3
		jsclick(getUser3());
		Thread.sleep(8000);
		Reporter.log("Click on User textbox", true);
		Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
		getSearchTextBox().sendKeys(CreateDOC_excelRead(1, 1));
		Thread.sleep(8000);
		Reporter.log("Enter username into search textbox", true);
		jsclick(getFindBTN());
		Thread.sleep(8000);
		Reporter.log("Click on Find button", true);
		Reporter.log("It should display the User name on the page with HRMS details", true);
		Select_TaskUser();
		Thread.sleep(8000);
		jsclick(getCreate_button());
		Thread.sleep(8000);
		Reporter.log("Click on Create button", true);
		getCreatedocmessage();
		Thread.sleep(8000);
		jsclick(getViewDocument_Button());
		Reporter.log("Click on view button", true);
		Reporter.log("INWARD - EXTERNAL Document created successfully ", true);
		Thread.sleep(10000);
		getINWARD_ID();
		Thread.sleep(8000);
		jsclick(getClose_Documentpage());
		Thread.sleep(8000);
		Reporter.log("Close document page");
		jsclick(getSelect_Document());
		Thread.sleep(8000);
		Reporter.log("Check Document from Document List", true);
		getMoveTo_Menu_Documents();
		Thread.sleep(8000);
		Reporter.log("Mousehover on Documents Tab", true);
		jsclick(Workflow);
		Thread.sleep(8000);
		Reporter.log("Click on Send to Workflow option", true);
		jsclick(SelectWorkflow());
		Thread.sleep(8000);
		Reporter.log("Select Workflow name", true);
		jsclick(Apply());
		Thread.sleep(8000);
		Reporter.log("Click on the Apply button", true);
		Reporter.log("The originator sent the document to workflow successfully...", true);
}
	
	// Intimate 
	
	public void Intimate_INWARD_Workflow_Document_from_User1() throws Exception {

		Reporter.log("Test Scenario 2 : Accept and Forward INWARD workflow Document from User1", true);
		Thread.sleep(2000);
		jsclick(getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		MoveTo_ToDoList_Option();
		Reporter.log("Move to To Do List Tab", true);
		jsclick(getSelect_All_Item());
		Thread.sleep(8000);
		Reporter.log("Click on All Item Option", true);
		jsclick(getOpen_ToDoDocument());
		Thread.sleep(7000);
		Reporter.log("Select and Open To Do List Document", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Reporter.log("Document open successfully", true);
		Thread.sleep(8000);
		Actions actor = new Actions(driver);
		actor.moveToElement(Select_Action).perform();
		Thread.sleep(8000);
		Reporter.log("Move to Select Action option", true);
		jsclick(Intimate_WF());
		Thread.sleep(8000);
		Reporter.log("Click on Intimate option", true);
		Enter_Comment().sendKeys(CreateDOC_excelRead(16, 1));
		Thread.sleep(8000);
		Reporter.log("Enter comment 'Intimate Workflow' into comment box", true);
		jsclick(WF_OKBTN());
		Reporter.log("Click on comment box Ok button", true);
		Reporter.log(
				"Task User-1 Add comments 'Intimate Workflow' the document move to Next Task User Succssfully",
				true);
	}

	// Accept and Forward Workflow for User 2

	public void Intimate_INWARD_Workflow_Document_from_User2() throws Exception {

		Reporter.log("Test Scenario 3 : Accept and Forward INWARD workflow Document from User2", true);
		Thread.sleep(2000);
		jsclick(getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username option", true);
		jsclick(getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout option", true);
		loginUser5();
		Thread.sleep(8000);
		Reporter.log("Task User-2 Log into SIDBIDMSRoom", true);
		MoveTo_ToDoList_Option();
		Reporter.log("Move to To Do List Tab", true);
		jsclick(getSelect_All_Item());
		Thread.sleep(8000);
		Reporter.log("Click on All Item Option", true);
		jsclick(getOpen_ToDoDocument());
		Thread.sleep(7000);
		Reporter.log("Select and Open To Do List Document", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Reporter.log("Document open successfully ", true);
		Thread.sleep(8000);
		Actions actor = new Actions(driver);
		actor.moveToElement(Select_Action).perform();
		Thread.sleep(8000);
		Reporter.log("Move to Select Action option", true);
		jsclick(Intimate_WF());
		Thread.sleep(8000);
		Reporter.log("Click on Intimate option", true);
		Enter_Comment().sendKeys(CreateDOC_excelRead(16, 1));
		Thread.sleep(8000);
		Reporter.log("Enter comment 'Intimate Workflow' into comment box", true);
		jsclick(WF_OKBTN());
		Reporter.log("Click on comment box Ok button", true);
		Reporter.log(
				"Task User-2 Add comments 'Intimate Workflow' the document move to Next Task User Succssfully",
				true);
	}

	// End Workflow Workflow for User 3

	public void EndWorkflow_INWARD_Workflow_Document_from_User3() throws Exception {

		Reporter.log("Test Scenario 4 : End INWARD workflow Document from User3", true);
		Thread.sleep(2000);
		jsclick(getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username option", true);
		jsclick(getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout option", true);
		loginUser1();
		Thread.sleep(8000);
		Reporter.log("Task User-3 Log into SIDBIDMSRoom", true);
		MoveTo_ToDoList_Option();
		Reporter.log("Move to To Do List Tab", true);
		jsclick(getSelect_All_Item());
		Thread.sleep(8000);
		Reporter.log("Click on All Item Option", true);
		jsclick(getOpen_ToDoDocument());
		Thread.sleep(7000);
		Reporter.log("Select and Open To Do List Document", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Reporter.log("Document open successfully ", true);
		Thread.sleep(8000);
		jsclick(StopWorkflow());
		Thread.sleep(8000);
		Reporter.log("Click on Stop Workflow option", true);
		Enter_Comment().sendKeys(CreateDOC_excelRead(17, 1));
		Thread.sleep(8000);
		Reporter.log("Enter comment 'Stop Workflow successfully' into comment box", true);
		jsclick(WF_OKBTN());
		Reporter.log("Click on comment box Ok button", true);
		Reporter.log(
				"Task User-3 Add comments 'Stop Workflow successfully'",
				true);
		driver.close();
		Reporter.log("Close the browser", true);
	}
	
	// Intimation Internal
	
		public void Create_INWARD_Internal_Document_and_sendTo_Inward_Workflow_For_Intimation () throws Exception {

			Reporter.log("Test Scenario 1 : Create INWARD Document and send To Inward workflow", true);
			Thread.sleep(8000);
			jsclick(getClick_New_Document());
			Thread.sleep(2000);
			Reporter.log("Click on New Document Tab", true);
			jsclick(getDestination_Folder_Textbox());
			Thread.sleep(2000);
			Reporter.log("Click on Destination Folder Textbox", true);
			selectElement(getSelect_Cabinet());
			Thread.sleep(8000);
			Reporter.log("Expand a Cabinet", true);
			selectElement(getSelect_Drawer());
			Thread.sleep(8000);
			Reporter.log("Expand a Drawer", true);
			selectElement(getSelect_Folder());
			Thread.sleep(8000);
			Reporter.log("select a Folder", true);
			jsclick(getOK_Button_BrowseforFolder());
			Thread.sleep(8000);
			Reporter.log("Click on Destination folder dialogue Ok button", true);
			getSelect_Document_Type_INWARD_INTERNAL();
			Thread.sleep(8000);
			Subject().sendKeys(CreateDOC_excelRead(18, 1));
			Thread.sleep(3000);
			Reporter.log("Select Inward External document type", true);
			jsclick(getMove_To_PlusIcon());
			getBrowse_Option();
			Thread.sleep(2000);
			Reporter.log("Click on Browse option", true);
			Runtime.getRuntime().exec("D:\\DipakAutoit\\SIDBI\\InwardExternal.exe");
			Reporter.log("By using AutoIT add file from external folder", true);
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
			Thread.sleep(8000);
			Reporter.log("Accept alert message", true);
			// Add User 1
			jsclick(getUser2());
			Thread.sleep(8000);
			Reporter.log("Click on User textbox", true);
			Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
			getSearchTextBox().sendKeys(CreateDOC_excelRead(15, 1));
			Thread.sleep(8000);
			Reporter.log("Enter username into search textbox", true);
			jsclick(getFindBTN());
			Thread.sleep(8000);
			Reporter.log("Click on Find button", true);
			Reporter.log("It should display the User name on the page with HRMS details", true);
			Select_TaskUser();
			Thread.sleep(8000);
			// Add User 2
			jsclick(getUser3());
			Thread.sleep(8000);
			Reporter.log("Click on User textbox", true);
			Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
			getSearchTextBox().sendKeys(CreateDOC_excelRead(5, 1));
			Thread.sleep(8000);
			Reporter.log("Enter username into search textbox", true);
			jsclick(getFindBTN());
			Thread.sleep(8000);
			Reporter.log("Click on Find button", true);
			Reporter.log("It should display the User name on the page with HRMS details", true);
			Select_TaskUser();
			Thread.sleep(8000);
			// Add User 3
			jsclick(getUser4());
			Thread.sleep(8000);
			Reporter.log("Click on User textbox", true);
			Reporter.log("It should open dynamic user and Group for workflow dialogue", true);
			getSearchTextBox().sendKeys(CreateDOC_excelRead(1, 1));
			Thread.sleep(8000);
			Reporter.log("Enter username into search textbox", true);
			jsclick(getFindBTN());
			Thread.sleep(8000);
			Reporter.log("Click on Find button", true);
			Reporter.log("It should display the User name on the page with HRMS details", true);
			Select_TaskUser();
			Thread.sleep(8000);
			jsclick(getCreate_button());
			Thread.sleep(8000);
			Reporter.log("Click on Create button", true);
			getCreatedocmessage();
			Thread.sleep(8000);
			jsclick(getViewDocument_Button());
			Reporter.log("Click on view button", true);
			Reporter.log("INWARD - EXTERNAL Document created successfully ", true);
			Thread.sleep(10000);
			getINWARD_ID();
			Thread.sleep(8000);
			jsclick(getClose_Documentpage());
			Thread.sleep(9000);
			Reporter.log("Close document page");
			jsclick(getSelect_Document());
			Thread.sleep(8000);
			Reporter.log("Check Document from Document List", true);
			getMoveTo_Menu_Documents();
			Thread.sleep(8000);
			Reporter.log("Mousehover on Documents Tab", true);
			jsclick(Workflow);
			Thread.sleep(8000);
			Reporter.log("Click on Send to Workflow option", true);
			jsclick(SelectWorkflow());
			Thread.sleep(8000);
			Reporter.log("Select Workflow name", true);
			jsclick(Apply());
			Thread.sleep(8000);
			Reporter.log("Click on the Apply button", true);
			Reporter.log("The originator sent the document to workflow successfully...", true);
	}
}
