package Script;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Pom.WorkflowPOM;

public class AddingUserOneByOne extends BaseClass {
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
		pojo.DynamicWorkFlow_With_5Users();
		
	}

	@Test(priority = 3)
	public void Tc03_EnterOTPDialog() throws Exception {
		Reporter.log("Scenario 02: Validate OTP ");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();
	}

	@Test(priority = 4)
	public void Tc04_SendToWorkflowDialog() throws Exception {
		Reporter.log("Scenario 03: Orginator Send the document to 'OFFICE NOTES' workflow");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.SendToWorkflowOfficeNote();
	}

	@Test(priority = 5)
	public void Tc05_Originator_LogouthePage() throws Exception {
		Reporter.log("Scenario 4:Originator Logout the page");
		LogoutPage();
	}

	@Test(priority = 6)
	public void Tc06_Task_User1_Login() throws Exception {
		Reporter.log("Scenario 5:Login as 'Task User-1'");
		loginArora();
	}

	@Test(priority =7)
	public void Tc07_User1_ApproveAnd_PSR() throws Exception {
		Reporter.log("Scenario 7:Task User-1 'Approve and PSR'");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.ApproveAndPSRDocument();
	}

	@Test(priority = 8)
	public void Tc08_User_1_OTP_Validation() throws Exception {
		Reporter.log("Scenario 8:Enter valid OTP ");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();

		Thread.sleep(4000);
	}

	@Test(priority = 9)
	public void Tc09_User_1_Add_One_More_Task_User() throws Exception {
		Reporter.log("Scenario 9 : Add a Next User");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.selectUser_8();
		Reporter.log("Next Task User Added Successfully...");
		Thread.sleep(4000);
	}
	
	@Test(priority = 10)
	public void Tc10_User_1_EnterCommentAndApprovedPSR() throws Exception {
		Reporter.log("Scenario 10:Enter Comments  into the 'Approve and PSR' commentbox");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.AcceptAndForWardCommentBox();
		Thread.sleep(4000);
	}
	

	@Test(priority =11)
	public void Tc11_TaskUser_1_LogouthePage() throws Exception {
		Reporter.log("Scenario 11:Task User-1 Logout the page");
		LogoutPage();
	}

	@Test(priority = 12)
	public void Tc12_Task_User1_Login() throws Exception {
		Reporter.log("Scenario 12:Login as Task User-2");
		loginAlkas();
	}

	@Test(priority =13)
	public void Tc13_User2_ApproveAnd_PSR() throws Exception {
		Reporter.log("Scenario 13:Task User-2 'Approve and PSR'");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.ApproveAndPSRDocument();
	}

	@Test(priority = 14)
	public void Tc14_User_2_OTP_Validation() throws Exception {
		Reporter.log("Scenario 14:Enter valid OTP");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();

		Thread.sleep(4000);
	}

	@Test(priority = 15)
	public void Tc15_User_2_Add_One_More_Task_User() throws Exception {
		Reporter.log("Scenario 15 : Add Next Task User");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.selectUser_7();
		Reporter.log("Next Task User Added Successfully...");
		Thread.sleep(4000);
	}
	
	@Test(priority = 16)
	public void Tc16_User_2_EnterCommentAndApprovedPSR() throws Exception {
		Reporter.log("Scenario 16:Enter Comments into 'Approve and PSR' commentbox");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.AcceptAndForWardCommentBox();
		Thread.sleep(4000);
	}
	
	@Test(priority = 17)
	public void Tc17_TaskUser_2_LogouthePage() throws Exception {
		Reporter.log("Scenario 17:Task User-2 Logout the page");
		LogoutPage();
	}
	@Test(priority = 18)
	public void Tc18_Task_User3_Login() throws Exception {
		Reporter.log("Scenario 18:Login as Task User-3");
		loginAmarnath();
	}

	@Test(priority =19)
	public void Tc19_User3_ApproveAnd_PSR() throws Exception {
		Reporter.log("Scenario 19:Task User-3 'Approve and PSR' ");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.ApproveAndPSRDocument();
	}

	@Test(priority = 20)
	public void Tc20_User_3_OTP_Validation() throws Exception {
		Reporter.log("Scenario 20:Enter valid OTP");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();

		Thread.sleep(4000);
	}

	@Test(priority = 21)
	public void Tc21_User__3Add_One_More_Task_User() throws Exception {
		Reporter.log("Scenario 21 : Add Next Task User");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.selectUser_6();//ajit
		Reporter.log("Next Task User Added Successfully...");
		Thread.sleep(4000);
	}
	
	@Test(priority = 22)
	public void Tc22_User_3_EnterCommentAndApprovedPSR() throws Exception {
		Reporter.log("Scenario 22:Enter Comments into 'Approve and PSR' commentbox");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.AcceptAndForWardCommentBox();
		Thread.sleep(4000);
	}
	
	
	@Test(priority = 23)
	public void Tc23_TaskUser__3_LogouthePage() throws Exception {
		Reporter.log("Scenario 23:Task User-3 Logout the page");
		LogoutPage();
	}
	@Test(priority = 24)
	public void Tc24_Task_User4_Login() throws Exception {
		Reporter.log("Scenario 24:Login as Task User-4");
		loginAjitkumar();
	}

	@Test(priority =25)
	public void Tc25_User5_ApproveAnd_PSR() throws Exception {
		Reporter.log("Scenario 25:Task User-4 'Approve and PSR'");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.ApproveAndPSRDocument();
	}

	@Test(priority = 26)
	public void Tc26_User_4_OTP_Validation() throws Exception {
		Reporter.log("Scenario 26:Enter valid OTP");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();

		Thread.sleep(4000);
	}

	@Test(priority = 27)
	public void Tc27_User__4_Add_One_More_Task_User() throws Exception {
		Reporter.log("Scenario 27 : Add Next Task User");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.selectUser_10();
		Reporter.log("Next Task User Added Successfully...");
		Thread.sleep(4000);
	}
	
	@Test(priority = 28)
	public void Tc28_User_4_EnterCommentAndApprovedPSR() throws Exception {
		Reporter.log("Scenario 28:Enter Comments  into 'Approve and PSR' commentbox");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.AcceptAndForWardCommentBox();
		Thread.sleep(4000);
	}
	@Test(priority = 29)
	public void Tc29_TaskUser_4_LogouthePage() throws Exception {
		Reporter.log("Scenario 29:Task User-4 Logout the page");
		LogoutPage();
	}


	
	

	@Test(priority = 30)
	public void Tc30_Task_User5_Login() throws Exception {
		Reporter.log("Scenario 30:Login as Task User-5");
		loginSrikanth();
	}

	@Test(priority = 31)
	public void Tc31_User5_ApproveAndEnd_PSR() throws Exception {
		Reporter.log("Scenario 31:Task User-5 'Approve and EndWorkflow' ");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.ApproveAndPSRDocument();
	}

	@Test(priority = 32)
	public void Tc32_User_5_OTP_Validation() throws Exception {
		Reporter.log("Scenario 32:Enter valid OTP ");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();

		Thread.sleep(4000);
	}

	@Test(priority = 33)
	public void Tc33_User_5_Add_One_More_Task_User() throws Exception {
		Reporter.log("Scenario 33:Add Next Task User");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.selectUser_6();
		Reporter.log("Next Task User Added Successfully...");
		Thread.sleep(4000);
	}
	
	@Test(priority = 34)
	public void Tc34_User_5_EnterCommentAndEndPSR() throws Exception {
		Reporter.log("Scenario 34:Enter Comments  into the 'Approve and PSR' commentbox");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.AcceptAndForWardCommentBox();
		Thread.sleep(4000);
	}

	@Test(priority = 35)
	public void Tc35_TaskUser_5_LogouthePage() throws Exception {
		Reporter.log("Scenario 35:Task User-5 Logout the page");
		LogoutPage();
	}

	@Test(priority = 36)
	public void Tc36_Task_User6_Login() throws Exception {
		Reporter.log("Scenario 36:Login as Task User-6 ");
		loginAjitkumar();
	}

	@Test(priority = 37)
	public void Tc37_User6_ApproveAnd_PSR() throws Exception {
		Reporter.log("Scenario 37:Task User-6 'Approve and PSR' ");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.ApproveAndPSRDocument();
	}

	@Test(priority = 38)
	public void Tc38_User_6_OTP_Validation() throws Exception {
		Reporter.log("Scenario 38:Enter valid OTP ");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();

		Thread.sleep(4000);
	}

	@Test(priority = 39)
	public void Tc39_User_6_Add_One_More_Task_User() throws Exception {
		Reporter.log("Scenario 39 :Add next Task User");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.selectUser_7();
		Reporter.log("Next Task User Added Successfully...");
		Thread.sleep(4000);
	}
	
	@Test(priority = 40)
	public void Tc40_User_6_EnterCommentAndApprovedPSR() throws Exception {
		Reporter.log("Scenario 40:Enter Comments  into the 'Approve and PSR' commentbox");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.AcceptAndForWardCommentBox();
		Thread.sleep(4000);
	}
	
	@Test(priority = 41)
	public void Tc41_TaskUser_6_LogouthePage() throws Exception {
		Reporter.log("Scenario 41:Task User-6 Logout the page");
		LogoutPage();
	}

	@Test(priority = 42)
	public void Tc42_Task_User7_Login() throws Exception {
		Reporter.log("Scenario 42:Login as Task User-7 ");
		loginAmarnath();
	}

	@Test(priority = 43)
	public void Tc43_User7_ApproveAnd_PSR() throws Exception {
		Reporter.log("Scenario 43:Task User-7 'Approve and PSR' ");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.ApproveAndPSRDocument();
	}

	@Test(priority = 44)
	public void Tc44_User_7_OTP_Validation() throws Exception {
		Reporter.log("Scenario 44:Enter valid OTP ");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();

		Thread.sleep(4000);
	}

	@Test(priority = 45)
	public void Tc45_User_7_Add_One_More_Task_User() throws Exception {
		Reporter.log("Scenario 45 : Add Next Task User");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.selectUser_8();
		Reporter.log("Next Task User Added Successfully...");
		Thread.sleep(4000);
	}
	
	@Test(priority = 46)
	public void Tc46_User_7_EnterCommentAndApprovedPSR() throws Exception {
		Reporter.log("Scenario 46:Enter Comments  into the 'Approve and PSR' commentbox");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.AcceptAndForWardCommentBox();
		Thread.sleep(4000);
		
	}
	
	@Test(priority = 47)
	public void Tc47_TaskUser_6_LogouthePage() throws Exception {
		Reporter.log("Scenario 47:Task User-7 Logout the page");
		LogoutPage();
	}

	@Test(priority = 48)
	public void Tc48_Task_User7_Login() throws Exception {
		Reporter.log("Scenario 48:Login as Task User-8");
		loginAlkas();
	}

	@Test(priority = 49)
	public void Tc49_User8_ApproveAnd_PSR() throws Exception {
		Reporter.log("Scenario 49:Task User-8 'Approve and PSR' ");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.ApproveAndPSRDocument();
	}

	@Test(priority = 50)
	public void Tc50_User_8_OTP_Validation() throws Exception {
		Reporter.log("Scenario 50:Enter valid OTP ");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();

		Thread.sleep(4000);
	}

	@Test(priority = 51)
	public void Tc51_User_8_Add_One_More_Task_User() throws Exception {
		Reporter.log("Scenario 51 : Add Next Task User");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.selectUser_9();
		Reporter.log("Next Task User Added Successfully...");
		Thread.sleep(4000);
	}
	
	@Test(priority = 52)
	public void Tc52_User_8_EnterCommentAndApprovedPSR() throws Exception {
		Reporter.log("Scenario 52:Enter Comments  into the 'Approve and PSR' commentbox");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.AcceptAndForWardCommentBox();
		Thread.sleep(4000);
	
	}
	
	@Test(priority = 53)
	public void Tc53_TaskUser_8_LogouthePage() throws Exception {
		Reporter.log("Scenario 53:Task User-8 Logout the page");
		LogoutPage();
	}

	@Test(priority = 54)
	public void Tc54_Task_User9_Login() throws Exception {
		Reporter.log("Scenario 54:Login as Task User-9");
		loginArora();
	}

	@Test(priority = 55)
	public void Tc55_User9_ApproveAnd_PSR() throws Exception {
		Reporter.log("Scenario 55:Task User-9 'Approve and PSR' ");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.ApproveAndPSRDocument();
	}

	@Test(priority = 56)
	public void Tc56_User_9_OTP_Validation() throws Exception {
		Reporter.log("Scenario 56:Enter valid OTP ");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();

		Thread.sleep(4000);
	}

	@Test(priority = 57)
	public void Tc57_User_9_Add_One_More_Task_User() throws Exception {
		Reporter.log("Scenario 57 : Add Next Task User");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.selectUser_10();
		Reporter.log("Next Task User Added Successfully...");
		Thread.sleep(4000);
	}
	
	@Test(priority = 58)
	public void Tc58_User_9_EnterCommentAndApprovedPSR() throws Exception {
		Reporter.log("Scenario 58:Enter Comments  into the 'Approve and PSR' commentbox");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.AcceptAndForWardCommentBox();
		Thread.sleep(4000);
		
	}
	
	@Test(priority = 59)
	public void Tc59_TaskUser_9_LogouthePage() throws Exception {
		Reporter.log("Scenario 59:Task User-9 Logout the page");
		LogoutPage();
	}

	@Test(priority = 60)
	public void Tc60_Task_User10_Login() throws Exception {
		Reporter.log("Scenario 60:Login as Task User-10");
		loginSrikanth();
	}

	@Test(priority = 61)
	public void Tc61_User10_ApproveAnd_PSR() throws Exception {
		Reporter.log("Scenario 61:Task User-10 'Approve and PSR' ");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.ApproveAndPSRDocument();
	}

	@Test(priority = 62)
	public void Tc62_User_10_OTP_Validation() throws Exception {
		Reporter.log("Scenario 62:Enter valid OTP ");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.WorkflowOTP();

		Thread.sleep(4000);
	}

	
	
	@Test(priority =63 )
	public void Tc63_User_10_EnterCommentAndApprovedPSR() throws Exception {
		Reporter.log("Scenario 63:Enter Comments  into the 'Approve and PSR' commentbox");
		WorkflowPOM pojo = new WorkflowPOM();
		pojo.AcceptAndForWardCommentBox();
		Thread.sleep(4000);
	
		Reporter.log(
				"Document 'Accept and PSR' by all Task Users Successfully...");
	}
	
	
	
	
	
	
}
