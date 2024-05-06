package Script;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
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

import Generic.BaseClass;
import Generic.FailedRetry;
import Pom.SearchFunction;
import okhttp3.internal.connection.RouteSelector.Selection;

public class SearchSelectDocumentLocation extends BaseClass {
	public static Actions act;
	
	 private static org.apache.logging.log4j.Logger log = LogManager.getLogger(SearchSelectDocumentLocation.class);

	 @BeforeClass
		public void ladBrowser() throws Exception {
		 loadBrowserChrome();
			launchUrl();
			driver.manage().deleteAllCookies();
		}

		@Test(priority = 1)
		public void Tc01_LoginSIDBI() throws Exception {

			loginVidya();

		}
	 
		@Test (priority=2)// blank search
		public void A_BlankSearch() throws InterruptedException {
			 Reporter.log("Scenario 01: Search tab - blank search");
			SearchFunction sr = new SearchFunction();
			Thread.sleep(3000);
			 Reporter.log("User click on Search tab");
			jsclick(sr.getSearchTab());
			Thread.sleep(5000);
			 Reporter.log("Click on find button");
			jsclick(sr.getFindButton());
			Thread.sleep(10000);
			 Reporter.log("It should list all the document successfully...");
			jsclick(sr.getClearButton());
			Reporter.log("Click on clear button");
			Reporter.log("Searched document list cleared successfull");
			log.info("verify Blank search.");
		}

    @Test(priority=3) 
	public void B_ExactSearchInIndexWithLoadMoreCount() throws InterruptedException, IOException {
		SearchFunction sr = new SearchFunction();
		jsclick(sr.getSearchTab());
		Reporter.log("Scenario 02: Search - load more count");
		Reporter.log("User click on Search tab");
	   Thread.sleep(5000);
		act = new Actions(driver);
		act.moveToElement(sr.getIndexContainsSearch()).click().build().perform();
		Reporter.log("Enter value into Index contains textbox");
		sr.getIndexContainsSearch().sendKeys("Automation");//sendKeys("Test Doc");
		Thread.sleep(5000);
		Reporter.log("Click on find button");
		jsclick(sr.getFindButton());
		Thread.sleep(8000);
		//scrollDown(sr.getinMiddleDocOFSeachMetaData());
		Thread.sleep(3000);
		jsclick(sr.getinMiddleDocOFSeachMetaData());
	
		Reporter.log("Scroll down the searched list,now user can able to see the 'loadmore' button");
		
		sr.ScrollDownButton();
		Thread.sleep(5000);
		Reporter.log("Click on load more button");
	   jsclick(sr.getloadMore());
	   Thread.sleep(4000);
	   scrollDown(sr.getafterLoadmoreSeachMetaData());
	   Thread.sleep(5000);
	   jsclick(sr.getafterLoadmoreSeachMetaData());
	   Thread.sleep(8000);
	 Reporter.log("Scroll down the searched list,again it will show the 'load more' button");
	  Reporter.log("Click on load more button again");
	   sr.ScrollDownButton();
	  
	   Thread.sleep(3000);
	   jsclick(sr.getloadMore());
	   Thread.sleep(5000);
	   WebDriverWait wait = new WebDriverWait(driver, 30);
	   try {
		wait.until(ExpectedConditions.alertIsPresent());
	   acceptAlert();
	   }
	   catch(Exception e) {
		 log.info("NoAlertIsPresent");  
	   }
	   Reporter.log("It should show 'no more data found' warning alert, Warning alert displayed successfull");
	  Thread.sleep(8000);
		Reporter.log("Click on OK button");
		Reporter.log("It should close the Alert dialog successfull");
		jsclick(sr.getClearButton());
		 Reporter.log("Click on clear button");
		log.info("Searchfunctionality with exact phrase index search with load more count");
		 Reporter.log("It should clear the searched document list successfully");
		
   }
    @Test(priority=4)
     public void C_ExactSearchInIndex() throws Exception {
 		SearchFunction sr = new SearchFunction();
 		Reporter.log("Scenario 03: Search tab - Index search contains 'Exact Phrase'");
 		jsclick(sr.getSearchTab());
 		 Reporter.log("User click on search tab");
 	   Thread.sleep(5000);
 		act = new Actions(driver);
 		act.moveToElement(sr.getIndexContainsSearch()).click().build().perform();
 		Reporter.log("Enter value on index search contains textbox");
 		sr.getIndexContainsSearch().sendKeys(readFromExSearch(3, 1));
 		Thread.sleep(5000);
 		Reporter.log("Click on find button");
 		jsclick(sr.getFindButton());
 		Reporter.log("It should list the document on the page, document displayed successfull...");
 		Thread.sleep(8000);
 		//Reporter.log("Search tab: Exact phrase index contains search working fine");
 		log.info("Search tab: Exact phrase index contains search working fine");
		sr.getRandomSelectDoc();
		Thread.sleep(10000);
		Reporter.log("Click on Clear button");
		 Reporter.log("It should clear the searched document list successfully");
		jsclick(sr.getClearButton());
		
     }
    
     	@Test(priority=16) // AlloftheWords search
	public void N_TextSearchWithSQLData() throws InterruptedException, IOException {
		SearchFunction sr = new SearchFunction();
		Reporter.log("Scenario 19:Search tab- TextContains search 'alloftheword' option");
		Reporter.log("NOTE:Start the indexer server then execute the mentioned SQL statement 'ALTER FULLTEXT INDEX ON Indexer START FULL POPULATION\r\n" + 
				"Select * from Indexer");
		Reporter.log("Click on search tab");
		jsclick(sr.getSearchTab());
		Thread.sleep(3000);
		(sr.getfortextcontainsdrpdwnicon()).click();
		Reporter.log("Select text contains 'alloftheword' option");
	     Thread.sleep(3000);
		movingclkElement(sr.getforallofthewordsinText());
		Reporter.log("Start the  indexer by using sql statement");
		movingclkElement(sr.getTextContainsSearch());
		sr.getTextContainsSearch().sendKeys(sr.getSearchString());
		Reporter.log("Click on find button");
		Reporter.log("It will automatically  list all the indexed document relate to the search");
		Thread.sleep(3000);
		jsclick(sr.getFindButton());
		Reporter.log("Click on find button");
		Thread.sleep(10000);
		jsclick(sr.getopendocfortext());
		Reporter.log("open the document from the list, verify the thumbnail it will be highlihted for the particular search.");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		try {
			if(sr.getLockeddoc().isDisplayed()) {
				
				WebElement element1 = driver.findElement(By.xpath("//*[@id=\"ownershipMessageModelOk\"]"));
	            jsclick(element1);
			}
			}
			catch(Exception e) {
			Reporter.log("Locked message displayed",true);
			Thread.sleep(2000);
			}
			
		
		
		
		try {
		if(wait.until(ExpectedConditions.alertIsPresent()) != null) {
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		acceptAlert();
		} }catch(Exception e) {
			
			log.info("AlertNotPresent");
		}
		Thread.sleep(3000);
		scrollDown(sr.getnewdocscroll());
	//	Reporter.log("It should highlight the document on thumbnail page");
				Thread.sleep(8000);
		jsclick(Refresh_Button(driver));
		log.info(" verify Search text contains functionality with all of the words option.");
	}
    	@Test(priority=17) // AlloftheWords search
    	public void O_TextSearchWithAllOftheWords() throws InterruptedException, IOException {
    		Reporter.log("Scenario 20:Search tab- TextContains search 'AtLeasetOneOFTheWord' option");
    		Reporter.log("NOTE:Start the indexer server then execute the mentioned SQL statement 'ALTER FULLTEXT INDEX ON Indexer START FULL POPULATION\r\n" + 
    				"Select * from Indexer");
    		Reporter.log("Click on search tab");
    		SearchFunction sr = new SearchFunction();
    		jsclick(sr.getSearchTab());
    	//	Reporter.log("User click on search tab");
    		Thread.sleep(3000);
    		jsclick(sr.getfortextcontainsdrpdwnicon());
    		Reporter.log("Select text contains 'AtLeastOneOFTheWord' option");
    	     Thread.sleep(3000);
    		movingclkElement(sr.getforExactPhraseText());

    		Reporter.log("Start the  indexer by using sql statement");
    		Thread.sleep(2000);
    		jsclick(sr.getTextContainsSearch());
    		Reporter.log("It will automatically  list all the indexed document relate to the search");
    		sr.getTextContainsSearch().sendKeys(readFromExSearch(2, 4));
    		Thread.sleep(3000);
    		Reporter.log("open the document from the list, verify the thumbnail it will be highlihted for the particular search.");
    //		Reporter.log("It should highlight the document on thumbnail page");
    		jsclick(sr.getFindButton());
    		Thread.sleep(10000);
    		jsclick(sr.getopendocforallwrdtext());
    		Thread.sleep(3000);
    		
    		try {
    			if(sr.getLockeddoc().isDisplayed()) {
    				
    				WebElement element1 = driver.findElement(By.xpath("//*[@id=\"ownershipMessageModelOk\"]"));
    	            jsclick(element1);
    			}
    			}
    			catch(Exception e) {
    			Reporter.log("Locked message displayed",true);
    			Thread.sleep(2000);
    			}
    			
    		
    		
    		
    		WebDriverWait wait = new WebDriverWait(driver, 30);
    		try {
    		if(wait.until(ExpectedConditions.alertIsPresent()) != null) {
    	//	WebDriverWait wait = new WebDriverWait(driver, 30);
    		wait.until(ExpectedConditions.alertIsPresent());
    		acceptAlert();
    		}
    		}catch(Exception e) {
    			
    			Reporter.log("AlertNotPresent");
    		}
    		Thread.sleep(3000);
    	//	jsclick(sr.gethighlightdocview());
    		Thread.sleep(8000);
    		//scrollDown(sr.getnewdocscroll());
    		//snap("SearchScrollDownBarIssue");
    	//	Thread.sleep(8000);
    		jsclick(Refresh_Button(driver));
    		log.info(" verify Search text contains functionality with all of the words option.");
    	}
    	@Test(priority=18) // AlloftheWords search
    	public void P_TextSearchWithAtpartOftheWord() throws InterruptedException, IOException {
    		Reporter.log("Scenario 21:Search tab- TextContains search 'AtPartOFTheWord' option");
    		Reporter.log("NOTE:Start the indexer server then execute the mentioned SQL statement 'ALTER FULLTEXT INDEX ON Indexer START FULL POPULATION\r\n" + 
    				"Select * from Indexer");
    		Reporter.log("Click on search tab");
    		SearchFunction sr = new SearchFunction();
    		jsclick(sr.getSearchTab());
    		 Reporter.log("Click on 'AtpartOFtheWord' word submenu");
    		Thread.sleep(3000);
    		 Reporter.log("It will automatically  list all the indexed document relate to the search");
    		(sr.getfortextcontainsdrpdwnicon()).click();
    	     Thread.sleep(3000);
    		movingclkElement(sr.getForatleasetoneofthewordText());
    		Thread.sleep(2000);
    		 Reporter.log("User click on Find button");
    		movingclkElement(sr.getTextContainsSearch());
    		sr.getTextContainsSearch().sendKeys(sr.searchStringSQL());
    		Thread.sleep(3000);
    		jsclick(sr.getFindButton());
    		 Reporter.log("open the document from the list, verify the thumbnail it will be highlihted for the particular search.");
    		Thread.sleep(10000);
    		jsclick(sr.getforRandomdocOpen());
    		Thread.sleep(3000);
    		try {
    			if(sr.getLockeddoc().isDisplayed()) {
    				
    				WebElement element1 = driver.findElement(By.xpath("//*[@id=\"ownershipMessageModelOk\"]"));
    	            jsclick(element1);
    			}
    			}
    			catch(Exception e) {
    			Reporter.log("Locked message displayed",true);
    			Thread.sleep(2000);
    			}
    			
    		
    		
    		
    		
    		WebDriverWait wait = new WebDriverWait(driver, 30);
    		try {
    		if(wait.until(ExpectedConditions.alertIsPresent()) != null) {
    		//WebDriverWait wait = new WebDriverWait(driver, 30);
    		wait.until(ExpectedConditions.alertIsPresent());
    		acceptAlert();
    		} }catch(Exception e) {
    			
    			System.out.print("AlertNotPresent");
    		}
    		Thread.sleep(3000);
    		//jsclick(sr.gethighlightdocview());
    		Thread.sleep(3000);
    		
    	//	sr.ScrollDownBTNText();
    		
    		Thread.sleep(8000);
    		jsclick(Refresh_Button(driver));
    		// Reporter.log("User check the thumbnail view highlighted pages...");
    	//	 Reporter.log("Textcontains search with 'alloftheword' submenu working fine");
    		log.info(" verify Search text contains functionality with all of the words option.");
    	}
     	
    	
     	


	

	@Test (priority=5)// atleast one word
	public void D_AtLeastOneWordSeachIndex() throws Exception {
		SearchFunction sr = new SearchFunction();
		Reporter.log("Scenario 04: Search tab- Index contains 'AtleastOneOfTheWord'");
		jsclick(sr.getSearchTab());
		 Reporter.log("User click on Search tab");
		Thread.sleep(3000);
		VisiblityOf(sr.getForIndxdropdwnicon());
		 Reporter.log("User click on atleastoneofthe word submenu");
		movingclkElement(sr.getForIndxdropdwnicon());
		jsclick(sr.getForatleastoneword());
		Reporter.log("User enter the value into  index contains text box");
		movingclkElement(sr.getIndexContainsSearch());
		sendvalue(sr.getIndexContainsSearch(),readFromExSearch(1, 1));
		movingclkElement(sr.getFindButton());
		 Reporter.log("User click on find button");
		Thread.sleep(10000);
		 Reporter.log("It should display document on the page");
		Reporter.log("Searchfunctionality with exact phrase index contains search working fine");
		jsclick(sr.getClearButton());
		log.info(" verify Index contains search:atleast one of the words search");
	}
		@Test(priority=6) // allofthe word search
	public void E_AllOfTheWordSearchIndex() throws Exception {
			Reporter.log("Scenario 05:Search tab Index contains 'AtleastOneOfTheWord'");
		SearchFunction sr = new SearchFunction();
		Thread.sleep(5000);
		Reporter.log("Click on Index contains search 'all of th word' submenu");
		movingElement(sr.getForIndxdropdwnicon());
		Reporter.log("Enter value in index contains search textbox");
		jsclick(sr.getforAllofthewords());
		sendvalue(sr.getIndexContainsSearch(),readFromExSearch(1, 0));
		Reporter.log("Click on find button");
		jsclick(sr.getFindButton());
		Thread.sleep(10000);
		Reporter.log("It should display the document on the page, Document dislpayed successsfull...");
		jsclick(sr.getmetaDataNum3());
		Reporter.log("Index contains search 'all of the word' working fine...");
		Thread.sleep(10000);
		Reporter.log("Click on clear button");
		jsclick(sr.getClearButton());
		log.info(" verify Index contains search:all of the word search");
	}
	
	
	// @Test (priority=7)
		public void F_AllVrsn_Incldcmnt_FindInHit_AppendToHit() throws InterruptedException, IOException {
			SearchFunction sr = new SearchFunction();
			Thread.sleep(5000);
			Reporter.log("Scenario 06:Search tab - AppendToHitlist checkbox");
			try {
		    jsclick(sr.getIndexContainsSearch());
		    WebDriverWait wait=new WebDriverWait(driver,20);
		    wait.until(ExpectedConditions.elementToBeClickable(sr.getIndexContainsSearch()));
		    sr.getIndexContainsSearch().sendKeys("Test");
			}
			catch (JavascriptException e) {
				Reporter.log("Exception handled");
			}
		    Reporter.log("Note: User search some document first...");
			Reporter.log("Enter the value into index contains search text box");
			
			movingclkElement(sr.getFindButton());
			
			Reporter.log("Click on find button");
			Thread.sleep(8000);
			Reporter.log("It should list the document on document page");
			(sr.getIndexContainsSearch()).clear();
			Reporter.log("Clear the index contains search text box");
			Thread.sleep(3000);
			Reporter.log("Click on append to hit list check box");
			sr.getAppendToHitlist().click();
			Reporter.log("Enter the value into index contains search text box ");
			movingclkElement(sr.getIndexContainsSearch());
			sendvalue(sr.getIndexContainsSearch(), "Automation folder");//dsdf
			movingclkElement(sr.getFindButton());
			Reporter.log("User click on find button");
			Thread.sleep(10000);
			Reporter.log("Its append the search document in the listed document");
			sr.getAppendToHitlist().click();
			Reporter.log("===========================================================================");
		//	Reporter.log("Expected result actual result same...");
			Thread.sleep(3000);
			Reporter.log("scenario 07: Verify search tab - FindInHitlist checkbox");
			
			sr.getFindInHitlist().click();
			Reporter.log("Enter the value in index contains search textbox");
			movingclkElement(sr.getFindButton());
			Reporter.log("Click on find in hitlist check box");
			Thread.sleep(3000);
			Reporter.log("Click on find button");
			sr.getFindInHitlist().click();
			Thread.sleep(3000);
			Reporter.log("It should  display only the  searched document on the document page");
			sr.getIncludeComments().click();
			Reporter.log("===========================================================================");
			Reporter.log("Scneario 08: Search tab - Include comment checkbox");
			Thread.sleep(3000);
			(sr.getIndexContainsSearch()).clear();
			Reporter.log("Enter the value in text contains search text box");
			sendvalue(sr.getTextContainsSearch(), "Approve and Forward");//vidya
			movingclkElement(sr.getFindButton());
			Reporter.log("Click on Inclue_comment check box");
			Thread.sleep(10000);
			Reporter.log("Click on find button");
			jsclick(sr.getMetadata());
			Reporter.log("It should display the document which is containing the comment..");
			Thread.sleep(8000);
	//		Reporter.log("Expected result and actual result is same test case passed...");
			jsclick(sr.getforComments());
			Thread.sleep(3000);
			jsclick(sr.getCancelComments());
			Thread.sleep(5000);
			Reporter.log("Click  on clear button");
			sr.getClearButton().click();
			Reporter.log("It should clear the searched list successfully");
			Thread.sleep(3000);
			Reporter.log("===========================================================================");
			Reporter.log("Scneario 09: Search tab - all version check box");
			movingElement(sr.getForIndxdropdwnicon());
			Reporter.log("User enter the value in index contains search text box");
			jsclick(sr.getforExactPhraseinde());
			sendvalue(sr.getIndexContainsSearch(), "Test");
			sr.getAllVersion().click();
			Reporter.log("Click on all version check box");
	        movingclkElement(sr.getFindButton());
	        Reporter.log("Click on find button");
	        Thread.sleep(10000);
	        jsclick(sr.getMetadata());
	        Reporter.log("It should display the document which in containing version");
	        Thread.sleep(3000);
	        Reporter.log("Click on Clear button");
	        WebDriverWait wait=new WebDriverWait(driver,30);
	        wait.until(ExpectedConditions.visibilityOf(sr.getforallversionshows()));
			sr.getforallversionshows().click();
		//	Reporter.log("All version function working fine");
			Thread.sleep(8000);
			sr.getClearButton();
			log.info(" verify Allversion/include comments/appendtohitlist /find in hit list functionality working fine");
		}
	
	@Test(priority=8) // Cabinet/drawer/folder level search in search document location
	public void G_FolderLevelSearch() throws InterruptedException {
		Reporter.log("Scenario 10: Verify 'Select document location' - folder");
		SearchFunction sr = new SearchFunction();
		act=new Actions(driver);
		Reporter.log("Click on search tab");
		jsclick(sr.getSearchTab());
		Thread.sleep(5000);
		Reporter.log("Click on 'Select search location' textbox");
		movingElement(sr.getSearchlocation());// used base class
		Reporter.log("Expand a cabinet");
		jsclick(sr.getSearchlocation());
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(sr.getCabinet()));
	    selectElement(sr.getCabinet());
		Thread.sleep(3000);
		Reporter.log("Expand a drawer");
		//act.moveToElement(sr.getDrawer());// used base class
		VisiblityOf(sr.getDrawer());
		selectElement(sr.getDrawer());
		Reporter.log("Select a folder");
		Thread.sleep(3000);
	   // act.moveToElement(sr.getFolder()).perform();
		//act.doubleClick(sr.getFolder()).perform();
		selectElement(sr.getFolder());
		Reporter.log("Click on 'Select search location' dialog OK button");
		jsclick(sr.getOKbuttonforsearchlocation());
		Reporter.log("Click on find button");
		jsclick(sr.getFindButton());
	//	Assert.assertTrue(sr.getsoftAssertvalidation().isDisplayed());
		Reporter.log("It should display the particular selected folder documents on the page");
		Thread.sleep(6000);
		//Reporter.log("Expected actual same TC passed...");
		jsclick(sr.getClearButton());
		log.info("Cabinet/drawer/folder level search in search document location working fine");
	}

	

	@Test(priority=9) // Cabinet/drawer/ level search in search document location
	public void H_DrawerLevelSearch() throws InterruptedException {
		Reporter.log("Scneario 11: Verify 'Select Document location' - drawer");
		SearchFunction sr = new SearchFunction();
		act=new Actions(driver);
		Reporter.log("Click on search tab");
		jsclick(sr.getSearchTab());
		Thread.sleep(5000);
		Reporter.log("Click on 'Select Document location' textbox");
		movingElement(sr.getSearchlocation());// used base class
		Reporter.log("Expand a cabinet");
		jsclick(sr.getSearchlocation());
		//Reporter.log("USer click on select search location dialog OK button");
	   selectElement(sr.getCabinet());
		Thread.sleep(3000);
		Reporter.log("Select a drawer");
	//	movingElement(sr.getDrawer());// used base class
		selectElement(sr.getDrawer());
		Thread.sleep(3000);
		Reporter.log("Click on 'Select Document location' dialog OK button");
		jsclick(sr.getOKbuttonforsearchlocation());
		Reporter.log("Click on find button");
		jsclick(sr.getFindButton());
	//	Assert.assertTrue(sr.getsoftAssertvalidation().isDisplayed());
		Reporter.log("It should display the particular drawer document on the page");
        Thread.sleep(6000);
      //  Reporter.log("Actual and expected same...TC passed");
		jsclick(sr.getClearButton());
		log.info("Cabinet/drawer/ level search in search document location working fine");
	}

	@Test(priority=10) // Cabinet level search in search document location
	public void I_CabinetLevel() throws InterruptedException {
		Reporter.log("Scenario 12: Verify 'Select Document location'- cabinet ");
		SearchFunction sr = new SearchFunction();
		act=new Actions(driver);
		Reporter.log("Click on search tab");
		jsclick(sr.getSearchTab());
		Thread.sleep(5000);
		Reporter.log("Click on 'Select Document location' textbox");
		movingElement(sr.getSearchlocation());// used base class
		Reporter.log("Expand a cabinet");
		jsclick(sr.getSearchlocation());
		Reporter.log("Click on 'Select Document location' dialog OK button");
	   selectElement(sr.getCabinet());
		Thread.sleep(3000);
		jsclick(sr.getOKbuttonforsearchlocation());
		jsclick(sr.getFindButton());
		Reporter.log("Click on find button");
	//	Assert.assertTrue(sr.getsoftAssertvalidation().isDisplayed());
		applyWaitsForAll();
		Reporter.log("It should display the searched cabinet document on the page");
		Thread.sleep(10000);
//		Reporter.log("Expected actuall result same.. Test Case passed");
		jsclick(sr.getClearButton());
		
		log.info("Cabinet level search in search document location working fine");
	}
	
 @Test (priority=11)
	public void J_DocumentDropDown() throws Exception {
		SearchFunction sr = new SearchFunction();
		Reporter.log("Scenario 13: Verify search tab ('Document Type')");
        movingclkElement(sr.getforSelectDocdropdownicon());
        Reporter.log("Click on document type dropdown");
   //    sr.getforSelectDocdropdown().sendKeys(readFromExSearch(1, 2));
       Thread.sleep(3000);
       Reporter.log("User should select a document type");
	    movingclkElement(sr.getforCVReports());
	    jsclick(sr.getFindButton());
	    Reporter.log("Click on find button");
	    Thread.sleep(10000);
	    Reporter.log("It should display the searched document type documents on the page");
		jsclick(sr.getClearButton());
	//	Reporter.log("Expected reuslt actual result same...TC passed");
		log.info("Select document type dropdown: Enter CVReport and click cvreports it shows the cvreports documents.");
		}
@Test (priority=12)// enter value in field and select the user
	public void K_DocumentCreatorDropDown() throws Exception {
	Reporter.log("Scenario 14:Verify Search tab  ('document creator')");
		SearchFunction sr = new SearchFunction();
		jsclick(sr.getSearchTab());
		Reporter.log("Click on search tab");
		Thread.sleep(5000);
        movingclkElement(sr.getforSelectcreatordropdown());
        Reporter.log("Select a document creator from the dropdown");
	//	sr.getforSelectcreatordropdownicon().sendKeys(readFromExSearch(1, 4));
		Thread.sleep(3000);
		Reporter.log("Click on find button");
		movingclkElement(sr.getforNishacreator());
		sr.getFindButton().click();
		Reporter.log("It should display the searched creator documents on the page");
		Thread.sleep(10000);
		sr.getClearButton().click();
		log.info("Document Creator dropdown working fine..");

}

	@Test(priority=13)
	public void L_WorkflowStatusDropdown() throws InterruptedException {
		SearchFunction sr = new SearchFunction();
		Reporter.log("Scenario 14:Verify Search tab-Workflow status(Reject option)");
        WebDriverWait wait=new WebDriverWait(driver,30);
        Reporter.log("Click on workflow status dropdown");
		wait.until(ExpectedConditions.elementToBeClickable(sr.getforworkflowdropdown()));
		(sr.getforworkflowdropdown()).click();
		Reporter.log("Select Reject option");
        (sr.getforworkflowReject()).click();
        Reporter.log("Click on find button");
        jsclick(sr.getFindButton());
        Reporter.log("It should display the rejected workflow documents on the page");
        Thread.sleep(15000);
		jsclick(sr.getClearButton());
		Reporter.log("Click on clear button");
		 Reporter.log("Listed document cleared successfully...");
		log.info("workflow rejected: documents displayed successfully");
		 Reporter.log("=================================================================");
		Reporter.log("Scenario 15:  Verify Search tab-Workflow status(Pending option)");
		(sr.getforworkflowdropdown()).click();// pending
		Reporter.log("Select the workflow dropdown pending Option");
		(sr.getforworkflowPending()).click();
		Reporter.log("Click on find button");
		jsclick(sr.getFindButton());
		Reporter.log("It should display the wrokflow status pending documents on the page");
		Thread.sleep(8000);
		
		jsclick(sr.getClearButton());
		log.info("workflow pending: documents displayed successfully");
		Reporter.log("Click on clear button");
		 Reporter.log("Listed document cleared successfully...");
			Reporter.log("===============================================================================");
		(sr.getforworkflowdropdown()).click();
		Reporter.log("Scenario 16: Verify Search tab-Workflow status(Workflow completed option)");
		(sr.getforworkflowCompleted()).click();
		Reporter.log("Select a workflow dropdown 'workflow completed' option");
	    jsclick(sr.getFindButton());
	    Reporter.log("USer click on find button");
		Thread.sleep(8000);
		Reporter.log("It should display the wrokflow completed documents on the page");
		jsclick(sr.getClearButton());
		Thread.sleep(3000);
		log.info("workflow completed: documents displayed successfully");
		Reporter.log("Click on clear button");
		 Reporter.log("Listed document cleared successfully...");
			Reporter.log("===============================================================================");
		(sr.getforworkflowdropdown()).click();// Endworkflow
		Reporter.log("Scenario 17: Verify Search tab-Workflow status(Endworkflow option)");
		(sr.getforworkflowEndWorkflow()).click();
		Reporter.log("Select a workflow dropdown  'endworkflow' option");
		jsclick(sr.getFindButton());
		Reporter.log("Click on find button");
		Thread.sleep(8000);
		jsclick(sr.getClearButton());
		Reporter.log("It should display the workflow ended documents on the page");
		Thread.sleep(8000);
		log.info("end workflow: documents displayed successfully");
		Thread.sleep(3000);
		log.info("workflow completed: documents displayed successfully");
		Reporter.log("Click on clear button");
		 Reporter.log("Listed document cleared successfully...");
			Reporter.log("===============================================================================");
		(sr.getforworkflowdropdown()).click();
		Reporter.log("Scenario 18: Verify Search tab-Workflow status(TaskCompleted option)");
		(sr.getforworkflowTaskcomplete()).click();// taskcompleted
		Reporter.log("Select a workflow dropdown  Task completed Option");
		jsclick(sr.getFindButton());
		Reporter.log("Click on find button");
		Thread.sleep(8000);
		jsclick(sr.getClearButton());
		Thread.sleep(3000);
		Reporter.log("It should display the Task completed documents on the page");
		log.info("task completed: documents displayed successfully");
		Thread.sleep(3000);
		log.info("workflow completed: documents displayed successfully");
		Reporter.log("Click on clear button");
		 Reporter.log("Listed document cleared successfully...");
			Reporter.log("===============================================================================");
}

//	@Test(priority=14)
	public void CreatedFromToModifiedFromTo() throws InterruptedException {
		SearchFunction sr = new SearchFunction();
		jsclick(sr.getSearchTab());
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(sr.getCreatedFrom()));
		movingclkElement(sr.getCreatedFrom());
		movingclkElement(sr.getCreatedfromdate());
		jsclick(sr.getDatePickerOKBTN());
		Thread.sleep(3000);
		movingclkElement(sr.getCreatedTo());
		Thread.sleep(3000);
		movingclkElement(sr.getforCreatedToDate());
		jsclick(sr.getDatePickerOKBTN());
		Thread.sleep(3000);
		jsclick(sr.getFindButton());
		Thread.sleep(8000);
		jsclick(sr.getClearButton());
		log.info("Created from and created To date: document displayed successfully");
		movingclkElement(sr.getModifiedFrom());
		Thread.sleep(3000);
		movingclkElement(sr.getModifiedfromdate());
		Thread.sleep(3000);
		jsclick(sr.getDatePickerOKBTN());
		Thread.sleep(3000);
		movingclkElement(sr.getModifiedTo());
		Thread.sleep(2000);
		movingclkElement(sr.getModifiedTodate());
		jsclick(sr.getDatePickerOKBTN());
		
		Thread.sleep(3000);
		jsclick(sr.getFindButton());
		Thread.sleep(10000);
		jsclick(sr.getClearButton());
		log.info("Modify from and modify To date: documents displayed successfully");
	}

	

	@Test(priority=15) // showing saved documents
	public void M_SavingTheSearchDoc() throws InterruptedException, IOException {
		Reporter.log("Scenario 18:Verify Select saved search functionality");
		SearchFunction sr = new SearchFunction();
		jsclick(sr.getSearchTab());
		Reporter.log("Select search tab");
		jsclick((sr.getsaveDropdown()));
		Reporter.log("Click on new search");
		Thread.sleep(3000);
        sr.getnewsearch().click();
        Reporter.log("Enter value into new search textbox");
		sr.getnewsearchvalueenter().sendKeys(readFromExSearch(3, 0));
		Thread.sleep(5000);
		Reporter.log("Enter value in index contains search textbox");
		sendvalue(sr.getIndexContainsSearch(), readFromExSearch(1, 3));
		 movingclkElement(sr.getforSelectDocdropdownicon());
		 Reporter.log("Select a document data type");
	   //  sr.getforSelectDocdropdown().sendKeys(readFromExSearch(1, 2));
	     Thread.sleep(3000);
	     Reporter.log("Selecct a document creator");
		 movingclkElement(sr.getforCVReports());
		sr.getFindButton().click();
		Thread.sleep(5000);
		Reporter.log("Click on 'select saved search' save icon");
		movingElement(sr.getsavebotton());
		
		jsclick(sr.getsavebotton());
		Thread.sleep(3000);
		movingclkElement((sr.getsavedNamecheck()));
		Reporter.log("Mouse hover on saved select search dropdown ");
		Thread.sleep(5000);
		Reporter.log("Click on find");
		sr.getClearButton().click();
		Reporter.log("It should display the searched document on the page");
		Reporter.log("Search tab: searched documents saved functionality working fine");
	}

	@Test(priority=19) // TreeIcon search
	public void Q_FolderSerchIcon() throws Exception {
		SearchFunction sr = new SearchFunction();
		Reporter.log("Scenario 22: Navigation folder icon search");
		Reporter.log("Click on navigation folder search icon");
		jsclick(sr.getfornavigatetofoldersearch());
		Thread.sleep(3000);
		Reporter.log("Enter value into navigation folder search textbox");
		sr.getsearchTree().sendKeys(readFromExSearch(1, 3));
		Thread.sleep(5000);
		Reporter.log("Click on Keyboard ENTER key");
		sr.getsearchTree().sendKeys(Keys.RETURN);// tree search
		Thread.sleep(10000);
		Reporter.log("Folder search dialog should be opened");
		Reporter.log("Searched folder documents display on the dialog box successfully");
		WebElement CloseIcon = driver.findElement(By.xpath("//*[@id=\"FolderSearchModelHeaderClose\"]"));
		jsclick(CloseIcon);
		Reporter.log("Click on folder document close icon");
		Thread.sleep(4000);
		log.info("TreeIcon search functionality works fine");
		

	}

	@Test(priority=20) // Quick search
	public void R_QuickSearch() throws Exception {
		SearchFunction sr = new SearchFunction();
		sr.getquicksearch().sendKeys(readFromExSearch(2, 1));
		Reporter.log("Scenario 23: Search tab - Quick search");
        Thread.sleep(3000);
        Reporter.log("Enter value in quick search textbox");
		sr.getquicksearch().sendKeys(Keys.RETURN);
		Thread.sleep(15000);
		SoftAssert so = new SoftAssert();
		String PageTitle = driver.getTitle();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		 Reporter.log("Click on Keyboard ENTER key");
		wait.until(ExpectedConditions.visibilityOf(sr.getquicksearch()));
		so.assertTrue(PageTitle.contains(readFromExSearch(2, 4)));
		 Reporter.log("It should display searched document on the page successfully...");
		log.info("quick search icon works fine");
	//	Reporter.log("quick search works fine");
		jsclick(Refresh_Button(driver));
	}
	@Test(priority=21)
	public void S_DocumentSearch() throws Exception {
		SearchFunction sr = new SearchFunction();
		Reporter.log("Scenario 24:Folder document search");
		sr.SearchDocumentsTabInPage();
		
		jsclick(Refresh_Button(driver));
		Thread.sleep(5000);
		Reporter.log("The documents Search from folder completed, working fine");
		log.info("The documents Search from folder completed, working fine");
}
}
