package com.MavenPro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClase {
	public static WebDriver driver;
	public void writeCellData(String sheetName,int rownum,int cellnum,String data)throws IOException {
		File file=new File("D:\\Raaj VS Bairav\\MavenClassOne\\Excel\\ADACTIN-HOTEL-BOOKINK.xlsx");
	    FileInputStream fileInputStream=new FileInputStream(file);	
	    Workbook workbook=new XSSFWorkbook(fileInputStream);
	    Sheet sheet = workbook.getSheet("Datas list");
	    Row row = sheet.getRow(rownum);
	    Cell cell = row.getCell(cellnum);
	    cell.setCellValue(data);
	    FileOutputStream fileOutputStream=new FileOutputStream(file);
	    workbook.write(fileOutputStream);	
	}
	
	public void updateCellData(String sheetName,int rownum,int cellnum,String oldData,String newData)throws IOException {
		File file=new File("D:\\Raaj VS Bairav\\MavenClassOne\\Excel\\ADACTIN-HOTEL-BOOKINK.xlsx");
	    FileInputStream fileInputStream=new FileInputStream(file);	
	    Workbook workbook=new XSSFWorkbook(fileInputStream);
	    Sheet sheet = workbook.getSheet("Datas list");
	    Row row = sheet.getRow(rownum);
	    Cell cell = row.getCell(cellnum);
	    String value=cell.getStringCellValue();
	    if (value.equals(oldData)) {
	    	cell.setCellValue(newData);
	    }
	    FileOutputStream fileOutputStream=new FileOutputStream(file);
	    workbook.write(fileOutputStream);	
		}
	
	public static String getCellValue (String sheetName,int rownum,int cellnum)throws IOException {
		String res=" ";
		File file=new File("D:\\Raaj VS Bairav\\MavenClassOne\\Excel\\ADACTIN-HOTEL-BOOKINK.xlsx");
	    FileInputStream fileInputStream=new FileInputStream(file);	
	    Workbook workbook=new XSSFWorkbook(fileInputStream);
	    Sheet sheet = workbook.getSheet("Datas list");
	    Row row = sheet.getRow(rownum);
	    Cell cell = row.getCell(cellnum);
	    CellType type = cell.getCellType();
  		switch (type) {
		case STRING:
			res = cell.getStringCellValue();
			break;
		case NUMERIC:
			  if (DateUtil.isCellDateFormatted(cell)) {
				  Date dateCellValue = cell.getDateCellValue();
				  SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/YYYY");
				  res  = dateFormat.format(dateCellValue);
			} else {
				double numericCellValue = cell.getNumericCellValue();
				long check = Math.round(numericCellValue);
				if (check==numericCellValue) {
					res = String.valueOf(numericCellValue);
				} else {
                    res = String.valueOf(check);
				}
              break;
			}
		default:
			break;
		}
		return res;      	
	}
  		
	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public static void enterApplnUrl(String url) {
		driver.get(url);
	}
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	public static void quitWindow() {
		driver.quit();
	}
	public void closewindow() {
		driver.close();
	}
	public static void elementClick(WebElement element) {
	element.click();
    }
	public void elementclear(WebElement element) {
		
		element.clear();

	}
	public static WebElement findElementById(String attributevalue) {
	WebElement element = driver.findElement(By.id(attributevalue));
	return element;
	}
	public WebElement findElementByName(String attributevalue) {
		WebElement element = driver.findElement(By.name(attributevalue));
		return element;
	}
	public WebElement findelementbyxpath(String xpathExp) {
		WebElement element = driver.findElement(By.xpath(xpathExp));
		return element;

	}
	public String getApplnTitle() {
		String title = driver.getTitle();
		return title;
	}
	public String elementGetText(WebElement element) {
		String text = element.getText();
		return text.trim();
	}
	
   public String elementGetAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
         return attribute.trim();
	}
   public String elementGetAttribute(WebElement element,String attributeName) {
		String attribute = element.getAttribute(attributeName);
        return attribute;
	}
	public void sendKeys(WebElement element,String text) {
       element.sendKeys(text);		
	}
	public static void selectOptionsByText(WebElement element,String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	public static void selectOptionsByValue(WebElement element,String value) {
		Select s=new Select(element);
        s.selectByValue(value);
	}
    public void selectOptionsByIndex(WebElement element,int num) {
		Select s=new Select(element);
		s.selectByIndex(num);
	}
    public void deselectOptionsByText(WebElement element,String text) {
		Select s=new Select(element);
		s.deselectByVisibleText(text);
	}
    public void deselectOptionsByValue(WebElement element,String value) {
		Select s=new Select(element);
        s.deselectByVisibleText(value);
        
	}
    public void deselectOptionsByIndex(WebElement element,int index) {
		Select s=new Select(element);
		s.deselectByIndex(index);
	}
    public void deselectAll(WebElement element) {
		Select s=new Select(element);
		s.deselectAll();
	}
    public WebElement getfirstselectedtext(WebElement element) {
		Select s=new Select(element);
		WebElement option = s.getFirstSelectedOption();
		return option;
	}
    public List<WebElement> getAllSelectedOption(WebElement element) {
		Select s=new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		return allSelectedOptions;
    }
    public boolean isdisplayed(WebElement element) {
		boolean c = element.isDisplayed();
		return c;
		
	}
    public boolean isEnabled(WebElement element) {
		boolean c = element.isEnabled();
		return c;
		
	}
    public boolean isSelected(WebElement element) {
		boolean c = element.isSelected();
		return c;
		
	}
    public void switchFrameByIndex(int index) {
		driver.switchTo().frame(index);

	}
    public void switchFrameByName(String name) {
		driver.switchTo().frame(name);

	}
    public void switchElement(WebElement element) {
		driver.switchTo().frame(element);
	}
   public void elementSendkeysJs(WebElement element,String text) {
	JavascriptExecutor executor=(JavascriptExecutor)driver;
	executor.executeScript("argument[0].setAttribute('value',"+text+")",element);
   }
   public void clickOkAltert(WebElement element) {
	   Alert alert = driver.switchTo().alert();
	   alert.accept();
   }
   public void clickCancelAltert(WebElement element) {
	   Alert alert = driver.switchTo().alert();
	   alert.dismiss();
   }
   public void insertValueInAlert(WebElement element,String keysToSend) {
	   Alert alert = driver.switchTo().alert();
       alert.sendKeys(keysToSend);
   }
   public String getTextValueFromAlert(WebElement element) {
	   Alert alert = driver.switchTo().alert();	
       String text = alert.getText();
        return text;
   }
   public void mouseOverAction(WebElement element) {
	Actions actions=new Actions(driver);
	actions.moveToElement(element).perform();
   }
   public void dragAndDrop(WebElement source,WebElement target) {
	   Actions actions=new Actions(driver);
	   actions.dragAndDrop(source,target).perform();
   }
   public void switchtoParentWindow(WebElement element,String name) {
	driver.switchTo().window(name);
   }   
   public String windowHandle(WebElement element) {
	String windowHandle = driver.getWindowHandle();
	return windowHandle;

    }
   public Set<String> windowHandles(WebElement element) {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;

	}
   public void doubleClick(WebElement element) {
	  Actions a=new Actions(driver);
	  a.doubleClick(element).perform();
	}
   
   public String getText(WebElement element) {
	   	
	  String text = element.getText();
	return text;
	}
   
   

}
