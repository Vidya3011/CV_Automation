package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Generic.BaseClass;

public class SearchWith4CheckBox extends BaseClass {
	public static Actions act;

	/*@BeforeClass
	public void ladBrowser() {
		loadBrowser();
		launchUrl();
		driver.manage().deleteAllCookies();
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

	@Test//AllVersion
	public void Tc03() throws InterruptedException {
		driver.findElement(By.id("advSearchMenuBtn")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='  All versions']")).click();
		driver.findElement(By.xpath("//button[@id='advFindBtnLabel']")).click();
		applyWaitsForAll();
		driver.findElement(By.id("clearSearchBtnLabel")).click();
	}

	@Test//include comment
	public void Tc04() throws InterruptedException {
		driver.findElement(By.id("advSearchMenuBtn")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='  Include comment']")).click();
		driver.findElement(By.xpath("//button[@id='advFindBtnLabel']")).click();
		applyWaitsForAll();
		driver.findElement(By.id("clearSearchBtnLabel")).click();
	}

	@Test//append to hitList
	public void Tc05() throws InterruptedException {
		driver.findElement(By.id("advSearchMenuBtn")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//label[normalize-space()='Append to hitlist'])[1]")).click();
		driver.findElement(By.xpath("//button[@id='advFindBtnLabel']")).click();
		applyWaitsForAll();
		driver.findElement(By.id("clearSearchBtnLabel")).click();
	}

	@Test//Find in hitlist
	public void Tc06() throws InterruptedException {
		driver.findElement(By.id("advSearchMenuBtn")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='  Find in hitlist']")).click();
		driver.findElement(By.xpath("//button[@id='advFindBtnLabel']")).click();
		applyWaitsForAll();
		driver.findElement(By.id("clearSearchBtnLabel")).click();
	}

	@Test//showing saved documents
	public void Tc07() throws InterruptedException {
		driver.findElement(By.id("advSearchMenuBtn")).click();
		Thread.sleep(5000);
		WebElement ck = driver.findElement(By.id("savedSearchName"));
		movingclkElement(ck);
		ck.sendKeys("nisha");
		driver.findElement(By.id("saveBtnForSaveSearchName")).click();
		driver.findElement(By.xpath("//button[@id='advFindBtnLabel']")).click();
		applyWaitsForAll();
		WebElement c = driver.findElement(By.id("savedSearchName"));
		movingclkElement(c);
	}
}

/*search-text
 * WebElement sel = driver.findElement(By.id("savedSearchName")); Select s=new
 * Select(sel); s.selectByVisibleText("<New Search>");
 */
