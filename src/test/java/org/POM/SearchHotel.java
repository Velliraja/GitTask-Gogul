package org.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MavenPro.BaseClase;

public class SearchHotel extends BaseClase{

	public SearchHotel(){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="location")
	private WebElement ddlocation;
	
	@FindBy(id="username_show")
	private WebElement textwelcome;
	
	@FindBy(id="hotels")
	private WebElement ddhotels;
	
	@FindBy(id="room_type")
	private WebElement ddroom;
	
	@FindBy(id="room_nos")
	private WebElement ddroomno;
	
	@FindBy(id="datepick_in")
	private WebElement textcheckin;
	
	@FindBy(id="datepick_out")
	private WebElement ytextCheckout;
	
	@FindBy(id="Submit")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getDdlocation() {
		return ddlocation;
	}

	public WebElement getTextwelcome() {
		return textwelcome;
	}

	public WebElement getDdhotels() {
		return ddhotels;
	}

	public WebElement getDdroom() {
		return ddroom;
	}

	public WebElement getDdroomno() {
		return ddroomno;
	}

	public WebElement getTextcheckdate() {
		return textcheckin;
	}

	public WebElement getYtextCheckout() {
		return ytextCheckout;
	}
	public WebElement getTextcheckin() {
		return textcheckin;
	}
	
	
	
	public void SelectHotel(String location,String Hotel,String Roomtype,String Roomno,String ChecinDAte,String CheckOutDate) {
		
		selectOptionsByText(getDdlocation(), location);
		selectOptionsByText(getDdhotels(), Hotel);
		selectOptionsByText(getDdroom(), Roomtype);
		selectOptionsByText(getDdroomno(), Roomno);
		sendKeys(getTextcheckdate(), ChecinDAte);
		sendKeys(getYtextCheckout(), CheckOutDate);
	    elementClick(getSubmit());		

	}

	
	
	
}
