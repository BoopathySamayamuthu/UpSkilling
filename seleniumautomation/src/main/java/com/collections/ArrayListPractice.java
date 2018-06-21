/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Jun 18, 2018
 */

package com.collections;

import java.util.ArrayList;
import java.util.*;

/**
 * @author n0217055
 *
 */

//Array List  - Dynamic array - No need to declare its Size - Duplicate elements are allowed 
public class ArrayListPractice {

	public static void main(String[] args){
		ArrayList<String> arr1 = new ArrayList<String>();
		System.out.println("Initial size of ArrayList = "+ arr1.size());
		
		arr1.add("Boopa");
		arr1.add("Angu");
		arr1.add("K'D");
		arr1.add("Chaco");
		arr1.add("Chaco");
		
		
		
		System.out.println("ArrayList after adding objects = " + arr1);
		System.out.println("Size of ArrayList = "+ arr1.size());
		
		arr1.remove(4);	//Removing an element at the 4th index
		
		System.out.println("ArrayList afer removing element at 4th index = "+ arr1);
		
		arr1.remove("Chaco"); //Removing an element "Chaco"

		System.out.println("ArrayList afer removing element Chaco = "+ arr1);
		System.out.println("Size of  ArrayList = "+ arr1.size());
		
		ArrayList<String> arr2 = new ArrayList<String>(arr1);
		//ArrayList<Integer> arr2 = new ArrayList<Integer>(arr1);
		System.out.println("Contents of new ArrayList : " + arr2);
		System.out.println("Size of new ArrayList = "+ arr2.size());
		
		
		//Converting an ArrayList to an Object array.
		
		Object[] xyz = arr1.toArray();
		for(Object element : xyz)
		System.out.println(element + " " );
		// Actual arr1 size and values unchanged
		arr1.size();
		System.out.println("Size of new ArrayList = "+ arr1.size()+ arr1);
		
		
	}
}
