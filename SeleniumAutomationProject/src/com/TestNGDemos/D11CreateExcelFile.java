package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D11CreateExcelFile {
	File file;					//To handle file
	FileOutputStream fos;		//For writing the data to file
	//For the excel files having extension .xlsx use XSSF format
	//For the excel files having extension .xls use HSSF format
	XSSFWorkbook wb;			//For handling workbook
	XSSFSheet sheet;			//For handling sheet
	XSSFRow row;				//For handling row
	XSSFCell cell;				//For handling a cell
	
	@Test
	public void writeToExcel() {
		row = sheet.createRow(0);		//This will create 1st row inside the sheet as index starts with 0
		cell = row.createCell(0);		//This will create 1st cell inside 1st row
		
		cell.setCellValue("Alekhya");
	}

	@BeforeTest
	public void beforeTest() throws FileNotFoundException {
		file = new File("MyFirstExcelFile.xlsx");
		fos = new FileOutputStream(file);
		
		wb = new XSSFWorkbook();
		sheet = wb.createSheet();	
		//If you are not passing the sheet name then default name of sheet will be Sheet0
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		//The virtual object wb will be physically stored inside the file
		//This will write the data physically to the file
		
		System.out.println("Data added to file...");
	}

}
