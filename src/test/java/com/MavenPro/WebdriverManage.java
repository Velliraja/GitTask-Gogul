package com.MavenPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManage {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("gmail.com");
	
	WebElement pass = driver.findElement(By.id("password"));
	pass.sendKeys(("password"));
	
	WebElement log = driver.findElement(By.id("login"));
	log.click();
	
	
	}
	

}
