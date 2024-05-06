package Script;

import org.openqa.selenium.WebDriver;

import Pom.Logout;


public class LogoutPage {

	private WebDriver driver;

	LogoutPage() {

	}

	LogoutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void testLogout() throws Exception  {
		Logout logout1 = new Logout(driver);
		logout1.SetLogout();
}
}