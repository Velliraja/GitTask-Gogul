package org.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MavenPro.BaseClase;

public class CancelBooking extends BaseClase {
	 public CancelBooking() {
		 PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id="first_name")
	private WebElement firstame;
	@FindBy(id="last_name")
	private WebElement lastname;
	@FindBy(id="address")
	private WebElement  addres;
	@FindBy(id="order_no")
	private WebElement orderid;
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement clickitetery;
	
	public WebElement getFirstame() {
		return firstame;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddres() {
		return addres;
	}
	public WebElement getOrderid() {
		return orderid;
	}
	public WebElement getClickitetery() {
		return clickitetery;
	}
	
	public void cancelbook(String name,String lstname,String addres,String orderid) {
	
		sendKeys(getFirstame(), name);
		sendKeys(getLastname(), lstname);
		sendKeys(getAddres(), addres);
		elementGetAttribute(getOrderid());
		elementClick(getClickitetery());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
