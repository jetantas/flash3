package com.georgetantas.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	

	public WebDriver driver = null;
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		driver = new ChromeDriver();
		return driver;
		
	}

}
