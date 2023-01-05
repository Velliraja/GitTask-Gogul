package org.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MavenPro.BaseClase;

public class SelectHotel extends BaseClase{
	public SelectHotel() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//td[text()='Select Hotel ']")
	private WebElement hotelText;



	@FindBy(id = "radiobutton_0")
	private WebElement btnRadioClick;

	public WebElement getHotelText() {
		return hotelText;
	}

	@FindBy(id = "continue")
	private WebElement btnContinue;

	public WebElement getBtnRadioClick() {
		return btnRadioClick;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}


	public void selectAHotel() {
		elementClick(getBtnRadioClick());
		elementClick(getBtnContinue());

	}
}