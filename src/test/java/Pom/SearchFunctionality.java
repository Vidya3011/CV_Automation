package Pom;

import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchFunctionality {  //IndexcontainsSearch

	public static WebDriver driver;
	public static Actions act;

	/*@BeforeClass
	public void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.4.10.60:8080/CVWeb/cvLgn");
	}

	@Test
	public void LoginValidCr() {
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("RNisha");
		driver.findElement(By.id("loginPassword")).sendKeys("syntax@10");
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		act = new Actions(driver);
		act.moveToElement(room).click().build().perform();
		WebElement ro = driver.findElement(By.xpath("//option[text()='CVWin19Server.Win2019_TestRoom']"));
		ro.click();
		driver.findElement(By.id("submitid")).click();
		WebElement sessiomsg = driver.findElement(By.xpath(" //button[@id='cvModelLoginValidationOk']"));
		sessiomsg.click();
	}*/

	@Test//exactPhrasesearch
	public void SearchHeader() throws InterruptedException {
		driver.findElement(By.id("advSearchMenuBtn")).click();
		Thread.sleep(3000);
		WebElement fls = driver.findElement(By.xpath("(//input[@id='indexPhrase1'])[1]"));
		act = new Actions(driver);
		act.moveToElement(fls).click().build().perform();
		fls.sendKeys("nisha");
		WebElement index = driver.findElement(By.xpath("//button[@id='advFindBtnLabel']"));
		act.moveToElement(index).click().build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test//atleast one word
	public void Tc01() throws InterruptedException {
		driver.findElement(By.id("advSearchMenuBtn")).click();
		Thread.sleep(5000);
		WebElement atleast = driver.findElement(By.xpath("(//img[@id='labelSearchImage1'])[1]"));
		act = new Actions(driver);
		act.moveToElement(atleast).perform();
		WebElement atl = driver.findElement(By.xpath("(//li[@id='indexOptionMenu_2'])[1]"));
		act.moveToElement(atl).perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", atl);
		WebElement fls = driver.findElement(By.xpath("(//input[@id='indexPhrase1'])[1]"));
		act = new Actions(driver);
		act.moveToElement(fls).click().build().perform();
		fls.sendKeys("army");
		WebElement index = driver.findElement(By.xpath("//button[@id='advFindBtnLabel']"));
		act.moveToElement(index).click().build().perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test//allofthe word search
	public void Tc02() throws InterruptedException {
		driver.findElement(By.id("advSearchMenuBtn")).click();
		Thread.sleep(5000);
		WebElement alword = driver.findElement(By.xpath("(//img[@id='labelSearchImage1'])[1]"));
		act = new Actions(driver);
		act.moveToElement(alword).perform();
		WebElement atl = driver.findElement(By.xpath("(//li[@id='indexOptionMenu_0'])[1]"));
		act.moveToElement(atl).perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", atl);
		WebElement fls = driver.findElement(By.xpath("(//input[@id='indexPhrase1'])[1]"));
		act = new Actions(driver);
		act.moveToElement(fls).click().build().perform();
		fls.sendKeys("hike");
		WebElement index = driver.findElement(By.xpath("//button[@id='advFindBtnLabel']"));
		act.moveToElement(index).click().build().perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	

}
