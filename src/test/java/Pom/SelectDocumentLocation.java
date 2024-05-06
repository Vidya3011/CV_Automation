package Pom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Generic.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import okhttp3.internal.connection.RouteSelector.Selection;

public class SelectDocumentLocation extends BaseClass {
	public static Actions act;

	/*@BeforeClass
	public void ladBrowser() {
		WebDriverManager.edgedriver().setup();
		//EdgeOptions opt=new EdgeOptions();
	//	opt.addArguments("--disable-notifications");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.4.10.60:8080/CVWeb/cvLgn");
	}

	@Test
	public void Tc01() {
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

	@Test//Cabinet/drawer/folder level search in search document location
	public void Tc02() throws InterruptedException {
		
		driver.findElement(By.id("advSearchMenuBtn")).click();
		Thread.sleep(5000);
		WebElement click=driver.findElement(By.xpath("(//input[@id='folderLocationForSearch'])[1]"));
		movingElement(click);//used base class
		jsclick(click);//used base class
		VisiblityOf(driver.findElement(By.xpath("(//a[text()='CVApp Test'])[1]")));
		WebElement dble = driver.findElement(By.xpath("(//a[text()='CVApp Test'])[1]"));
		act.doubleClick(dble).perform();
		Thread.sleep(3000);
		WebElement drawer= driver.findElement(By.xpath("//a[text()='CVMobile App 2022']"));
		movingElement(drawer);//used base class
		act.doubleClick(drawer).perform();
		WebElement folder= driver.findElement(By.xpath("//a[text()='Test apk']"));
		act.doubleClick(folder).perform();
		WebElement okbutton= driver.findElement(By.id("navigatorTreeOk1"));
		act.doubleClick(okbutton).perform();
		driver.findElement(By.xpath("//button[@id='advFindBtnLabel']")).click();
		WebElement validation = driver.findElement(By.xpath("(//th[text()='DOCUMENT NAME'])[5]"));
	    Assert.assertTrue(validation.isDisplayed());
	    System.out.println("search document location folder level search functionality works fine.The selected folder documents will be displayed successfully");
		applyWaitsForAll();
	}
	@Test//Cabinet/drawer/ level search in search document location
	public void Tc03() throws InterruptedException {
		driver.findElement(By.id("advSearchMenuBtn")).click();
		Thread.sleep(5000);
		WebElement click=driver.findElement(By.xpath("(//input[@id='folderLocationForSearch'])[1]"));
		movingElement(click);//used base class
		jsclick(click);//used base class
		VisiblityOf(driver.findElement(By.xpath("(//a[text()='Bills'])[1]")));
		WebElement dble = driver.findElement(By.xpath("(//a[text()='Bills'])[1]"));
		act.doubleClick(dble).perform();
		Thread.sleep(3000);
		WebElement drawer= driver.findElement(By.xpath("(//a[text()='Test'])[1]"));
		movingElement(drawer);//used base class
		act.doubleClick(drawer).perform();
		WebElement okbutton= driver.findElement(By.id("navigatorTreeOk1"));
		act.doubleClick(okbutton).perform();
		driver.findElement(By.xpath("//button[@id='advFindBtnLabel']")).click();
		WebElement validation = driver.findElement(By.xpath("(//th[text()='DOCUMENT NAME'])[5]"));
	    Assert.assertTrue(validation.isDisplayed());
	    System.out.println("search document location drawer level search functionality works fine.The selected folder documents will be displayed successfully");
		applyWaitsForAll();
}
	@Test//Cabinet level search in search document location
	public void Tc04() throws InterruptedException {
		driver.findElement(By.id("advSearchMenuBtn")).click();
		Thread.sleep(5000);
		WebElement click=driver.findElement(By.xpath("(//input[@id='folderLocationForSearch'])[1]"));
		movingElement(click);//used base class
		jsclick(click);//used base class
		VisiblityOf(driver.findElement(By.xpath("(//a[text()='CVApp Test'])[1]")));
		WebElement dble = driver.findElement(By.xpath("(//a[text()='CVApp Test'])[1]"));
		act.doubleClick(dble).perform();
		Thread.sleep(3000);
		WebElement okbutton= driver.findElement(By.id("navigatorTreeOk1"));
		act.doubleClick(okbutton).perform();
		driver.findElement(By.xpath("//button[@id='advFindBtnLabel']")).click();
		WebElement validation = driver.findElement(By.xpath("(//th[text()='DOCUMENT NAME'])[5]"));
	    Assert.assertTrue(validation.isDisplayed());
	    System.out.println("search document location cabinet level search functionality works fine.The selected cabinet documents will be displayed successfully");
		applyWaitsForAll();
}
////////////////////////////Search/select document type dropdown Functionality validation/////////////////////////////

	@Test//document textbox enter CVReport and click cvreports it will show the cvreports.
	public void Tc05() throws InterruptedException {

		driver.findElement(By.id("advSearchMenuBtn")).click();
		Thread.sleep(5000);
		WebElement clk = driver.findElement(By.xpath("(//select[@class='e-multi-hidden'])[1]"));
		movingclkElement(clk);
		WebElement selectdoc = driver.findElement(By.xpath("//input[@class='e-input-filter e-input']"));
		selectdoc.sendKeys("CVReports");
		Thread.sleep(3000);
		WebElement cl = driver.findElement(By.xpath("//li[text()='CVReports1']"));
		movingclkElement(cl);
		driver.findElement(By.xpath("//button[@id='advFindBtnLabel']")).click();
		applyWaitsForAll();
	}

	@Test//Select all dropdown
	public void Tc06() throws InterruptedException {
		driver.findElement(By.id("advSearchMenuBtn")).click();
		Thread.sleep(5000);
		WebElement clk = driver.findElement(By.xpath("(//select[@class='e-multi-hidden'])[1]"));
		movingclkElement(clk);
		WebElement forSelectdoc = driver.findElement(By.xpath("//li[text()='aaa']"));
		movingclkElement(forSelectdoc);
		driver.findElement(By.xpath("//button[@id='advFindBtnLabel']")).click();
		applyWaitsForAll();
	}
	
////////////////////////////Search/select document creator dropdown Functionality validation/////////////////////////////
	
	@Test//enter value in field and select the user
	public void Tc07() throws InterruptedException {

		driver.findElement(By.id("advSearchMenuBtn")).click();
		Thread.sleep(5000);
		WebElement clk = driver.findElement(By.xpath("(//select[@class='e-multi-hidden'])[2]"));
		movingclkElement(clk);
		WebElement selectdoc = driver.findElement(By.xpath("//input[@class='e-input-filter e-input']"));
		selectdoc.sendKeys("nisha");
		Thread.sleep(3000);
		WebElement cl = driver.findElement(By.xpath("//li[text()='nisha']"));
		movingclkElement(cl);
		driver.findElement(By.xpath("//button[@id='advFindBtnLabel']")).click();
		applyWaitsForAll();
	
	}
	

	@Test//Select all user search
	public void Tc08() throws InterruptedException {
		driver.findElement(By.id("advSearchMenuBtn")).click();
		Thread.sleep(5000);
		WebElement clk = driver.findElement(By.xpath("(//select[@class='e-multi-hidden'])[2]"));
		movingclkElement(clk);
		WebElement forSelectAll = driver.findElement(By.xpath("//span[text()='Select All']"));
		movingclkElement(forSelectAll);
		driver.findElement(By.xpath("//button[@id='advFindBtnLabel']")).click();
		applyWaitsForAll();
	}

	}
	
