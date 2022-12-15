package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	WebDriver driver;
	
	@BeforeMethod
	public void setuo() {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless");
//		option.setHeadless(true);
		driver= new ChromeDriver(option);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
