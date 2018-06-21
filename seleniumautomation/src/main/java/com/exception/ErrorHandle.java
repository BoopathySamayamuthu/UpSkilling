/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Jun 7, 2018
 */

package com.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * @author n0217055
 *
 */
public class ErrorHandle {

	public static void notToCloseInTry(){
		FileInputStream inputStream = null;
		try{
			File file = new File("C:/Users/n0217055/Documents/testfile1.txt");
			System.out.println("File found, nothing is catched");
			inputStream = 	new FileInputStream(file);
			inputStream.close();
		}
		 catch (FileNotFoundException e) {
			 System.out.println("File not found" + e.getMessage());
		} catch (IOException e) {
			System.out.println("IO exception found");
		}
	
	}
	
	public static void alwaysFinallyExecute(){
		FileInputStream inputStream = null;
		try{
			File file = new File("C:/Users/n0217055/Documents/testfile1.txt");
			inputStream = 	new FileInputStream(file);
		}
			 catch (FileNotFoundException e) {
				 System.out.println("File not found method2");	
				} finally {
					if (inputStream != null) {
						try {
							int a=1,b=3;
							int c= a+b;
							inputStream.read();
							System.out.println("Always execute");
							System.out.println(c);
						} catch (IOException e) {
							System.out.println("catch execute");	
						}
					}
				}	
	}
	public static Long draw() {
		long x = 123;
		
		System.out.println(
				"The color I want to print is " + x);
	return x;
	}
	
	public static void oneTryMultipleCatch(){
		try{
			String y = "Test";
			int i = 0;
			while(i<100)
			{
				if(y.contentEquals("d"));
				
			}
			
			draw();
			
			{	
				
			}	
		}
		catch (NumberFormatException e){
			System.out.println("NumberFormat Exception thrown");
		}
		catch (IllegalArgumentException e){
			System.out.println("IllegalArgumentException thrown");
		}
		
	}
	public static void main(String[] args){
		notToCloseInTry();
		alwaysFinallyExecute();
		//oneTryMultipleCatch();
	}
}
