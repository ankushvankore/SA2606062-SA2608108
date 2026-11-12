package com.TestNGDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D09KeywordDrivenFramework {
	WebDriver driver;
	File file;		//As we need to get the data from file
	FileInputStream fis;	//As we are reading the data from file
	Properties pr;	//As the data in the file is stored in properties = value format
	
	@Test
	public void loginToCRM() {
		driver.findElement(By.id(pr.getProperty("userNameId"))).sendKeys(pr.getProperty("username"));
		driver.findElement(By.name(pr.getProperty("passwordName"))).sendKeys(pr.getProperty("password"));
		driver.findElement(By.cssSelector(pr.getProperty("rememberCss"))).click();
		driver.findElement(By.xpath(pr.getProperty("submitXPath"))).click();
		
		driver.findElement(By.linkText(pr.getProperty("signoutLinkText"))).click();
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File("Utilities/MyLocators.properties");
		fis = new FileInputStream(file);
		pr = new Properties();
		pr.load(fis);
		//Will load all the properties in pr object. Now this pr object is holding all the properties for that file
		//System.out.println(pr.getProperty("url"));
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(pr.getProperty("url"));
		//This will fetch the value of url property
	}

	@AfterTest
	public void afterTest() {
	}

}
