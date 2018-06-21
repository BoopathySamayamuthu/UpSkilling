/*
 * Copyright (C) 2017, Liberty Mutual Group
 *
 * Created on Oct 30, 2017
 */

package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * @author n0217055
 *
 */
public class BaseTest {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	

	@BeforeMethod
	protected void methodSetUp() {
		System.out.println("Method set up");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\n0217055\\Documents\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@AfterMethod
	protected void methodTearDown() {
		System.out.println("Method tear down");
		driver.quit();
	}


}
