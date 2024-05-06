package Pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class CreateNode {

	@FindBy(id = "navigationMenuBtn")
	private WebElement RoomName;

	@FindBy(xpath = (".//*[@id='viewDocumentnavigator']/ul/li/a"))
	private WebElement ExistingCabinet;

	@FindBy(xpath = ("//a[@id='createNodeAnchorForCabinet']"))
	private WebElement CreateCabinet;

	@FindBy(xpath = ("//input[@id='newNodeName13']"))
	private WebElement CreateCabinetText;

	@FindBy(xpath = ("//button[@id='createNewNodeOk13']"))
	private WebElement CreateCabinetOK;

	@FindBy(xpath = ("//a[@id='createNodeAnchor']"))
	private WebElement CreateDrawerFolder;

	@FindBy(xpath = ("//input[@id='newNodeName']"))
	private WebElement CreateDrawerFolderText;

	@FindBy(xpath = (".//*[@id='createDocuemntNavigator']/ul/li"))
	private WebElement cabinetId;

	@FindBy(xpath = ("//button[@id='createNewNodeOk']"))
	private WebElement CreateNodeOK;

	

	public WebDriver driver;
	Actions action;

	public CreateNode(WebDriver driver) {

		PageFactory.initElements(driver, this);
		action = new Actions(driver);
		this.driver = driver;
	}

	public void CreateDrawerFolderforNameduser(String CabinetName, String DrawerName, String FolderName)
			throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ExistingCabinet)); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		
		//action.click(ExistingCabinet).build().perform();
		Reporter.log("ExistingCabinet::" + ExistingCabinet.getText(),true);
		ExistingCabinet.click();
		Reporter.log("Existing cabinet is selected",true);
		Thread.sleep(2000);
		action.moveToElement(RoomName).build().perform();
		Thread.sleep(3000);
		action.click(CreateDrawerFolder).build().perform();
		driver.switchTo().activeElement().sendKeys(DrawerName);
		CreateNodeOK.click();
		Reporter.log("Drawer is selected",true);
		Thread.sleep(2000);
		action.moveToElement(RoomName).build().perform();
		action.click(CreateDrawerFolder).build().perform();
		driver.switchTo().activeElement().sendKeys(FolderName);
		CreateNodeOK.click();
		Reporter.log("Folder is selected",true);

	}

	/*public void CreateCabinetforAdmin(String CabinetName, String DrawerName, String FolderName) throws InterruptedException {
		action.moveToElement(RoomName).build().perform();
		if (CreateCabinet.isEnabled()) {
			System.out.println("Create cabinet permission is there");
			action.moveToElement(CreateCabinet).build().perform();
			CreateCabinet.click();
			CreateCabinetText.sendKeys(CabinetName);
			CreateCabinetOK.click();
			
		}
		else {
			System.out.println("Create cabinet permission denied");
		}*/
	}

