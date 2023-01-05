package com.MavenPro;

import java.io.IOException;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class JunitTest extends BaseClase {

	static WebDriver driver;
	@BeforeClass
	public static void Before() {
		getDriver();
		enterApplnUrl("https://adactinhotelapp.com/");
		maximizeWindow();

	}
	@AfterClass
	public  static void afterclass() {
		//quitWindow();


	}
	@Test
	public void booking() throws IOException, InterruptedException {
		WebElement usrname = findElementById("username");
		String name = getCellValue("Datas list", 1,0);
		sendKeys(usrname, name);
		
		WebElement usrpass = findElementById("password");
		String pass = getCellValue("Datas List", 1, 1);
		sendKeys(usrpass, pass);
		
		WebElement btnlogin = findElementById("login");
		elementClick(btnlogin);
		
		WebElement textloginsuccess = findElementById("username_show");
		String entertext = elementGetAttribute(textloginsuccess);
		Assert.assertEquals("verify After login message","Hello Karrthikeyan!",entertext );
		

        WebElement location = BaseClase.findElementById("location");
        String locationvalue = BaseClase.getCellValue("Datas list", 1, 2);
        BaseClase.selectOptionsByValue(location, locationvalue);
       
        WebElement hotel = BaseClase.findElementById("hotels");
        String hotelLocation = BaseClase.getCellValue("Data List", 1,3);
        BaseClase.selectOptionsByValue(hotel, hotelLocation);
      
        
        WebElement Room = BaseClase.findElementById("room_type");
        String roomLocation = BaseClase.getCellValue("Data List", 1, 4);
        BaseClase.selectOptionsByValue(Room, roomLocation);
        
        WebElement roomno = BaseClase.findElementById("room_nos");
        String roomnum = BaseClase.getCellValue("Datas list", 1, 5);
        BaseClase.selectOptionsByText(roomno, roomnum);
        
        WebElement btnsearch = BaseClase.findElementById("Submit");
        BaseClase.elementClick(btnsearch);
        
        
        WebElement nextpg = findelementbyxpath("//td[@class='login_title']");
		String nextentry = elementGetText(nextpg);
		Assert.assertEquals("Welcome to Adactin Group of Hotels","Select Hotel",nextentry);
		

		WebElement clickbtn = findElementById("radiobutton_0");
		clickbtn.click();
		
		WebElement clkcontinue = findElementByName("continue");
		clkcontinue.click();
		Thread.sleep(5000);
		
		
        
		WebElement Bookingpage = findelementbyxpath("(//td[@class='login_title'])[2]");
		String book = elementGetText(Bookingpage);
		Assert.assertEquals("Hotel Booking","Book A Hotel",book);
		
		 WebElement txtFirst =findElementById("first_name");
			String txtFirstname = getCellValue("Datas list", 1, 9);
			sendKeys(txtFirst, txtFirstname);
			
			WebElement txtLast = findElementById("last_name");
			String txtLastname = getCellValue("Datas list", 1, 10);
			sendKeys(txtLast, txtLastname);
			
			WebElement txtaddress = findElementById("address");
			String txtaddressname = getCellValue("Datas list", 1, 11);
			sendKeys(txtaddress, txtaddressname);
			
			WebElement txtccno = findElementById("cc_num");
			String txtccnoname = getCellValue("Datas list", 1, 12);
			sendKeys(txtccno, txtccnoname);
			
			WebElement drpcctype = findElementById("cc_type");
	        String drpcctypevalue = getCellValue("Datas list", 1, 13);
	        selectOptionsByValue(drpcctype, drpcctypevalue);
	        
	        WebElement drpccExpMonth = findElementById("cc_exp_month");
	        String drpccExpMonthvalue = getCellValue("Datas list", 1, 14);
	        selectOptionsByText(drpccExpMonth, drpccExpMonthvalue);
	        
	        WebElement drpccExpYear =findElementById("cc_exp_year");
	        selectOptionsByIndex(drpccExpYear,11);
	        
	        WebElement txtcvv = findElementById("cc_cvv");
	        String txtCvvValue = getCellValue("Datas list", 1, 16);
		    sendKeys(txtcvv,txtCvvValue );
			
			WebElement btnBooknow = findElementById("book_now");
	        elementClick(btnBooknow);
	        
	        Thread.sleep(9000);
	        WebElement txtOrderNo = findElementById("order_no");
	        String orderNo = elementGetAttribute(txtOrderNo);
	        writeCellData("Datas list", 1, 17,orderNo );

	        WebElement textbookconf =findelementbyxpath("//td[@class='login_title']");
	        String acttextbookconf = elementGetText(textbookconf);
	        Assert.assertEquals("Verify Booking Confirmation", "Booking Confirmation",acttextbookconf);
	        
		
	}
}
