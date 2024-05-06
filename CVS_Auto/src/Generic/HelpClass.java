package Generic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelpClass {
	public static WebDriver driver;
	public static Actions a;
	public static Alert alrt;
	public static Select mom;

	public static void launchBrowser() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void passValue(WebElement ele, String val) {
		ele.sendKeys(val);
	}

	public static void click(WebElement ele) {
		ele.click();

	}

	public static void dropDown(WebElement ele, String sel) {
		mom = new Select(ele);
		mom.selectByValue(sel);
	}

	public static void dropwn(WebElement ele, int nw) {
		mom = new Select(ele);
		mom.selectByIndex(nw);
	}

	public static void get(WebElement ele) {

		ele.getText();
	}

	public static void Act(WebElement ele) {
		a = new Actions(driver);
		a.moveToElement(ele).click().build().perform();
	}

	public static void back(WebElement ele) {
		driver.navigate().back();
	}

	public static void accept(WebElement ele) {
		alrt = driver.switchTo().alert();
		alrt.accept();
	}

	public static void list(List<WebElement> parrow, int ind) {
		WebElement ele = ((List<WebElement>) parrow).get(ind);
	}

	public static void dismis(WebElement ele) {
		alrt = driver.switchTo().alert();
		alrt.dismiss();
	}

	public static void jsClick(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
	}

	public static void scroll(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", ele);
	}

	public static void childWind(int ind) {
		Set<String> allwind = driver.getWindowHandles();
		List<String> li = new ArrayList();
		li.addAll(allwind);
		driver.switchTo().window(li.get(ind));
	}

	public static void fram(int ind) {
		driver.switchTo().frame(ind);
	}

}
