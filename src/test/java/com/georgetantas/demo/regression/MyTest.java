package com.georgetantas.demo.regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.georgetantas.demo.Base;
import com.georgetantas.demo.business.Sample_01;

public class MyTest {
	
	@Test
	public void test01() {
		
		Base b = new Base();
		WebDriver driver = b.getDriver();
		Sample_01 sample1 = PageFactory.initElements(driver, Sample_01.class);
		String url = "https://demo.tanmaysarkar.com/sample_01.html";
		driver.get(url);
		driver.manage().window().maximize();
		sample1.formFillUp("george", "tantas", "lima");
		driver.close();
		
	}

}
