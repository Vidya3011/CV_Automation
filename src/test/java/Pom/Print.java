package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Print extends Generic.BaseClass {

	public Print() {
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
	
	@FindBy(xpath = ("(//button[@class='modalDialogButtons'])[1]"))
	private WebElement EmailsuccessMessageDialogboxOK;
	
	 public WebElement getEmailsuccessMessageDialogboxOK() {
			return EmailsuccessMessageDialogboxOK;
		}

	
			 
			 
			 @FindBy(xpath = ("(//input[@id='sendDocAsCopy'])[1]"))
				private WebElement CopyEmail;				
			 
			 public WebElement getCopyEmail() {
					return CopyEmail;
				}			 
			 
			//*[@id="homeMenuBtn"]/img	 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 @FindBy(xpath = ("(//input[@id='sendDocAsReference'])[1]"))
				private WebElement ReferenceEmail;				
			 
			 public WebElement getReferenceEmail() {
					return ReferenceEmail;
				}	
			 
			 
			 
	
	@FindBy(xpath = ("(//button[@id='saveSendToDocument'])[1]"))
	private WebElement EmailSendOk;				
			                                                                         //(//input[@id='zipPasswordInputpdf'])[1]
	@FindBy(xpath = ("//*[@id=\"ccEmail\"]"))
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
    
    @FindBy(xpath=("(//input[@id='retainFormatChkExport'])[1]"))
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
  
    
  
    
    @FindBy(xpath=("//*[@id=\"messageContent\"]"))
    private WebElement WithoutEmailID;
  
    public WebElement getWithoutEmailID() {
		return WithoutEmailID;
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

	
	@FindBy(xpath=("//*[@id=\"messageButtonOK\"]"))
    private WebElement InvalidDialogBoxOKBTN;
	
	public WebElement getInvalidDialogBoxOKBTN() {
		return InvalidDialogBoxOKBTN;
	}
	
	@FindBy(xpath=("//*[@id=\"messageContent\"]"))
    private WebElement InvalidEmailMessageValidation;
	
	public WebElement getInvalidEmailMessageValidation() {
		return InvalidEmailMessageValidation;
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

	



	@FindBy(xpath = ("/html/body/div[58]/div[64]/div[1]/div/div[2]/div[2]/ul/li[1]/a"))
	private WebElement Cabinet;

	@FindBy(xpath = ("//*[@id=\"2\"]/a"))
	private WebElement Drawer;

	@FindBy(xpath = ("/html/body/div[58]/div[64]/div[1]/div/div[2]/div[2]/ul/li[1]/ul/li[1]/ul/li[1]/a"))
	private WebElement Folder;

	//

	@FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[8]/td[3]"))
	private WebElement Document;

	
	
	
	@FindBy(xpath = ("/html/body/div[58]/div[64]/div[4]/div[2]/div[1]/div/div[2]/div[2]/table/tbody/tr[1]/td[3]"))
	private WebElement OpenCaseCabDocument;
	
public WebElement getOpenCaseCabDocument() {

		
		return OpenCaseCabDocument;

	}
	
	public WebElement getCabinet() {

		
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

	@FindBy(xpath = ("//*[@id=\"toolbarId\"]/div[6]"))
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
	
	
	
	
	@FindBy(xpath = ("//*[@id=\"recepientEmailId\"]"))
	private WebElement secureLinkReceipientMail;

	public WebElement getsecureLinkReceipientMail() {
		return secureLinkReceipientMail;
	}
	
	
	
	@FindBy(xpath = ("//*[@id=\"confirmEmailIdSecure\"]"))
	private WebElement secureLinkConfirmMail;

	public WebElement getsecureLinkConfirmtMail() {
		return secureLinkConfirmMail;
	}
	

	
	@FindBy(xpath = ("//*[@id=\"modifyPermissionCheckbox\"]"))
	private WebElement secureLinkModifyCheckBox;

	public WebElement getsecureLinkModifyCheckBox() {
		return secureLinkModifyCheckBox;
	}
	
	
	
	@FindBy(xpath = ("//*[@id=\"navigatorTreeOk32\"]"))
	private WebElement secureLinkOKBTN;

	public WebElement getsecureLinkOKBTN() {
		return secureLinkOKBTN;
	}
	
	
	
	@FindBy(id = ("recipientMailIdSecond"))
	private WebElement secLinkReceipientMailAgain;

	public WebElement getsecLinkReceipientMailAgain() {
		return secLinkReceipientMailAgain;
	}
	
	@FindBy(xpath = ("//*[@id=\"messageContent\"]"))
	private WebElement secLinkBlankMail_ID;

	public WebElement getsecLinkBlankMail_ID() {
		return secLinkBlankMail_ID;
	}
	
	
	
	@FindBy(xpath = ("//*[@id=\"messageButtonOK\"]"))
	private WebElement EmailIDMismatchDialogOKBTN;

	public WebElement getEmailIDMismatchDialogOKBTN() {
		return EmailIDMismatchDialogOKBTN;
	}
	
	@FindBy(xpath = ("//*[@id=\"messageContent\"]"))
	private WebElement EmailIDMismatchMessage;

	public WebElement getEmailIDMismatchMessage() {
		return EmailIDMismatchMessage;
	}
	
	
	
	
	
	
	
	@FindBy(xpath = ("//*[@id=\"confirmEmailIdSecureSecond\"]"))
	private WebElement secLinkConfirmMailAgain;

	public WebElement getsecLinkConfirmtMailAgain() {
		return secLinkConfirmMailAgain;
	}
	
	@FindBy(xpath = ("//*[@id=\"userName\"]"))
	private WebElement secLinkUserName;

	public WebElement getsecLinkUserName() {
		return secLinkUserName;
	}
	
	
	@FindBy(xpath = ("//*[@id=\"password\"]"))
	private WebElement secLinkUserPwrd;

	public WebElement getsecLinkUserPwrd() {
		return secLinkUserPwrd;
	}
	@FindBy(xpath = ("//*[@id=\"submitid\"]"))
	private WebElement secLinkLogin;

	public WebElement getsecLinkLogin() {
		return secLinkLogin;
	}
	
	@FindBy(xpath = ("//*[@id=\"navigatorTreeOk33\"]"))
	private WebElement secureLinkOKBTNsecond;

	public WebElement getsecureLinkOKBTNsecond() {
		return secureLinkOKBTNsecond;
	}
	
	
	
	@FindBy(xpath = ("//*[@id=\"documentSendToLi\"]"))
	private WebElement secureLinkFromDocTab;

	public WebElement getsecureLinkFromDocTab() {
		return secureLinkFromDocTab;
	}
	
	//*[@id="sendToSecureMail"]
	@FindBy(xpath = ("//*[@id=\"sendToSecureMail\"]"))
	private WebElement sendToDocTab;

	public WebElement getsendToDocTab() {
		return sendToDocTab;
	}

	@FindBy(xpath = ("//*[@id=\"sendToSecureMailView\"]"))
	private WebElement secureLink;

	public WebElement getsecureLink() {
		return secureLink;
	}

	@FindBy(xpath=("//*[@id='viewDocumentnavigator']/ul/li/a"))
	private WebElement TestCabExpIcon;
	
	public WebElement getTestCabExpIcon() {
		return TestCabExpIcon;
	}

	@FindBy(xpath=("//*[@id=\"30\"]/ins"))
	private WebElement CaseRoomNishRCab;
	
	public WebElement getCaseRoomNishRCab() {
		return CaseRoomNishRCab;
	}
	
	@FindBy(xpath=("//*[@id=\"31\"]/ins"))
	private WebElement CAseRoomNishDrawerIcon;
	
	public WebElement getCAseRoomNishDrawerIcon() {
		return CAseRoomNishDrawerIcon;
	}
	@FindBy(xpath=("//*[@id=\"32\"]/a/ins"))
	private WebElement CAseRoomNishRExpIcon;
	
	public WebElement getCAseRoomNishRExpIcon() {
		return CAseRoomNishRExpIcon;
	}

	 @FindBy(xpath = ("//button[@id='ownershipMessageModelOk']"))
		private WebElement Lockeddoc;
	 
	 public WebElement getLockeddoc() {
			return Lockeddoc;
		}

	@FindBy(xpath=("//*[@id='viewDocumentnavigator']/ul/li/ul/li[1]/a"))
	private WebElement TesttestDrawerExpIcon;

	public WebElement getTesttestDrawerExpIcon() {
		return TesttestDrawerExpIcon;
	}


	@FindBy(xpath=("//*[@id=\"viewDocumentnavigator\"]/ul/li[1]/ul/li/ul/li[1]/a"))
	private WebElement VidyaTestFolder;
	
	public WebElement getVidyaTestFolder() {
		return VidyaTestFolder;
	}

	@FindBy(xpath = "//*[@id=\"376\"]/a")
	private WebElement SQLRoomFolder;
	
	
	
	public WebElement getSQLRoomFolder() {
	
		return SQLRoomFolder;
	}
	
	
	
}
