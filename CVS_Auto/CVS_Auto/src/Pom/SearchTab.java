package Pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class SearchTab {
	@FindBy(xpath = ("//a[@id='advSearchMenuBtn']"))
	private WebElement SearchTab;
	
	@FindBy(xpath = ("//input[@id='indexPhrase1']"))
	private WebElement IndexContainsSearch;
	
	@FindBy(xpath = ("//input[@id='indexPhrase2']"))
	private WebElement TextContainsSearch;
	
	@FindBy(xpath = ("//span[@id='docTypeSpan']"))
	private WebElement SearchDoctype;
	
	@FindBy(xpath = ("//span[@id='docCreatorSpan']"))
	private WebElement SearchDocCreator;
	
	@FindBy(xpath = ("//input[@id='createdDateFrom']"))
	private WebElement CreatedFrom;
	
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
	
	public WebDriver driver;
	
	public SearchTab(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	
	public void SetSearchTab() {
		SearchTab.click();
		Reporter.log("Search tab is clicked ", true);
	}
	
	public void SetIndexSearch(String Indexsearch) {
		IndexContainsSearch.sendKeys(Indexsearch);
		FindButton.click();
	}
	
	
	public void SetTextSearch(String Textsearch) {
		TextContainsSearch.sendKeys(Textsearch);
		FindButton.click();
	}
	
	public void SetDoctypeSearch (String doctypesearch,String Indexsearch ) {
		IndexContainsSearch.sendKeys(Indexsearch);
		Select doctype = new Select(doctypesearch);
		doctype.selectByValue(doctype);
		List<WebElement> oSize = doctype.getOptions();
		for (int i = 1; i < oSize.size(); i++) {

			String sValue = doctype.getOptions().get(i).getText();
			System.out.println(sValue);

		}
		SearchDoctype.sendKeys(doctypesearch);
		FindButton.click();
	}
	
	public void SetDocCreatorSearch(String docCreatorsearch,String Indexsearch,String doctypesearch) {
		IndexContainsSearch.sendKeys(Indexsearch);
		SearchDoctype.sendKeys(doctypesearch);
		SearchDocCreator.sendKeys(docCreatorsearch);
		FindButton.click();
	}
}
