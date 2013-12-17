package com.luxoft.testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class NewClass {
	
	WebDriver driver;
	
	@BeforeClass
	public void openSite() {
		WebDriver driver = new FirefoxDriver();
	}
	
	public void newTestCase() {
		
	}
}
