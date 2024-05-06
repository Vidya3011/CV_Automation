package Pom;

import org.openqa.selenium.Alert;
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

public class OpenDoc {
	@FindBy(xpath = (".//*[@id='viewDocumentnavigator']/ul/li/a"))
	private WebElement Cabinet;

	@FindBy(xpath = (".//*[@id='viewDocumentnavigator']/ul/li/ul/li"))
	private WebElement Drawer;

	@FindBy(xpath = (".//*[@id='viewDocumentnavigator']/ul/li/ul/li/ul/li/a"))
	private WebElement Folder;


//	@FindBy(xpath = (".//table[@id='documentListTable']/tbody/tr[2]/td[3]"))
//	private WebElement Document;
	
	 @FindBy(xpath = ("//button[@id='ownershipMessageModelOk']"))
		private WebElement Lockeddoc;
	 
	@FindBy(xpath = ("//td[contains(@class,'customDocName')]"))
	private WebElement Document;

	public WebDriver driver;
	Actions action;

	public OpenDoc(WebDriver driver) {
		PageFactory.initElements(driver, this);
		action = new Actions(driver);

		this.driver = driver;
	}

	public void SetExpandNode() throws InterruptedException {

		System.out.println("Cabinet::" + Cabinet.getText());
		openTree(Cabinet);
		Thread.sleep(2000);
		System.out.println("Drawer::" + Drawer.getText());
		openTree(Drawer);
		action.doubleClick(Folder).build().perform();
		System.out.println("Folder::" + Folder.getText());
	}

	public void openTree(WebElement Cabinetxpath) throws InterruptedException {

		action.doubleClick(Cabinetxpath).build().perform();
		Thread.sleep(3000);
	}

	public void DocumentOpen() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		action.click(Document).build().perform();

		//if(Lockeddoc.isDisplayed())		{
			//action.click(Lockeddoc).build().perform();	
		//wait.until(ExpectedConditions.elementToBeClickable(Lockeddoc));
		if(Lockeddoc.isDisplayed()) {
			WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='ownershipMessageModelOk']")));
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", element1);
		Reporter.log("Locked message displayed",true);
		Thread.sleep(2000);
			Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
			myAlert.accept();
		}else {
			action.click(Document).build().perform();
			Thread.sleep(2000);
			Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
			myAlert.accept();
	}
	
}
}