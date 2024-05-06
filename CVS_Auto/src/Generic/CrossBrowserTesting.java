package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting extends BaseClass {
	
	@Parameters("browser")
	@Test
	private void LaunchCVSBrow(String brow) {
		
		
		
		if (brow.equals("chromebrowser")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			}
		else if (brow.equals("edgebrowser")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		driver.get("http://10.4.10.60:8080/CVWeb/cvLgn");
		driver.manage().window().maximize();
		
	}
	
	


		

	}
	
	


