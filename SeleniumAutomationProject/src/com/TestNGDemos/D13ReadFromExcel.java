package com.TestNGDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D13ReadFromExcel {
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@Test (enabled = false)
	public void readTheData() {
		row = sheet.getRow(0);
		cell = row.getCell(0);
		
		String data = cell.getStringCellValue();
		System.out.println(data);
		
		cell = row.getCell(1);
		data = cell.getStringCellValue();
		System.out.println(data);
		
		cell = row.getCell(2);
		System.out.println(cell.getStringCellValue());
		
		System.out.println("------------------------------");
		
		row = sheet.getRow(1);
		cell = row.getCell(0);
		
		data = cell.getStringCellValue();
		System.out.println(data);
		
		cell = row.getCell(1);
		data = cell.getStringCellValue();
		System.out.println(data);
		
		cell = row.getCell(2);
		System.out.println(cell.getStringCellValue());
		
		System.out.println("----------------------------------");
		
		System.out.println(sheet.getRow(2).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(2).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(2).getCell(2).getStringCellValue());
	}
	
	@Test
	public void readAllData() {
		System.out.println("----------------- Getting all data --------------");
		
		int totalRows = sheet.getPhysicalNumberOfRows();
		int totalCells = sheet.getRow(0).getPhysicalNumberOfCells();
		
		for(int i = 0; i < totalRows; i++) {
			row = sheet.getRow(i);
			for(int j = 0; j < totalCells; j++) {
				cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());
			}
			System.out.println("---------------------");
		}
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File("ExcelFiles/OHRM_LoginData.xlsx");
		fis = new FileInputStream(file);
		
		wb = new XSSFWorkbook(fis);
		//As we are reading the data from existing file, here we are passing input stream object.
		sheet = wb.getSheetAt(0);
		//This will read the 1st sheet
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.close();
		fis.close();
	}

}
