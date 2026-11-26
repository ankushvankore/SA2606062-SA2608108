package com.AssignmentSolutions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A36CreateLoginFile {
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int i = 0;
	
	@Test(dataProvider = "getLoginData")
	public void createLoginFile(String un, String ps, String rs) {
		sheet.createRow(i).createCell(0).setCellValue(un);
		sheet.getRow(i).createCell(1).setCellValue(ps);
		sheet.getRow(i).createCell(2).setCellValue(rs);
		
		i++;
	}

	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] {
			new Object[] { "User Name", "Password", "Result" },
			new Object[] { "admin", "admin123", "Not Run" },
			new Object[] { "abhay", "abhay123", "Not Run" },
			new Object[] { "sanna", "sanna123", "Not Run" },
			new Object[] { "admin", "admin123", "Not Run" },
		};
	}
	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File("ExcelFiles\\LoginData.xlsx");
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("LoginData");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fos.close();
	}
}
