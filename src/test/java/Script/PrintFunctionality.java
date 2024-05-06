package Script;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.lang.management.LockInfo;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.sun.corba.se.spi.orbutil.fsm.ActionBase;

import Generic.BaseClass;
import Generic.FailedRetry;
import Pom.Print;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintFunctionality extends BaseClass {

	public static SoftAssert so;
	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(PrintFunctionality.class);

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

	



	

	@Test(priority = 2)
	public void TC02_SIDBI_exports_with_Retain() throws Exception {
		Print pojo = new Print();
		Reporter.log("Scenario 01:verifying export functionality retain format,with zip password",
				true);
		Thread.sleep(4000);
		selectElement(pojo.getTestCabExpIcon());
		Reporter.log("Expand the cabinet");
		Thread.sleep(4000);
		VisiblityOf(pojo.getTesttestDrawerExpIcon());
		selectElement(pojo.getTesttestDrawerExpIcon());
		Reporter.log("Expand the drawer");
		Thread.sleep(3000);
		Reporter.log("Click on the folder");
		try {
			driver.manage().timeouts().setScriptTimeout(2000, TimeUnit.MILLISECONDS);
			selectElement(pojo.getVidyaTestFolder());
			}
			catch(JavascriptException e) {
				Reporter.log("Exception Handled");
			}
		
		Thread.sleep(5000);
		jsclick(pojo.getDocument());
		Reporter.log("Open a document");
		Thread.sleep(7000);
		try {
			if (pojo.getLockeddoc().isDisplayed()) {

				WebElement element1 = driver.findElement(By.xpath("//*[@id=\"ownershipMessageModelOk\"]"));
				jsclick(element1);
			}
		} catch (Exception e) {
			Reporter.log("Locked message displayed", true);
			Thread.sleep(2000);
		}

		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			log.info("AlertISNotPresent");
		}
		Thread.sleep(3000);
		Thread.sleep(10000);
	
		wait.until(ExpectedConditions.visibilityOf(pojo.getCheckBox()));
		Reporter.log("Open a document and select a page");
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getCheckBox()));
		Reporter.log("Click on SendTo tool icon");
		jsclick(pojo.getCheckBox());
		Reporter.log("Select Export submenu");
		Reporter.log("Export dialog should be open");
		jsclick(pojo.getSendToIcon());
		Thread.sleep(3000);
		Reporter.log("Select 'Retain' Radio button");
		jsclick(pojo.getExportDialog());
		Thread.sleep(5000);
		jsclick(pojo.getExpretainchkbox());
		
		Thread.sleep(5000);
		pojo.getExpzippwrdcheckbxg().sendKeys("Nisha");
		Reporter.log("Enter password into 'Zip password' textbox");
		Reporter.log("Click on export dialog OK button");
		Reporter.log("It should display 'Please Wait Exporting Document' Alert on the page");
		Thread.sleep(3000);
		jsclick(pojo.getEmailSendOk());
		Reporter.log("Document Exported with Retain format Successfully...");
		Thread.sleep(15000);

	}

	

}



