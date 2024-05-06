package Script;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.Create_DOC;

public class INWARD_EXTERNAL_WORKFLOW extends Generic.BaseClass {

	@BeforeClass

	public void LandBrowser() {
		loadBrowser("edge");
		launchUrl1();
		Reporter.log("SIDBI URL started successfully", true);
	}

	@Test

	public void Login_EWA() throws Exception {
		loginCVS();
		Reporter.log("User has logged in successfully.", true);

	}

	// Create Inward External document and send to WF

	@Test(priority = 1)

	public void TC_01_Create_INWARD_Document_and_sendTo_Inward_Workflow() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Create_INWARD_Document_and_sendTo_Inward_Workflow();

	}

	// Accept and Forward

	@Test(priority = 2)

	public void TC_02_Accept_and_Forward_INWARD_Workflow_Document_from_User1() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Accept_and_Forward_INWARD_Workflow_Document_from_User1();

	}

	@Test(priority = 3)

	public void TC_03_Accept_and_Forward_INWARD_Workflow_Document_from_User2() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Accept_and_Forward_INWARD_Workflow_Document_from_User2();

	}

	@Test(priority = 4)

	public void TC_04_Accept_and_Forward_INWARD_Workflow_Document_from_User3() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Accept_and_Forward_INWARD_Workflow_Document_from_User3();

	}

	@Test(priority = 5)

	public void TC_05_Accept_and_Forward_INWARD_Workflow_Document_from_User4() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Accept_and_Forward_INWARD_Workflow_Document_from_User4();

	}

	@Test(priority = 6)

	public void TC_06_Accept_and_Forward_INWARD_Workflow_Document_from_User5() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Accept_and_Forward_INWARD_Workflow_Document_from_User5();

	}

	@Test(priority = 7)

	public void TC_07_Accept_and_Forward_INWARD_Workflow_Document_from_User6() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Accept_and_Forward_INWARD_Workflow_Document_from_User6();

	}

	@Test(priority = 8)

	public void TC_08_Accept_and_Forward_INWARD_Workflow_Document_from_User7() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Accept_and_Forward_INWARD_Workflow_Document_from_User7();

	}

	@Test(priority = 9)

	public void TC_09_Accept_and_Forward_INWARD_Workflow_Document_from_User8() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Accept_and_Forward_INWARD_Workflow_Document_from_User8();

	}

	@Test(priority = 10)

	public void TC_10_Accept_and_Forward_INWARD_Workflow_Document_from_User9() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Accept_and_Forward_INWARD_Workflow_Document_from_User9();

	}

	// Approve and End Workflow

	@Test(priority = 11)

	public void TC_11_Approve_and_End_INWARD_Workflow_Document_from_User10() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Approve_and_EndWorkflow_INWARD_Workflow_Document_from_User10();

	}

	// Create Inward External document and send to WF

	@Test(priority = 12)

	public void LandBrowser1() {
		loadBrowser("edge");
		launchUrl1();
		Reporter.log("SIDBI URL started successfully", true);
	}

	@Test(priority = 13)

	public void Login_EWA1() throws Exception {
		loginCVS();
		Reporter.log("User has logged in successfully.", true);

	}

	@Test(priority = 14)

	public void TC_12_Create_INWARD_Document_and_sendTo_Inward_Workflow_Approve_and_PSR() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Create_INWARD_Document_and_sendTo_Inward_Workflow_Approve_and_PSR();

	}

	// Approve and PSR

	@Test(priority = 15)

	public void TC_13_Approve_and_PSR_INWARD_Workflow_Document_from_User1() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Approve_and_PSR_INWARD_Workflow_Document_from_User1();

	}

	@Test(priority = 16)

	public void TC_14_Approve_and_PSR_INWARD_Workflow_Document_from_User2() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Approve_and_PSR_INWARD_Workflow_Document_from_User2();

	}

	@Test(priority = 17)

	public void TC_15_Approve_and_PSR_INWARD_Workflow_Document_from_User3() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Approve_and_PSR_INWARD_Workflow_Document_from_User3();

	}

	@Test(priority = 18)

	public void TC_16_Approve_and_PSR_INWARD_Workflow_Document_from_User4() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Approve_and_PSR_INWARD_Workflow_Document_from_User4();

	}

	@Test(priority = 19)

	public void TC_17_Approve_and_PSR_INWARD_Workflow_Document_from_User5() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Approve_and_PSR_INWARD_Workflow_Document_from_User5();

	}

	@Test(priority = 20)

	public void TC_18_Approve_and_PSR_INWARD_Workflow_Document_from_User6() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Approve_and_PSR_INWARD_Workflow_Document_from_User6();

	}

	@Test(priority = 21)

	public void TC_19_Approve_and_PSR_INWARD_Workflow_Document_from_User7() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Approve_and_PSR_INWARD_Workflow_Document_from_User7();

	}

	@Test(priority = 22)

	public void TC_20_Approve_and_PSR_INWARD_Workflow_Document_from_User8() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Approve_and_PSR_INWARD_Workflow_Document_from_User8();

	}

	@Test(priority = 23)

	public void TC_21_Approve_and_PSR_INWARD_Workflow_Document_from_User9() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Approve_and_PSR_INWARD_Workflow_Document_from_User9();

	}

	// PSR End Workflow

	@Test(priority = 24)

	public void TC_22_PSR_and_EndWorkflow_INWARD_Workflow_Document_from_User10() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.PSR_and_End_INWARD_Workflow_Document_from_User10();

	}

	@Test(priority = 25)

	public void LandBrowser2() {
		loadBrowser("edge");
		launchUrl1();
		Reporter.log("SIDBI URL started successfully", true);
	}

	@Test(priority = 26)

	public void Login_EWA2() throws Exception {
		loginCVS();
		Reporter.log("User has logged in successfully.", true);

	}

	// Create Inward External document and send to WF

	@Test(priority = 27)

	public void TC_23_Create_INWARD_Document_and_sendTo_Inward_Workflow() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Create_INWARD_Document_and_sendTo_Inward_Workflow();

	}

	// Accept and Forward

	@Test(priority = 28)

	public void TC_24_Accept_and_Forward_INWARD_Workflow_Document_from_User1() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Accept_and_Forward_INWARD_Workflow_Document_from_User1();

	}

	@Test(priority = 29)

	public void TC_25_Accept_and_Forward_INWARD_Workflow_Document_from_User2() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Accept_and_Forward_INWARD_Workflow_Document_from_User2();

	}

	@Test(priority = 30)

	public void TC_26_Accept_and_Forward_INWARD_Workflow_Document_from_User3() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Accept_and_Forward_INWARD_Workflow_Document_from_User3();

	}

	@Test(priority = 31)

	public void TC_27_Accept_and_Forward_INWARD_Workflow_Document_from_User4() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Accept_and_Forward_INWARD_Workflow_Document_from_User4();

	}

	@Test(priority = 32)

	public void TC_28_Accept_and_Forward_INWARD_Workflow_Document_from_User5() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Accept_and_Forward_INWARD_Workflow_Document_from_User5();

	}

	@Test(priority = 33)

	public void TC_29_Accept_and_Forward_INWARD_Workflow_Document_from_User6() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Accept_and_Forward_INWARD_Workflow_Document_from_User6();

	}

	@Test(priority = 34)

	public void TC_30_Rework_INWARD_Workflow_Document_from_User7() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Rework_INWARD_Workflow_Document_from_User7();

	}

	// Create Inward External document and send to WF for Intimate

	@Test(priority = 35)

	public void LandBrowser21() {
		loadBrowser("edge");
		launchUrl1();
		Reporter.log("SIDBI URL started successfully", true);
	}

	@Test(priority = 36)

	public void Login_EWA21() throws Exception {
		loginCVS();
		Reporter.log("User has logged in successfully.", true);

	}

	@Test(priority = 37)

	public void TC_31_Create_INWARD_EXTERNAL_Document() throws Exception {
		Create_DOC pojo = new Create_DOC();
		pojo.Create_INWARD_Document_and_sendTo_Inward_Workflow_For_Intimation();

	}

	@Test(priority = 38)

	public void TC_32_Intimate_INWARD_Workflow_Document_from_User1() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Intimate_INWARD_Workflow_Document_from_User1();

	}

	@Test(priority = 39)

	public void TC_33_Intimate_INWARD_Workflow_Document_from_User2() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.Intimate_INWARD_Workflow_Document_from_User2();

	}

	@Test(priority = 40)

	public void TC_34_Intimate_End_INWARD_Workflow_Document_from_User3() throws Exception {

		Create_DOC pojo = new Create_DOC();
		pojo.EndWorkflow_INWARD_Workflow_Document_from_User3();

	}

}
