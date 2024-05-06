package Script;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic.FailedRetry;
import Pom.SearchFunction;
import okhttp3.internal.connection.RouteSelector.Selection;

public class SearchSelectDocumentLocation extends Generic.BaseClass {
	public static Actions act;
	
	@BeforeMethod
	public void DateAndTime() {
		Date d=new Date();
		System.out.println(d);
		}

	@BeforeClass
	public void ladBrowser() {
		loadBrowser("Chrome");
		launchUrl();
	}

	@Test(priority=1)
	public void CVSLogin() throws Exception {
		SearchFunction sr = new SearchFunction();
		//sr.getSearchString();
		loginCVS();
	
	}

     @Test(priority=3) 
	public void ExactSearchInIndexWithLoadMoreCount() throws InterruptedException, IOException {
		SearchFunction sr = new SearchFunction();
		jsclick(sr.getSearchTab());
	   Thread.sleep(5000);
		act = new Actions(driver);
		act.moveToElement(sr.getIndexContainsSearch()).click().build().perform();
		sr.getIndexContainsSearch().sendKeys(readFromExSearch(1, 3));
		Thread.sleep(5000);
		jsclick(sr.getFindButton());
		Thread.sleep(8000);
		scrollDown(sr.getinMiddleDocOFSeachMetaData());
		Thread.sleep(3000);
		jsclick(sr.getinMiddleDocOFSeachMetaData());
		Thread.sleep(5000);
		sr.ScrollDownButton();
		Thread.sleep(5000);
	   jsclick(sr.getloadMore());
	   Thread.sleep(4000);
	   scrollDown(sr.getafterLoadmoreSeachMetaData());
	   Thread.sleep(5000);
	   jsclick(sr.getafterLoadmoreSeachMetaData());
	   Thread.sleep(3000);
	   sr.ScrollDownButton();
	   Thread.sleep(3000);
	   jsclick(sr.getloadMore());
	   Thread.sleep(5000);
	   WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
	   acceptAlert();
	  Thread.sleep(8000);
		jsclick(sr.getClearButton());
		Reporter.log("Searchfunctionality with exact phrase index search with load more count", true);
   }
    @Test(priority=4)
     public void ExactSearchInIndex() throws InterruptedException, IOException {
 		SearchFunction sr = new SearchFunction();
 		jsclick(sr.getSearchTab());
 	   Thread.sleep(5000);
 		act = new Actions(driver);
 		act.moveToElement(sr.getIndexContainsSearch()).click().build().perform();
 		sr.getIndexContainsSearch().sendKeys(readFromExSearch(3, 1));
 		Thread.sleep(5000);
 		jsclick(sr.getFindButton());
 		Thread.sleep(8000);
 		jsclick(sr.getmetaDataNum2());
		Thread.sleep(10000);
		jsclick(sr.getClearButton());
		Reporter.log("Searchfunctionality with exact phrase index search",true);
		
     }
     
     	@Test(priority=16,retryAnalyzer=FailedRetry.class) // AlloftheWords search
	public void TextSearchWithSQLData() throws InterruptedException, IOException {
		SearchFunction sr = new SearchFunction();
		jsclick(sr.getSearchTab());
		Thread.sleep(3000);
		(sr.getfortextcontainsdrpdwnicon()).click();
	     Thread.sleep(3000);
		movingclkElement(sr.getforallofthewordsinText());
		movingclkElement(sr.getTextContainsSearch());
		sr.getTextContainsSearch().sendKeys(sr.getSearchString());
		Thread.sleep(3000);
		jsclick(sr.getFindButton());
		Thread.sleep(10000);
		jsclick(sr.getopendocfortext());
		if(sr.getopendocfortext().isDisplayed()) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		acceptAlert();
		} else {
			
			Reporter.log("AlertNotPresent");
		}
		Thread.sleep(3000);
		scrollDown(sr.getnewdocscroll());
		snap("SearchScrollDownBarIssue");
		Thread.sleep(8000);
		jsclick(Refresh_Button(driver));
		Reporter.log(" verify Search text contains functionality with all of the words option.", true);
	}
     	@Test(priority=17,retryAnalyzer=FailedRetry.class) // AlloftheWords search
    	public void TextSearchWithAllOftheWords() throws InterruptedException, IOException {
    		SearchFunction sr = new SearchFunction();
    		jsclick(sr.getSearchTab());
    		Thread.sleep(3000);
    		(sr.getfortextcontainsdrpdwnicon()).click();;
    	     Thread.sleep(3000);
    		movingclkElement(sr.getforExactPhraseText());
    		Thread.sleep(2000);
    		movingclkElement(sr.getTextContainsSearch());
    		sr.getTextContainsSearch().sendKeys(readFromExSearch(2, 4));
    		Thread.sleep(3000);
    		jsclick(sr.getFindButton());
    		Thread.sleep(10000);
    		jsclick(sr.getopendocfortext());
    		if(sr.getopendocfortext().isDisplayed()) {
    		WebDriverWait wait = new WebDriverWait(driver, 30);
    		wait.until(ExpectedConditions.alertIsPresent());
    		acceptAlert();
    		} else {
    			
    			Reporter.log("AlertNotPresent");
    		}
    		Thread.sleep(3000);
    		jsclick(sr.gethighlightdocview());
    		Thread.sleep(3000);
    		scrollDown(sr.getnewdocscroll());
    		snap("SearchScrollDownBarIssue");
    		Thread.sleep(8000);
    		jsclick(Refresh_Button(driver));
    		Reporter.log(" verify Search text contains functionality with all of the words option.", true);
    	}
    	@Test(priority=18,retryAnalyzer=FailedRetry.class) // AlloftheWords search
    	public void TextSearchWithAtpartOftheWord() throws InterruptedException, IOException {
    		SearchFunction sr = new SearchFunction();
    		jsclick(sr.getSearchTab());
    		Thread.sleep(3000);
    		(sr.getfortextcontainsdrpdwnicon()).click();;
    	     Thread.sleep(3000);
    		movingclkElement(sr.getForatleasetoneofthewordText());
    		Thread.sleep(2000);
    		movingclkElement(sr.getTextContainsSearch());
    		sr.getTextContainsSearch().sendKeys(sr.searchStringSQL());
    		Thread.sleep(3000);
    		jsclick(sr.getFindButton());
    		Thread.sleep(10000);
    		jsclick(sr.getforRandomdocOpen());
    		if(sr.getopendocfortext().isDisplayed()) {
    		WebDriverWait wait = new WebDriverWait(driver, 30);
    		wait.until(ExpectedConditions.alertIsPresent());
    		acceptAlert();
    		} else {
    			
    			Reporter.log("AlertNotPresent");
    		}
    		Thread.sleep(3000);
    		//jsclick(sr.gethighlightdocview());
    		Thread.sleep(3000);
    		sr.ScrollDownBTNText();
    		snap("SearchScrollDownBarIssue");
    		Thread.sleep(8000);
    		jsclick(Refresh_Button(driver));
    		Reporter.log(" verify Search text contains functionality with all of the words option.", true);
    	}
     	
    	
     	

	@Test (priority=2)// blank search
	public void BlankSearch() throws InterruptedException {
		SearchFunction sr = new SearchFunction();
		jsclick(sr.getSearchTab());
		Thread.sleep(5000);
		jsclick(sr.getFindButton());
		Thread.sleep(10000);
		jsclick(sr.getClearButton());
		Reporter.log("verify Search  functionality with blank option.", true);
	}

	

	@Test (priority=5)// atleast one word
	public void AtLeastOneWordSeachIndex() throws Exception {
		SearchFunction sr = new SearchFunction();
	
		jsclick(sr.getSearchTab());
		Thread.sleep(3000);
		VisiblityOf(sr.getForIndxdropdwnicon());
		movingclkElement(sr.getForIndxdropdwnicon());
		jsclick(sr.getForatleastoneword());
		movingclkElement(sr.getIndexContainsSearch());
		sendvalue(sr.getIndexContainsSearch(),readFromExSearch(1, 1));
		movingclkElement(sr.getFindButton());
		Thread.sleep(10000);
		jsclick(sr.getClearButton());
		Reporter.log(" verify Index contains search:atleast one of the words search", true);
	}
		@Test(priority=6) // allofthe word search
	public void AllOfTheWordSearchIndex() throws Exception {
		SearchFunction sr = new SearchFunction();
		Thread.sleep(5000);
		movingElement(sr.getForIndxdropdwnicon());
		jsclick(sr.getforAllofthewords());
		sendvalue(sr.getIndexContainsSearch(),readFromExSearch(1, 0));
		jsclick(sr.getFindButton());
		Thread.sleep(10000);
		jsclick(sr.getmetaDataNum3());
		Thread.sleep(10000);
		jsclick(sr.getClearButton());
		Reporter.log(" verify Index contains search:all of the word search", true);
	}
	
	
	 @Test (priority=7)
		public void AllVrsn_Incldcmnt_FindInHit_AppendToHit() throws InterruptedException, IOException {
			SearchFunction sr = new SearchFunction();
			Thread.sleep(3000);
		    movingclkElement(sr.getIndexContainsSearch());
			sendvalue(sr.getIndexContainsSearch(), readFromExSearch(1, 4));
			movingclkElement(sr.getFindButton());
			Thread.sleep(8000);
			(sr.getIndexContainsSearch()).clear();
			Thread.sleep(3000);
			sr.getAppendToHitlist().click();
			movingclkElement(sr.getIndexContainsSearch());
			sendvalue(sr.getIndexContainsSearch(), readFromExSearch(2, 3));//dsdf
			movingclkElement(sr.getFindButton());
			Thread.sleep(10000);
			sr.getAppendToHitlist().click();
			Thread.sleep(3000);
			sr.getFindInHitlist().click();
			movingclkElement(sr.getFindButton());
			Thread.sleep(3000);
			sr.getFindInHitlist().click();
			Thread.sleep(3000);
			sr.getIncludeComments().click();
			Thread.sleep(3000);
			(sr.getIndexContainsSearch()).clear();
			sendvalue(sr.getTextContainsSearch(), readFromExSearch(1, 3));//vidya
			movingclkElement(sr.getFindButton());
			Thread.sleep(10000);
			jsclick(sr.getMetadata());
			Thread.sleep(8000);
			jsclick(sr.getforComments());
			Thread.sleep(3000);
			sr.getCancelComments().click();
			Thread.sleep(5000);
			sr.getClearButton().click();
			Thread.sleep(3000);
			movingElement(sr.getForIndxdropdwnicon());
			jsclick(sr.getforExactPhraseinde());
			sendvalue(sr.getIndexContainsSearch(), readFromExSearch(2,0 ));
			sr.getAllVersion().click();
	        movingclkElement(sr.getFindButton());
	        Thread.sleep(10000);
	        jsclick(sr.getMetadata());
	        Thread.sleep(3000);
	        WebDriverWait wait=new WebDriverWait(driver,30);
	        wait.until(ExpectedConditions.visibilityOf(sr.getforallversionshows()));
			sr.getforallversionshows().click();
			Thread.sleep(8000);
			sr.getClearButton();
			Reporter.log(" verify Allversion/include comments/appendtohitlist /find in hit list functionality working fine", true);
		}
	
	@Test(priority=8) // Cabinet/drawer/folder level search in search document location
	public void FolderLevelSearch() throws InterruptedException {

		SearchFunction sr = new SearchFunction();
		act=new Actions(driver);
		jsclick(sr.getSearchTab());
		Thread.sleep(5000);
		movingElement(sr.getSearchlocation());// used base class
		jsclick(sr.getSearchlocation());
	    act.doubleClick(sr.getCabinet()).perform();
		Thread.sleep(3000);
		act.moveToElement(sr.getDrawer());// used base class
		act.doubleClick(sr.getDrawer()).perform();
		Thread.sleep(3000);
	    act.moveToElement(sr.getFolder()).perform();
		act.doubleClick(sr.getFolder()).perform();
		jsclick(sr.getOKbuttonforsearchlocation());
		jsclick(sr.getFindButton());
		Assert.assertTrue(sr.getsoftAssertvalidation().isDisplayed());
		
		Thread.sleep(10000);
		jsclick(sr.getClearButton());
		Reporter.log("Cabinet/drawer/folder level search in search document location", true);
	}

	@Test(priority=9) // Cabinet/drawer/ level search in search document location
	public void DrawerLevelSearch() throws InterruptedException {
		SearchFunction sr = new SearchFunction();
		act=new Actions(driver);
		jsclick(sr.getSearchTab());
		Thread.sleep(5000);
		movingElement(sr.getSearchlocation());// used base class
		jsclick(sr.getSearchlocation());// used base class
		movingElement(sr.getCabinet());
		act.doubleClick(sr.getCabinet()).perform();
		Thread.sleep(3000);
		movingElement(sr.getDrawer());// used base class
		act.doubleClick(sr.getDrawer()).perform();
		Thread.sleep(3000);
		jsclick(sr.getOKbuttonforsearchlocation());
		jsclick(sr.getFindButton());
		Assert.assertTrue(sr.getsoftAssertvalidation().isDisplayed());
        Thread.sleep(10000);
		jsclick(sr.getClearButton());
		Reporter.log("Cabinet/drawer/ level search in search document location", true);
	}

	@Test(priority=10) // Cabinet level search in search document location
	public void CabinetLevel() throws InterruptedException {
		SearchFunction sr = new SearchFunction();
		act=new Actions(driver);
		jsclick(sr.getSearchTab());
		Thread.sleep(5000);
		movingElement(sr.getSearchlocation());// used base class
		jsclick(sr.getSearchlocation());// used base class
		movingElement(sr.getCabinet());
		act.doubleClick(sr.getCabinet()).perform();
		Thread.sleep(3000);
		jsclick(sr.getOKbuttonforsearchlocation());
		jsclick(sr.getFindButton());
		Assert.assertTrue(sr.getsoftAssertvalidation().isDisplayed());
		applyWaitsForAll();
		Thread.sleep(10000);
		jsclick(sr.getClearButton());
		
		Reporter.log("Cabinet level search in search document location", true);
	}
	
 @Test (priority=11)
	public void DocumentDropDown() throws Exception {
		SearchFunction sr = new SearchFunction();
        movingclkElement(sr.getforSelectDocdropdownicon());
       sr.getforSelectDocdropdown().sendKeys(readFromExSearch(1, 2));
       Thread.sleep(3000);
	    movingclkElement(sr.getforCVReports());
	    jsclick(sr.getFindButton());
	    Thread.sleep(10000);
		jsclick(sr.getClearButton());
		
		Reporter.log(
				"Select document type dropdown: Enter CVReport and click cvreports it will show the cvreports documents.",
				true);
		}
@Test (priority=12)// enter value in field and select the user
	public void DocumentCreatorDropDown() throws Exception {
		SearchFunction sr = new SearchFunction();
		jsclick(sr.getSearchTab());
		Thread.sleep(5000);
        movingclkElement(sr.getforSelectcreatordropdown());
		sr.getforSelectcreatordropdownicon().sendKeys(readFromExSearch(1, 4));
		Thread.sleep(3000);
		movingclkElement(sr.getforNishacreator());
		sr.getFindButton().click();
		Thread.sleep(10000);
		sr.getClearButton().click();

}

	@Test(priority=13)
	public void WorkflowStatusDropdown() throws InterruptedException {
		SearchFunction sr = new SearchFunction();
        WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(sr.getforworkflowdropdown()));
		(sr.getforworkflowdropdown()).click();
        (sr.getforworkflowReject()).click();
        jsclick(sr.getFindButton());
        Thread.sleep(10000);
		jsclick(sr.getClearButton());
		
		Reporter.log("work flow rejected documents displayed successfully", true);

		(sr.getforworkflowdropdown()).click();// pending
		(sr.getforworkflowPending()).click();
		jsclick(sr.getFindButton());
		Thread.sleep(8000);
		
		jsclick(sr.getClearButton());
		Reporter.log("work flow pending documents displayed successfully", true);

		(sr.getforworkflowdropdown()).click();
		(sr.getforworkflowCompleted()).click();
	    jsclick(sr.getFindButton());
		Thread.sleep(8000);
		jsclick(sr.getClearButton());
		Thread.sleep(3000);
		Reporter.log("work flow completed documents displayed successfully", true);

		(sr.getforworkflowdropdown()).click();// Endworkflow
		(sr.getforworkflowEndWorkflow()).click();
		jsclick(sr.getFindButton());
		Thread.sleep(8000);
		jsclick(sr.getClearButton());
		Thread.sleep(8000);
		Reporter.log("end work flow documents displayed successfully", true);

		(sr.getforworkflowdropdown()).click();
		(sr.getforworkflowTaskcomplete()).click();// taskcompleted
		 jsclick(sr.getFindButton());
		Thread.sleep(8000);
		jsclick(sr.getClearButton());
		Thread.sleep(3000);
		Reporter.log("task completed documents displayed successfully", true);
}

	@Test(priority=14)
	public void CreatedFromToModifiedFromTo() throws InterruptedException {
		SearchFunction sr = new SearchFunction();
		jsclick(sr.getSearchTab());
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(sr.getCreatedFrom()));
		movingclkElement(sr.getCreatedFrom());
		movingclkElement(sr.getCreatedfromdate());
		movingclkElement(sr.getCreatedTo());
		movingclkElement(sr.getforCreatedToDate());
		jsclick(sr.getFindButton());
		Thread.sleep(8000);
		jsclick(sr.getClearButton());
		Reporter.log("given created from and created To date document displayed successfully", true);
		movingclkElement(sr.getModifiedFrom());
		movingclkElement(sr.getModifiedfromdate());
		movingclkElement(sr.getModifiedTo());
		movingclkElement(sr.getModifiedTodate());
		Thread.sleep(3000);
		jsclick(sr.getFindButton());
		Thread.sleep(10000);
		jsclick(sr.getClearButton());
		Reporter.log("given modify from and modify To date documents displayed successfully", true);
	}

	

	@Test(priority=15) // showing saved documents
	public void SavingTheSearchDoc() throws InterruptedException, IOException {
		SearchFunction sr = new SearchFunction();
		jsclick(sr.getSearchTab());
		jsclick((sr.getsaveDropdown()));
		Thread.sleep(3000);
        sr.getnewsearch().click();
		sr.getnewsearchvalueenter().sendKeys(readFromExSearch(3, 0));
		Thread.sleep(5000);
		sendvalue(sr.getIndexContainsSearch(), readFromExSearch(1, 3));
		 movingclkElement(sr.getforSelectDocdropdownicon());
	     sr.getforSelectDocdropdown().sendKeys(readFromExSearch(1, 2));
	     Thread.sleep(3000);
		 movingclkElement(sr.getforCVReports());
		sr.getFindButton().click();
		Thread.sleep(5000);
		movingElement(sr.getsavebotton());
		jsclick(sr.getsavebotton());
		Thread.sleep(3000);
		movingclkElement((sr.getsavedNamecheck()));
		Thread.sleep(5000);
		sr.getClearButton().click();
		Reporter.log("search documents saved successfully", true);
	}

	@Test(priority=19) // TreeIcon search
	public void FolderSerchIcon() throws Exception {
		SearchFunction sr = new SearchFunction();
		jsclick(sr.getfornavigatetofoldersearch());
		Thread.sleep(3000);
		sr.getsearchTree().sendKeys(readFromExSearch(1, 3));
		Thread.sleep(5000);
		sr.getsearchTree().sendKeys(Keys.RETURN);// tree search
		Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(sr.getsearchTree()));
		Reporter.log("TreeIcon search functionality works fine", true);

	}

	@Test(priority=20) // Quick search
	public void QuickSearch() throws Exception {
		SearchFunction sr = new SearchFunction();
		sr.getquicksearch().sendKeys(readFromExSearch(2, 1));
        Thread.sleep(3000);
		sr.getquicksearch().sendKeys(Keys.RETURN);
		Thread.sleep(15000);
		SoftAssert so = new SoftAssert();
		String PageTitle = driver.getTitle();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(sr.getquicksearch()));
		so.assertTrue(PageTitle.contains(readFromExSearch(2, 4)));
		Reporter.log("quick search icon works fine", true);
		jsclick(Refresh_Button(driver));
	}
	@AfterMethod
	public void EndTime() {
		
		Date d=new Date();
		System.out.println(d);
	}

}
