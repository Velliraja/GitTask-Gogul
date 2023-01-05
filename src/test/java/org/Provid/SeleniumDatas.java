package org.Provid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MavenPro.BaseClase;

public class SeleniumDatas extends BaseClase{

	@DataProvider(name = "valu")
	public Object[][] m1() {
		
		Object[][] obj = new Object[][] {{"java@gmail.com","java@123"},{"selenium@gmail.com","selenium@123"},{"junit@gmail.com","junit@123"}};
		return obj;	
}
	
	@Test(dataProvider="valu")
	private void testCase(String s1,String s2) {
		//WebDriver driver = new ChromeDriver();
		getDriver();
	
		enterApplnUrl("https://adactinhotelapp.com/");
		maximizeWindow();
		WebElement username = driver.findElement(By.id("username"));
		sendKeys( username, s1);
		WebElement pass = driver.findElement(By.id("password"));
		sendKeys(pass, s2);
		WebElement login = driver.findElement(By.id("login"));
		elementClick(login);
		

	}
	
}