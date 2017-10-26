//package BusinessReusables;
//
//import java.util.Properties;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;
//
//import Utilities_Helper.HelperClass;
//import Pages.Login;
//import Pages.Product;
////import SCB.SCM_Automation.TestBaseClass;
//
//public class ReusableScripts {
//
//	WebDriver driver;
//	HelperClass HelperClass;
//	
//	@Test
//	public void testScript1() throws Exception
//	{
//		
//		SCB.SCM_Automation.TestBaseClass ConfigProp = new SCB.SCM_Automation.TestBaseClass();
//		Properties ConfigObj = ConfigProp.LoadConfigProperties();	
//		
//		driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		HelperClass = new HelperClass(driver);
//		HelperClass.getURL(ConfigObj.getProperty("AutomationPracticeURL"));
//		//Uid - mngr95462 Password - YsAjeqE
//	    Login lg = new Login (driver, HelperClass);
//		lg.login("raghulmec@gmail.com", "maveric1@");
//		
//		Product product = new Product(driver, HelperClass);
//		product.addtocart("3");	
//		
//	
//	
//		
//		
//		
//	}
//}
