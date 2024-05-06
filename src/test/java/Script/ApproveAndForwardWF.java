package Script;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.sun.jna.Function;

import Generic.BaseClass;
import Generic.POM;
import Pom.WorkflowPOM;
import junit.framework.Assert;

public class ApproveAndForwardWF extends BaseClass {
	public static Actions act;
	public static SoftAssert so;

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
	public void Tc02_CreateOfficeNoteDynamicWF() throws Exception {

		WorkflowPOM pojo = new WorkflowPOM();
		pojo.DynamicWorkFlowTodoListFunctionality();
	}

	@Test(priority = 3)
	public void Tc03_EnterOTPDialog() throws Exception {
		Reporter.log("Scenario 02: Validate OTP ");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();
	}

	@Test(priority = 4)
	public void Tc04_SendToWorkflowDialog() throws Exception {
		Reporter.log("Scenario 03: Orginator Sending the document to 'OFFICE NOTES' workflow");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.SendToWorkflowOfficeNote();
	}

	@Test(priority = 5)
	public void Tc05_Originator_Logout() throws Exception {
		Reporter.log("Scenario 04:Orginator Logout the page");
		LogoutPage();
	}

	@Test(priority = 6)
	public void Tc06_Task_User1_Login() throws Exception {
		Reporter.log("Scenario 05:Login as Task User-1 ");
		loginArora();
	}

	@Test(priority = 7)
	public void Tc07_User1_ApproveAndForward_Wf() throws Exception {
		Reporter.log("Scenario 06:Task User-1 'Approve and Forward'");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.ApproveAndForward();
	}

	@Test(priority = 8)
	public void Tc08_User_1_OTP_Validation() throws Exception {
		Reporter.log("Scenario 07:Enter valid OTP ");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();
		driver.manage().timeouts().setScriptTimeout(1000, TimeUnit.MILLISECONDS);
		movingclkElement(pojo.getUserGRPOKBTN());
		Thread.sleep(4000);
	}

	@Test(priority = 9)
	public void Tc09_User_1_EnterCommentAndSendDocumentToNextUser() throws Exception {
		Reporter.log("Scenario 08:Enter Comments  into the 'Approve and Forward' commentbox");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.AcceptAndForWardCommentBox();
		Thread.sleep(4000);
		Reporter.log("Comments added successfully...");
	}

	@Test(priority = 10)
	public void Tc10_TaskUser_1_LogouthePage() throws Exception {
		Reporter.log("Scenario 09:Task User-1 Logout the page");
		LogoutPage();
	}

	@Test(priority = 11)
	public void Tc11_Task_User2_Login() throws Exception {
		Reporter.log("Scenario 10:Login as Task User-2 ");
		loginAlkas();
	}

	@Test(priority = 12)
	public void Tc12_User2_ApproveAndForward_Wf() throws Exception {
		Reporter.log("Scenario 11:Task User-2 'Approve and Forward'");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.ApproveAndForward();
	}

	@Test(priority = 13)
	public void Tc13_User_2_OTP_Validation() throws Exception {
		Reporter.log("Scenario 12:Enter valid OTP ");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();
		driver.manage().timeouts().setScriptTimeout(1000, TimeUnit.MILLISECONDS);
		movingclkElement(pojo.getUserGRPOKBTN());
	
		Thread.sleep(4000);
	}

	@Test(priority = 14)
	public void Tc14_User_2_EnterCommentAndSendDocumentToNextUser() throws Exception {
		Reporter.log("Scenario 13:Enter Comments  into the 'Approve and Forward' commentbox");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.AcceptAndForWardCommentBox();
		Thread.sleep(4000);
		Reporter.log("Comment added successfully...");
	}

	@Test(priority = 15)
	public void Tc15_TaskUser_2_LogouthePage() throws Exception {
		Reporter.log("Scenario 14:Task User-2 Logout the page");
		LogoutPage();
	}

	@Test(priority = 16)
	public void Tc16_Task_User3_Login() throws Exception {
		Reporter.log("Scenario 15:Login as Task User-3 ");
		loginAjitkumar();
	}

	@Test(priority = 17)
	public void Tc17_User3_ApproveAndForward_Wf() throws Exception {
		Reporter.log("Scenario 16:Task User-3 'Approve and Forward' ");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.ApproveAndForward();
	}

	@Test(priority = 18)
	public void Tc18_User_3_OTP_Validation() throws Exception {
		Reporter.log("Scenario 17:Enter valid OTP ");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();
		driver.manage().timeouts().setScriptTimeout(1000, TimeUnit.MILLISECONDS);
		movingclkElement(pojo.getUserGRPOKBTN());
		
		Thread.sleep(4000);
	}

	@Test(priority = 19)
	public void Tc19_User_3_EnterCommentAndSendDocumentToNextUser() throws Exception {
		Reporter.log("Scenario 18:Enter Comments  into the 'Approve and Forward' commentbox");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.AcceptAndForWardCommentBox();
		Thread.sleep(4000);
		Reporter.log("Comment added successfully...");
	}

	@Test(priority = 20)
	public void Tc20_TaskUser_3_LogouthePage() throws Exception {
		Reporter.log("Scenario 19:Task User-3 Logout the page");
		LogoutPage();
	}

	@Test(priority = 21)
	public void Tc21_Task_User4_Login() throws Exception {
		Reporter.log("Scenario 20:Login as Task User-4 ");
		loginAmarnath();
	}

	@Test(priority = 22)
	public void Tc22_User3_ApproveAndForward_Wf() throws Exception {
		Reporter.log("Scenario 21:Task User-4 'Approve and Forward' ");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.ApproveAndForward();
	}

	@Test(priority = 23)
	public void Tc23_User_4_OTP_Validation() throws Exception {
		Reporter.log("Scenario 22:Enter valid OTP");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();
		driver.manage().timeouts().setScriptTimeout(1000, TimeUnit.MILLISECONDS);
		try {
		movingclkElement(pojo.getUserGRPOKBTN());
		}
		catch(JavascriptException e) {
			Reporter.log("Exception Handled successfully...");
		}
		Thread.sleep(4000);
	}

	@Test(priority = 24)
	public void Tc24_User_4_EnterCommentAndSendDocumentToNextUser() throws Exception {
		Reporter.log("Scenario 23:Enter Comments  into the 'Approve and Forward' commentbox");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.AcceptAndForWardCommentBox();
		Thread.sleep(4000);
		Reporter.log("Comment added successfully...");
	}

	@Test(priority = 25)
	public void Tc25_TaskUser_4_LogouthePage() throws Exception {
		Reporter.log("Scenario 24:Task User-4 Logout the page");
		LogoutPage();
	}

	@Test(priority = 26)
	public void Tc26_Task_User5_Login() throws Exception {
		Reporter.log("Scenario 25:Login as Task User-5 ");
		loginSrikanth();
	}

	@Test(priority = 27)
	public void Tc27_User5_ApproveAndEnd_Wf() throws Exception {
		Reporter.log("Scenario 26:Task User-5 'Approve and EndWorkflow' ");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.ApproveAndForward();
	}

	@Test(priority = 28)
	public void Tc28_User_5_OTP_Validation() throws Exception {
		Reporter.log("Scenario 28:Enter valid OTP ");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();

		driver.manage().timeouts().setScriptTimeout(1000, TimeUnit.MILLISECONDS);
		try {
		movingclkElement(pojo.getUserGRPOKBTN());
		}
		catch(JavascriptException e) {
			Reporter.log("Exception Handled successfully...");
		}
		Thread.sleep(4000);
	}
	

	@Test(priority = 29)
	public void Tc29_User_5_EnterCommentAndApporveTheWorkflow() throws Exception {
		Reporter.log("Scenario 28:Enter Comments  into the 'Approve and Approve' commentbox");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.AcceptAndForWardCommentBox();
		
		
		
	}
	
	
	
	@Test(priority = 30)
	public void Tc30_TaskUser_5_LogouthePage() throws Exception {
		Reporter.log("Scenario 29:Task User-5 Logout the page");
		LogoutPage();
	}

	@Test(priority = 31)
	public void Tc31_Task_User6_Login() throws Exception {
		Reporter.log("Scenario 30:Login as Task User-6 ");
		loginArora();
		Thread.sleep(3000);
	}

	@Test(priority = 32)
	public void Tc32_User6_ApproveAndForward_Wf() throws Exception {
		Reporter.log("Scenario 31:Task User-6 'Approve and Forward'");
		WorkflowPOM pojo = new WorkflowPOM();
		jsclick(Refresh_Button(driver));
		Thread.sleep(5000);
		pojo.ApproveAndForward();
	}

	@Test(priority = 33)
	public void Tc33_User_6_OTP_Validation() throws Exception {
		Reporter.log("Scenario 32:Enter valid OTP");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();
		driver.manage().timeouts().setScriptTimeout(1000, TimeUnit.MILLISECONDS);
		try {
			Actions act=new Actions(driver);
		act.moveToElement(pojo.getUserGRPOKBTN()).click(pojo.getUserGRPOKBTN()).build().perform();
		}
		catch(JavascriptException e) {
			Reporter.log("Exception handled");
		}
		Thread.sleep(4000);
	}

	@Test(priority = 34)
	public void Tc34_User_6_EnterCommentAndSendDocumentToNextUser() throws Exception {
		Reporter.log("Scenario 33:Enter Comments  into the 'Approve and Forward' commentbox");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.AcceptAndForWardCommentBox();
		Thread.sleep(4000);
	
		
	}

	
	@Test(priority = 35)
	public void Tc35_TaskUser_6_LogouthePage() throws Exception {
		Reporter.log("Scenario 34:Task User-6 Logout the page");
		LogoutPage();
	}

	@Test(priority = 36)
	public void Tc36_Task_User7_Login() throws Exception {
		Reporter.log("Scenario 35:Login as Task User-7 ");
		loginAlkas();
	}

	@Test(priority = 37)
	public void Tc37_User7_ApproveAndForward_Wf() throws Exception {
		Reporter.log("Scenario 36:Task User-7 'Approve and Forward' ");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.ApproveAndForward();
	}

	@Test(priority = 38)
	public void Tc38_User_7_OTP_Validation() throws Exception {
		Reporter.log("Scenario 38:Enter valid OTP");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();
		driver.manage().timeouts().setScriptTimeout(1000, TimeUnit.MILLISECONDS);
		try {
		jsclick(pojo.getUserGRPOKBTN());
		}
		catch(Exception e) {
			Reporter.log("Exception handled successfully");
		}
		Thread.sleep(4000);
	}

	@Test(priority = 39)
	public void Tc39_User_7_EnterCommentAndSendDocumentToNextUser() throws Exception {
		Reporter.log("Scenario 39:Enter Comments  into the 'Approve and Forward' commentbox");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.AcceptAndForWardCommentBox();
		Thread.sleep(4000);
		
	}

	
	@Test(priority = 40)
	public void Tc40_TaskUser_7_LogouthePage() throws Exception {
		Reporter.log("Scenario 40:Task User-7 Logout the page");
		LogoutPage();
	}

	@Test(priority = 41)
	public void Tc41_Task_User8_Login() throws Exception {
		Reporter.log("Scenario 41:Login as Task User-8 ");
		loginAmarnath();
	}

	@Test(priority = 42)
	public void Tc42_User8_ApproveAndForward_Wf() throws Exception {
		Reporter.log("Scenario 31:Task User-8 'Approve and Forward' ");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.ApproveAndForward();
	}

	@Test(priority = 43)
	public void Tc43_User_8_OTP_Validation() throws Exception {
		Reporter.log("Scenario 43:Enter valid OTP ");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();
		driver.manage().timeouts().setScriptTimeout(1000, TimeUnit.MILLISECONDS);
		movingclkElement(pojo.getUserGRPOKBTN());
	
		Thread.sleep(4000);
	}

	@Test(priority = 44)
	public void Tc44_User_8_EnterCommentAndSendDocumentToNextUser() throws Exception {
		Reporter.log("Scenario 44:Enter Comments  into the 'Approve and Forward' commentbox");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.AcceptAndForWardCommentBox();
		Thread.sleep(4000);
	}

	@Test(priority = 45)
	public void Tc45_TaskUser_8_LogouthePage() throws Exception {
		Reporter.log("Scenario 45:Task User-8 Logout the page");
		LogoutPage();
	}

	@Test(priority = 46)
	public void Tc46_Task_User9_Login() throws Exception {
		Reporter.log("Scenario 46:Login as Task User-9");
		loginSrikanth();
	}

	@Test(priority = 47)
	public void Tc47_User9_ApproveAndForward_Wf() throws Exception {
		Reporter.log("Scenario 47:Task User-9 'Approve and Forward'");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.ApproveAndForward();
	}

	@Test(priority = 48)
	public void Tc48_User_9_OTP_Validation() throws Exception {
		Reporter.log("Scenario 48:Enter valid OTP");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();
		
		driver.manage().timeouts().setScriptTimeout(1000, TimeUnit.MILLISECONDS);
		try {
		movingclkElement(pojo.getUserGRPOKBTN());
		}
		catch(JavascriptException e) {
			Reporter.log("Exception Handled successfully...");
		}
		Thread.sleep(4000);
	}
	

	@Test(priority = 49)
	public void Tc49_User_9_EnterCommentAndSendDocumentToNextUser() throws Exception {
		Reporter.log("Scenario 49:Enter Comments  into the 'Approve and Forward' commentbox");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.AcceptAndForWardCommentBox();
		Thread.sleep(4000);
	}

	
	@Test(priority = 50)
	public void Tc50_TaskUser_9_LogouthePage() throws Exception {
		Reporter.log("Scenario 50:Task User-9 Logout the page");
		LogoutPage();
	}

	@Test(priority = 51)
	public void Tc51_Task_User10_Login() throws Exception {
		Reporter.log("Scenario 51:Login as Task User-10 ");
		loginAjitkumar();
	}

	@Test(priority = 52)
	public void Tc52_User10_ApproveAndEnd_Wf() throws Exception {
		Reporter.log("Scenario 52:Task User-10 'Approve and End' ");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.ApproveAndEndWF();
	}

	@Test(priority = 53)
	public void Tc53_User_10_OTP_Validation() throws Exception {
		Reporter.log("Scenario 53:Enter valid OTP ");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();
	//	jsclick(pojo.getUserGRPOKBTN());
		Thread.sleep(4000);
	}

	@Test(priority = 54)
	public void Tc54_User_10_EnterCommentAndEndTheWF() throws Exception {
		Reporter.log("Scenario 54:Enter Comments  into the 'Approve and End' commentbox");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.AcceptAndForWardCommentBox();
		Thread.sleep(4000);
		
		Reporter.log(
				"Task User-10 'Approve and End' the workflow document Successfully");
		
	}

	
	
	
	
	
	
	

}
