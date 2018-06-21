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
public class LinkedListPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LinkedList can be used to depict an first-in, first-out(FIFO) or
		// last-in, first-out(LIFO) storage

		LinkedList<Integer> link1 = new LinkedList<Integer>();
		ArrayList<String> array1 = new ArrayList<String>();

		link1.add(4);
		link1.add(9);
		link1.add(786);
		link1.add(782);
		array1.add("Java");
		array1.add("Javascript");
		array1.add("VB");
		array1.add("Javascript");
		array1.add("C++");

		link1.addFirst(0);
		System.out.println("Linkedlist after adding objects = " + link1);
		System.out.println("Size of LinkedList = " + link1.size());
		link1.addFirst(-1);
		System.out.println("Linkedlist after adding objects = " + link1);
		link1.addLast(999);
		System.out.println("Linkedlist after adding objects = " + link1);

		link1.removeFirst();
		System.out.println("After removing first element, LinkedList is = " + link1);

		link1.removeLast();
		System.out.println("After removing Last element, LinkedList is = " + link1);

		link1.remove(1); // Removing the Index 1
		System.out.println("After removing Index element 1, LinkedList is = " + link1);

		// List Iterator example
		ListIterator<String> it = array1.listIterator();

		// Forward Iteration

		System.out.println("Forward iteration :");
		while (it.hasNext())
			// Loop never ends if we print the below, prints "True"
			// System.out.println(it.hasNext());

			System.out.println(it.next());

		// Backward Iteration
		System.out.println("Backward iteration :");
		while (it.hasPrevious())
			System.out.println(it.previous());
		
		// nextIndex and previousIndex return next and previous index from the current position in the list
		
		System.out.println("Previous Index is : " + it.previousIndex());  
		System.out.println("Next Index is : " + it.nextIndex());
		
		 // We get the next element in forward order
		
		    System.out.println("Next element is : " + it.next());

		
		// Add an element just before the next element
		
		//array1.add("ORACLE"); If added this error out ask the Team
		it.add("ANGULAR");
		
		 System.out.println("After inserting elements, ArrayList contains : ");
		 
		     for(int i = 0; i < array1.size(); i++)
		     System.out.println(array1.get(i));
		     System.out.println(array1);
		     
		     System.out.println("Next element is : " + it.next());
		     it.remove();
		     
		     for(int i = 0; i < array1.size(); i++)
			     System.out.println(array1.get(i));



	}

}
