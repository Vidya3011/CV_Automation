package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import Generic.BaseClass;

public class Security extends BaseClass {
	
	public static WebElement element;

	// 1.
	public static WebElement security_option(WebDriver driver) {
		element = driver.findElement(By.id("security"));
		return element;
	}

	// 2.
	public static WebElement Select_Cabinet(WebDriver driver) {
		element = driver.findElement(By.xpath("(//a[text()='CVApp Test'])[1]"));
		return element;
	}

	// 3.
	public static WebElement Select_Drawer(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[text()='CVMobile App 2022']"));
		return element;
	}

	// 4.
	public static WebElement Select_Folder(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[text()='Test apk']"));
		return element;
	}

	// 5.
	public static WebElement MoveTo_Menu_RoomName(WebDriver driver) {
		element = driver.findElement(By.id("navigationMenuBtn"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		return element;
	}

	// 6.
	public static WebElement titelvalidation(WebDriver driver) {
		
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Permissions for Node: Test apk";
		String actualtext = driver.findElement(By.xpath("//h2[@id='securityModal']")).getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		return element;
	}

	// 7.
	public static WebElement Add_Button(WebDriver driver) {
		element = driver.findElement(By.id("securityAdd"));
		return element;
	}

	// 8.
	public static WebElement cvnamed(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".collapsed:nth-child(1) span > img"));
		return element;
	}

	// 9.
	public static WebElement Select_User(WebDriver driver) {
		element = driver.findElement(By.xpath("/html[1]/body[1]/div[55]/div[32]/div[2]/ul[1]/ul[1]/li[6]/a[1]"));
		return element;
	}

	// 10.
	public static WebElement OK_Button_UserDialog(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#selectedUsersAndGroups"));
		return element;
	}

	// 11.
	public static WebElement DoubleClick_CrossBar(WebDriver driver) {
		element = driver.findElement(By.id("imgAssign"));
		Actions builder = new Actions(driver);
		builder.doubleClick(element).perform();
		return element;
	}

	// 12.
	public static WebElement Apply_Button_SecurityDialog(WebDriver driver) {
		element = driver.findElement(By.id("applySecurity"));
		return element;
	}

	// 13.
	public static WebElement Ok_Button_SecurityDialog(WebDriver driver) {
		element = driver.findElement(By.id("securityUpdate"));
		return element;
	}

	// 14.
	public static WebElement Select_Added_User(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".collapsed:nth-child(3)"));
		return element;
	}

	// 15.
	public static WebElement Remove_Button(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@id='securityRemove']"));
		return element;
	}

	// 16.
	public static WebElement Cancel_Button_SecurityDialog(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@id='cancelSecurity']"));
		return element;
	}

	// 17.
	public static WebElement Cross_Button_SecurityDialog(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[@id='navigatorModelClose36']"));
		return element;
	}

	// 18
	public static WebElement Reset_Button_SecurityDialog(WebDriver driver) {
		element = driver.findElement(By.id("resetSecurity"));
		return element;
	}

	// 19.
	public static WebElement No_Button_Securitypopup(WebDriver driver) {
		element = driver.findElement(By.id("resetNo"));
		return element;
	}

	// 20.
	public static WebElement Yes_Button_Securitypopup(WebDriver driver) {
		element = driver.findElement(By.id("resetYes"));
		//driver.findElement(By.xpath("//button[@id='resetNo']"));
		return element;
	}
}

