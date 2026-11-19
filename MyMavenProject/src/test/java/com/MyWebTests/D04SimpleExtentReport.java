package com.MyWebTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class D04SimpleExtentReport {

	public static void main(String[] args) throws InterruptedException {
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("SimpleReport.html");;
		//This object represents the report file
		ExtentReports report = new ExtentReports();
		//This object represents the report (about the test cases)
		ExtentTest test;
		//This object represents single test case 
		
		report.attachReporter(htmlReport);
		//This will tell that whatever report is generated store it inside the above file
		
		//Add environment details for your project
		report.setSystemInfo("Machine", "Dell Laptop");
		report.setSystemInfo("Browser", "MS Edge");
		report.setSystemInfo("User Name", "Shrutika");
		report.setSystemInfo("OS", "Windows 10");
		report.setSystemInfo("Processor", "I5");
		
		//Configuration about look and feel of the report
		htmlReport.config().setDocumentTitle("My first Extent Report");
		htmlReport.config().setReportName("Google Tests");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setTimeStampFormat("dd - MMM - yyyy");
		
		//Create a test case for reporting
		test = report.createTest("Google Title Test");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		System.out.println("Title:  " + driver.getTitle());
		
		driver.quit();
		
		//Will add the status and all the details of test case to report
		test.log(Status.PASS, MarkupHelper.createLabel("Fist Test: Google title test case", ExtentColor.GREEN));
		
		//Create another test case
		test = report.createTest("Google Search");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Maven Project");
		Thread.sleep(2000);
		driver.quit();
		
		test.log(Status.FAIL, MarkupHelper.createLabel("Second Test: Google Search", ExtentColor.RED));
		
		report.flush();
		//This will generate the report file
	}

}
