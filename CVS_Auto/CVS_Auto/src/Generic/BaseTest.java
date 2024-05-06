package Generic;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class BaseTest implements IAutoConst {
	public WebDriver driver;
	/*static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		System.setProperty(EDGE_KEY, EDGE_VALUE);
	}*/

	@Parameters("browser")
	@BeforeClass
	public void beforeTest(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if ((browser.equalsIgnoreCase("chrome"))) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		String url = Config.getproperty(CONFIG_PATH, "URL");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.get("http://10.4.10.72:8080/CVWeb/login");
		driver.manage().window().maximize();

	}
	
	@AfterMethod //AfterMethod annotation - This method executes after every test execution
	public void screenShot(ITestResult result){
	//using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
	if(ITestResult.FAILURE==result.getStatus()){
	try{
	// To create reference of TakesScreenshot
	TakesScreenshot screenshot=(TakesScreenshot)driver;
	// Call method to capture screenshot
	File src=screenshot.getScreenshotAs(OutputType.FILE);
	// Copy files to specific location
	// result.getName() will return name of test case so that screenshot name will be same as test case name
	//File destFile=new File("D:\\"+result.getName()+".png");
	File destFile=new File("D://Screenshot/"+result.getName()+".png");
	FileUtils.copyFile(src,destFile );
	System.out.println("Successfully captured a screenshot");
	}catch (Exception e){
	System.out.println("Exception while taking screenshot "+e.getMessage());
	}
	}
	//driver.quit();
	}

	

	/*
	 * @AfterMethod 
	 * public void CloseApplication(){ 
	 * driver.close(); 
	 * }
	 */

}
