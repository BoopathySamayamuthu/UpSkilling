/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on May 31, 2018
 */

package com.oops.inheritance;
import java.io.File;

import org.testng.annotations.Test;

/**
 * @author n0217055
 *
 */
public class Liberty extends Associate {
	
	private String libertyemp;
//	Liberty obj = new Liberty();
	/**
	 * @return the libertyemp
	 * 
	 */
	public String getLibertyemp() {
		return libertyemp;
	}

	/**
	 * @param libertyemp the libertyemp to set
	 */
	public void setLibertyemp(String libertyemp) {
		this.libertyemp = libertyemp;
		
	}
	public int add(int a , int b ) {
		
		a=2;
		b=2;			
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	@Test
	public void printAttributes(){
		System.out.println("test1");
		printParentAttributes();
		System.out.println(add(2,3));
		getDesignation();
		
		//System.out.println(add(2,3));
		
	}
	
}
