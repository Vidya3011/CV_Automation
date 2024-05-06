package Script;

import org.testng.Reporter;

import Generic.IAutoConst;
import Generic.Lib;

public class ForLogTodoList {
	
	
	
	
	


	
		
		String xlpath = IAutoConst.xlpath;
		int rc1 = Lib.getRowCount(xlpath, "To-dolist");
		{
		for (int i = 1; i <= rc1; i++) 
			try {
				{	
		
				
	//i is a row count
					String WorkflowName = Lib.getCellValue(xlpath, "To-dolist", i, 0);
					Reporter.log("Workflow Name:" + WorkflowName, true);

					String Task1 = Lib.getCellValue(xlpath, "To-dolist", i, 1);
					Reporter.log("Task 1 User:" + Task1, true);
					
					String Task2 = Lib.getCellValue(xlpath, "To-dolist", i, 2);
					Reporter.log("Task 2 User:" + Task2, true);

					String Task3 = Lib.getCellValue(xlpath, "To-dolist", i, 3);
					Reporter.log("Task 3 User:" + Task3, true);
					
					String Accept = Lib.getCellValue(xlpath, "To-dolist", i, 4);
					Reporter.log("Accept:" + Accept, true);
					
					String Reject = Lib.getCellValue(xlpath, "To-dolist", i, 5);
					Reporter.log("Reject:" + Reject, true);
					
					String EndWorkflow = Lib.getCellValue(xlpath, "To-dolist", i, 6);
					Reporter.log("End workflow:" + EndWorkflow, true);
					
					String Review = Lib.getCellValue(xlpath, "To-dolist", i, 7);
					Reporter.log("Review:" + Review, true);
				}
			}
				catch(Exception e) {
					e.printStackTrace();
				}
		}
	}






