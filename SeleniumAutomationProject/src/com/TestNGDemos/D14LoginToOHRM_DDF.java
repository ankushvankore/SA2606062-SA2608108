package com.TestNGDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import graphql.Assert;

/*
 * 1. Read the data (user name and password) from the excel file
 * 2. Pass this data to the test case
 * 3. Try login with this data
 * 4. Update the result column in Excel file (Write the data to excel file)
 */
public class D14LoginToOHRM_DDF {
	File file;
	FileInputStream fis;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	WebDriver driver;
	int index = 1;

	@Test(dataProvider = "getLoginData")
	public void loginToOHRM(String un, String ps) {
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(ps);
		driver.findElement(By.tagName("button")).click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("dash"));
	}

	@DataProvider
	public Object[][] getLoginData() {
		int totalRows = sheet.getPhysicalNumberOfRows();
		String[][] loginData = new String[totalRows-1][2];
		
		for(int i = 0; i < totalRows-1; i++) {
			row = sheet.getRow(i+1);
			for(int j = 0; j < 2; j++) {
				cell = row.getCell(j);
				loginData[i][j] = cell.getStringCellValue();
			}
		}

		return loginData;
	}
	
	@AfterMethod
	public void logout() {
		row = sheet.getRow(index);
		cell = row.getCell(2);
		if (driver.getCurrentUrl().contains("dashboard")) {
			System.out.println("Login sucessful!!!");
			driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
			driver.findElement(By.linkText("Logout")).click();
			
			cell.setCellValue("Pass");
		}
		else {
			System.out.println("Login fail!!! Invalid credtionals!!!");
			
			cell.setCellValue("Fail");
		}			
		
		index++;
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File("ExcelFiles/OHRM_LoginData.xlsx");
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		//sheet = wb.getSheetAt(0);
		sheet = wb.getSheet("Sheet1");
		fos = new FileOutputStream(file);
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fis.close();
		
		driver.close();
	}

}
