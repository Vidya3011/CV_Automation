package Pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Generic.HelpClass;

public class seachFucn02 extends HelpClass {  //TextContainsSearch
	public static Actions act;

	/*@BeforeClass
	public void browserlanch() throws InterruptedException {

		launchBrowser();
		launchUrl("http://10.4.10.60:8080/CVWeb/cvLgn");
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

	@Test//enter value in indexcontains search and enter value in textcontains search
	public void Tc02() throws InterruptedException {
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
		fls.sendKeys("documents");
		Thread.sleep(5000);
		WebElement cl = driver.findElement(By.xpath("(//img[@id='labelSearchImage2'])[1]"));
		act = new Actions(driver);
		act.moveToElement(cl).perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement ck = driver.findElement(By.xpath("//li[@id='textOptionMenu_0']"));
		Act(ck);

		WebElement allofthewords = driver.findElement(By.xpath("//input[@id='indexPhrase2']"));
		act.moveToElement(allofthewords).click().build().perform();

		allofthewords.sendKeys("Employment");
		driver.findElement(By.xpath("//button[@id='advFindBtnLabel']")).click();

	}

	@Test//AlloftheWords search
	public void Tc03() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='advSearchMenuBtn']")).click();
		Thread.sleep(5000);
		WebElement cl = driver.findElement(By.xpath("(//img[@id='labelSearchImage2'])[1]"));
		act = new Actions(driver);
		act.moveToElement(cl).perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement ck = driver.findElement(By.xpath("//li[@id='textOptionMenu_0']"));
		Act(ck);

		WebElement allofthewords = driver.findElement(By.xpath("//input[@id='indexPhrase2']"));
		act.moveToElement(allofthewords).click().build().perform();

		allofthewords.sendKeys("Employment");
		driver.findElement(By.xpath("//button[@id='advFindBtnLabel']")).click();
	}

	@Test//ExactPhraseSearch
	public void Tc04() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='advSearchMenuBtn']")).click();
		Thread.sleep(5000);
		WebElement exactphrase = driver.findElement(By.xpath("//input[@id='indexPhrase2']"));
		act.moveToElement(exactphrase).click().build().perform();
		exactphrase.sendKeys("Rahamah");
		driver.findElement(By.xpath("//button[@id='advFindBtnLabel']")).click();
	}

	@Test//atleastOneof the word search
	public void Tc05() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='advSearchMenuBtn']")).click();
		Thread.sleep(5000);
		WebElement cl = driver.findElement(By.xpath("(//img[@id='labelSearchImage2'])[1]"));
		act = new Actions(driver);
		act.moveToElement(cl).perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement ck = driver.findElement(By.xpath("(//li[@id='textOptionMenu_2'])[1]"));
		Act(ck);

		WebElement atleastoneword = driver.findElement(By.xpath("//input[@id='indexPhrase2']"));
		act.moveToElement(atleastoneword).click().build().perform();

		atleastoneword.sendKeys("content");
		driver.findElement(By.xpath("//button[@id='advFindBtnLabel']")).click();
	}

	@Test//atPartof the word search
	public void Tc06() throws InterruptedException {

		driver.findElement(By.xpath("//a[@id='advSearchMenuBtn']")).click();
		Thread.sleep(5000);
		WebElement cl = driver.findElement(By.xpath("(//img[@id='labelSearchImage2'])[1]"));
		act = new Actions(driver);
		act.moveToElement(cl).perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement ck = driver.findElement(By.xpath("(//li[@id='textOptionMenu_3'])[1]"));
		Act(ck);

		WebElement atpartofword = driver.findElement(By.xpath("//input[@id='indexPhrase2']"));
		act.moveToElement(atpartofword).click().build().perform();

		atpartofword.sendKeys("content");
		driver.findElement(By.xpath("//button[@id='advFindBtnLabel']")).click();
		Thread.sleep(5000);
	}

}

// @AfterClass
// public void Logout() {
// driver.close();
