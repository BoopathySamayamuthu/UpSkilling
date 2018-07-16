/*
 * Copyright (C) 2017, Liberty Mutual Group
 *
 * Created on Oct 17, 2017
 */

package com.viacc;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
//import org.testng.annotations.Test;
import org.junit.Test;

import com.base.BaseTest;

public class FirstTestCase extends BaseTest {

//	WebDriver driver;
//
//	@BeforeMethod
//	public void methodSetUp() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\n0217055\\Documents\\Drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//
//	}
//
//	@AfterMethod
//	public void methodTearDown() {
//		driver.quit();
//	}

	@BeforeAll
	static void setup(){	
		System.out.println("Method set up");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\n0217055\\Documents\\Drivers\\chromedriver.exe");
		//driver = new ChromeDriver();
		System.out.println("Hello I am learning Junit");
	
		
	}
	
	@BeforeEach
	void cleanupApplication(){
		
		//driver.getTitle();
		System.out.println("BeforeEach method is executed");
		
	}
	
	@AfterEach
	void refreshDatasheet(){
		
		System.out.println("AfterEach method is executed");
		
	}
	
	
	@Test
	public void Test1() {
		System.out.println("Hello welcome to Java");

	}

	@Test
	public void Test2() {
// open VICAA
	driver.get("https://test-pcm.lmig.com/palclaims/cc/ClaimCenter.do");
	}
	
	@AfterAll
	void sayBye(){
		
		System.out.println("done learning Junit annotations");
		
	}
}
