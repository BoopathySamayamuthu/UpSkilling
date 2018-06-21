/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Jun 12, 2018
 */

package com.filehandling;
import java.io.*;

/**
 * @author n0217055
 *
 */
public class Example {
	
	 public static void main(String args[]) throws IOException {
	      FileReader in = null;
	      FileWriter out = null;

	      try {
	         //in = new FileReader("input.txt");
	    	  in = new FileReader("C:/Users/n0217055/Documents/testfile.txt");
	          out = new FileWriter("C:/Users/n0217055/Documents/output.xlsx");
	         
	         int c;
	         while ((c = in.read()) != -1) {
	            out.write(c);
	         }
	      }finally {
	        
	            in.close();
	         }
	   
	            out.close();
	         }
	      
	   }


