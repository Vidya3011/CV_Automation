package Script;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic.BaseClass;
import Pom.WorkflowPOM;

public class ApproveAndPSRWorkFlow  extends BaseClass {
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

		loginAlkas();

	}

	@Test(priority = 2)
	public void Tc02_CreateOfficeNoteDynamicWF() throws Exception {

		WorkflowPOM pojo = new WorkflowPOM();
		pojo.DynamicWorkFlow_OFFICENOTES_ApproveAndReWork();
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
		Reporter.log("Scenario 05:Task User-1 Log into SIDBIDMSRoom");
		loginArora();
	}

	@Test(priority = 7)
	public void Tc07_User1_ApproveAndForward_Wf() throws Exception {
		Reporter.log("Scenario 06:Task User-1 'Approve and Forward' the NewItems workflow document");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.ApproveAndForward();
	}

	@Test(priority = 8)
	public void Tc08_User_1_OTP_Validation() throws Exception {
		Reporter.log("Scenario 07:Enter valid OTP to send the document to Next Task User");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();
		jsclick(pojo.getUserGRPOKBTN());
		Thread.sleep(4000);
	}

	@Test(priority = 9)
	public void Tc09_User_1_EnterCommentAndSendDocumentToNextUser() throws Exception {
		Reporter.log("Scenario 08:Enter Comments  into the 'Approve and Forward' commentbox");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.AcceptAndForWardCommentBox();
		Thread.sleep(4000);
		Reporter.log("Task User-1 Add commments 'Approve and Forward' the document to 2nd Task User Succssfully...");
	}

	@Test(priority = 10)
	public void Tc10_TaskUser_1_LogouthePage() throws Exception {
		Reporter.log("Scenario 09:Task User-1 Logout the page");
		LogoutPage();
	}

	@Test(priority = 11)
	public void Tc11_Task_User2_Login() throws Exception {
		Reporter.log("Scenario 10:Task User-2 Log into SIDBIDMSRoom");
		loginAlkas();
	}

	@Test(priority = 12)
	public void Tc12_User2_ApproveAndForward_Wf() throws Exception {
		Reporter.log("Scenario 11:Task User-2 'Approve and Forward' the NewItems workflow document");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.ApproveAndForward();
	}

	@Test(priority = 13)
	public void Tc13_User_2_OTP_Validation() throws Exception {
		Reporter.log("Scenario 12:Enter valid OTP to send the document to Next Task User");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();
		jsclick(pojo.getUserGRPOKBTN());
		Thread.sleep(4000);
	}

	@Test(priority = 14)
	public void Tc14_User_2_EnterCommentAndSendDocumentToNextUser() throws Exception {
		Reporter.log("Scenario 13:Enter Comments  into the 'Approve and Forward' commentbox");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.AcceptAndForWardCommentBox();
		Thread.sleep(4000);
		Reporter.log("Task User-2 Add commments 'Approve and Forward' the document to 3rd Task User Succssfully...");
	}

	@Test(priority = 15)
	public void Tc15_TaskUser_2_LogouthePage() throws Exception {
		Reporter.log("Scenario 14:Task User-2 Logout the page");
		LogoutPage();
	}

	@Test(priority = 16)
	public void Tc16_Task_User3_Login() throws Exception {
		Reporter.log("Scenario 15:Task User-3 Log into SIDBIDMSRoom");
		loginAjitkumar();
	}

	@Test(priority = 17)
	public void Tc17_User3_ApproveAndForward_Wf() throws Exception {
		Reporter.log("Scenario 16:Task User-3 'Approve and Forward' the NewItems workflow document");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.ApproveAndForward();
	}

	@Test(priority = 18)
	public void Tc18_User_3_OTP_Validation() throws Exception {
		Reporter.log("Scenario 17:Enter valid OTP to send the document to Next Task User");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();
		jsclick(pojo.getUserGRPOKBTN());
		Thread.sleep(4000);
	}

	@Test(priority = 19)
	public void Tc19_User_3_EnterCommentAndSendDocumentToNextUser() throws Exception {
		Reporter.log("Scenario 18:Enter Comments  into the 'Approve and Forward' commentbox");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.AcceptAndForWardCommentBox();
		Thread.sleep(4000);
		Reporter.log("Task User-3 Add commments 'Approve and Forward' the document to  Ta4th Task User Succssfully...");
	}

	@Test(priority = 20)
	public void Tc20_TaskUser_3_LogouthePage() throws Exception {
		Reporter.log("Scenario 19:Task User-3 Logout the page");
		LogoutPage();
	}

	@Test(priority = 21)
	public void Tc21_Task_User4_Login() throws Exception {
		Reporter.log("Scenario 20:Task User-4 Log into SIDBIDMSRoom");
		loginAmarnath();
	}

	@Test(priority = 22)
	public void Tc22_User3_ApproveAndForward_Wf() throws Exception {
		Reporter.log("Scenario 21:Task User-4 'Approve and Forward' the NewItems workflow document");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.ApproveAndForward();
	}

	@Test(priority = 23)
	public void Tc23_User_4_OTP_Validation() throws Exception {
		Reporter.log("Scenario 22:Enter valid OTP to send the document to Next Task User");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();
		jsclick(pojo.getUserGRPOKBTN());
		Thread.sleep(4000);
	}

	@Test(priority = 24)
	public void Tc24_User_4_EnterCommentAndSendDocumentToNextUser() throws Exception {
		Reporter.log("Scenario 23:Enter Comments  into the 'Approve and Forward' commentbox");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.AcceptAndForWardCommentBox();
		Thread.sleep(4000);
		Reporter.log("Task User-4 Add commments 'Approve and Forward' the document to 5th Task User Succssfully...");
	}

	@Test(priority = 25)
	public void Tc25_TaskUser_4_LogouthePage() throws Exception {
		Reporter.log("Scenario 24:Task User-4 Logout the page");
		LogoutPage();
	}

	@Test(priority = 26)
	public void Tc26_Task_User5_Login() throws Exception {
		Reporter.log("Scenario 25:Task User-5 Log into SIDBIDMSRoom");
		loginSrikanth();
	}

	@Test(priority = 27)
	public void Tc27_User5_ApproveAndEnd_Wf() throws Exception {
		Reporter.log("Scenario 26:Task User-5 'Approve and EndWorkflow' the workflow document");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.ApproveAndForward();
	}

	@Test(priority = 28)
	public void Tc28_User_5_OTP_Validation() throws Exception {
		Reporter.log("Scenario 27:Enter valid OTP to send the document to End the Workflow");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();

		Thread.sleep(4000);
	}

	@Test(priority = 29)
	public void Tc29_User_5_EnterCommentAndApporveTheWorkflow() throws Exception {
		Reporter.log("Scenario 28:Enter Comments  into the 'Approve and Approve' commentbox");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.AcceptAndForWardCommentBox();
		Thread.sleep(4000);
		Reporter.log(
				"Task User-5 Add commments in 'Approve and Approve workflow' dialog box. The workflow document Move to next user Succssfully...");
	}
	
	
	
	@Test(priority = 30)
	public void Tc30_TaskUser_5_LogouthePage() throws Exception {
		Reporter.log("Scenario 29:Task User-5 Logout the page");
		LogoutPage();
	}

	@Test(priority = 31)
	public void Tc31_Task_User6_Login() throws Exception {
		Reporter.log("Scenario 30:Task User-6 Log into SIDBIDMSRoom");
		loginArora();
	}

	@Test(priority = 32)
	public void Tc32_User6_ApproveAndForward_Wf() throws Exception {
		Reporter.log("Scenario 31:Task User-6 'Approve and Forward' the NewItems workflow document");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.ApproveAndForward();
	}

	@Test(priority = 33)
	public void Tc33_User_6_OTP_Validation() throws Exception {
		Reporter.log("Scenario 32:Enter valid OTP to send the document to Next Task User");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();
		jsclick(pojo.getUserGRPOKBTN());
		Thread.sleep(4000);
	}

	@Test(priority = 34)
	public void Tc34_User_6_EnterCommentAndSendDocumentToNextUser() throws Exception {
		Reporter.log("Scenario 33:Enter Comments  into the 'Approve and Forward' commentbox");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.AcceptAndForWardCommentBox();
		Thread.sleep(4000);
		Reporter.log("Task User-6 Add commments 'Approve and Forward' the document to 6th Task User Succssfully...");
	}

	
	@Test(priority = 35)
	public void Tc35_TaskUser_6_LogouthePage() throws Exception {
		Reporter.log("Scenario 34:Task User-6 Logout the page");
		LogoutPage();
	}

	@Test(priority = 36)
	public void Tc36_Task_User7_Login() throws Exception {
		Reporter.log("Scenario 35:Task User-7 Log into SIDBIDMSRoom");
		loginAlkas();
	}

	@Test(priority = 37)
	public void Tc37_User7_ApproveAndForward_Wf() throws Exception {
		Reporter.log("Scenario 36:Task User-7 'Approve and Forward' the NewItems workflow document");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.ApproveAndForward();
	}

	@Test(priority = 38)
	public void Tc38_User_7_OTP_Validation() throws Exception {
		Reporter.log("Scenario 38:Enter valid OTP to send the document to Next Task User");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();
		jsclick(pojo.getUserGRPOKBTN());
		Thread.sleep(4000);
	}

	@Test(priority = 39)
	public void Tc39_User_7_EnterCommentAndSendDocumentToNextUser() throws Exception {
		Reporter.log("Scenario 39:Enter Comments  into the 'Approve and Forward' commentbox");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.AcceptAndForWardCommentBox();
		Thread.sleep(4000);
		Reporter.log("Task User-7 Add commments 'Approve and Forward' the document to 8th Task User Succssfully...");
	}
}