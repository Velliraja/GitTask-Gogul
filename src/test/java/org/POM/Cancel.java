package org.POM;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MavenPro.BaseClase;

public class Cancel extends BaseClase {
	public Cancel() {
		 PageFactory.initElements(driver,this);
	}
	
	@FindBy (id="check_all")
private WebElement cancelclick;
	
	@FindBy(name="cancelall")
	private WebElement cancelbtn;

	public WebElement getCancelclick() {
		return cancelclick;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}
	
	public void clickCancelBtn() {
	
	elementClick(getCancelclick());
	elementClick(getCancelbtn());
	

	}
}
