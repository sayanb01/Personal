package practice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Class1 {
	
	ExtentReports extent;

	@Test
	public void Hello()
	{
		extent.createTest("Hello");
		System.out.println("Class1 method1");

	}
	
	@Test
	public void Hello2()
	{
		extent.createTest("Hello2");
		System.out.println("Class1 method2");
	}
	
	@Test
	public void Hello3()
	{
		extent.createTest("Hello3");
		System.out.println("Class1 method3");
	}

	@BeforeTest
	public void initialize()
	{
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Test Report");
		reporter.config().setDocumentTitle("Non-framework report");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		
	}
	
	@AfterTest
	public void report()
	{
		extent.flush();
	}
}

