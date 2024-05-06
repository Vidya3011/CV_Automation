package Pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic.BaseClass;

public class ToDoListTab extends BaseClass {
	
	public ToDoListTab() {
		
		PageFactory.initElements(driver, this);
		}
	
	
	
	
	@FindBy(xpath = ("//a[@id='myTaskMenu']"))
	private WebElement TodolistTab;
	
	@FindBy(xpath = ("//a[@id='newItems']"))
	private WebElement NewItems;
	
	
			
    @FindBy(xpath = ("(//td[@class=' details-control'])[1]"))
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

	public WebElement getTodolistDoc() {
		return TodolistDoc;
	}

	public WebElement getAcceptButton() {
		return AcceptButton;
	}

	public WebElement getRejectButton() {
		return RejectButton;
	}

	public WebElement getEndWfButton() {
		return EndWfButton;
	}

	public WebElement getSummaryButton() {
		return SummaryButton;
	}

	public WebElement getWorkflowComments() {
		return WorkflowComments;
	}

	public WebElement getWorkflowCommentsOKButton() {
		return WorkflowCommentsOKButton;
	}

	public WebElement getAssertvalid() {
		return assertvalid;
	}
	
	
	
	@FindBy(xpath = ("(//button[text()='Cancel'])[67]"))
	private WebElement summarycancelbtn;
	
	public WebElement getsummarycancelbtn() {
		return summarycancelbtn;
	}
	
	@FindBy(id = ("showTaskDescription"))
	private WebElement summaryshowdiscription;
	
	public WebElement getsummaryshowdiscription() {
		return summaryshowdiscription;
	}
	
	@FindBy(xpath = ("(//button[@type='button'][normalize-space()='Cancel'])[5]"))
	private WebElement summaryshowdiscriptioncancelbtn;
	
	public WebElement getsummaryshowdiscriptioncancelbtn() {
		return summaryshowdiscriptioncancelbtn;
	}
	
	@FindBy(xpath = ("(//a[normalize-space()='Properties - Show'])[1]"))
	private WebElement summaryshowproperties;
	
	public WebElement getsummaryshowproperties() {
		return summaryshowproperties;
	}
	
	@FindBy(xpath = ("(//a[normalize-space()='Summary Report - Show all'])[1]"))
	private WebElement summaryshowreportsshowall;
	
	public WebElement getsummaryshowreportsshowall() {
		return summaryshowreportsshowall;
	}
	
	@FindBy(xpath = ("(//button[text()='Cancel'])[67]"))
	private WebElement summaryshowreportscancelbtn;
	
	public WebElement getsummaryshowreportscancel() {
		return summaryshowreportscancelbtn;
	}
	
	
	@FindBy(css = ("#todoPending"))
	private WebElement TodolistPendingItems;
	
	public WebElement getTodolistPendingItems() {
		return TodolistPendingItems;
	}
	
	@FindBy(xpath = ("(//a[text()='All Items'])[2]"))
	private WebElement TodolistallItems;
	
	public WebElement getTodolistallItems() {
		return TodolistallItems;
	}
	@FindBy(xpath = ("//a[text()='Sent Items']"))
	private WebElement TodolistsentItems;
	public WebElement getTodolistsentItems() {
		return TodolistsentItems;
	}
	
	
	
	
	
	
	@FindBy(xpath = ("(//span[@class='jconfirm-title'])[1]"))
	private WebElement opendocwfvalidation;
	public WebElement getopendocwfvalidation() {
		return opendocwfvalidation;
	}
	
	
	 @FindBy(xpath = ("//*[@id=\"homeMenuBtn\"]/img	"))
		private WebElement RefreshButton;				
	 
	 public WebElement getRefreshButton() {
			return RefreshButton;
		}		
	
	 
	 public void LogVidyaTaskUser1() throws Exception {
		      LogoutPage();
		      Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(TodoListExcel(1, 1));
				driver.findElement(By.id("loginPassword")).sendKeys(TodoListExcel(2, 1));
				WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
				a1 = new Actions(driver);
				a1.moveToElement(room).click().build().perform();
				WebElement ro = driver.findElement(By.xpath("//option[text()='CVWin19Server.Win2019_TestRoom']"));
				ro.click();
				WebElement ele=driver.findElement(By.id("submitid"));jsclick(ele);
				Thread.sleep(2000);
				Thread.sleep(3000);
				try {
					WebElement sessiomsg = driver.findElement(By.cssSelector("#cvModelLoginValidationMessage"));
					WebElement sessiomsgOK = driver.findElement(By.id("cvModelLoginValidationOk"));
					if(sessiomsg.isDisplayed()) {
				    jsclick(sessiomsgOK);
					}
					}
				catch (NoSuchElementException e) {
					Reporter.log("Login without msg");
				}
			}
			
	 
	 
	
	 public void SendingDocumentInworkflow() throws InterruptedException {
	       
		 Print pojo = new Print();
			movingDoublecli(pojo.getCabinet(), pojo.getCabinet());
			Thread.sleep(3000);
			movingDoublecli(pojo.getDrawer(), pojo.getDrawer());
			Thread.sleep(3000);
			movingDoublecli(pojo.getFolder(), pojo.getFolder());
			Thread.sleep(5000);                                
			WebElement checkbox = driver.findElement(By.xpath("//body[1]/div[55]/div[59]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[5]/td[1]"));
		    checkbox.click();
		    WebElement doc = driver.findElement(By.xpath("(//a[normalize-space()='Documents'])[1]"));
		   movingElement(doc);
		   WebElement SendToWf = driver.findElement(By.xpath("//a[@id='sendtoworkflow']"));jsclick(SendToWf);
		   Thread.sleep(5000);
		  // SendToWf.sendKeys(WorkflowName);
		   WebElement NewManualforautococ= driver.findElement(By.xpath("//td[text()='New Manual for Automation']"));
          jsclick( NewManualforautococ);
          WebElement docSendDialogbocOKBTN= driver.findElement(By.xpath("(//button[@id='CommentsMessageModelOk'])[1]"));
		   jsclick(docSendDialogbocOKBTN);
		   Thread.sleep(5000);
		  
		   Reporter.log("document sent to workflow successfully");
			
		}
	
	 
	 
	 @FindBy(id = "cvModelLoginValidationMessage")
		private WebElement SessionMessage;

		@FindBy(id = "cvModelLoginValidationOk")
		private WebElement SessionMessageOK;
	 
	 
		public WebElement getSessionMessageOK() {
			return SessionMessageOK;
		}
	 
	 
	 
	 
	 
	
	 public void refrshLogDipakTaskUser() throws Exception {
		 LogoutPage();
		      Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(TodoListExcel(1, 3));
				driver.findElement(By.id("loginPassword")).sendKeys(TodoListExcel(2, 3));
				WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
				a1 = new Actions(driver);
				a1.moveToElement(room).click().build().perform();
				WebElement ro = driver.findElement(By.xpath("//option[text()='CVWin19Server.Win2019_TestRoom']"));
				ro.click();
				WebElement ele=driver.findElement(By.id("submitid"));jsclick(ele);
				Thread.sleep(3000);
				try {
					WebElement sessiomsg = driver.findElement(By.cssSelector("#cvModelLoginValidationMessage"));
					WebElement sessiomsgOK = driver.findElement(By.id("cvModelLoginValidationOk"));
					if(sessiomsg.isDisplayed()) {
				    jsclick(sessiomsgOK);
					}
					}
				catch (NoSuchElementException e) {
					Reporter.log("Login without msg");
				}
			}
			
				
	 
	 
	 public void refrshLogNishaTaskUser() throws Exception {
			 LogoutPage();
		      Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(TodoListExcel(1, 2));
				driver.findElement(By.id("loginPassword")).sendKeys(TodoListExcel(2, 2));
				WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
				a1 = new Actions(driver);
				a1.moveToElement(room).click().build().perform();
				WebElement ro = driver.findElement(By.xpath("//option[text()='CVWin19Server.Win2019_TestRoom']"));
				ro.click();
				WebElement ele=driver.findElement(By.id("submitid"));jsclick(ele);
				Thread.sleep(3000);
				try {
					WebElement sessiomsg = driver.findElement(By.cssSelector("#cvModelLoginValidationMessage"));
					WebElement sessiomsgOK = driver.findElement(By.id("cvModelLoginValidationOk"));
					if(sessiomsg.isDisplayed()) {
				    jsclick(sessiomsgOK);
					}
					}
				catch (NoSuchElementException e) {
					Reporter.log("Login without msg");
				}
			}
			
	 
	 
	 public void DynamicWorkFlowTodoListFunctionality() throws Exception {
		WebElement newDocumentTab = driver.findElement(By.xpath("(//a[@id='createDocument'])[1]"));
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		jsclick(newDocumentTab);
		WebElement DocumentLocation = driver.findElement(By.xpath("(//input[@id='createDocuemtnLocation'])[1]"));
		Thread.sleep(4000);
		jsclick(DocumentLocation);
		WebElement cabinet = driver.findElement(By.xpath("(//ins[@class='jstree-icon'])[1]"));
		jsclick(cabinet);

		Thread.sleep(4000);
		WebElement drawer = driver.findElement(By.xpath("(//ins[@class='jstree-icon'])[3]"));
		Thread.sleep(4000);
		jsclick(drawer);
		WebElement folder = driver.findElement(By.xpath("/html[1]/body[1]/div[23]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"));
		Thread.sleep(4000);
		jsclick(folder);
		WebElement OKbtn = driver.findElement(By.xpath("(//button[@id='navigatorTreeOk'])[1]"));
		Thread.sleep(4000);
		jsclick(OKbtn);
		Thread.sleep(5000);
		WebElement docTypeDropDown = driver.findElement(By.xpath("(//select[@id='docTypeList'])[1]"));
		movingclkElement(docTypeDropDown);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//option[text()='Dynamic document type']")).click();
		WebElement User1 = driver.findElement(By.xpath("(//input[@id='indices_65'])[1]"));
		jsclick(User1);
		Thread.sleep(3000);
		WebElement findbtn = driver.findElement(By.xpath("(//button[@id='searchDynamicUser'])[1]"));
		jsclick(findbtn);
		WebElement User1Vidya = driver.findElement(By.xpath("(//span[@id='spanCheckDynamicUser_vidya'])[1]"));
		jsclick(User1Vidya);
		WebElement usergrpOKBtn = driver.findElement(By.xpath("(//button[@id='navigatorTreeCancle5'])[1]"));
		movingclkElement(usergrpOKBtn);
		Thread.sleep(4000);
		WebElement User2 = driver.findElement(By.xpath("(//input[@id='indices_66'])[1]"));
		jsclick(User2);
		Thread.sleep(3000);
		jsclick(findbtn);
		WebElement RNishaUser = driver.findElement(By.xpath("(//span[@id='spanCheckDynamicUser_RNisha'])[1]"));
		jsclick(RNishaUser);
		movingclkElement(usergrpOKBtn);
		Thread.sleep(4000);
		WebElement User3 = driver.findElement(By.xpath("(//input[@id='indices_67'])[1]"));
		jsclick(User3);
		WebElement TextBoxSearch = driver.findElement(By.xpath("(//input[@id='textForUserSearch'])[1]"));
		TextBoxSearch.sendKeys(TodoListExcel(1, 3));
		jsclick(findbtn);
		WebElement dipakUser = driver.findElement(By.xpath("(//span[@id='spanCheckDynamicUser_dipak'])[1]"));
		jsclick(dipakUser);
		movingclkElement(usergrpOKBtn);
		Thread.sleep(4000);
		WebElement KeyValue = driver.findElement(By.xpath("(//input[@id='indices_278'])[1]"));
		jsclick(KeyValue);
		KeyValue.sendKeys(TodoListExcel(3, 1));
		
		Thread.sleep(3000);
		WebElement moveToPlusIcon = driver.findElement(By.xpath("/html[1]/body[1]/div[55]/div[59]/div[7]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]"));
		movingElement(moveToPlusIcon);
		Thread.sleep(4000);
		WebElement browseOption = driver.findElement(By.xpath("//input[@id='viewDocumentAddPages']"));
		movingclkElement(browseOption);
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\AutoImage\\FilesAuto_x64.exe");
		 wait.until(ExpectedConditions.alertIsPresent());
		 acceptAlert();
		 Thread.sleep(5000);
		 WebElement CreateBTN= driver.findElement(By.xpath("(//button[normalize-space()='Create'])[1]"));
		 jsclick(CreateBTN);
		 Thread.sleep(15000);
		WebElement viewOption = driver.findElement(By.xpath("(//button[normalize-space()='View'])[1]"));
		 jsclick(viewOption);
		 Thread.sleep(8000);
		 WebElement signaturetab = driver.findElement(By.xpath("(//span[@class='text'])[57]"));
		 jsclick(signaturetab);
		 Thread.sleep(4000);
		 WebElement page = driver.findElement(By.xpath("(//canvas[@class='lt-imageviewer-eventcanvas'])[3]"));
		 clickElement(page);
		 WebElement savetab = driver.findElement(By.xpath("//div[@id='saveAddedPages']//span[1]"));
		 jsclick(savetab);
		 Thread.sleep(8000);
		 WebElement saveOKBTN = driver.findElement(By.xpath("(//button[@id='messageButtonOK42'])[1]"));
		 jsclick(saveOKBTN);
		 Thread.sleep(3000);
		WebElement sendToWf = driver.findElement(By.xpath("(//span[@id='viewSendToWrkflw'])[1]"));
		jsclick(sendToWf);
		Thread.sleep(3000);
		WebElement dynamicwfnew = driver.findElement(By.xpath("(//td[contains(text(),'Dynamic workflow')])[1]"));
	    jsclick(dynamicwfnew);
	    WebElement applyBTN = driver.findElement(By.xpath("(//button[@id='sidbisendworkflowOk'])[1]"));
	     jsclick(applyBTN);
	     Thread.sleep(10000);
	    WebElement sendwfsuccessdialogOKBTN = driver.findElement(By.xpath("(//button[@id='CommentsMessageModelOk'])[1]"));
	    jsclick(sendwfsuccessdialogOKBTN);
	    }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 



	@FindBy(xpath = ("/html[1]/body[1]/div[55]/div[59]/div[4]/div[2]/div[3]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]"))
	private WebElement TodolistDoc;
	
	@FindBy(xpath = ("//a[@id='accept']"))
	private WebElement AcceptButton;
;
	
	@FindBy(xpath = ("//a[@id='reject']"))
	private WebElement RejectButton;
	
	@FindBy(xpath = ("//a[@id='endwf']"))
	private WebElement EndWfButton;
	
	@FindBy(xpath = ("//a[@id='summary1']"))
	private WebElement SummaryButton;
	
	@FindBy(xpath = ("(//a[normalize-space()='Comment'])[1]"))
	private WebElement CommentButton;
	
	public WebElement getCommentButton() {
		return CommentButton;
	}
			
			@FindBy(xpath = ("/html[1]/body[1]/div[55]/div[43]/div[12]/div[2]/div[1]/ul[1]/li[7]/ul[1]/li[3]/a[1]"))
	private WebElement RewiewITems;
	
	public WebElement getRewiewITems() {
		return RewiewITems;
	}
	@FindBy(xpath = ("(//a[normalize-space()='Review'])[1]"))
	private WebElement RewiewBTN;
	
	public WebElement getRewiewBTN() {
		return RewiewBTN;
	}	
			
	
			
	@FindBy(xpath = ("(//textarea[@id='wfcomments'])[1]"))
	private WebElement CommenttextBox;
			
	public WebElement getCommenttextBox() {
	return CommenttextBox;
			}
	
	
	@FindBy(xpath = ("(//button[@id='wfactionOk'])[1]"))
	private WebElement CommenttextBoxOKBTN;
			
	public WebElement getCommenttextBoxOKBTN() {
	return CommenttextBoxOKBTN;
			}
	
	@FindBy(xpath = ("//textarea[@id='wfcomments']"))
	private WebElement WorkflowComments;
	
	@FindBy(xpath = ("//button[@id='wfactionOk']"))
	private WebElement WorkflowCommentsOKButton;
	
	@FindBy(xpath = ("(//h2[@class='headerText'])[52]"))
	private WebElement assertvalid;
	


}
