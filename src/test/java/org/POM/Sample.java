package org.POM;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.MavenPro.BaseClase;

public class Sample extends BaseClase {

	static WebDriver driver;

	@BeforeClass
	public  static void beforeclass() {

		getDriver();
		enterApplnUrl("https://adactinhotelapp.com/");
		maximizeWindow();
	}

@AfterClass
public static void afterclass() {
	

}
@Test
public void AdactinBooking() throws IOException {
	
	HotelLogin login = new HotelLogin();
	login.login(getCellValue("Datas list", 1, 0), getCellValue("Datas list", 1, 1));
	
	SearchHotel search =new SearchHotel();
	String welcomemsg = elementGetAttribute(search.getTextwelcome());
	Assert.assertEquals("verify After log","Hello Karrthikeyan!",welcomemsg);
	
	search.SelectHotel(getCellValue("Datas list", 1, 2), getCellValue("Datas list", 1, 3), getCellValue("Datas list", 1, 4), getCellValue("Datas list", 1, 5), getCellValue("Datas list", 1, 6), getCellValue("Datas list", 1, 7));
	
	
	SelectHotel select = new SelectHotel();
	String selecttext = elementGetText(select.getHotelText());
	Assert.assertEquals("verifi After Search", "Select Hotel", selecttext);
	select.selectAHotel();
	
	BookHotel book=new BookHotel();
	String text = book.getText(book.getBookAHotel());
	Assert.assertEquals("after selectHotel", "Book A Hotel",text);
	
	book.bookHotelPage(getCellValue("Datas list", 1, 9),getCellValue("Datas list", 1, 10),getCellValue("Datas list", 1, 11),getCellValue("Datas list", 1, 12),getCellValue("Datas list", 1, 13),getCellValue("Datas list", 1, 14),getCellValue("Datas list", 1, 15),getCellValue("Datas list", 1, 16));
	
	
	
}

}
