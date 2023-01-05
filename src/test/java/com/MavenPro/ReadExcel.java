package com.MavenPro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws IOException {
		
		File file =new File("D:\\Raaj VS Bairav\\MavenClassOne\\Excel\\STUDENT DATA.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(stream);
		
		Sheet sheet = book.getSheet("STUDENDS DATAS");
		
		/*Row row = sheet.getRow(0);
		for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
			Cell cell = row.getCell(i);
			System.out.println(cell);
			
		}*/
		
		Row row = sheet.getRow(4);
		System.out.println(row);
		Cell cell = row.getCell(6);
		System.out.println(cell);
		
	}}
		/*int phyr = sheet.getPhysicalNumberOfRows();
		 System.out.println(phyr);
		*/
		
		/*Row row = sheet.getRow(3);
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		System.out.println(physicalNumberOfCells);
		*/
		
		
		
		
//		for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
//			Row row = sheet.getRow(i);
//			
//			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
//
//				Cell cell = row.getCell(j);
//				System.out.println(cell);
//			}
//			
//		}
			
