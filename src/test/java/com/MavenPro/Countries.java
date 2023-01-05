package com.MavenPro;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Countries {
	public static void main(String[] args) {
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.navigate().to("");
		
		WebElement Country = driver.findElement(By.id(""));
		
		
		
		
}
}