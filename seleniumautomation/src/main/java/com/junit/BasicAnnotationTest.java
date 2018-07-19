/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Jul 16, 2018
 */

package com.junit;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author n0217055
 *
 */
public class BasicAnnotationTest {
	
	public WebDriver driver;
	public WebDriverWait wait;
	private ArrayList<String> list;	
	
	// Run once, e.g. Database connection, connection pool
    @BeforeClass
    public static void runOnceBeforeClass() {
        System.out.println("@BeforeClass method will be executed before JUnit test for "
                + "a Class starts");

    }

    // Run once, e.g close connection, cleanup
    @AfterClass
    public static void runOnceAfterClass() {
        System.out.println("@AfterClass method will be executed after JUnit test for"
                + "a Class Completed");
    }

    // Should rename to @BeforeTestMethod
    // e.g. Creating an similar object and share for all @Test
    @Before
    public void runBeforeTestMethod() {
        System.out.println("@Before - runBeforeTestMethod");
        list = new ArrayList<String>();
       
      
    }

    // Should rename to @AfterTestMethod
    @After
    public void runAfterTestMethod() {
        list.clear();
        System.out.println("@After - runAfterTestMethod");
        
    }

    @Test
    public void test_method_1() {
        System.out.println("@Test - test_method_1");
    	//driver.get("https://test-pcm.lmig.com/palclaims/cc/ClaimCenter.do");
    	//driver.get("www.google.com");
    		System.out.println("Executing");
    		list.add("Junit lesson 1");
    		list.add("Junit lesson 2");
    		assertFalse(list.isEmpty());
    		assertEquals(1, list.size());
    		
    		
    }

    @Test
    public void test_method_2() {
        System.out.println("@Test - test_method_2");
        
    }
    
    @Ignore
    public void underConstruction(){
    	
    	  System.out.println("Using @Ignore , this execution is ignored");
    }
    @Test(timeout = 10)			
    public void timeoutExample() {					
        System.out.println("Using @Test(timeout),it can be used to enforce timeout in JUnit4 test case");					
    }	
	
}


