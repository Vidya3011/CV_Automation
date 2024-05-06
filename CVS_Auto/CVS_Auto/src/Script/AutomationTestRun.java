package Script;

import org.testng.annotations.Test;

public class AutomationTestRun {
	
		
	@Test(priority=01)
	public void testSecuritydialog() throws Exception {
	Security_dialog sc=new Security_dialog();
	
	sc.Open_Security_Dialog_And_Verify_Title();
	sc.Verify_Add_User_And_Give_Permissions();
	sc.Verify_Remove_User();
	sc.Verify_The_Cancel_Button();
	sc.Verify_The_Cross_Button_Of_Security_Dialog();
	sc.Verify_The_Reset_Functionality();
	Thread.sleep(5000);

}
    @Test(priority=02)
	public void testSearchdialog() throws Exception {
		SearchSelectDocumentLocation sr=new SearchSelectDocumentLocation();
		sr.BlankSearch();
		sr.ExactSearchInIndex();
		sr.AtLeastOneWordSeachIndex();
		sr.AllOfTheWordSearchIndex();
		sr.AllVrsn_Incldcmnt_FindInHit_AppendToHit();
		sr.FolderLevelSearch();
		sr.DrawerLevelSearch();
		sr.CabinetLevel();
		sr.DocumentDropDown();
		sr.DocumentCreatorDropDown();
		sr.WorkflowStatusDropdown();
		sr.CreatedFromToModifiedFromTo();
		sr.SavingTheSearchDoc();
		sr.TextSearchWithAllOftheWords();
		sr.TextSearchAtleastoneofwordIncludeComments();
		sr.QuickSearch();
		
	}
   
    
    
    @Test(priority=04)
    public void TestCustomColumn() throws Exception {
    
    Custom_Columns_TestRoom cs=new  Custom_Columns_TestRoom();
    cs.Open_Custom_List_Dialog_And_Verify_Title_Roomcolumn();
    cs.Verify_The_Text_of_Custom_List_Dialog_Roomcolumn();
    cs.Set_And_Verify_Custom_Columns_NodeLevel();
    cs.Verify_Default_Custom_Columns();
    cs.Verify_Cancel_Button_of_CustomList();
    cs.Verify_Custom_Columns_RoomLevel();
    cs.Verify_Reset_Columns_Functionality();
    cs.Open_Custom_List_Dialog_And_Verify_Title_Searchcolumn();
    cs.Verify_Set_Custom_Columns_for_Search();
    cs.Verify_Reset_Columns_for_Search();
    cs.Open_Custom_List_Dialog_And_Verify_Title_ToDoList();
    cs.Verify_The_Text_of_Custom_List_Dialog_ToDoList();
    cs.Verify_Set_Custom_Columns_for_ToDoList();
    cs.Reset_Custom_Columns_for_ToDoList();
    
    }
    
   @Test(priority=03)
   public void TestTemplates() throws Exception {
	   
	   Templates ts=new Templates();
	   ts.Verify_to_Create_Template();
	   ts.Verify_to_Edit_and_Delete_Template();
	   }
   
   
   @Test(priority=04)
   public void TestPrintEmailExport() throws Exception {
	   PrintFunctionality em=new PrintFunctionality();
	   em.Email_Reference();
	   em.Email_Copy_WithMsgBox_SubjectBox();
	   em.Email_ConvertPDF_WithAll_Annotations();
	   em.exports_with_convert_to_pdf_with_passwords();
	   em.exports_with_Retain_and_average_quality();
	   em.exports_with_convert_to_pdf_and_best_quality();
	   em.exports_with_convert_to_pdf_and_include_workflow_summary();
	   }
   
   
	
	
	
	
}

