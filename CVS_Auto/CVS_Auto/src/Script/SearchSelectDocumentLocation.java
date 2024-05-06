package Script;

import java.util.ArrayList;
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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pom.SearchFunction;
import io.github.bonigarcia.wdm.WebDriverManager;
import okhttp3.internal.connection.RouteSelector.Selection;

public class SearchSelectDocumentLocation extends Generic.BaseClass {
	public static Actions act;

	@BeforeClass
	public void ladBrowser() {
		loadBrowser("Chrome");
		launchUrl();
	}

	@Test(priority=1)
	public void CVSLogin() {
		loginCVS();
	}

     @Test(priority=3) // enter value in indexcontains with exact search 
	public void ExactSearchInIndex() throws InterruptedException {
		SearchFunction sr = new SearchFunction();
		jsclick(sr.getSearchTab());
	   Thread.sleep(5000);
		act = new Actions(driver);
		
		act.moveToElement(sr.getIndexContainsSearch()).click().build().perform();
		sendvalue(sr.getIndexContainsSearch(), "vidya");
		Thread.sleep(5000);
		jsclick(sr.getFindButton());
		Thread.sleep(8000);
		jsclick(sr.getMetadata());
		Thread.sleep(10000);
		jsclick(sr.getClearButton());
		Reporter.log("Searchfunctionality with exact phrase index search", true);

	}

	@Test(priority=15) // AlloftheWords search
	public void TextSearchWithAllOftheWords() throws InterruptedException {
		SearchFunction sr = new SearchFunction();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		(sr.getfortextcontainsdrpdwnicon()).click();;
	     Thread.sleep(3000);
		movingclkElement(sr.getforallofthewordsinText());
		movingclkElement(sr.getTextContainsSearch());
		sendvalue(sr.getTextContainsSearch(), "contentverse");
		jsclick(sr.getFindButton());
		Thread.sleep(3000);
	    jsclick(sr.getopendocfortext());
	    Thread.sleep(3000);
	    wait.until(ExpectedConditions.alertIsPresent());
	    acceptAlert();
	    jsclick(sr.gethighlightdocview());
	    Thread.sleep(3000);
	    Refresh_Button(driver);
		Reporter.log(" verify Search text contains functionality with all of the words option.", true);
	}

	@Test (priority=2)// blank search
	public void BlankSearch() throws InterruptedException {
		SearchFunction sr = new SearchFunction();
		Thread.sleep(3000);
		jsclick(sr.getSearchTab());
		Thread.sleep(5000);
		jsclick(sr.getFindButton());
		Thread.sleep(10000);
		jsclick(sr.getClearButton());
		Reporter.log("verify Search  functionality with blank option.", true);
	}

	@Test(enabled=false) // atleastOneof the word search
	public void TextSearchAtleastoneofwordIncludeComments() throws InterruptedException {
		SearchFunction sr = new SearchFunction();
		Thread.sleep(3000);
		jsclick(sr.getSearchTab());
		Thread.sleep(3000);
		(sr.getfortextcontainsdrpdwnicon()).click();
		Thread.sleep(3000);
		jsclick(sr.getforExactPhraseText());
		movingclkElement(sr.getTextContainsSearch());
		sr.getTextContainsSearch().sendKeys("addtional information");
		jsclick(sr.getFindButton());
		Thread.sleep(8000);
		jsclick(sr.getopendocfortext());
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		acceptAlert();*/
		Thread.sleep(10000);
		Reporter.log("verify Search text contains functionality with atleast one of the words option.", true);
	}



	@Test (priority=4)// atleast one word
	public void AtLeastOneWordSeachIndex() throws InterruptedException {
		SearchFunction sr = new SearchFunction();
	
		jsclick(sr.getSearchTab());
		Thread.sleep(3000);
		VisiblityOf(sr.getForIndxdropdwnicon());
		movingclkElement(sr.getForIndxdropdwnicon());
		jsclick(sr.getForatleastoneword());
		movingclkElement(sr.getIndexContainsSearch());
		sendvalue(sr.getIndexContainsSearch(), "documents");
		movingclkElement(sr.getFindButton());
		Thread.sleep(10000);
		jsclick(sr.getClearButton());
		Reporter.log(" verify Index contains search:atleast one of the words search", true);
	}
		@Test(priority=5) // allofthe word search
	public void AllOfTheWordSearchIndex() throws InterruptedException {
		SearchFunction sr = new SearchFunction();
		Thread.sleep(5000);
		movingElement(sr.getForIndxdropdwnicon());
		jsclick(sr.getforAllofthewords());
		sendvalue(sr.getIndexContainsSearch(), "TestDocument");
		jsclick(sr.getFindButton());
		
		
		Thread.sleep(10000);
		jsclick(sr.getClearButton());
		Reporter.log(" verify Index contains search:all of the word search", true);
	}
	
	
	 @Test (priority=6)
		public void AllVrsn_Incldcmnt_FindInHit_AppendToHit() throws InterruptedException {
			SearchFunction sr = new SearchFunction();
			Thread.sleep(3000);
		    movingclkElement(sr.getIndexContainsSearch());
			sendvalue(sr.getIndexContainsSearch(), "nisha");
			movingclkElement(sr.getFindButton());
			Thread.sleep(8000);
			(sr.getIndexContainsSearch()).clear();
			Thread.sleep(3000);
			sr.getAppendToHitlist().click();
			movingclkElement(sr.getIndexContainsSearch());
			sendvalue(sr.getIndexContainsSearch(), "dfsd");
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
			sendvalue(sr.getTextContainsSearch(), "vidya");
			movingclkElement(sr.getFindButton());
			Thread.sleep(10000);
			jsclick(sr.getMetadata());
			Thread.sleep(8000);
			jsclick(sr.getforComments());
			Thread.sleep(5000);
			sr.getCancelComments().click();
			Thread.sleep(5000);
			sr.getClearButton().click();
			Thread.sleep(3000);
			movingElement(sr.getForIndxdropdwnicon());
			jsclick(sr.getforExactPhraseinde());
			sendvalue(sr.getIndexContainsSearch(), "Nisha New Test folder");
			sr.getAllVersion().click();
	        movingclkElement(sr.getFindButton());
	        Thread.sleep(10000);
	      /*  jsclick(sr.getMetadata());
	        Thread.sleep(3000);
	        WebDriverWait wait=new WebDriverWait(driver,30);
	        wait.until(ExpectedConditions.visibilityOf(sr.getforallversionshows()));
			sr.getforallversionshows().click();*/
			Thread.sleep(8000);
			sr.getClearButton();
			Reporter.log(" verify Allversion/include comments/appendtohitlist /find in hit list functionality working fine", true);
		}
	
	@Test(priority=7) // Cabinet/drawer/folder level search in search document location
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

	@Test(priority=8) // Cabinet/drawer/ level search in search document location
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

	@Test(priority=9) // Cabinet level search in search document location
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
	
 @Test (priority=10)
	public void DocumentDropDown() throws InterruptedException {
		SearchFunction sr = new SearchFunction();
        movingclkElement(sr.getforSelectDocdropdownicon());
       sr.getforSelectDocdropdown().sendKeys("CVReports1");
       Thread.sleep(3000);
	    movingclkElement(sr.getforCVReports());
	    jsclick(sr.getFindButton());
	    Thread.sleep(10000);
		jsclick(sr.getClearButton());
		
		Reporter.log(
				"Select document type dropdown: Enter CVReport and click cvreports it will show the cvreports documents.",
				true);
		}
@Test (priority=11)// enter value in field and select the user
	public void DocumentCreatorDropDown() throws InterruptedException {
		SearchFunction sr = new SearchFunction();
		jsclick(sr.getSearchTab());
		Thread.sleep(5000);
        movingclkElement(sr.getforSelectcreatordropdown());
		sr.getforSelectcreatordropdownicon().sendKeys("Nisha");
		Thread.sleep(3000);
		movingclkElement(sr.getforNishacreator());
		sr.getFindButton().click();
		Thread.sleep(10000);
		sr.getClearButton().click();
}

	@Test(priority=12)
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

	@Test(priority=13)
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

	

	@Test(priority=14) // showing saved documents
	public void SavingTheSearchDoc() throws InterruptedException {
		SearchFunction sr = new SearchFunction();
		jsclick(sr.getSearchTab());
		jsclick((sr.getsaveDropdown()));
		Thread.sleep(3000);
        sr.getnewsearch().click();
		sr.getnewsearchvalueenter().sendKeys("NisNewDoc");
		Thread.sleep(5000);
		sendvalue(sr.getIndexContainsSearch(), "vidya");
		 movingclkElement(sr.getforSelectDocdropdownicon());
	     sr.getforSelectDocdropdown().sendKeys("CVReports1");
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

	@Test(enabled=false) // TreeIcon search
	public void FolderSerchIcon() throws InterruptedException {
		SearchFunction sr = new SearchFunction();
		jsclick(sr.getfornavigatetofoldersearch());
		Thread.sleep(3000);
		sr.getsearchTree().sendKeys("vidya");
		Thread.sleep(5000);
		sr.getsearchTree().sendKeys(Keys.RETURN);// tree search
		Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(sr.getsearchTree()));
		Reporter.log("TreeIcon search functionality works fine", true);

	}

	@Test(priority=18) // Quick search
	public void QuickSearch() throws InterruptedException {
		SearchFunction sr = new SearchFunction();
		sr.getquicksearch().sendKeys("pujita");

		sr.getquicksearch().sendKeys(Keys.RETURN);
		Thread.sleep(15000);// quicksearch
		SoftAssert so = new SoftAssert();
		String PageTitle = driver.getTitle();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(sr.getquicksearch()));
		so.assertTrue(PageTitle.contains("Contentverse"));
		Reporter.log("quick search icon works fine", true);
	}

}
