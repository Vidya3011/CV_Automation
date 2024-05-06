package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecurityPermission {

	@FindBy(xpath=("//a[@id='security']"))
    private WebElement SecurityOption;
	
	
	@FindBy(xpath=("//button[@id='securityAdd']"))
    private WebElement SecurityAddbutton;
	
	@FindBy(xpath=("//span[@id='floatButton']"))
    private WebElement FloatButton;
	
	@FindBy(xpath=("//button[@id='selectedUsersAndGroups']"))
    private WebElement SelectUserGroupok;
	
	@FindBy(xpath=("//img[@id='imgAssign']"))
    private WebElement Assignbutton;
	
	@FindBy(xpath=("//button[@id='applySecurity']"))
    private WebElement Applybutton;
	
	@FindBy(xpath=("//button[@id='securityUpdate']"))
    private WebElement Securityupdateok;
	
	@FindBy(xpath=("//input[@id='myInput']"))
    private WebElement SearchUser;
	
	@FindBy(xpath=("//button[@id='showUsers']"))
    private WebElement ShowUsers;
	
	@FindBy(xpath=(".//div[@id='groupModal']/ul/li/a"))
    private WebElement user;
	
	public WebDriver driver;
	Actions action ;
	public SecurityPermission(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		action = new Actions(driver);
		this.driver = driver;
	}
		public void Security() {
			
	}
}
