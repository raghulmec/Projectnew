//package Utilities_Helper;
//
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;
//
//import Utilities_Helper.HelperClass;
//
//public class FileUploadDemo {
//	
//	public WebDriver driver =null;
//
//	@Test
//	public void test1()
//	{
//		try
//		{
//		driver = new FirefoxDriver();
//		HelperClass HelperClass = new HelperClass(driver);
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		HelperClass.getURL("https://my.naukri.com/account/createaccount");
//		WebElement expbutton =	driver.findElement(By.xpath("//button[text()='I am a Professional']"));
//		HelperClass.clickElement(expbutton);
//		Thread.sleep(2000);
//		WebElement clickupload =driver.findElement(By.xpath("//input[@name='uploadCV']"));
//		HelperClass.clickElement(clickupload);
//		String filePath =	"C:\\Users\\raghull\\Desktop\\AutoIT Files\\Filupload.exe";
//		FileuploadByAutoIt(filePath);
//		}
//	catch(  InterruptedException e)
//		{
//		System.out.println();
//		}
//	}
//	
//	public void FileuploadByAutoIt(String FilePath)
//	{
//		try
//		{
//			Thread.sleep(2000);
//			Runtime.getRuntime().exec(FilePath);
//			Thread.sleep(2000);
//		}
//		catch(Exception e)
//		{
//		System.out.println();
//		}
//		
//	}
//	
//}
