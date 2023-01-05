package com.MavenPro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.format.CellDateFormatter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CellTypes {
	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\Raaj VS Bairav\\MavenClassOne\\Excel\\CELL TYPE STRING & NUMERIC.xlsx");
		
		FileInputStream stream =  new FileInputStream(file);
		
		Workbook book = new XSSFWorkbook(stream);
		
		Sheet sheet = book.getSheet("STUDENDS DATAS");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
				 switch (cellType) {
				case STRING:
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
					
					
					break;
				case NUMERIC:
					
					if (DateUtil.isCellDateFormatted(cell)){
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat formet=new SimpleDateFormat("dd-MMMM-yyyy");
						String format = formet.format(dateCellValue);
						System.out.println(format);
					}else {
					double numericCellValue = cell.getNumericCellValue();
					BigDecimal bd = BigDecimal.valueOf(numericCellValue);
					String string = bd.toString();
					System.out.println(string);
				
					}
					break;
				default:
					break;
				}
				 
			}
			
			
		}

		
	}


}
