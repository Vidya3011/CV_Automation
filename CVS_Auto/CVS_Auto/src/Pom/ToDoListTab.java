package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	
	 
	 public void LogVidyaTaskUser1() throws InterruptedException {
			driver.navigate().refresh();
		      Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("vidya");
				driver.findElement(By.id("loginPassword")).sendKeys("syntax@10");
				WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
				a1 = new Actions(driver);
				a1.moveToElement(room).click().build().perform();
				WebElement ro = driver.findElement(By.xpath("//option[text()='CVWin19Server.Win2019_TestRoom']"));
				ro.click();
				WebElement ele=driver.findElement(By.id("submitid"));jsclick(ele);
				WebElement sessiomsg = driver.findElement(By.xpath("//button[@id='cvModelLoginValidationOk']"));
				sessiomsg.click();
				System.out.println("LoginSuccessFull");
				}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	 public void SendingDocumentInworkflow() throws InterruptedException {
	       
		 POM pojo = new POM();
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
	
	
	 public void refrshLogDipakTaskUser() throws InterruptedException {
			driver.navigate().refresh();
		      Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Dipak");
				driver.findElement(By.id("loginPassword")).sendKeys("syntax@10");
				WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
				a1 = new Actions(driver);
				a1.moveToElement(room).click().build().perform();
				WebElement ro = driver.findElement(By.xpath("//option[text()='CVWin19Server.Win2019_TestRoom']"));
				ro.click();
				WebElement ele=driver.findElement(By.id("submitid"));jsclick(ele);
				WebElement sessiomsg = driver.findElement(By.xpath("//button[@id='cvModelLoginValidationOk']"));
				sessiomsg.click();
				System.out.println("LoginSuccessFull");
				}
	 
	 
	 public void refrshLogNishaTaskUser() throws InterruptedException {
			  driver.navigate().refresh();
		      Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("RNisha");
				driver.findElement(By.id("loginPassword")).sendKeys("syntax@10");
				WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
				a1 = new Actions(driver);
				a1.moveToElement(room).click().build().perform();
				WebElement ro = driver.findElement(By.xpath("//option[text()='CVWin19Server.Win2019_TestRoom']"));
				ro.click();
				WebElement ele=driver.findElement(By.id("submitid"));jsclick(ele);
				WebElement sessiomsg = driver.findElement(By.xpath("//button[@id='cvModelLoginValidationOk']"));
				sessiomsg.click();
				System.out.println("LoginSuccessFull");
				}



	@FindBy(xpath = ("(//td[contains(text(),'Test wf')])[1]"))
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
	
	@FindBy(xpath = ("//textarea[@id='wfcomments']"))
	private WebElement WorkflowComments;
	
	@FindBy(xpath = ("//button[@id='wfactionOk']"))
	private WebElement WorkflowCommentsOKButton;
	
	@FindBy(xpath = ("(//h2[@class='headerText'])[52]"))
	private WebElement assertvalid;
	


}
