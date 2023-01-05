package org.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MavenPro.BaseClase;

public class ApplyOrderId extends BaseClase {
	public ApplyOrderId() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="search_hotel_id")
	private WebElement gobtn;
	

	@FindBy(id="order_id_text")
	private WebElement orderidtext;

	public WebElement getOrderidtext() {
		return orderidtext;
	}

		public WebElement getGobtn() {
		return gobtn;
	}
	
		public void clickgo(String orderidtxt) {
		sendKeys(getOrderidtext(), orderidtxt);
		elementClick(getGobtn());
		WebElement element = null;
		clickCancelAltert(element);
	}

}
