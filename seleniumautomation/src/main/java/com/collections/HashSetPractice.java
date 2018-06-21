/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Jun 18, 2018
 */

package com.collections;
import java.util.*;

/**
 * @author n0217055
 *
 */
public class HashSetPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hash= new HashSet<String>();

		hash.add("Sendrayen");
		hash.add("Magath");
		hash.add("Janani");
		hash.add("Yashika");
		hash.add("Yashika");// See duplicate elements are not considered
		hash.add("I will add to my wish");

		System.out.println("HashSet after adding objects = " + hash);
		System.out.println("Size of HashSet = "+ hash.size());

		hash.remove("Janani");
		System.out.println("After removing element 5.2, HashSet = "+ hash);

		//Creating new Hashset from existing Hashset
		HashSet<String> hash2= new HashSet<String>(hash);

		System.out.println("New HashSet created from an existing HashSet = " + hash2);
		hash2.add("Oviya");
		hash2.add("Snehan");
		
		//Adding all contents to first hash list
		
		hash2.addAll(hash);
		System.out.println("The latest HashSet created  = " + hash2);
		System.out.println("Size of second  HashSet = "+ hash.size());
		System.out.println("Size of second  HashSet = "+ hash2.size());
		

	}

}
