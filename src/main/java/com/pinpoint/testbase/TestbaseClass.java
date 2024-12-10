package com.pinpoint.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestbaseClass {
	protected WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pinpoint.idearise.co/#hero");	
	}
	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	}
	

}
