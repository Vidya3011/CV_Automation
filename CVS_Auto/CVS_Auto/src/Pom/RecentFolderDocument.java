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

public class RecentFolderDocument {
	@FindBy(xpath = ("//a[@id='recentMenuBtn']"))
	private WebElement RecentTab;
	
	@FindBy(xpath = ("//table[@id='recentFolders']/tbody/tr[1]/td[1]"))
	private WebElement RecentFolder;
	
	@FindBy(xpath = (".//table[@id='recentDocuments']/tbody/tr[1]/td[1]"))
	private WebElement RecentDocument;
	
	public WebDriver driver;
	Actions action;

	public RecentFolderDocument(WebDriver driver) {
		PageFactory.initElements(driver, this);
		action = new Actions(driver);

		this.driver = driver;
	}
	public void SetRecentFolder() throws InterruptedException {
	action.moveToElement(RecentTab).perform();	
    WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(RecentFolder)); 
	((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
	action.moveToElement(RecentFolder).perform();
	Reporter.log("Recent Folder::"+RecentFolder,true);
	}
	
	public void SetRecentDocument() throws Exception {
		action.moveToElement(RecentTab).perform();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(".//table[@id='recentDocuments']/tbody/tr[1]/td[1]")));
//		WebElement element1 =	wait.until(ExpectedConditions.elementToBeClickable(RecentDocument)); 
//		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element1);
		
		Thread.sleep(2000);
		action.moveToElement(RecentDocument).perform();
		Reporter.log("Recent Document::"+RecentDocument,true);
		RecentDocument.click();
		
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='ownershipMessageModelOk']")));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element1);
		Thread.sleep(2000);
	Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
	myAlert.accept();
		
		// Alert alert = driver.switchTo().alert();

		Thread.sleep(2000);
		myAlert.accept();
		}
	
}
