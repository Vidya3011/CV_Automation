package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Logout {
	
	@FindBy(xpath = ("//span[@id='logedinusername']"))
	private WebElement loggedinusername;
     
	@FindBy(xpath = ("//a[contains(text(),'Logout')]"))
	private WebElement loggedoutbutton;
	
	public WebDriver driver;
	Actions action;

	public Logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
		action = new Actions(driver);

		this.driver = driver;
	}
	public void SetLogout() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(loggedinusername)); 
 	    ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(loggedoutbutton)); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element1);
		//loggedoutbutton.click();
		Reporter.log("Logout Button is clicked ", true);
	
//		try {
//			wait.until(ExpectedConditions.elementToBeClickable((loggedoutbutton)));
//			loggedoutbutton.click();
//			Reporter.log("Logout Button is clicked ", true);
//		} catch (Exception e) {
//			Reporter.log("Logout Button is not clicked ", true);
//		}
		

	}
}
