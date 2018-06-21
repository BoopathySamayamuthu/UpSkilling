/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Jun 18, 2018
 */

package com.collections;
import java.util.*;
import java.util.Map;

/**
 * @author n0217055
 *
 */
public class MapsPractice {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		HashMap <String,Integer> hm1 = new HashMap <String,Integer>();

		hm1.put("Max", 1000);
		hm1.put("John", 4000);
		hm1.put("Tom", 2000);
		hm1.put("Ana", 6000);
		hm1.put("Rick", 5000);

		System.out.println(hm1);

		System.out.println("Value at the key, Tom is "+ hm1.get("Tom"));
		System.out.println("Value at the key, Ana is "+ hm1.get("Ana"));

		
		
//		
//		Map <String,Integer> hm = new HashMap <String,Integer>();
//
//		hm.put("Prathap", 1);
//		hm.put("Boopa", 4);
//		hm.put("Kathir", 2);
//		hm.put("Angu", 6);
//		hm.put("Unknown", 5);
//
//		System.out.println("Iterating TreeMap using Map.Entry and for-each loop");
//		Set<Map.Entry<String,Integer>> set = hm.entrySet();
//
//		//for-each loop to iterate each element of Map, using Map.Entry objects and methods
//		//for(Map.Entry <String,Integer> me : set)
//		//System.out.print(entry.getKey() +":");
//		//System.out.println(entry.getValue());

	}

	
	

}
