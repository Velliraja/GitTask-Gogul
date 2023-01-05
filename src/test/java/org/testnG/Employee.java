package org.testnG;

import org.POM.HotelLogin;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.MavenPro.BaseClase;

public class Employee extends BaseClase {


	@BeforeClass
	private void beforeclass() throws InterruptedException {
		getDriver();
		maximizeWindow();
		Thread.sleep(3000);
		enterApplnUrl("https://adactinhotelapp.com/");

	}
	@AfterClass
	private void afterClass() {
	//	quitWindow();

	}
	@BeforeMethod
	private void beforemethod() {

		long startime = System.currentTimeMillis();
		System.out.println(startime);

	} 
	@AfterMethod
	private void afteremethod() {
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);

	}
	
	@Parameters({"userName","password"})
	@Test
	private void sample(String name ,String pass) {
		
		HotelLogin login =new HotelLogin();
		login.login("Karrthikeyan", "H8A8AR");
	
		
	}
}
