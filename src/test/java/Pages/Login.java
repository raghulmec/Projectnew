package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities_Helper.HelperClass;

//import Test.SCB.TestScript1;

public class Login {

	public WebDriver driver;
	HelperClass HelperClass;

	public Login(WebDriver driver, HelperClass HelperClass)
	{
		this.driver=driver;
		this.HelperClass = HelperClass;
		PageFactory.initElements(driver, this);
	}

	//Page Factory
@FindBy(xpath="//a[@class='login']") WebElement siginbutton;
@FindBy(xpath = "//input[@id='email']") WebElement username;
@FindBy(xpath="//input[@id='passwd']") WebElement password;
@FindBy(xpath="//button[@id='SubmitLogin']") WebElement login;


public void login(String uname, String pwd) throws InterruptedException
{

	HelperClass.clickElement(siginbutton);
//	HelperClass.scrollByElement(username);
	
	HelperClass.EnterText(username, uname);
	
	HelperClass.EnterText(password, pwd);
	
	HelperClass.clickElement(login);
}

}
