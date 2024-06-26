package Script;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.lang.management.LockInfo;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.sun.corba.se.spi.orbutil.fsm.ActionBase;

import Generic.FailedRetry;
import Pom.Print;
import Pom.TemplatePage;
import Pom.ToDoListTab;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintFunctionality extends Generic.BaseClass {
	
	public static SoftAssert so;

	@BeforeClass
	public void ladBrowser() {
		loadBrowser("Chrome");
		
		launchUrl();
		}

	@Test(priority=1)
	public void LogVCS() throws Exception {
		 loginCVS();
	}

	@Test(enabled = false)
	public void UploadingNewFile() throws InterruptedException, AWTException, IOException {

		Print pojo = new Print();
		movingDoublecli(pojo.getCabinet(), pojo.getCabinet());
		Thread.sleep(3000);
		movingDoublecli(pojo.getDrawer(), pojo.getDrawer());
		Thread.sleep(3000);
		movingDoublecli(pojo.getFolder(), pojo.getFolder());
		Thread.sleep(5000);
		clickElement(pojo.getDocument());
		Thread.sleep(3000);
		TemplatePage.Move_To_PlusIcon(driver);
		TemplatePage.Browse_Option(driver);
		Thread.sleep(3000);

		Runtime.getRuntime().exec("C:\\AutoImage\\FilesAuto_x64.exe");

		Thread.sleep(3000);
		Reporter.log("Uploading new file", true);
	}

	@Test(priority=4)
	public void Email_ConvertPDF_WithAll_Annotations() throws Exception {
		Print pojo = new Print();

		Reporter.log("Verifying Email Functionality", true);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getCheckBox()));
		jsclick(pojo.getCheckBox());
		jsclick(pojo.getSendToIcon());
		Thread.sleep(3000);
		jsclick(pojo.getEmailDoc());
		jsclick(pojo.getConvertPDfCheckbox());
		Thread.sleep(3000);
		sendvalue(pojo.getEnterEmail(),readFromExMail(2, 0));
		Thread.sleep(3000);
		sendvalue(pojo.getSubject(),readFromExMail(3, 2));
		Thread.sleep(3000);
		jsclick(pojo.getForRetainEmail());
		Thread.sleep(3000);
		jsclick(pojo.getForemaliPasswrd());
		Thread.sleep(3000);
		movingElement(pojo.getForezipPasswrd());
		sendvalue(pojo.getForezipPasswrd(), readFromExMail(1, 3));
		jsclick(pojo.getEmailSendOk());
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getEmailsuccessMessageDialogboxOK()));
		jsclick(pojo.getEmailsuccessMessageDialogboxOK());
		Thread.sleep(15000);
		
		Reporter.log("Email Functionality with all annotation settings,sent successfull", true);
	}

	@Test(priority=2)
	public void Email_Reference() throws Exception {
		Print pojo = new Print();
      
        movingDoublecli(pojo.getCabinet(), pojo.getCabinet());
		Thread.sleep(3000);
		movingDoublecli(pojo.getDrawer(), pojo.getDrawer());
		Thread.sleep(3000);
		movingDoublecli(pojo.getFolder(), pojo.getFolder());
		Thread.sleep(5000);
		jsclick(pojo.getDocument());
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		    acceptAlert();  
		Thread.sleep(3000);
		jsclick(pojo.getCheckBox());
		jsclick(pojo.getSendToIcon());
		Thread.sleep(3000);
		jsclick(pojo.getEmailDoc());
		Thread.sleep(3000);
		jsclick(pojo.getReferenceEmail());
		Thread.sleep(3000);
		sendvalue(pojo.getEnterEmail(), readFromExMail(1, 0));
		jsclick(pojo.getEmailSendOk());
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getEmailsuccessMessageDialogboxOK()));
		jsclick(pojo.getEmailsuccessMessageDialogboxOK());
		Thread.sleep(15000);
		
		Reporter.log("Reference Email sent successfull", true);

	}

	@Test(priority=3,retryAnalyzer=FailedRetry.class)
	public void Email_Copy_WithMsgBox_SubjectBox() throws Exception {
		Print pojo = new Print();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getCheckBox()));
        jsclick(pojo.getCheckBox());
		jsclick(pojo.getSendToIcon());
		Thread.sleep(3000);
		jsclick(pojo.getEmailDoc());
		jsclick(pojo.getCopyEmail());
		Thread.sleep(3000);
		sendvalue(pojo.getEnterEmail(), readFromExMail(2, 0));
		sendvalue(pojo.getSubject(),  readFromExMail(1, 2));
		Thread.sleep(4000);
		sendvalue(pojo.getMessageBox(),  readFromExMail(2, 2));
		Thread.sleep(4000);
		jsclick(pojo.getEmailSendOk());
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getEmailsuccessMessageDialogboxOK()));
		jsclick(pojo.getEmailsuccessMessageDialogboxOK());
		Thread.sleep(15000);
		
		Reporter.log("Copy Email sent successfull", true);

	}




	@Test(priority=5)
	public void exports_with_convert_to_pdf_with_passwords() throws Exception {
		Print pojo = new Print();

		Reporter.log("Verifying Export Functionality convertToPDF with Zippassword and convertToPdF password option ",
				true);
		Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(pojo.getCheckBox()));
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getCheckBox()));
		clickElement(pojo.getCheckBox());
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getSendToIcon()));
		jsclick(pojo.getSendToIcon());
		Thread.sleep(3000);
		jsclick(pojo.getExportDialog());
		jsclick(pojo.getExportCovertPDFcheckbx());
		Thread.sleep(2000);
		jsclick(pojo.getExpzippwrdcheckbxg());
		pojo.getExpzippwrdcheckbxg().sendKeys( readFromExMail(1, 3));
		Thread.sleep(3000);
		pojo.getExpPDFpaswrdbox().sendKeys( readFromExMail(2, 3));
		Thread.sleep(3000);
		jsclick(pojo.getEmailSendOk());
		Thread.sleep(15000);
		Reporter.log("exporting documents dialog displayed", true);

	}

	@Test(priority=6)
	public void exports_with_Retain() throws Exception {
		Print pojo = new Print();
		Reporter.log("verifying export functionality retain format,with average quality and zip password", true);
		Thread.sleep(10000);
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(pojo.getCheckBox()));
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getCheckBox()));
		jsclick(pojo.getCheckBox());
		jsclick(pojo.getSendToIcon());
		Thread.sleep(3000);
		jsclick(pojo.getExportDialog());
		Thread.sleep(5000);
		jsclick(pojo.getExpretainchkbox());
	    Thread.sleep(5000);
		pojo.getExpzippwrdcheckbxg().sendKeys( readFromExMail(3, 3));
		Thread.sleep(3000);
		jsclick(pojo.getEmailSendOk());
		Reporter.log("verifying export functionality retain format,with zip password", true);
		Thread.sleep(15000);

	}

	@Test(priority=7)
	public void exports_with_convert_to_pdf_and_best_quality() throws Exception {
		Print pojo = new Print();

		Reporter.log(
				"verifying export functionality covertToPDF format,with best quality and zip password,PDF password,Export with annotations,unlock redactions with delimit password options",
				true);
		Thread.sleep(15000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(pojo.getCheckBox()));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(pojo.getCheckBox()));
		jsclick(pojo.getCheckBox());
		jsclick(pojo.getSendToIcon());
		Thread.sleep(3000);
		jsclick(pojo.getExportDialog());
		Thread.sleep(3000);
		jsclick(pojo.getExportCovertPDFcheckbx());
		movingclkElement(pojo.getExpQualitydropdwn());
		jsclick(pojo.getExpBestQuality());
		Thread.sleep(2000);
		pojo.getExpzippwrdcheckbxg().sendKeys( readFromExMail(4, 3));
		Thread.sleep(3000);
		pojo.getExpPDFpaswrdbox().sendKeys( readFromExMail(5, 3));
		Thread.sleep(3000);
		jsclick(pojo.getExpWithannotations());
		jsclick(pojo.getExpunlockredbox());
		Thread.sleep(3000);
		pojo.getExpUnlockRedPasswrd().sendKeys( readFromExMail(2, 1));
		jsclick(pojo.getEmailSendOk());
		Reporter.log("the document export with convert to pdf and best quality succcessfully", true);
		Thread.sleep(15000);

 }

	@Test(priority=8)
	public void exports_with_convert_to_pdf_and_include_workflow_summary() throws InterruptedException {
		Print pojo = new Print();
		Thread.sleep(8000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(pojo.getCheckBox()));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(pojo.getCheckBox()));
		jsclick(pojo.getCheckBox());
		jsclick(pojo.getSendToIcon());
		Thread.sleep(3000);
		jsclick(pojo.getExportDialog());
		Thread.sleep(3000);
		jsclick(pojo.getExportCovertPDFcheckbx());
		Thread.sleep(3000);
		jsclick(pojo.getExpIncludewrkflwchkbox());
		Thread.sleep(3000);
		jsclick(pojo.getEmailSendOk());
		Reporter.log("the document exports with convert to pdf and include workflow summary succcessfully", true);
		Thread.sleep(15000);

	}
  
  
   /* @Test(priority=9)
  public void PrintWithcertifiedCoverPageUnlockRedaction() throws InterruptedException, AWTException,IOException {
		POM pojo = new POM();
		movingDoublecli(pojo.getCabinet(), pojo.getCabinet());
		Thread.sleep(3000);
		movingDoublecli(pojo.getDrawer(), pojo.getDrawer());
		Thread.sleep(3000);
		movingDoublecli(pojo.getFolder(), pojo.getFolder());
		Thread.sleep(5000);

		clickElement(pojo.getDocument());
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		acceptAlert();
		jsclick(pojo.getCheckBox());
		Thread.sleep(3000);
		
		 jsclick(pojo.getSendToIcon());
		 Thread.sleep(3000);
		 jsclick(pojo.getDocPrint()); 
		 Thread.sleep(3000);
		jsclick(pojo.getCertifiedPageCheckbox());
		jsclick(pojo.getBlackoutCheckbox());
		Thread.sleep(3000);
		jsclick(pojo.getforincludewrkflowcheckbx());
		Thread.sleep(3000);
		jsclick(pojo.getUnlockRedaction());
		
		sendvalue(pojo.getUnlockRedactionPasswrd(),  readFromExMail(2, 3));
		 jsclick(pojo.getOKbuttonprintpage());
		Reporter.log("The print page displayed successfully with selected document", true);

		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.print();");
		
		Thread.sleep(15000);

		Runtime.getRuntime().exec("C:\\AutoImage\\SaveDoc.exe");

  }*/
  }


 /** Robot r=new Robot(); String fol="nisha"; for (char c:fol.toCharArray()) { int
 * keyCode=KeyEvent.getExtendedKeyCodeForChar(c); r.keyPress(keyCode);
 * r.keyRelease(keyCode); } r.keyPress(KeyEvent.VK_ENTER);
 * r.keyRelease(KeyEvent.VK_ENTER);
 * 
 * r.keyPress(KeyEvent.VK_ENTER); r.keyRelease(KeyEvent.VK_ENTER);
 
*/