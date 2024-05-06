package Pom;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

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

public class ViewerToolbar {

	@FindBy(xpath = ("//*[@id='messageButtonOK']"))
	private WebElement OKbutton;

	 @FindBy(xpath=("//span[contains(text(),'Paste')]"))
	 private WebElement Paste;

	@FindBy(xpath = ("//*[@id='cvDocumentClose']/span"))
	private WebElement CloseViewer;


	
	@FindBy(xpath = ("//span[contains(@class,'pageMenu')]"))
	private WebElement Pagemenu;

	@FindBy(xpath = ("//button[@id='copyDoc']"))
	private WebElement Copy;
	
	@FindBy(xpath = ("//button[@id='splitDocumentAnchor']"))
	private WebElement Split;
	
	@FindBy(xpath = ("//button[@id='splitDocument']"))
	private WebElement splitOkButton;
	
	@FindBy(xpath = ("//input[@id='startRange']"))
	private WebElement pdfStartRange;
	
	@FindBy(xpath = ("//input[@id='endRange']"))
	private WebElement pdfEndRange;
	
	@FindBy(xpath = ("//span[contains(text(),'Full Screen View')]"))
	private WebElement Fullscreen;
	
	@FindBy(xpath = ("//span[contains(text(),'Show Thumbnails')]"))
	private WebElement ShowThumbnail;
	

	
	@FindBy(xpath = ("//span[contains(@class,'viewMenu w3-large')]"))
	private WebElement Viewmenu;

	
	@FindBy(id="thumbnailOptionSelected")
    private WebElement Thumbnail;


	@FindBy(xpath = ("//*[@id='createDocuemtnLocation']"))
	private WebElement DestinationFolder;

	@FindBy(xpath = ("//div[@id='addDocdropdwn']"))
	private WebElement menuitem;
	
	@FindBy(id="cvDocumentClose")
    private WebElement CloseVeiwer;
	
	@FindBy(xpath=("//div[@id='messageBox27']"))
    private WebElement SaveDialog;
	
	@FindBy(xpath=("//button[@id=CommentsMessageModelOk']"))
    private WebElement msgBox;
	
	@FindBy(id="messageButtonOK27")
    private WebElement SaveDialogYes;
	
	@FindBy(id="messageButtonNo27")
    private WebElement SaveDialogNo;
	
	@FindBy(id="messageButtonCancel27")
    private WebElement SaveDialogCancel;
	
	@FindBy(id="addWordFile")
    private WebElement NewWordDocument;

	@FindBy(id="addExcelFile")
    private WebElement NewExcelDocument;
	
	@FindBy(id="addPPTFile")
    private WebElement NewPPTDocument;
	
	@FindBy(id="newTemplateFileName")
    private WebElement EnterfileName;
	
	@FindBy(id="templateOK")
    private WebElement EnterFileNameOK;
	
	@FindBy(id="createDocuemntNavigator")
    private WebElement NavTree;
	
	@FindBy(id="templateCanel")
    private WebElement EnterFileNameCancel;
	
	@FindBy(id="messageButtonOK26")
    private WebElement DownloadButton;
	
	@FindBy(id="messageButtonOK26")
    private WebElement CancelButton;
	
//	@FindBy(id="messageButtonOK")
//    private WebElement OkBtn;
	
	//vidya
	//@FindBy(xpath=(".//div[@id='controlBlock']/button[@id='messageButtonOK']"))
	//@FindBy(xpath=("//div[@id='messageBox']/div[@id='controlBlock']/button[@id='messageButtonOK']"))
	//private WebElement SendMailOkBtn;
	//@FindBy(xpath=("//button[@id='messageButtonOK']"))	
	@FindBy(xpath=("//*[@id='messageButtonOK']"))	
    private WebElement OkBtn;
	
	/*@FindBy(xpath = ("//span[contains(@class,'shareIcon')]"))
	private WebElement shareicon;*/
	
	@FindBy(xpath = ("//div[@id='fileControl_sendTo']"))
	private WebElement shareicon;
	
	@FindBy(xpath = ("//div[@id='viewDocumentMail']"))
	private WebElement Mail;
	@FindBy(xpath = ("//div[@id='viewDocumentPrint']"))
	private WebElement PrintDialog;
	@FindBy(xpath = ("//div[@id='viewDocumentExport']"))
	private WebElement ExportDialog;
	@FindBy(xpath = ("//div[@id='sendToSecureMailView']"))
	private WebElement SecurelinkDialog;
	
	@FindBy(xpath= ("//button[@id='saveSendToDocument']"))
    private WebElement MailOkBtn;
	
	/*@FindBy(xpath=("//span[contains(text(),'Mail...')]"))
    private WebElement Mail;*/
	
/*	@FindBy(xpath=("//span[contains(text(),'Print...')]"))
    private WebElement PrintDialog;*/
	
	@FindBy(xpath=("//button[@id='printDocumentOnView']"))
    private WebElement PrintOkBtn;
	/*
	@FindBy(xpath=("//span[contains(text(),'Export...')]"))
    private WebElement ExportDialog;*/
	
	@FindBy(id="saveSendToDocument")
    private WebElement ExportOkBtn;
	
//	@FindBy(xpath=("//span[contains(text(),'Secure link...')]"))
//    private WebElement SecurelinkDialog;
	
	@FindBy(xpath=("//input[@id='toEmial']"))
    private WebElement MailEmailID;
	
//	@FindBy(xpath=("//label[contains(text(),'To Email-id')]"))
//    private WebElement MailEmailID;
	
	@FindBy(xpath=("//input[@id='subjectid']"))
    private WebElement MailSubject;
	
	@FindBy(id="rotateClockwise")
    private WebElement RotateClock;
	
	@FindBy(id="rotateCounterClockwise")
    private WebElement RotateAntiClock;
	
	@FindBy(id="downloadPagesDropDown")
    private WebElement DownloadDropdwn;
	
	@FindBy(id="pageDownload_shortcut")
    private WebElement DownloadOption;
	
	@FindBy(id="pageOffline_shortcut")
    private WebElement OfflineOpt;
	
	@FindBy(xpath=(".//*[@class='editproperties']"))
    private WebElement PropertiesUpdateButton;
	
	@FindBy(xpath=(".//*[@class='saveproperties']"))
    private WebElement PropertiesSaveButton;
	
	@FindBy(xpath=("//span[contains(text(),'Rotate Clock Wise')]"))
    private WebElement RotateClockwise;
	
	@FindBy(xpath=("//span[contains(text(),'Rotate Clock Wise')]"))
    private WebElement RotateAntiClockwise;
	
	
	@FindBy(id="saveAddedPages")
    private WebElement SaveBtn;
	
	@FindBy(id="messageButtonOK42")
    private WebElement SaveOkBtn;
	
	@FindBy(id="navigatorTreeCancle19")
    private WebElement DeleteNoBtn;
	
	@FindBy(id="comment")
    private WebElement Comments1;
	
	@FindBy(xpath=(".//*[contains(@class,'commentNew')]"))
    private WebElement CommentsNew;
	
	@FindBy(xpath=(".//*[contains(@class,'name form-control')]"))
    private WebElement CommentsNewText;
	

	@FindBy(xpath=(".//*[contains(@type,'check')])"))
    private WebElement CommentsPrivate;
	
	@FindBy(xpath=(".//*[@class='jconfirm-buttons']/button"))
    private WebElement CommentSaveDelete;
	
	@FindBy(id="CommentsMessageModelOk")
    private WebElement CommentsSaveDeleteOK;
	
	@FindBy(xpath=("//*[@class=' commentClass']"))
    private WebElement CommentsOpen;
	
	@FindBy(id="saveAddedPages")
    private WebElement SaveIcon;
	
	@FindBy(id="cvDocumentClose")
    private WebElement CloseBtn;
	

	@FindBy(xpath=("//button[@id='messageButtonOK42']"))
    private WebElement SaveOK;
	
	@FindBy(xpath=("//button[@id='messageButtonOK27']"))
    private WebElement SaveDialogYesButton;
	
	@FindBy(xpath=("//button[@id='messageButtonNo27']"))
    private WebElement SaveDialogNOButton;
	
	@FindBy(xpath=("//button[@id='messageButtonCancel27']']"))
    private WebElement SaveDialogCancelButton;

	@FindBy(id="fileControl_delete")
    private WebElement DeleteBtn;
	
//	@FindBy(xpath = ("/div[contains(text(),'Destination Folder')]"))
//	private WebElement DestinationFolder;
	
	@FindBy(xpath = ("//button[@id='messageButtonCreate_as_NewOnPaste']"))
	private WebElement CreateasNewbutton;
	
	@FindBy(xpath = ("//button[@id='deleteMessageOk19']"))
	private WebElement DeleteYesBtn;
	
	@FindBy(xpath = ("//button[@id='messageButtonOK42']"))
	private WebElement SaveOKBtn;
	
	@FindBy(xpath = ("//button[@id='messageButtonOKDEl']"))
	private WebElement FileDeleteOk;
	
	@FindBy(xpath = ("//button[@id='addComment']"))
	private WebElement AddComment;
	
	@FindBy(xpath = ("//textarea[@id='newCommentsInput']"))
	private WebElement NewComment;
	
	@FindBy(xpath = ("//button[@id='saveComment']"))
	private WebElement SaveComment;
	
	@FindBy(xpath = ("//button[@id='cancelComments']"))
	private WebElement CloseComments;
	
	@FindBy(xpath = ("//button[@id='cancelComments']"))
	private WebElement Comments;
	
	@FindBy(xpath = ("//a[contains(text(),'View Document As PDF')]"))
	private WebElement ConvertToPDFLink;
	
	@FindBy(xpath = ("//div[@id='convertToPdfDropDown']"))
	private WebElement ConvertToPDF;
	
	public WebDriver driver;
	Actions action;

	public ViewerToolbar(WebDriver driver) {
		PageFactory.initElements(driver, this);
		action = new Actions(driver);

		this.driver = driver;
	}

	public void setConvToPDF() {
		action.moveToElement(ConvertToPDF).build().perform();
		Reporter.log("View as PDF menu icon is selected ", true);
		action.click(ConvertToPDFLink).build().perform();
		Reporter.log("View as PDF link  is selected ", true);
		
		
		
	}
	
	 
	public void SetCopyPaste() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("thumbnailOptionSelected"))); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);

//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
//		WebElement el1 = driver.findElement(By.className("thumbnailOptionSelected"));
//		         JavascriptExecutor executor = (JavascriptExecutor)driver;
//		         executor.executeScript("arguments[0].click()", el1);
	
		action.moveToElement(Pagemenu).build().perform();
		Reporter.log("Page menu icon is selected ", true);
		if(Copy.isEnabled()) {
		action.click(Copy).build().perform();
		Reporter.log("Copy icon is enabled and selected ", true);
		}else {
			Reporter.log("Copy icon is disabled", true);
		}
		OKbutton.click();
		Reporter.log("Page is copied successfully", true);
		action.moveToElement(Pagemenu).build().perform();
		Reporter.log("Page menu icon is selected again ", true);
		action.click(Paste).build().perform();
		Reporter.log("Paste icon is selected ", true);

		//OkBtn.click();
		action.click(OkBtn).build().perform();
		((JavascriptExecutor)driver).executeScript("arguments[0.click();", OkBtn);
		Reporter.log("Page is Pasted successfully", true);
	}
	
	public void SetSplitPageTiff(String fileName , int pos) throws Exception {
		
		WebElement checkbox = driver.findElement(By.xpath("//body/div[@id='main']/div[@id='bodyMain']/div[@id='viewerDiv']/div[@id='docViewerMetaData']/div[@id='"+fileName+"']/div['"+pos+"']/input['"+pos+"']"));
		WebElement thumbnail = driver.findElement(By.xpath("//body/div[@id='main']/div[@id='bodyMain']/div[@id='viewerDiv']/div[@id='docViewerMetaData']/div[@id='"+fileName+"']/div['"+pos+"']/img['"+pos+"']"));
				
		//WebElement thumbnail = driver.findElement(By.id(fileNames[1]));
		checkbox.click();
		thumbnail.click();
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("thumbnailOptionSelected"))); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);*/
		action.moveToElement(Pagemenu).build().perform();
//		Reporter.log("Page menu icon is selected ", true);
		action.click(Split).build().perform();
		Reporter.log("Splitting the pages", true);
		
		Thread.sleep(2000);
		
		WebElement msgBox = driver.findElement(By.xpath("//button[@id=CommentsMessageModelOk']"));
		if(msgBox.isDisplayed() && msgBox.isEnabled()) {
			msgBox.click();
		}
	}
	
	public void SetSplitPagePdf(String fileName,String StartPage,String EndPage, int pos) throws Exception {
		
		WebElement checkbox = driver.findElement(By.xpath("//body/div[@id='main']/div[@id='bodyMain']/div[@id='viewerDiv']/div[@id='docViewerMetaData']/div[@id='"+fileName+"']/div['"+pos+"']/input['"+pos+"']"));
		WebElement thumbnail = driver.findElement(By.xpath("//body/div[@id='main']/div[@id='bodyMain']/div[@id='viewerDiv']/div[@id='docViewerMetaData']/div[@id='"+fileName+"']/div['"+pos+"']/img['"+pos+"']"));
				
		//WebElement thumbnail = driver.findElement(By.id(fileNames[1]));
		checkbox.click();
		thumbnail.click();
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("thumbnailOptionSelected"))); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);*/
		Thread.sleep(1000);
		action.moveToElement(Pagemenu).build().perform();
		Reporter.log("Page menu icon is selected ", true);
		Thread.sleep(1000);
		action.click(Split).build().perform();
		Reporter.log("Splitting the pages", true);
		
		//WebElement splitOkButton = driver.findElement(By.xpath("//button[@id='splitDocument']"));
		if( splitOkButton.isDisplayed() && splitOkButton.isEnabled()) {
			Thread.sleep(2000);
			
			pdfStartRange.sendKeys(StartPage.trim());
			pdfEndRange.sendKeys(EndPage.trim());
			Thread.sleep(2000);
			
			// driver.findElement(By.xpath("//input[@id='startRange']"));
			//WebElement  =driver.findElement(By.xpath("//input[@id='endRange']"));
			splitOkButton.click();
			
		}
		
		/*WebElement msgBox = driver.findElement(By.xpath("//button[@id=CommentsMessageModelOk']"));
		if(msgBox.isDisplayed()) {
			msgBox.click();*/
	//}
	}
	
	public void SetDeletePage() throws Exception {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("thumbnailOptionSelected"))); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		
	/*	WebElement el1 = driver.findElement(By.className("thumbnailOptionSelected"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", el1);*/
//		Reporter.log("Thumbnail is selected ", true);
//		Thread.sleep(2000);
		DeleteBtn.click();
		Thread.sleep(2000);
		DeleteYesBtn.click();
		Thread.sleep(2000);
		FileDeleteOk.click();
		Reporter.log("Document is deleted successfully " ,true);
		
	}
	
	public void SetFullScreen() {
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("thumbnailOptionSelected"))); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);*/
//		WebElement el1 = driver.findElement(By.className("thumbnailOptionSelected"));
//        JavascriptExecutor executor = (JavascriptExecutor)driver;
//        executor.executeScript("arguments[0].click()", el1);
        Reporter.log("Thumbnail is selected ", true);
        action.moveToElement(Viewmenu).build().perform();
		Reporter.log("View menu icon is selected ", true);
		action.click(Fullscreen).build().perform();
		Reporter.log("FullScreen icon is selected ", true);
		action.moveToElement(Viewmenu).build().perform();
		action.click(Fullscreen).build().perform();
		Reporter.log("FullScreen icon is selected again ", true);
		action.moveToElement(Viewmenu).build().perform();
		action.click(ShowThumbnail).build().perform();
		Reporter.log("Show thumbnails icon is selected  ", true);
		action.moveToElement(Viewmenu).build().perform();
		action.click(ShowThumbnail).build().perform();
		Reporter.log("Show thumbnails icon is selected again ", true);
	}
	public void SetSavePage() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SaveIcon.click();
		Reporter.log("Document is Saved successfully " ,true);
		SaveOKBtn.click();
		
	}
	
	public void SetMail(String Email_ID,String Subject) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("thumbnailOptionSelected"))); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		action.moveToElement(shareicon).build().perform();
		Reporter.log("Share icon menu icon is selected ", true);
		action.click(Mail).build().perform();
		Reporter.log("Mail icon is selected ", true);
		
	    //driver.switchTo().activeElement().sendKeys(Email_ID);
		MailEmailID.sendKeys(Email_ID);
		Reporter.log("Email ID is entered ", true);
		//driver.switchTo().activeElement().sendKeys(Subject);
		MailSubject.sendKeys(Subject);
		Reporter.log("Subject is entered ", true);
		MailOkBtn.click();
		Reporter.log("Mail dialog OK button is clicked ", true);
		Thread.sleep(3000);
		//OKbutton.click();
		//vidya
		//WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(OkBtn)); 

//	element1.submit();
		((JavascriptExecutor)driver).executeScript("arguments[0.click();", element1);
		//OkBtn.click();
		//driver.switchTo().alert().accept();
	//action.moveToElement(OkBtn).build().perform();

	}
	
	public void SetPrint() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("thumbnailOptionSelected"))); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		action.moveToElement(shareicon).build().perform();
		Reporter.log("Share icon menu icon is selected ", true);
		action.click(PrintDialog).build().perform();
		Reporter.log("Print icon is selected ", true);
		//driver.switchTo().activeElement().click();
		PrintOkBtn.click();
		Reporter.log("Print OK button is clicked ", true);
		Thread.sleep(5000);
		OKbutton.click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		   
           js.executeScript("window.print();");
			Thread.sleep(5000);
		
		
	}
	
	public void SetExport() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("thumbnailOptionSelected"))); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		action.moveToElement(shareicon).build().perform();
		Reporter.log("Share icon menu icon is selected ", true);
		action.click(ExportDialog).build().perform();
		Reporter.log("Export icon is selected ", true);
		ExportOkBtn.click();
		Reporter.log("Export OK button is clicked ", true);
	}
	
	public void SetCloseViewer() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 CloseVeiwer.click();		
		 Reporter.log("Closing the viewer",true);
		  if(CloseVeiwer.isDisplayed()){
		  SaveDialogYesButton.click();
		  SaveOKBtn.click();
  }else{
	   SaveDialogNOButton.click();
  }
		
	}
}
