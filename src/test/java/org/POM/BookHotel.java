package org.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MavenPro.BaseClase;

public class BookHotel extends BaseClase {
	public BookHotel() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement bookAHotel;
	
	public WebElement getBookAHotel() {
		return bookAHotel;
	}
	@FindBy(id="first_name")
    private WebElement txtFirstName;
	
	@FindBy(id="last_name")
    private WebElement txtLastName;
	
	@FindBy(id="address")
    private WebElement txtAddress;
	
	@FindBy(id="cc_num")
    private WebElement txtCcNum;
	
	@FindBy(id="cc_type")
    private WebElement ddnCcType;
	
	@FindBy(id="cc_exp_month")
    private WebElement ddnCcExpMonth;
	
	@FindBy(id="cc_exp_year")
    private WebElement ddnCcExpYear;
	
	@FindBy(id="cc_cvv")
    private WebElement txtCcCvv;
	
	@FindBy(id="book_now")
    private WebElement btnBookNow;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCcNum() {
		return txtCcNum;
	}

	public WebElement getDdnCcType() {
		return ddnCcType;
	}

	public WebElement getDdnCcExpMonth() {
		return ddnCcExpMonth;
	}

	public WebElement getDdnCcExpYear() {
		return ddnCcExpYear;
	}

	public WebElement getTxtCcCvv() {
		return txtCcCvv;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

	public void bookHotelPage(String firstname,String lastName,String address, String ccNumber,String ccType,String ccExpMonth,String num,String ccCvv ) 
	{
	 sendKeys(getTxtFirstName(), firstname);
	 sendKeys(getTxtLastName(), lastName);
	 sendKeys(getTxtAddress(), address);
	 sendKeys(getTxtCcNum(), ccNumber);
	 selectOptionsByText(getDdnCcType(), ccType);
	 selectOptionsByText(getDdnCcExpMonth(), ccExpMonth);
	 selectOptionsByText(getDdnCcExpMonth(), num);
	 sendKeys(getTxtCcCvv(), ccCvv);
	 elementClick(getBtnBookNow());

}
}
	