package org.POM;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MavenPro.BaseClase;

public class HotelLogin extends BaseClase{


public HotelLogin(){
	PageFactory.initElements(driver,this);
	
	
}


	
	@FindBy(id="username")
	private WebElement textusername;

	@FindBy(id="password")
	private WebElement textpassword;

	@FindBy(id="login")
	private WebElement btnlogin;

	public WebElement getTextusername() {
		return textusername;
	}

	public WebElement getTextpassword() {
		return textpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}


	public void login(String usernname,String password) {
		sendKeys(getTextusername(), usernname);
		sendKeys(getTextpassword(), password);
		elementClick(getBtnlogin());

	}

}
