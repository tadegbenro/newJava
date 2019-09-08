package com.revature.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class UnderstangingSet {
	
	public static void main (String[] args) {
		//HashSet<String> set = new HashSet<String>();
		//Here data is not added as in indexing approach
		//HashCodes are calculated for the elements added
		
		TreeSet<String> set = new TreeSet<String>();
		//
		set.add("Jill");
		set.add("John");
		set.add("Jack");
		set.add("John");
		set.add("Albert");
		set.add("Jennie");
		set.add("John");
		set.add("Joe");
		set.add("Becca");
		
		//1. Data is Uniqie, No Redundancy
		//2. Data is unordered i output due to hashing
		System.out.println("Set is: "+set);
		
		//Iterating through the Set
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		
		//Other methods
		set.remove("Joe");
		
		if(set.contains("Jennie")){
			System.out.println("Yes Jennie is in the list!");
		}
		
		System.out.println("set size is: "+set.size());
		
	}

}
