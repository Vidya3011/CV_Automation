package Generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BaseClass;

public class POM extends BaseClass {

	public POM() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = ("//a[@id='recentMenuBtn']"))
	private WebElement RecentTab;
	
	@FindBy(xpath = ("//table[@id='recentFolders']/tbody/tr[1]/td[1]"))
	private WebElement RecentFolder;
	
	@FindBy(xpath = ("//td[text()='test doc']"))
	private WebElement RecentDocument;
	
	@FindBy(xpath = ("//div[@id='viewDocumentMail']"))
	private WebElement EmailDoc;
	
	@FindBy(xpath = ("(//input[@id='toEmial'])[1]"))
	private WebElement EnterEmail;
	
	@FindBy(xpath = ("(//input[@id='convertToPdfChk'])[1]"))
	private WebElement ConvertPDfCheckbox;

	@FindBy(xpath = ("(//textarea[@id='messageId'])[1]"))
	private WebElement MessageBox;
	
	@FindBy(xpath = ("(//button[@id='saveSendToDocument'])[1]"))
	private WebElement EmailSendOk;				
			                                                                         //(//input[@id='zipPasswordInputpdf'])[1]
	@FindBy(xpath = ("//input[@id='ccEmail'])[1]"))
	private WebElement ForCCmail;
	
	@FindBy(xpath = ("(//input[@id='subjectid'])[1]"))
	private WebElement ForSubject;
	
	@FindBy(xpath = ("(//input[@id='retainPdfColorExport1'])[1]"))
	private WebElement ForRetainEmail;
	
	@FindBy(xpath = ("(//input[@id='sendToPassword'])[1]"))
	private WebElement ForemailPasswrd;
	
	@FindBy(xpath = ("(//input[@id='zipPasswordInputpdf'])[1]"))
	private WebElement ForzipPasswrd;
	
	@FindBy(xpath=("//div[@id='viewDocumentExport']//a[contains(text(),'Export...')]"))
    private WebElement ExportDialog;
    
    @FindBy(xpath=("(//input[@id='convertToPdfChkExport'])[1]"))
    	    private WebElement ExportCovertPDFcheckbx;
    
    @FindBy(xpath=("(//input[@id='zipPasswordInput'])[1]"))
    private WebElement Expzippwrdcheckbx;
    
    ////input[@id='includeRouteSummary']
    
    @FindBy(xpath=("(//input[@id='pdfPasswordInput'])[1]"))
    private WebElement ExpPDFpaswrdbox;
    
    
    @FindBy(xpath=("(//input[@id='unlockRedactionsWithExport'])[1]"))
    private WebElement Expunlockredbox;
    
    @FindBy(xpath=("//input[@id//input[@id='retainFormatChkExport']='retainFormatChkExport']"))
    private WebElement Expretainchkbox;
    
    
    @FindBy(xpath=("//input[@id='includeRouteSummary']"))
    private WebElement ExpIncludewrkflwchkbox;
    
  //input[@id='exportAnnotations'](//input[@id='unlockRedactionsPwdExport'])[1]//select[@id='convertToPdfExportQuality']
    
    @FindBy(xpath=("//input[@id='exportAnnotations']"))
    private WebElement ExpWithannotations;
    
    @FindBy(xpath=("(//input[@id='unlockRedactionsPwdExport'])[1]"))
    private WebElement ExpUnlockRedPasswrd;
  
    @FindBy(xpath=("//select[@id='convertToPdfExportQuality']"))
    private WebElement ExpQualitydropdwn;
  
    public WebElement getForCCmail() {
		return ForCCmail;
	}

	public WebElement getForSubject() {
		return ForSubject;
	}

	public WebElement getForemailPasswrd() {
		return ForemailPasswrd;
	}

	public WebElement getForzipPasswrd() {
		return ForzipPasswrd;
	}

	public WebElement getExpzippwrdcheckbx() {
		return Expzippwrdcheckbx;
	}

	public WebElement getExpretainchkbox() {
		return Expretainchkbox;
	}

	public WebElement getExpIncludewrkflwchkbox() {
		return ExpIncludewrkflwchkbox;
	}

	public WebElement getExpWithannotations() {
		return ExpWithannotations;
	}

	public WebElement getExpUnlockRedPasswrd() {
		return ExpUnlockRedPasswrd;
	}

	public WebElement getExpQualitydropdwn() {
		return ExpQualitydropdwn;
	}

	public WebElement getExpAverageQuality() {
		return ExpAverageQuality;
	}

	public WebElement getExpBestQuality() {
		return ExpBestQuality;
	}



	@FindBy(xpath=("//option[@id='exportAverageQuality']"))
    private WebElement ExpAverageQuality;
    
    @FindBy(xpath=("//option[@id='exportBestQuality']"))
    private WebElement ExpBestQuality;
    
    
    
    public WebElement getExpunlockredbox() {
		return Expunlockredbox;
	}
    
    public WebElement getExpPDFpaswrdbox() {
		return ExpPDFpaswrdbox;
	}
    
    
    
    
    
    public WebElement getExpzippwrdcheckbxg() {
		return Expzippwrdcheckbx;
	}
    
    
	public WebElement getExportDialog() {
		return ExportDialog;
	}
	public WebElement getExportCovertPDFcheckbx() {
		return ExportCovertPDFcheckbx;
	}
	
	
	public WebElement getForezipPasswrd() {
		return ForzipPasswrd;
	}
	
	
	public WebElement getForemaliPasswrd() {
		return ForemailPasswrd;
	}
	
	
	
	
	public WebElement getForRetainEmail() {
		return ForRetainEmail;
	}
	
	public WebElement getSubject() {
		return ForSubject;
	}
	
	
	public WebElement getforCCmail() {
		return ForCCmail;
	}
	
	
	public WebElement getEnterEmail() {
		return EnterEmail;
	}

	public WebElement getConvertPDfCheckbox() {
		return ConvertPDfCheckbox;
	}

	public WebElement getMessageBox() {
		return MessageBox;
	}

	public WebElement getEmailSendOk() {
		return EmailSendOk;
	}

	public WebElement getForincludewrkflowcheckbx() {
		return forincludewrkflowcheckbx;
	}

	public WebElement getRecentTab() {
		return RecentTab;
	}

	public WebElement getEmailDoc() {
		return EmailDoc;
	}

	public WebElement getRecentFolder() {
		return RecentFolder;
	}



	public WebElement getRecentDocument() {
		return RecentDocument;
	}

	



	@FindBy(xpath = ("//a[text()='CVApp Test']"))
	private WebElement Cabinet;

	@FindBy(xpath = ("//a[text()='CVMobile App 2022']"))
	private WebElement Drawer;

	@FindBy(xpath = ("//a[text()='Test apk']"))
	private WebElement Folder;

	//

	@FindBy(xpath = ("(//td[@class=' customDocName'][normalize-space()='single pdf upload'])[1]"))
	private WebElement Document;

	public WebElement getCabinet() {

		Cabinet.click();
		return Cabinet;

	}

	public WebElement getDrawer() {
		return Drawer;
	}

	public WebElement getFolder() {
		return Folder;
	}

	public WebElement getDocument() {
		return Document;
	}

	@FindBy(xpath = ("//a[@id='createDocument']"))
	private WebElement NewDocumentID;

	// @FindBy(xpath=("//*[@id='viewDocumentTypeList']"))
	// private WebElement DocTypeList;

	@FindBy(xpath = ("//span[@class='c0193']"))
	private WebElement SelectDropdown;

	@FindBy(xpath = ("(//input[@id='blackoutPrint'])[1]"))
	private WebElement BlackoutCheckbox;

	@FindBy(xpath = ("//div[@id='viewDocumentPrint']"))
	private WebElement DocPrint;

	@FindBy(xpath = ("(//input[@id='includeRouteSummaryPrint'])[1]"))
	private WebElement forincludewrkflowcheckbx;

	@FindBy(xpath = ("(//input[@class='thumbnailOptionSelected'])[1]"))
	private WebElement CheckBox;

	@FindBy(xpath = ("/html[1]/body[1]/div[55]/div[59]/div[7]/div[2]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/span[1]"))
	private WebElement SendToIcon;

	@FindBy(xpath = ("(//input[@id='unlockRedactionsWithPrint'])[1]"))
	private WebElement UnlockRedaction;

	@FindBy(xpath = ("(//input[@id='unlockRedactionsPwdPrint'])[1]"))
	private WebElement UnlockRedactionPasswrd;

	@FindBy(xpath = ("(//button[@id='messageButtonOKFD'])[1]"))
	private WebElement PrintokButton;

	@FindBy(xpath = ("//button[@id='cancelPrintBtn']"))
	private WebElement Cancelb;

	@FindBy(xpath = ("(//button[@id='printDocumentOnView'])[1] "))
	private WebElement OKbuttonprintpage;

	@FindBy(xpath = ("(//input[@id='certifiedCoverPagePrint'])[1]"))
	private WebElement CertifiedPageCheckbox;

	public WebElement getUnlockRedactionPasswrd() {
		return UnlockRedactionPasswrd;
	}

	public WebElement getUnlockRedaction() {
		return UnlockRedaction;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCancelb() {
		return Cancelb;
	}

	public WebElement getOKbuttonprintpage() {
		return OKbuttonprintpage;
	}

	public WebElement getNewDocumentID() {
		return NewDocumentID;
	}

	public WebElement getforincludewrkflowcheckbx() {
		return forincludewrkflowcheckbx;
	}

	public WebElement getCheckBox() {
		return CheckBox;
	}

	public WebElement getSelectDropdown() {
		return SelectDropdown;
	}

	public WebElement getBlackoutCheckbox() {
		return BlackoutCheckbox;
	}

	public WebElement getDocPrint() {
		return DocPrint;
	}

	public WebElement getSendToIcon() {
		return SendToIcon;
	}

	public WebElement getPrintokButton() {
		return PrintokButton;
	}

	public WebElement getCertifiedPageCheckbox() {
		return CertifiedPageCheckbox;
	}
	

}
