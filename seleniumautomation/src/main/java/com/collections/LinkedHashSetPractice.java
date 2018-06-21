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
public class LinkedHashSetPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> linkHash= new LinkedHashSet<Integer>();

		linkHash.add(1+2);
		linkHash.add(1+3);
		linkHash.add(5);
		linkHash.add(2);
		linkHash.add(3); // Duplication ignored
		


		System.out.println("LinkedHashSet after adding objects = " + linkHash);
		System.out.println("Size of LinkedHashSet = "+ linkHash.size());

		linkHash.remove(3);
		System.out.println("Afer removing element 3, LinkedHashSet = "+ linkHash);

		System.out.println("Is this LinkedHashSet empty() : "+ linkHash.isEmpty());
		
		LinkedHashSet<Integer> linkHash2= new LinkedHashSet<Integer>(linkHash);
		linkHash2.add(999);
		System.out.println("Afer adding 999, LinkedHashSet = "+ linkHash2);
		linkHash2.removeAll(linkHash);
		System.out.println("Afer removing all = "+ linkHash2);
		System.out.println(linkHash2.size());
	}

}
