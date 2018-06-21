/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Jun 20, 2018
 */

package com.threadingsample;

/**
 * @author n0217055
 *
 */
public class Sequence {

	/**
	 * @param args
	 */
	// This method is not Thread Safe 
	private int value =0;
	
	
	
	public int getNext(){
		synchronized(this){
		value++;
		return value;
	}
	
	}
	
}
