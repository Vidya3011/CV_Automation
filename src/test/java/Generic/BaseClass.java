package Generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Alert a;
	public static Actions a1;
	public static Robot r;
	public static JavascriptExecutor js;
	public static Select sl;
	public static TakesScreenshot ts;

	// 1.
	public static void loadBrowserChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	// 2.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void launchUrl() throws Exception {
		driver.get(readFromExLogin(5, 2));
		
		
	}

	public static void loginArora() throws Exception {
		Thread.sleep(3000);
		WebElement UserName=driver.findElement(By.xpath("//input[@id='userName']"));
		Reporter.log("Login to EWA");
		Reporter.log("Enter valid Username into username field");
		Thread.sleep(3000);
		UserName.sendKeys(readFromExLogin(5, 0));
		driver.findElement(By.id("loginPassword")).sendKeys(readFromExLogin(2, 1));
		Reporter.log("Enter valid password into password field");
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
        Select sel=new Select(room);
		sel.selectByVisibleText(readFromExLogin(4, 2));//SQLroom 3,2
		Thread.sleep(3000);
		Reporter.log("Click Login button");
		WebElement LoginBTN=driver.findElement(By.id("submitid"));
		jsclick(LoginBTN);
		Thread.sleep(3000);
		try {
			
			WebElement sessiomsg = driver.findElement(By.cssSelector("#cvModelLoginValidationMessage"));
			WebElement sessiomsgOK = driver.findElement(By.id("cvModelLoginValidationOk"));
			if(sessiomsg.isDisplayed()) {
				Reporter.log("Session for user is already active.Do you want to create new session? dialog box displayed User click on OK button,");
		    jsclick(sessiomsgOK);
			}
			}
		catch (NoSuchElementException e) {
			Reporter.log("Session message not appeared");
		}
		Reporter.log("User Login to EWA successfully...");
	}
	public static void loginSrikanth() throws Exception {
		Thread.sleep(3000);
		WebElement UserName=driver.findElement(By.xpath("//input[@id='userName']"));
		Reporter.log("Login to EWA");
		Reporter.log("Enter valid Username into username field");
		Thread.sleep(3000);
		UserName.sendKeys(readFromExLogin(9, 0));
		driver.findElement(By.id("loginPassword")).sendKeys(readFromExLogin(2, 1));
		Reporter.log("Enter valid password into password field");
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
        Select sel=new Select(room);
		sel.selectByVisibleText(readFromExLogin(4, 2));//SQLroom 3,2
		Thread.sleep(3000);
		Reporter.log("Click Login button");
		WebElement LoginBTN=driver.findElement(By.id("submitid"));
		jsclick(LoginBTN);
		Thread.sleep(3000);
		try {
			
			WebElement sessiomsg = driver.findElement(By.cssSelector("#cvModelLoginValidationMessage"));
			WebElement sessiomsgOK = driver.findElement(By.id("cvModelLoginValidationOk"));
			if(sessiomsg.isDisplayed()) {
				Reporter.log("Session for user is already active.Do you want to create new session? dialog box displayed User click on OK button,");
		    jsclick(sessiomsgOK);
			}
			}
		catch (NoSuchElementException e) {
			Reporter.log("Session message not appeared");
		}
		Reporter.log("Task User Login to EWA successfully...");
	}
	public static String readFromExLogin(int rw,int cl) throws IOException{
		File f= new File("./data/TestData.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet mySht = wb.getSheet("ValidLogin");
		Row row = mySht.getRow(rw);
		Cell cell = row.getCell(cl);
		String name = cell.getStringCellValue();
		return name;
		}
	

	
public static void loginAlkas() throws Exception {
		Thread.sleep(3000);
		WebElement UserName=driver.findElement(By.xpath("//input[@id='userName']"));
		Reporter.log("Login to EWA");
		Reporter.log("Enter valid Username into username field");
		Thread.sleep(3000);
		UserName.sendKeys(readFromExLogin(6, 0));
		driver.findElement(By.id("loginPassword")).sendKeys(readFromExLogin(2, 1));
		Reporter.log("Enter valid password into password field");
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
        Select sel=new Select(room);
		sel.selectByVisibleText(readFromExLogin(4, 2));//SQLroom 3,2
		Thread.sleep(3000);
		Reporter.log("Click Login button");
		WebElement LoginBTN=driver.findElement(By.id("submitid"));
		jsclick(LoginBTN);
		Thread.sleep(3000);
		try {
			
			WebElement sessiomsg = driver.findElement(By.cssSelector("#cvModelLoginValidationMessage"));
			WebElement sessiomsgOK = driver.findElement(By.id("cvModelLoginValidationOk"));
			if(sessiomsg.isDisplayed()) {
				Reporter.log("Session for user is already active.Do you want to create new session? dialog box displayed User click on OK button,");
		    jsclick(sessiomsgOK);
			}
			}
		catch (NoSuchElementException e) {
			Reporter.log("Session message not appeared");
			
		}
		Reporter.log("Task User Login to EWA successfully...");
	}
		
	
	
public static void loginAmarnath() throws Exception {
	Thread.sleep(3000);
	WebElement UserName=driver.findElement(By.xpath("//input[@id='userName']"));
	Reporter.log("Login to EWA");
	Reporter.log("Enter valid Username into username field");
	Thread.sleep(3000);
	UserName.sendKeys(readFromExLogin(7, 0));
	driver.findElement(By.id("loginPassword")).sendKeys(readFromExLogin(2, 1));
	Reporter.log("Enter valid password into password field");
	WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
    Select sel=new Select(room);
	sel.selectByVisibleText(readFromExLogin(4, 2));//SQLroom 3,2
	Thread.sleep(3000);
	Reporter.log("Click Login button");
	WebElement LoginBTN=driver.findElement(By.id("submitid"));
	jsclick(LoginBTN);
	Thread.sleep(3000);
	try {
		
		WebElement sessiomsg = driver.findElement(By.cssSelector("#cvModelLoginValidationMessage"));
		WebElement sessiomsgOK = driver.findElement(By.id("cvModelLoginValidationOk"));
		if(sessiomsg.isDisplayed()) {
			Reporter.log("Session for user is already active.Do you want to create new session? dialog box displayed User click on OK button,");
	    jsclick(sessiomsgOK);
		}
		}
	catch (NoSuchElementException e) {
		Reporter.log("Session message not appeared");
	}
	Reporter.log("Task User Login to EWA successfully...");
}
	

public static void loginAjitkumar() throws Exception {
	Thread.sleep(3000);
	WebElement UserName=driver.findElement(By.xpath("//input[@id='userName']"));
	Reporter.log("Log into EWA");
	Reporter.log("Enter valid Username into username field");
	Thread.sleep(3000);
	UserName.sendKeys(readFromExLogin(8, 0));
	driver.findElement(By.id("loginPassword")).sendKeys(readFromExLogin(2, 1));
	Reporter.log("Enter valid password into password field");
	WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
    Select sel=new Select(room);
	sel.selectByVisibleText(readFromExLogin(4, 2));//SQLroom 3,2
	Thread.sleep(3000);
	Reporter.log("Click Login button");
	WebElement LoginBTN=driver.findElement(By.id("submitid"));
	jsclick(LoginBTN);
	Thread.sleep(3000);
	try {
		
		WebElement sessiomsg = driver.findElement(By.cssSelector("#cvModelLoginValidationMessage"));
		WebElement sessiomsgOK = driver.findElement(By.id("cvModelLoginValidationOk"));
		if(sessiomsg.isDisplayed()) {
			Reporter.log("Session for user is already active.Do you want to create new session? dialog box displayed User click on OK button,");
	    jsclick(sessiomsgOK);
		}
		}
	catch (NoSuchElementException e) {
		Reporter.log("Session message not appeared");
	}
	Reporter.log("Task User Login to EWA successfully...");
}
	

public static void loginVidya() throws Exception {
	Thread.sleep(3000);
	WebElement UserName=driver.findElement(By.xpath("//input[@id='userName']"));
	Reporter.log("Login to EWA");
	Reporter.log("Enter valid Username into username field");
	Thread.sleep(3000);
	UserName.sendKeys("vidya");
	driver.findElement(By.id("loginPassword")).sendKeys(readFromExLogin(2, 1));
	Reporter.log("Enter valid password into password field");
	WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
    Select sel=new Select(room);
	sel.selectByVisibleText(readFromExLogin(4, 2));//SQLroom 3,2
	Thread.sleep(3000);
	Reporter.log("Click Login button");
	WebElement LoginBTN=driver.findElement(By.id("submitid"));
	jsclick(LoginBTN);
	Thread.sleep(3000);
	try {
		
		WebElement sessiomsg = driver.findElement(By.cssSelector("#cvModelLoginValidationMessage"));
		WebElement sessiomsgOK = driver.findElement(By.id("cvModelLoginValidationOk"));
		if(sessiomsg.isDisplayed()) {
			Reporter.log("Session for user is already active.Do you want to create new session? dialog box displayed User click on OK button,");
	    jsclick(sessiomsgOK);
		}
		}
	catch (NoSuchElementException e) {
		Reporter.log("Session message not appeared");
	}
	Reporter.log("Task User Login to EWA successfully...");
}
	



public static void LogoutPage() throws Exception {
	
	
	WebElement logout= driver.findElement(By.xpath("//*[@id='logoutElement']"));
	Thread.sleep(3000);
	Actions act=new Actions(driver);
	try {
	act.moveToElement(logout).click(logout).build().perform();
	Thread.sleep(5000);
	}
	catch(NoSuchElementException e) {
		Reporter.log("Exception handled");
	}
	WebElement logoutOKBTN=driver.findElement(By.xpath("//*[@id=\"idSidenav\"]/ul/li[1]/a"));
	jsclick(logoutOKBTN);
	
	Thread.sleep(3000);
	
	try {
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.alertIsPresent());
		acceptAlert();
		}
	 catch(Exception e) {
		 Reporter.log("Alert not present!!!");
	 }
}





	
	// 3.
	public static void browserMax() {
		driver.manage().window().maximize();
	}

	// 4.
	public static String pageTitle() {
		String title = driver.getTitle();
		return title;
	}

	// 5.
	public static String pageUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	// 6.
	public static void enterText(WebElement element, String value) {
		element.sendKeys(value);
	}

	// 7.
	public static void clickElement(WebElement element) {
		element.click();
	}

	// 8.
	public static void gettingText(WebElement element) {
		element.getText();
	}

	// 9.
	public static void gettingAttribute(WebElement element, String value) {
		element.getAttribute(value);
	}

	// 10.
	public static void pauseExecution(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// 11.
	public static void closeBrowser() {
		driver.quit();
		driver.close();
	}
	public static void sendvalue(WebElement ele,String value) {
		
		ele.sendKeys(value);
		
	}

	// 12.
	public static void applyWaitsForAll() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// 13.
	public static void movingElement(WebElement element) {
		a1 = new Actions(driver);
		a1.moveToElement(element).perform();
	}
	public static void movingDoublecli(WebElement element,WebElement ele) {
		a1 = new Actions(driver);
		a1.moveToElement(element).doubleClick(ele).build().perform();
	}
	public static void movingclkElement(WebElement element) {
		a1 = new Actions(driver);
		a1.moveToElement(element).click().build().perform();
	}
	
	
	public static WebElement Refresh_Button(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"homeMenuBtn\"]/img"));
		return element;
	}
	

	// 14.
	public static void dragAndDropElement(WebElement element1, WebElement element2) {
		a1 = new Actions(driver);
		a1.dragAndDrop(element1, element2).perform();
	}

	// 15.
	public static void selectElement(WebElement element) {
		a1 = new Actions(driver);
		a1.doubleClick(element).perform();
	}

	// 16.
	public static void rightClick(WebElement element) {
		a1 = new Actions(driver);
		a1.contextClick(element).perform();
	}

	// 17.
	public static void acceptAlert() {
		a = driver.switchTo().alert();
		
		a.accept();
	}

	// 18.
	public static void dismissAlert() {
		a = driver.switchTo().alert();
		a.dismiss();
	}

	// 19.
	public static String getTextFromAlert() {
		a = driver.switchTo().alert();
		String text = a.getText();
		return text;
	}

	// 20.
	public static void sendTextToAlert(String value) {
		a = driver.switchTo().alert();
		a.sendKeys(value);
	}

	// 21.
	public static void scrollDown(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView('true')", element);
	}

	// 22.
	public static void scrollUp(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView('false')", element);
	}

	public static void jsclick(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
     
	public static void jssend(String val,WebElement element) {
		js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].sendKeys(val)", element);
	}
	
	
	
	
	// 23.
	public static void pageRefresh() {
		driver.navigate().refresh();
	}

	// 24.
	public static void pageForward() {
		driver.navigate().forward();
	}

	// 25.
	public static void pageBack() {
		driver.navigate().back();
	}

	// 26.
	public static void goToPage(String url) {
		driver.navigate().to(url);
	}

	// 27.
	public static boolean elementDisplayed(WebElement element) {
		boolean d = element.isDisplayed();
		return d;
	}

	// 28.
	public static boolean elementEnabled(WebElement element) {
		boolean e = element.isEnabled();
		return e;
	}

	// 29.
	public static boolean elementSelected(WebElement element) {
		boolean s = element.isSelected();
		return s;
	}
	public static void Soft(WebElement expected,String actual) {
		SoftAssert so=new SoftAssert();
		so.assertEquals(expected, actual);
	}
	public static void Softall() {
		SoftAssert so=new SoftAssert();
		so.assertAll();
	}
	// 30.
	public static void frameByIdOrName(String value) {
		driver.switchTo().frame(value);
	}

	// 31.
	public static void frameByWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	// 32.
	public static void frameByIndex(int value) {
		driver.switchTo().frame(value);
	}

	// 33.
	public static void windowByUrl(String url) {
		driver.switchTo().window(url);
	}

	// 34.
	public static void windowByTitle(String title) {
		driver.switchTo().window(title);
	}

	// 35.
	public static void windowById(String windowId) {
		driver.switchTo().window(windowId);
	}

	// 36.
	public static String getParentId() {
		String parentId = driver.getWindowHandle();
		return parentId;
	}

	// 37.
	public static Set<String> allId() {
		Set<String> allId = driver.getWindowHandles();
		return allId;
	}

	// 38.
	public static void goToChildtab(String parentId, Set<String> allId) {
		for (String s : allId) {
			if (!s.equals(parentId)) {
				driver.switchTo().window(s);
			}
		}
	}

	// 39.
	public static void goToChildTabByIndex(Set<String> allId, int index) {
		List<String> l = new ArrayList<String>();
		l.addAll(allId);
		driver.switchTo().window(l.get(index));
	}

	// 40.
	public static void selectDropDownByValue(WebElement element, String text) {
		sl = new Select(element);
		sl.selectByValue(text);

	}

	// 41.
	public static void selectDropDownByVisibleText(WebElement element, String text) {
		sl = new Select(element);
		sl.selectByVisibleText(text);

	}

	// 42.
	public static void selectDropDownByIndex(WebElement element, int index) {
		sl = new Select(element);
		sl.selectByIndex(index);

	}

	// 43.
	public static void deselectDropDownByValue(WebElement element, String text) {
		sl = new Select(element);
		sl.deselectByValue(text);

	}

	// 44.
	public static void deselectDropDownByVisibleText(WebElement element, String text) {
		sl = new Select(element);
		sl.deselectByVisibleText(text);

	}

	// 45.
	public static void deselectDropDownByIndex(WebElement element, int index) {
		sl = new Select(element);
		sl.deselectByIndex(index);

	}

	// 46.
	public static void deselectDropDown(WebElement element) {
		sl = new Select(element);
		sl.deselectAll();
	}

	// 47.
	public static boolean multiselectDropDown(WebElement element) {
		sl = new Select(element);
		boolean multiple = sl.isMultiple();
		return multiple;
	}

	// 48.
	public static List<WebElement> options(WebElement element) {
		sl = new Select(element);
		List<WebElement> options = sl.getOptions();
		return options;

	}

	// 49.
	public static List<WebElement> selectedOptions(WebElement element) {
		sl = new Select(element);
		List<WebElement> option = sl.getAllSelectedOptions();
		return option;

	}

	// 50.
	public static WebElement firstSelectedOptions(WebElement element) {
		sl = new Select(element);
		WebElement option = sl.getFirstSelectedOption();
		return option;

	}

	// 51.
	public static String selectAllOption(WebElement element) {
		String text = "";
		sl = new Select(element);
		List<WebElement> options = sl.getOptions();
		for (WebElement w : options) {
			text = w.getText();
			System.out.println(text);
		}
		return text;
	}

	// 52.
	public static void takeScreenshot(String filePath) {
		ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(filePath);
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void VisiblityOf(WebElement ele) {
		WebDriverWait wait =new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		
	}
	
	
	public static void readFromEx() throws IOException{
		File f= new File("C:\\Users\\nisha.r\\Documents\\Downloads\\CVS_Auto\\data\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet mySht = wb.getSheet("SearchTab");
		Row row = mySht.getRow(1);
		Cell cell = row.getCell(3);
		}

	public static void alertIsPresent() {
			WebDriverWait wait =new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.alertIsPresent());
			
			
		}
	public static String readFromExSearch(int rw,int cl) throws IOException{
			File f= new File("./data/TestData.xlsx");
			FileInputStream fis=new FileInputStream(f);
			Workbook wb=new XSSFWorkbook(fis);
			Sheet mySht = wb.getSheet("SearchTab");
			Row row = mySht.getRow(rw);
			Cell cell = row.getCell(cl);
			String name = cell.getStringCellValue();
			return name;
			}
		
	


// Dipak generic

//1. Load Browser
	public static WebDriver loadBrowser(String browserName) {

		if (browserName.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else if (browserName.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else {
			Reporter.log("we do not support this browser", true);
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}

	// 3.
	public static void launchUrl1() {
		driver.get("http://10.4.10.72:8080/CVWeb/cvLgn");
		Reporter.log("Browser launch with SIDBI Testing URL", true);
	}

	@FindBy(xpath = "//*[@id=\"rooms\"]")
	private WebElement Click_Room;

	public void getSelect_Room_Dropdown() {
		Select drop = new Select(Click_Room);
		drop.selectByVisibleText(".sendKeys(ExcelLogin(1, 2));");

	}

	// 5.
	public static void loginCVS() throws Exception {

		driver.findElement(By.xpath("//input[@id='userName']")).clear();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ExcelLogin(2, 0));
		driver.findElement(By.id("loginPassword")).clear();
		Reporter.log("Enter valid username into username field", true);
		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(1, 0));
		Reporter.log("Enter valid password into password field", true);
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		Select sel = new Select(room);
		sel.selectByVisibleText(ExcelLogin(1, 1));
		Reporter.log("Select a room", true);
		driver.findElement(By.id("submitid")).click();
		Reporter.log("Click on the Login button", true);
		try {
			WebElement sessionmsgYes = driver.findElement(By.xpath(" //button[@id='cvModelLoginValidationOk']"));
			Reporter.log("Session for user is already active.Do you want to create new Session? dialog box displayed",
					true);
			sessionmsgYes.click();
			Thread.sleep(4000);
			Reporter.log("Click on the Yes button", true);

		} catch (Exception e) {
			// Session message is not displayed
		}
	}

	// 6.
	public static void loginUser1() throws Exception {

		driver.findElement(By.xpath("//input[@id='userName']")).clear();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ExcelLogin(3, 0));
		driver.findElement(By.id("loginPassword")).clear();
		Reporter.log("Enter valid username into username field", true);
		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(1, 0));
		Reporter.log("Enter valid password into password field", true);
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		Select sel = new Select(room);
		sel.selectByVisibleText(ExcelLogin(1, 1));
		Reporter.log("Select a room", true);
		driver.findElement(By.id("submitid")).click();
		Reporter.log("Click on the Login button", true);
		try {
			WebElement sessionmsgYes = driver.findElement(By.xpath(" //button[@id='cvModelLoginValidationOk']"));
			Reporter.log("Session for user is already active.Do you want to create new Session? dialog box displayed",
					true);
			sessionmsgYes.click();
			Thread.sleep(4000);
			Reporter.log("Click on the Yes button", true);

		} catch (Exception e) {
			// Session message is not displayed
		}
	}

	// 7.
	public static void loginUser2() throws Exception {

		driver.findElement(By.xpath("//input[@id='userName']")).clear();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ExcelLogin(4, 0));
		driver.findElement(By.id("loginPassword")).clear();
		Reporter.log("Enter valid username into username field", true);
		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(1, 0));
		Reporter.log("Enter valid password into password field", true);
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		Select sel = new Select(room);
		sel.selectByVisibleText(ExcelLogin(1, 1));
		Reporter.log("Select a room", true);
		driver.findElement(By.id("submitid")).click();
		Reporter.log("Click on the Login button", true);
		try {
			WebElement sessionmsgYes = driver.findElement(By.xpath(" //button[@id='cvModelLoginValidationOk']"));
			Reporter.log("Session for user is already active.Do you want to create new Session? dialog box displayed",
					true);
			sessionmsgYes.click();
			Thread.sleep(4000);
			Reporter.log("Click on the Yes button", true);

		} catch (Exception e) {
			// Session message is not displayed
		}
	}

	// 8.
	public static void loginUser3() throws Exception {

		driver.findElement(By.xpath("//input[@id='userName']")).clear();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ExcelLogin(5, 0));
		driver.findElement(By.id("loginPassword")).clear();
		Reporter.log("Enter valid username into username field", true);
		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(1, 0));
		Reporter.log("Enter valid password into password field", true);
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		Select sel = new Select(room);
		sel.selectByVisibleText(ExcelLogin(1, 1));
		Reporter.log("Select a room", true);
		driver.findElement(By.id("submitid")).click();
		Reporter.log("Click on the Login button", true);
		try {
			WebElement sessionmsgYes = driver.findElement(By.xpath(" //button[@id='cvModelLoginValidationOk']"));
			Reporter.log("Session for user is already active.Do you want to create new Session? dialog box displayed",
					true);
			sessionmsgYes.click();
			Thread.sleep(4000);
			Reporter.log("Click on the Yes button", true);

		} catch (Exception e) {
			// Session message is not displayed
		}
	}

	// 9.
	public static void loginUser4() throws Exception {

		driver.findElement(By.xpath("//input[@id='userName']")).clear();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ExcelLogin(6, 0));
		driver.findElement(By.id("loginPassword")).clear();
		Reporter.log("Enter valid username into username field", true);
		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(1, 0));
		Reporter.log("Enter valid password into password field", true);
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		Select sel = new Select(room);
		sel.selectByVisibleText(ExcelLogin(1, 1));
		Reporter.log("Select a room", true);
		driver.findElement(By.id("submitid")).click();
		Reporter.log("Click on the Login button", true);
		try {
			WebElement sessionmsgYes = driver.findElement(By.xpath(" //button[@id='cvModelLoginValidationOk']"));
			Reporter.log("Session for user is already active.Do you want to create new Session? dialog box displayed",
					true);
			sessionmsgYes.click();
			Thread.sleep(4000);
			Reporter.log("Click on the Yes button", true);

		} catch (Exception e) {
			// Session message is not displayed
		}
	}

	// 10.
	public static void loginUser5() throws Exception {

		driver.findElement(By.xpath("//input[@id='userName']")).clear();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ExcelLogin(7, 0));
		driver.findElement(By.id("loginPassword")).clear();
		Reporter.log("Enter valid username into username field", true);
		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(1, 0));
		Reporter.log("Enter valid password into password field", true);
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		Select sel = new Select(room);
		sel.selectByVisibleText(ExcelLogin(1, 1));
		Reporter.log("Select a room", true);
		driver.findElement(By.id("submitid")).click();
		Reporter.log("Click on the Login button", true);
		try {
			WebElement sessionmsgYes = driver.findElement(By.xpath(" //button[@id='cvModelLoginValidationOk']"));
			Reporter.log("Session for user is already active.Do you want to create new Session? dialog box displayed",
					true);
			sessionmsgYes.click();
			Thread.sleep(4000);
			Reporter.log("Click on the Yes button", true);

		} catch (Exception e) {
			// Session message is not displayed
		}
	}

	

	// 6. datadriven
	// 1. LoginCVS

	public static String ExcelLogin(int rowNo, int cellNo) throws Exception {
		File src = new File("./data/TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			XSSFSheet s = wb.getSheet("SIDBILogin");
			XSSFRow row = s.getRow(rowNo);
			XSSFCell cll = row.getCell(cellNo);
			String cellType = cll.getStringCellValue();
			return cellType;
		}
	}
}
      
/*

 //53. public static String excelRead(String fileName, String sheetName, int
 * rowNo, int cellNo) throws IOException
 *  { f=new File(""+fileName+".xlsx");
 *   fin
 * = new FileInputStream(f); w = new XSSFWorkbook(fin); s =
 * w.getSheet(sheetName); row =s.getRow(rowNo); cell = row.getCell(cellNo); int
 * cellType = cell.getCellType(); String text=""; if (cellType==1) {
 * text=cell.getStringCellValue(); } else if
 * (DateUtil.isCellDateFormatted(cell)) { Date d = cell.getDateCellValue();
 * System.out.println(d); SimpleDateFormat sim = new
 * SimpleDateFormat("dd-MM-yyyy"); text = sim.format(d); }else { double d =
 * cell.getNumericCellValue(); long l = (long)d; text = String.valueOf(l); }
 * return text; }
 * 
 * //54. public static void excelWrite(String fileName, String sheetName, int
 * rowNo, int cellNo, String value) throws IOException
 *  { f=new
 * File(""+fileName+".xlsx");
 *  w = new XSSFWorkbook();
 *   s =
 * w.createSheet(sheetName); row= s.createRow(rowNo); cell =
 * row.createCell(cellNo); cell.setCellValue(value); fout = new
 * FileOutputStream(f); w.write(fout); System.out.println("Done"); }
 * 
 * //55. public static void excelUpdate(String fileName, String sheetName, int
 * rowNo, int cellNo, String oldValue, String newValue) throws IOException {
 * f=new File(""+fileName+".xlsx"); fin = new FileInputStream(f); w = new
 * XSSFWorkbook(fin); s = w.getSheet(sheetName); row= s.getRow(rowNo); cell =
 * row.getCell(cellNo); String text = cell.getStringCellValue(); if
 * (text.equals(oldValue)) { cell.setCellValue(newValue); } fout = new
 * FileOutputStream(f); w.write(fout); System.out.println("Done"); } public
 * static void excelUpdates(String fileName, String sheetName, int rowNo, int
 * cellNo, String value) throws IOException { f=new File(""+fileName+".xlsx");
 * fin = new FileInputStream(f); w = new XSSFWorkbook(fin); s =
 * w.getSheet(sheetName); row= s.getRow(rowNo); cell = row.getCell(cellNo);
 * cell.setCellValue(value); fout = new FileOutputStream(f); w.write(fout);
 * System.out.println("Done");
 * 
 * } //56. public static void excelAddNewRow(String fileName, String sheetName,
 * int rowNo, int cellNo, String value) throws IOException{ f=new
 * File(""+fileName+".xlsx"); fin = new FileInputStream(f); w = new
 * XSSFWorkbook(fin); s = w.getSheet(sheetName); row= s.createRow(rowNo); cell =
 * row.createCell(cellNo); cell.setCellValue(value); fout = new
 * FileOutputStream(f); w.write(fout); System.out.println("Done"); } //57.
 * public static void createExcel(String fileName, String sheetName) throws
 * IOException { f=new File("" + fileName + ".xlsx"); w = new XSSFWorkbook(); s=
 * w.createSheet(sheetName); fout=new FileOutputStream(f); w.write(fout); }
 * //58. public static void createRow(String fileName, String sheetName, int
 * rowNo) throws IOException { f=new File(""+fileName+".xlsx"); fin = new
 * FileInputStream(f); w = new XSSFWorkbook(fin); s= w.getSheet(sheetName);
 * s.createRow(rowNo); fout=new FileOutputStream(f); w.write(fout); } //59.
 * public static void createCell(String fileName, String sheetName, int rowNo,
 * int cellNo, String value) throws IOException { f=new
 * File(""+fileName+".xlsx"); fin = new FileInputStream(f); w = new
 * XSSFWorkbook(fin); s= w.getSheet(sheetName); row= s.getRow(rowNo); cell =
 * row.createCell(cellNo); cell.setCellValue(value); fout=new
 * FileOutputStream(f); w.write(fout);
 * 
 * } //60. public static int getNoOfRows(String fileName, String sheetName)
 * throws IOException { f=new File(""+fileName+".xlsx"); fin = new
 * FileInputStream(f); w = new XSSFWorkbook(fin); s= w.getSheet(sheetName); int
 * NumberOfRows = s.getPhysicalNumberOfRows(); return NumberOfRows;
 * 
 * } //61. public static int getNoOFColumn(String fileName, String sheetName)
 * throws IOException { int NumberOfCells=0; f=new File(""+fileName+".xlsx");
 * fin = new FileInputStream(f); w = new XSSFWorkbook(fin); s=
 * w.getSheet(sheetName); for (int i = 0; i < getNoOfRows(fileName, sheetName);
 * i++) { Row r = s.getRow(i); NumberOfCells = r.getPhysicalNumberOfCells();
 * return NumberOfCells; }
 * 
 * } //62. public static int getTotalNoOfCells(String fileName, String
 * sheetName) throws IOException { int rows = getNoOfRows(fileName, sheetName);
 * int column = getNoOFColumn(fileName, sheetName); int Totalcells =rows*column;
 * return Totalcells; } }
 */