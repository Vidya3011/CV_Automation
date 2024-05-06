package Script;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import Generic.IAutoConst;
import Generic.Lib;
import Pom.LoginPage;
import Pom.SearchTab;

public class SearchItems {
	private WebDriver driver;
	SearchItems(WebDriver driver) {
		this.driver = driver;
	}
	public void testSearchItems() throws Exception {
		String xlpath = IAutoConst.xlpath;
		int rc = Lib.getRowCount(xlpath, "SearchTab");
		for (int i = 1; i <= rc; i++) {

			String IndexSearch = Lib.getCellValue(xlpath, "SearchTab", i, 0);
			Reporter.log("IndexSearch:" + IndexSearch, true);

			String TextSearch = Lib.getCellValue(xlpath, "SearchTab", i, 1);
			Reporter.log("TextSearch:" + TextSearch, true);

			String DocType = Lib.getCellValue(xlpath, "SearchTab", i, 2);
			Reporter.log("DocType:" + DocType, true);

			String DocCreator = Lib.getCellValue(xlpath, "SearchTab", i, 3);
			Reporter.log("DocCreator:" + DocCreator, true);
			
			SearchTab Search = new SearchTab(driver);
			Search.SetSearchTab();
			//Search.SetIndexSearch(IndexSearch);
			//Search.SetTextSearch(TextSearch);
            Search.SetDoctypeSearch(DocType,IndexSearch);
           // Search.SetDocCreatorSearch(DocCreator, IndexSearch, DocType);
}
	}
}
