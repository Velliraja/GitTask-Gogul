package com.MavenPro;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Adactin {
	

	public static void main(String[] args) throws IOException, InterruptedException {
		Adactin a=new Adactin();
		a.booking();
	}
	public void booking() throws IOException, InterruptedException {
		BaseClase baseclass=new BaseClase();
		baseclass.getDriver();
		baseclass.enterApplnUrl("https://adactinhotelapp.com/");
		baseclass.maximizeWindow();
		
		WebElement txtUserName = baseclass.findElementById("username");
		String name = baseclass.getCellValue("Datas list", 1, 0);
		baseclass.sendKeys(txtUserName, name);
		
		WebElement txtPassword = baseclass.findElementById("password");
		String password = baseclass.getCellValue("Datas list", 1, 1);
        baseclass.sendKeys(txtPassword, password);
        
        WebElement btnLogin = baseclass.findElementById("login");
        baseclass.elementClick(btnLogin);
        
        WebElement drplocation = baseclass.findElementById("location");
        String drplocationvalue = baseclass.getCellValue("Datas list", 1, 2);
        baseclass.selectOptionsByValue(drplocation, drplocationvalue);
        
        WebElement drpHotel = baseclass.findElementById("hotels");
        String drpHotelvalue = baseclass.getCellValue("Datas list", 1, 3);
        baseclass.selectOptionsByValue(drpHotel, drpHotelvalue);
        
        WebElement drproomtype = baseclass.findElementById("room_type");
        String drproomtypevalue = baseclass.getCellValue("Datas list", 1, 4);
        baseclass.selectOptionsByValue(drproomtype, drproomtypevalue);
        
        WebElement drproomno = baseclass.findElementById("room_nos");
        String drproomnovalue = baseclass.getCellValue("Datas list", 1, 5);
        baseclass.selectOptionsByText(drproomno, drproomnovalue);
        
        WebElement btnsearch = baseclass.findElementById("Submit");
        baseclass.elementClick(btnsearch);
        
        WebElement btnRadio = baseclass.findElementById("radiobutton_0");
        baseclass.elementClick(btnRadio);
        
        WebElement btnContinue = baseclass.findElementById("continue");
        baseclass.elementClick(btnContinue);
        
        WebElement txtFirst = baseclass.findElementById("first_name");
		String txtFirstname = baseclass.getCellValue("Datas list", 1, 9);
		baseclass.sendKeys(txtFirst, txtFirstname);
		
		WebElement txtLast = baseclass.findElementById("last_name");
		String txtLastname = baseclass.getCellValue("Datas list", 1, 10);
		baseclass.sendKeys(txtLast, txtLastname);
		
		WebElement txtaddress = baseclass.findElementById("address");
		String txtaddressname = baseclass.getCellValue("Datas list", 1, 11);
		baseclass.sendKeys(txtaddress, txtaddressname);
		
		WebElement txtccno = baseclass.findElementById("cc_num");
		String txtccnoname = baseclass.getCellValue("Datas list", 1, 12);
		baseclass.sendKeys(txtccno, txtccnoname);
		
		WebElement drpcctype = baseclass.findElementById("cc_type");
        String drpcctypevalue = baseclass.getCellValue("Datas list", 1, 13);
        baseclass.selectOptionsByValue(drpcctype, drpcctypevalue);
        
        WebElement drpccExpMonth = baseclass.findElementById("cc_exp_month");
        String drpccExpMonthvalue = baseclass.getCellValue("Datas list", 1, 14);
        baseclass.selectOptionsByText(drpccExpMonth, drpccExpMonthvalue);
        
        WebElement drpccExpYear = baseclass.findElementById("cc_exp_year");
        baseclass.selectOptionsByIndex(drpccExpYear,11);
        
        WebElement txtcvv = baseclass.findElementById("cc_cvv");
        String txtCvvValue = baseclass.getCellValue("Datas list", 1, 16);
	    baseclass.sendKeys(txtcvv,txtCvvValue );
		
		WebElement btnBooknow = baseclass.findElementById("book_now");
        baseclass.elementClick(btnBooknow);
        
        Thread.sleep(10000);
        WebElement txtOrderNo = baseclass.findElementById("order_no");
        String orderNo = baseclass.elementGetAttribute(txtOrderNo);
        System.out.println(orderNo);
       baseclass.writeCellData("Datas list", 1, 17,orderNo );
       
      
       
     baseclass.closewindow();
        
	}
}
