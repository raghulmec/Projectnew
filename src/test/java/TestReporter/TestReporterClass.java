package TestReporter;

import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestReporterClass {

	private static ExtentReports extent;
	//private static ExtentTest test;
	private static ExtentHtmlReporter htmlReporter;
	private static String filePath = "./SCBreport.html";
	
	public static ExtentReports GetExtent(){
			if (extent != null)
				return extent; //avoid creating new instance of html file
				extent = new ExtentReports();
				extent.attachReporter(getHtmlReporter());
			return extent;
		}
	
	private static ExtentHtmlReporter getHtmlReporter() {
	    htmlReporter = new ExtentHtmlReporter(filePath);
	    // make the charts visible on report open
		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle("SEM's application Report");
		htmlReporter.config().setReportName("AutomationTest Report for SEM's application");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setTimeStampFormat("MM:DD:YYYY");
		
		return htmlReporter;
	}
	
	
/*	public static void writeResultFailure(){
		
	}*/
	
/*	public static void WriteResultToExtentReport(ITestResult result){
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			
			extent.createTest(testCaseName,"Test FAILED");
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"Test Case FAILED due to below issues", ExtentColor.RED));
			//here MarkupHelper.createLabel is ue to get the name of test case and to add the color 
			test.fail(result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+"Test Case PASSED", ExtentColor.GREEN));
		}
		else
		{
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+"Test Case SKIPPED", ExtentColor.YELLOW));
			test.skip(result.getThrowable());
		}
	}*/
	
	
}
