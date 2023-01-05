package com.MavenPro;

import java.awt.print.Book;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.binary.XSSFBCommentsTable;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.WorkbookDocumentImpl;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelCountrysTask {

	
	public static void main(String[] args) throws IOException {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	
	driver.navigate().to("https://omrbranch.com/apitestingtraininginchennaiomr");
	
	WebElement Country = driver.findElement(By.id("country-list"));
	
	
	
	Select s = new Select(Country);
	List<WebElement> allcountrys = s.getOptions();
	
	File file = new File("D:\\Raaj VS Bairav\\MavenClassOne\\Excel\\countries.xlsx");
	
	
	Workbook book = new XSSFWorkbook();
	
	Sheet sheet = book.createSheet("countries");
	
	for (int i = 0; i < allcountrys.size(); i++) {
		
		WebElement webElement = allcountrys.get(i);
		String text = webElement.getText();
		//System.out.println(text);
	
		
		
		Row row = sheet.createRow(i);
		Cell cell = row.createCell(0);
		cell.setCellValue(text);
		FileOutputStream out = new FileOutputStream(file);
	book.write(out);

	}
		
	
		driver.quit();
		
		
		
	}
	
	
	
}
