package Utilities_Helper;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class HelperClass {
	
public WebDriver driver;
	 
	//********** We want to pass the driver from the TestScript ********//
	 public HelperClass(WebDriver driver)
	 {
		 this.driver=driver;
	 }
//*****************************************************************************************
	public  void selectByText(WebElement element,String str_msg)
	{
	 try
	 {
		 Select s = new Select(element);
		 s.selectByValue(str_msg);
	 }
	 catch(NoSuchElementException e)
	 {
		 System.out.println("Specifed WebElement is not Present in the WebPage: "+e);
	 }
	}
//*****************************************************************************************
	 public  void EnterText(WebElement element,String value)
	 {
		 try
		 {
			element.clear();
			element.sendKeys(value);
		 }
		 catch(NoSuchElementException e)
		 {
			System.out.println("Specifed WebElement is not Present in the WebPage: "+e);
		 }
	 }
//*****************************************************************************************
	 public String getAlertText()
	 {
		 String text =null;
		 try
		 {
			 Thread.sleep(4000);
			 text =driver.switchTo().alert().getText();
			 Thread.sleep(2000);
		 }
		 catch(Exception e)
		 {
			 System.out.println(" Alert is not present or searching the webElemnt is not valid :"+e);
		 }
		 return text;
	 }
//*****************************************************************************************
	public  boolean verifyAlertMessage( String verify_msg) 
	{
		try
		{
			String Actual_msg =  getAlertText();
			if(Actual_msg.equals(verify_msg))
			{
				System.out.println("Both the msg is verifyed & it's same");
				return true;
			}
			else
			{
				System.out.println("Messgae is not same");
				return false;
			}
			}
		 
		catch(Exception  e)
		{
			System.out.println(" Alert is not present or searching the webElemnt is not valid :"+e);
		}
		return false;
	}
//*****************************************************************************************
	public  void getURL(String baseURL)
	{
		try
		{
			driver.get(baseURL);
		}
		catch(WebDriverException e)
		{
			System.out.println("Entered URL is not valid: "+e);
		}
	}
 
//*****************************************************************************************
	public  boolean verifyText(WebElement element ,String expectedString)
	{
	try
		{
			String actualString= getText(element);
			if(expectedString.equals(actualString))
			{
				System.out.println(" text is verified");
				return true;
			}
			else
			{
				System.out.println("String content is different");
				return false;
			}
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Specifed WebElement is not Present in the WebPage: "+e);
		}
	return false;
	}
//*****************************************************************************************
	public boolean verifyopiton(WebElement element, String verifyOption)
	{
		try
		{
			Select s = new Select(element);
			WebElement actualElement =	s.getFirstSelectedOption();
			if(verifyOption.equals(actualElement))
			{
				System.out.println("Element is verifyed sucessfully");
				return true;
			}
			else
			{
				System.out.println("Element is not matched");
				return false;
			}
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Specifed WebElement is not Present in the WebPage: "+e);
		}
	return false;
	}
//*****************************************************************************************
 
	public String getText(WebElement element)
	{ String text=null;
		try
		{
			text =element.getText();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Specifed WebElement is not Present in the WebPage: "+e);
		}
		return text;
	}
//*****************************************************************************************
 
 public  void switchToChildWindow() {
		try {
			
			String MainWindow=driver.getWindowHandle();
			Set<String> s1=driver.getWindowHandles();		
	        Iterator<String> i1=s1.iterator();		
	        while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();		
	             if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	            {    		
	                 driver.switchTo().window(ChildWindow);
	            }
	        }
		   }	
		catch (Exception e) {
				System.out.println("The window could not be switched to the clind window :"+e);
		}
	}
//*****************************************************************************************

	public void switchToParentWindow() {
		try {
			Thread.sleep(3000);
			Set <String> CalcWind = driver.getWindowHandles();
			for (String winHandle : CalcWind) {
				driver.switchTo().window(winHandle);
			}
			System.out.println("The browser is switched to parent window");
		} catch (Exception e) 
		{
			System.out.println("The parent window couldn't be switched :"+e);
		}	
	}
//*****************************************************************************************
	public  void switchToFrame(String Name) {
		try {
			driver.switchTo().frame(Name);
			System.out.println("Navigated to frame with id ");
		} catch (NoSuchFrameException e) {
			System.out.println("Unable to locate frame with id : "+ e);
		} 
	}
//*****************************************************************************************
	public void switchtoDefaultFrame() {
		try {
			driver.switchTo().defaultContent();
			System.out.println("Navigated back to webpage from frame");
		} catch (Exception e) {
			System.out.println("unable to navigate back to main webpage from frame :"+e);
		}
	}
//*****************************************************************************************
	 public void quitBrowser() {
			try {
				driver.quit();
			} catch (WebDriverException e) {
				System.out.print("The browser could not be closed :"+e);
			}
	}	
//*****************************************************************************************
	 public void closeBrowser() {
			try {
				driver.close();
				System.out.println("The browser page is closed");
			} catch (WebDriverException e) {
				System.out.print("The browser could not be closed :"+e);
			}
	}
//*****************************************************************************************

	 public  void acceptAlert() {
			try {
				driver.switchTo().alert().accept();
				System.out.println("The alert box is accepted");
			} catch (Exception e) {
				System.out.println("The alert is not available :"+e);
			}
	 }
 
//*****************************************************************************************
	public  void scrollToBottom() {
			try
			{
				((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
			}
			catch(Exception e)
			{
				System.out.println(" Unable to ScrollDown in webpage :"+e);
			}
	}
//*****************************************************************************************
	public  void scrollToUp() {
			try
			{
				((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)");
			}
			catch(Exception e)
			{
				System.out.println(" Unable to ScrollDown in webpage :"+e);
			}
	}
//*****************************************************************************************
	public void moveToElement(WebElement main_menu,WebElement sub_menu)
		{
			try
			{
				Actions a = new Actions(driver);
				a.moveToElement(main_menu).moveToElement(sub_menu).click().perform();
			}
			catch(WebDriverException e)
			{
				System.out.println(" WebElement is Not Found :"+e);
			}
	}

//*****************************************************************************************
	public void datepicker(WebElement element,String Date)
	{
	try
		{
		element.click();
		WebElement dateWidget = driver.findElement(By.id("ui-datepicker-div"));
		//List<WebElement> rows=dateWidget.findElements(By.tagName("tr"));
		List<WebElement> columns=dateWidget.findElements(By.tagName("td"));
		for (WebElement ele : columns)
		{
			if (ele.getText().equals(Date)){
			ele.findElement(By.linkText(Date)).click();
			break;
		}
		}
	}
	catch(WebDriverException e)
	{
		System.out.println(" WebElement is Not Found :"+e);
	}
	}
//*****************************************************************************************
	public void isEnabled(WebElement element)
	{
	try
		{
		Boolean value =	element.isEnabled();
		if(value)
		{
		System.out.println(" Element is enabled ");
		element.click();
		}
		else
		{
		System.out.println("Element is Disabled");
		}
	}catch( NoSuchElementException e)
	{
		System.out.println("WebElement is Not Found :"+e);
	}
	}
 
//*****************************************************************************************
	public void dismissAlert() {
	try {
		driver.switchTo().alert().dismiss();
		System.out.println("The alert box is dismissed");
	} catch (Exception e) {
		System.out.println("The alert is not available :"+e);
	}
	}
 
//*****************************************************************************************
	public void clickElement(WebElement element) 
	{
		try {
			element.click();
			System.out.println("element is clicked successfully.");
		} 
		catch (NoSuchElementException e) 
		{
			System.out.println(" Unable to clicked on element" +e);
		}
	}	

}
