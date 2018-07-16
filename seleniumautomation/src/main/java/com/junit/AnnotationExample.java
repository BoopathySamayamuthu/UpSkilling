/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Jul 10, 2018
 */

package com.junit;

//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.*;

/**
 * @author n0217055
 *
 */
public class AnnotationExample{
	
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	// Run once, e.g. Database connection, connection pool
    @BeforeClass
    public static void runOnceBeforeClass() {
        System.out.println("@BeforeClass - runOnceBeforeClass");
    }
	
//	@BeforeAll
//	static void setup(){	
//		System.out.println("Method set up");
//		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\n0217055\\Documents\\Drivers\\chromedriver.exe");
//		//driver = new ChromeDriver();
//		System.out.println("Hello I am learning Junit");
//	
//		
//	}
	
	@Before
	public static void cleanupApplication(){
		
		//driver.getTitle();
		System.out.println("BeforeEach method is executed");
		
	}
	
	@After
	public static void refreshDatasheet(){
		
		System.out.println("AfterEach method is executed");
		
	}
	
	@Test
	 public void launchApplication() {
		// open VICAA Applicaiton
	//driver.get("https://test-pcm.lmig.com/palclaims/cc/ClaimCenter.do");
	driver.get("www.google.com");
		System.out.println("Executing");
	}
	
	@Test
	
	public void launchApplication1() {
		// open VICAA Applicaiton
	//driver.get("https://test-pcm.lmig.com/palclaims/cc/ClaimCenter.do");
	//driver.get("www.google.com");
		System.out.println("Executing method 2");
	}
	
//	@AfterAll
//	 static void sayBye(){
//		
//		System.out.println("done learning Junit annotations");
//		
//	}
	
	@AfterClass
	 static void sayBye1(){
		
		System.out.println("done learning Junit annotations");
		
	}
	
}
