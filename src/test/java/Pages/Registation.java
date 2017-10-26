package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.jetty9.io.ClientConnectionFactory.Helper;

import Utilities_Helper.HelperClass;

public class Registation {
	
	public WebDriver driver;
	HelperClass HelperClass;;
	
	
	public Registation(WebDriver driver,HelperClass HelperClass)
	{
		this.driver=driver;
		this.HelperClass = HelperClass;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='name_3_firstname']") WebElement f_name;
	@FindBy(xpath="//*[@id='name_3_lastname']")  WebElement l_name;
	@FindBy(xpath="//*[@id='pie_register']/li[2]/div/div/input[1]") WebElement status;
	@FindBy(xpath="//*[@id='pie_register']/li[3]/div/div[1]/input[1]") WebElement hobby;
	@FindBy(xpath="//*[@id='dropdown_7']")  WebElement country;
	@FindBy(xpath="//*[@id='mm_date_8']") WebElement month;
	@FindBy(xpath="//*[@id='dd_date_8']") WebElement date;
	@FindBy(xpath="//*[@id='yy_date_8']") WebElement year;
	@FindBy(xpath="//*[@id='phone_9']") WebElement phone_number;
	@FindBy(xpath="//*[@id='username']") WebElement username;
	@FindBy(xpath="//*[@id='email_1']") WebElement email;
	@FindBy(xpath="//*[@id='password_2']") WebElement password;
	@FindBy(xpath="//*[@id='confirm_password_password_2']") WebElement confirm_password;
	@FindBy(xpath="//*[@id='pie_register']/li[14]/div/input") WebElement submit;
	
	
	
	public void doRegistation(String fname,String lname,String n_country,String month1,String date1,String year1,String phn_no,String username1,String email1,String pwd,String cfm_pwd)
	{
		
		HelperClass.EnterText(f_name, fname);
		HelperClass.EnterText(l_name, lname);
		HelperClass.clickElement(status);
		HelperClass.clickElement(hobby);
		HelperClass.selectByText(country, n_country);
		HelperClass.selectByText(month, month1);
		HelperClass.selectByText(date, date1);
		HelperClass.selectByText(year, year1);
		HelperClass.EnterText(phone_number, phn_no);
	    HelperClass.EnterText(username, username1);
        HelperClass.EnterText(email, email1);
	    HelperClass.EnterText(password, pwd);
        HelperClass.EnterText(confirm_password, cfm_pwd);
        HelperClass.clickElement(submit);
	}

}
