package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BaseClass;

public class SearchFunction extends BaseClass {

	public SearchFunction() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("//a[@id='advSearchMenuBtn']"))
	private WebElement SearchTab;

	@FindBy(id = ("clearSearchBtnLabel"))
	private WebElement ClearButton;

	@FindBy(xpath = ("(//input[@id='indexPhrase1'])[1]"))
	private WebElement IndexContainsSearch;

	@FindBy(xpath = ("//input[@id='indexPhrase2']"))
	private WebElement TextContainsSearch;

	@FindBy(xpath = ("//span[@id='docTypeSpan']"))
	private WebElement SearchDoctype;

	@FindBy(xpath = ("//span[@id='docCreatorSpan']"))
	private WebElement SearchDocCreator;

	@FindBy(xpath = ("//input[@id='createdDateFrom']"))
	private WebElement CreatedFrom;

	@FindBy(xpath = ("(//img[@id='labelSearchImage2'])[1]"))
	private WebElement fortextcontainsdrpdwnicon;

	@FindBy(xpath = ("//li[@id='textOptionMenu_0']"))
	private WebElement forallofthewordsinText;

	@FindBy(xpath = ("(//li[@id='textOptionMenu_2'])[1]"))
	private WebElement foratleasetoneofthewordText;

	@FindBy(xpath = ("(//li[@id='textOptionMenu_3'])[1]"))
	private WebElement forAtpartofthewordText;

	@FindBy(xpath = ("(//li[@id='indexOptionMenu_0'])[1]"))
	private WebElement forAllofthewords;

	@FindBy(xpath = ("(//input[@id='folderLocationForSearch'])[1]"))
	private WebElement Searchlocation;

	@FindBy(xpath = ("(//a[text()='CVApp Test'])[1]"))
	private WebElement cabinet;

	@FindBy(xpath = ("//a[text()='CVMobile App 2022']"))
	private WebElement drawer;

	@FindBy(xpath = ("//a[text()='Test apk']"))
	private WebElement folder;

	@FindBy(id = ("navigatorTreeOk1"))
	private WebElement OKbuttonforsearchlocation;

	@FindBy(xpath = ("(//th[text()='DOCUMENT NAME'])[5]"))
	private WebElement softAssertValidation;

	public WebElement getsoftAssertvalidation() {
		return softAssertValidation;
	}

	@FindBy(xpath = (" //li[text()='CVReports1']"))
	private WebElement forCVReports;

	public WebElement getforCVReports() {
		return forCVReports;
	}
	
	
	
	@FindBy(xpath = ("(//div[@class='elementHeader'])[3]"))
	private WebElement forComments;

	public WebElement getforComments() {
		return forComments;
	}
	
	@FindBy(xpath = ("(//div[@class='elementHeader'])[5]"))
	private WebElement forallversionshows;

	public WebElement getforallversionshows() {
		return forallversionshows;
	}
	
	
	@FindBy(xpath = ("//*[@id=\"cancelComments\"]"))
	private WebElement CancelComments;

	public WebElement getCancelComments() {
		return CancelComments;
	}
	
	
	
	
	
	

	@FindBy(xpath = ("//li[text()='aaa']"))
	private WebElement foraaaDoc;

	public WebElement getforaaaDoc() {
		return foraaaDoc;
	}

	@FindBy(xpath = ("//input[@class='e-input-filter e-input']"))
	private WebElement forSelectcreatordropdownicon;

	public WebElement getforSelectcreatordropdownicon() {
		return forSelectcreatordropdownicon;
	}

	@FindBy(xpath = ("(//select[@class='e-multi-hidden'])[2]"))
	private WebElement forSelectcreatordropdown;

	public WebElement getforSelectcreatordropdown() {
		return forSelectcreatordropdown;
	}

	@FindBy(xpath = ("//li[text()='nisha']"))
	private WebElement forNishacreator;

	public WebElement getforNishacreator() {
		return forNishacreator;
	}

	@FindBy(xpath = ("   //input[@class='e-input-filter e-input']"))
	private WebElement forSelectDocdropdown;

	public WebElement getforSelectDocdropdown() {
		return forSelectDocdropdown;
	}

	@FindBy(xpath = ("(//select[@class='e-multi-hidden'])[1]"))
	private WebElement forSelectDocdropdownicon;

	public WebElement getforSelectDocdropdownicon() {
		return forSelectDocdropdownicon;
	}

	@FindBy(xpath = ("//option[text()='Rejected']"))
	private WebElement forworkflowReject;

	public WebElement getforworkflowReject() {
		return forworkflowReject;
	}

	@FindBy(xpath = ("//option[text()='Pending']"))
	private WebElement forworkflowPending;

	public WebElement getforworkflowPending() {
		return forworkflowPending;
	}

	@FindBy(xpath = ("//option[text()=' Workflow Completed']"))
	private WebElement forworkflowCompleted;

	public WebElement getforworkflowCompleted() {
		return forworkflowCompleted;
	}

	@FindBy(xpath = ("//option[text()=' End Workflow']"))
	private WebElement forworkflowEndWorkflow;

	public WebElement getforworkflowEndWorkflow() {
		return forworkflowEndWorkflow;
	}

	@FindBy(xpath = ("//option[text()=' Task completed']"))
	private WebElement forworkflowTaskcomplete;

	public WebElement getforworkflowTaskcomplete() {
		return forworkflowTaskcomplete;
	}

	public WebElement getFortextcontainsdrpdwnicon() {
		return fortextcontainsdrpdwnicon;
	}

	@FindBy(xpath = ("(//select[@id='workFlowDropdown'])[1]"))
	private WebElement forworkflowdropdown;

	public WebElement getforworkflowdropdown() {
		return forworkflowdropdown;
	}

	public WebElement getForallofthewordsinText() {
		return forallofthewordsinText;
	}

	public WebElement getForatleasetoneofthewordText() {
		return foratleasetoneofthewordText;
	}

	public WebElement getForAtpartofthewordText() {
		return forAtpartofthewordText;
	}

	public WebElement getForAllofthewords() {
		return forAllofthewords;
	}

	public WebElement getSearchlocation() {
		return Searchlocation;
	}

	public WebElement getCabinet() {
		return cabinet;
	}

	public WebElement getDrawer() {
		return drawer;
	}

	public WebElement getFolder() {
		return folder;
	}

	public WebElement getOKbuttonforsearchlocation() {
		return OKbuttonforsearchlocation;
	}

	
	public WebElement getforAllofthewords() {
		return forAllofthewords;
	}

	public WebElement getforAtpartofthewordText() {
		return forAtpartofthewordText;
	}

	public WebElement getforatleasetoneofthewordText() {
		return foratleasetoneofthewordText;
	}

	public WebElement getfortextcontainsdrpdwnicon() {
		return fortextcontainsdrpdwnicon;
	}

	public WebElement getforallofthewordsinText() {
		return forallofthewordsinText;
	}
	
	@FindBy(xpath = ("//input[@id='indexPhrase2']"))
	private WebElement forExactPhraseText;

	public WebElement getforExactPhraseText() {
		return forExactPhraseText;
	}
	
	@FindBy(xpath = ("//li[@id='indexOptionMenu_1']"))
	private WebElement forExactPhraseinde;

	public WebElement getforExactPhraseinde() {
		return forExactPhraseinde;
	}
	
	
	
	
	

	@FindBy(xpath = ("//a[@id='navigationMenuBtn']"))
	private WebElement fornavigatetofoldersearch;

	public WebElement getfornavigatetofoldersearch() {
		return fornavigatetofoldersearch;
	}

	@FindBy(id = ("searchTree"))
	private WebElement searchTree;

	public WebElement getsearchTree() {
		return searchTree;
	}

	@FindBy(id = ("search-text"))
	private WebElement quicksearch;

	public WebElement getquicksearch() {
		return quicksearch;
	}

	public WebElement getClearButton() {
		return ClearButton;
	}

	public WebElement getSearchTab() {
		return SearchTab;
	}

	public WebElement getIndexContainsSearch() {
		return IndexContainsSearch;
	}

	public WebElement getTextContainsSearch() {
		return TextContainsSearch;
	}

	public WebElement getSearchDoctype() {
		return SearchDoctype;
	}

	public WebElement getSearchDocCreator() {
		return SearchDocCreator;
	}

	public WebElement getCreatedFrom() {
		return CreatedFrom;
	}

	public WebElement getCreatedTo() {
		return CreatedTo;
	}

	public WebElement getAllVersion() {
		return AllVersion;
	}

	public WebElement getIncludeComments() {
		return IncludeComments;
	}

	public WebElement getAppendToHitlist() {
		return AppendToHitlist;
	}

	public WebElement getFindInHitlist() {
		return FindInHitlist;
	}

	public WebElement getFindButton() {
		return FindButton;
	}

	public WebElement getForIndxdropdwnicon() {
		return forIndxdropdwnicon;
	}

	public WebElement getForatleastoneword() {
		return foratleastoneword;
	}

	@FindBy(xpath = ("//a[text()='4']"))
	private WebElement CreatedToDate;

	
	
	@FindBy(xpath = ("//a[text()='3']"))
	private WebElement Createdfromdate;

	public WebElement getCreatedfromdate() {
		return Createdfromdate;
	}

	 @FindBy(xpath = ("(//td[@class=' details-control'])[1]"))
	    private WebElement Metadata;
	 
	 
	 public WebElement getMetadata() {
			return Metadata;
		}
	 
	 
	

	@FindBy(xpath = ("//a[text()='2']"))
	private WebElement Modifiedfromdate;
	public WebElement getModifiedfromdate() {
		return Modifiedfromdate;
	}

	@FindBy(xpath = ("//a[text()='7']"))
	private WebElement ModifiedTodate;

	public WebElement getModifiedTodate() {
		return ModifiedTodate;
	}

	@FindBy(xpath = ("(//input[@id='ModifiedDateFrom'])[1]"))
	private WebElement ModifiedFrom;

	public WebElement getModifiedFrom() {
		return ModifiedFrom;
	}

	@FindBy(xpath = ("(//input[@id='ModifiedDateTo'])[1]"))
	private WebElement ModifiedTo;

	public WebElement getModifiedTo() {
		return ModifiedTo;
	}

	public WebElement getforCreatedToDate() {
		return CreatedToDate;
	}

	@FindBy(id = ("savedSearchName"))
	private WebElement saveDropdown;

	public WebElement getsaveDropdown() {
		return saveDropdown;
	}

	@FindBy(xpath = ("//img[@id='saveBtnForSaveSearchName']"))
	private WebElement savebotton;

	public WebElement getsavebotton() {
		return savebotton;
	}
	@FindBy(xpath = ("(//option[@value='0'])[5]"))
	private WebElement newsearch;

	public WebElement getnewsearch() {
		return newsearch;
	}

	@FindBy(xpath = ("(//td[normalize-space()='Signature on tif'])[1]"))
	private WebElement opendocfortext;

	public WebElement getopendocfortext() {
		return opendocfortext;
	}
	
	@FindBy(xpath = ("//div[@id='docViewerMetaData']"))
	private WebElement newdocscroll;

	public WebElement getnewdocscroll() {
		return newdocscroll;
	}

	
	@FindBy(xpath = ("(//img[@class='imgP'])[4]"))
    private WebElement highlightdocview;

      public WebElement gethighlightdocview() {
      return highlightdocview;
			}
      
	
	
	
	
	@FindBy(id = ("newSavedSearchName"))
	private WebElement newsearchvalueenter;

	public WebElement getnewsearchvalueenter() {
		return newsearchvalueenter;
	}
	
	
	
	
	

	@FindBy(xpath = ("//select[@id='savedSearchName']"))
	private WebElement savedNamecheck;

	public WebElement getsavedNamecheck() {
		return savedNamecheck;
	}

	@FindBy(xpath = ("//input[@id='createdDateTo']"))
	private WebElement CreatedTo;

	@FindBy(xpath = ("//input[@id='allVersions']"))
	private WebElement AllVersion;

	@FindBy(xpath = ("//input[@id='includeComment']"))
	private WebElement IncludeComments;

	@FindBy(xpath = ("//input[@id='appendToHitList']"))
	private WebElement AppendToHitlist;

	@FindBy(xpath = ("//input[@id='findInHitList']"))
	private WebElement FindInHitlist;

	@FindBy(xpath = ("//button[@id='advFindBtnLabel']"))
	private WebElement FindButton;

	@FindBy(xpath = ("(//img[@id='labelSearchImage1'])[1]"))
	private WebElement forIndxdropdwnicon;

	@FindBy(xpath = ("(//li[@id='indexOptionMenu_2'])[1]"))
	private WebElement foratleastoneword;

	

}
