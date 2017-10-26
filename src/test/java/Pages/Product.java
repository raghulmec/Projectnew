package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities_Helper.HelperClass;

public class Product {

	public WebDriver driver;
	HelperClass HelperClass;

	
	public Product(WebDriver driver, HelperClass HelperClass)
	{
		this.driver=driver;
		this.HelperClass = HelperClass;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=".//*[@id='block_top_menu']/ul/li[3]/a")WebElement T_Shrit;
	@FindBy(xpath=".//*[@id='center_column']/ul/li/div/div[2]/span/span") WebElement inStactforScrolldown;
	@FindBy(xpath=".//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img") WebElement productimg;
	@FindBy(xpath=".//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span") WebElement add;
	@FindBy(xpath="//input[@id='quantity_wanted'] ")WebElement enterQuantity;
	@FindBy(xpath=".//*[@id='product_1_1_0_26668']/td[5]/input[2]")WebElement AddtoCart;
	@FindBy(xpath=".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")WebElement clickAddcart;
	@FindBy(xpath="//input[@name='quantity_1_1_0_26668']")WebElement updateCartCount;
	@FindBy(xpath="//div[@id='center_column']/p[2]/a[1]/span")WebElement proceedtoCheckOut1;
	@FindBy(xpath=".//*[@id='center_column']/form/p/button")WebElement proceedtoCheckOut2;
	
	public void addtocart(String quanty) throws Exception
	{
		
		HelperClass.clickElement(T_Shrit);
	   
	   //HelperClass.scrollByElement(inStactforScrolldown);
	   
	   HelperClass.moveToElement(productimg, add);
	 
	   HelperClass.clickElement(clickAddcart);
	   
	   HelperClass.clickElement(updateCartCount);
	   
	   HelperClass.EnterText(updateCartCount, quanty);
	   
	   HelperClass.clickElement(proceedtoCheckOut1);
	   
	   HelperClass.clickElement(proceedtoCheckOut2);
	   
	   
	   
	}
}
