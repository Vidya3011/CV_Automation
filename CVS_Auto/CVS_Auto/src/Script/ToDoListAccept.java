package Script;

import org.openqa.selenium.WebDriver;

import Pom.ToDoListTab;

public class ToDoListAccept {
	
		private WebDriver driver;
		ToDoListAccept(WebDriver driver) {
			this.driver = driver;
		}
		public void testTodoListItems() throws Exception {
			ToDoListTab todo=new ToDoListTab(driver);
			todo.SetNewItemsAccept();
		}

}
