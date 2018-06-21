package com.collections;
import java.util.*;

public abstract class TreeSetPractice implements Comparator {
	
	public Integer compare(String obj1, String obj2) //overriding Comparator's compare() method to give a descending ordering
	{
	return(obj2.compareTo(obj1)); //String's compareTo() method compares two String objects.
	}

	public static void main(String[] args) {
		
		TreeSet<Double> tree= new TreeSet<Double>();

		tree.add((Double) 1.2);
		tree.add((Double) 1.4);
		tree.add((Double) 1.2);
		tree.add((Double) 1.6);
		tree.add((Double) 1.8);
		tree.add((Double) 2.0);
		

		System.out.println("Content of TreeSet after adding objects" + tree);
		System.out.println("Size of TreeSet = "+ tree.size());


		System.out.println("Smallest number >=1.6 in TreeSet : "+ tree.ceiling((Double) 1.5));
		System.out.println("Smallest number >=1.6 in TreeSet : "+ tree.floor((Double) 1.5));
		System.out.println("Greatest Number <=1.8 in TreeSet : "+tree.floor((Double) 1.8));

		System.out.println("Number higher than 1.6 in TreeSet = "+tree.higher((Double) 1.6));
		System.out.println("Number lower than 1.4 in TreeSet = "+tree.lower((Double) 1.4));

		tree.remove(1.8);
		System.out.println("Afer removing element 3, TreeSet = "+ tree);
		
		//
		TreeSet<String> tree1= new TreeSet<String>(); //passing an object of implementer of Comparator Interface

		tree1.add("H");
		tree1.add("E");
		tree1.add("M"); 
		tree1.add("A");   
		tree1.add("N");

		System.out.println("Content of TreeSet with acending ordering" + tree1);
		System.out.println("Size of TreeSet = "+ tree1.size());

	}

}
