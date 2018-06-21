/*
 * Copyright (C) 2017, Liberty Mutual Group
 *
 * Created on Oct 30, 2017
 */

package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author n0217055
 *
 */
public class BasePageObject<T> {
	protected WebDriver driver;
	protected WebDriverWait wait;

	/**
	 * @param driver
	 */
	public BasePageObject(WebDriver driver) {
		this.driver = driver;
		wait =new WebDriverWait(driver, 40);
		// TODO Auto-generated constructor stub
	}
		
}
