package SCB.SCM_Automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;

public class TestBaseClass {
	Properties prop;
	
	 @BeforeSuite	
	 public Properties LoadConfigProperties() throws IOException{
	        
	       File propFile = new File(System.getProperty("user.dir")+"\\src\\test\\java\\Config\\config.properties" );
		
	       FileInputStream fileInput = null;
	        try{
	            fileInput = new FileInputStream(propFile);
	        } catch (FileNotFoundException e){
	            e.printStackTrace();
	        }

	        Properties prop = new Properties();
	        //Load properties file
	        try{
	            prop.load(fileInput);
	        }catch (IOException e){
	            e.printStackTrace();
	        }

/*	        System.out.println(prop.getProperty("TestDataFilePath"));
	        System.out.println(prop.getProperty("URL"));
	        System.out.println(prop.getProperty("TestDataSheet"));
	        System.out.println(System.getProperty("user.dir"));*/
	        
	        return prop;
	    }

@AfterSuite
public void afterSutie()
{
	
}
}
