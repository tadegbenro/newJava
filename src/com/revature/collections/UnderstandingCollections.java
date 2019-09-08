package com.revature.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class UnderstandingCollections {
	/*
	 * In Java, a Collection is a group of individual 
	 * objects represented as a single unit. 
	 * We use them to store and organize our groups of
	 * objects. 
	 * Java's Collection interface is extended by 3 major
	 * interfaces: List, Set, and Queue. 
	 * Also associated with Collections are Maps, which 
	 * hold Key, Value pairs 
	 */
	
	public static void main(String[] args) {
		//This array list is generic and can store any data types
		ArrayList myList = new ArrayList();
		myList.add(5); // index 0
		myList.add("helloWorld"); // index 1
		myList.add(new Object()); // index 2
		myList.add("helloWorld"); // index 3 also allows for duplicates
		
		
	//	int x = myList.get(0);
		
		//list can only store integers
		ArrayList<Integer> myNums = new ArrayList<Integer>();
		myNums.add(5);//index 0
		myNums.add(15);
		myNums.add(100);
	//	myNums.add("afojaifj");
		
		ArrayList<Object> myObjs = new ArrayList<Object>();
		myObjs.add(new Integer(5)); // index 0
		myObjs.add(new String("aiufhiauh")); //index 1
		myObjs.add(3); //index 2
		myObjs.add("Queens");
		
		
		Object curr = myObjs.get(0);
		//String str = (String) curr;
		//System.out.println(str.length());
		
		//Printing out lists
		System.out.println("myList is: "+ myList);
		System.out.println("myNums is: "+ myNums);
		
		//Get the element in the list
		int number = myNums.get(2);
		System.out.println("Number in index 2 is "+number);
		
		Object o = myObjs.get(2);
		System.out.println("Object in index 2 is "+o);
		
		//Udpate element in List
		myObjs.set(2, "India");
		
		
		System.out.println("Updated myObjs to "+myObjs);
		
		//Removing an element from the list using the index number
		myNums.remove(2);
		System.out.println("myNums after removal is "+myNums);
		
		//myNums.clear() -> Removes all elements in the list
		
		if(myObjs.contains("India")) {
			System.out.println("Yes this is true");
		}
		else {
			System.out.println("This does not exist in the list");
		}
		
		//Iterate in ArrayList
		System.out.println("===Iterating Using Basic For Loop===");
		for(int num=0; num < myNums.size(); num++) {
			System.out.println(myNums.get(num));
			System.out.println("===============");
		}
		System.out.println("===Iterating Using Enhanced For Loop===");
		for(int num : myNums) {
			System.out.println(num);
			System.out.println("===============");
		}
		
		System.out.println("===Iterating Using the Iterator Method===");
		Iterator<Object> itr = myObjs.iterator();
		//Iterator<Integer> itr = myNums.iterator();
		
		/*System.out.println(itr.next()); //Gives elements One by One
		System.out.println(itr.next());
		System.out.println(itr.next());*/
		
		while(itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj);
			if(obj.equals("Queens")) { //Conditional action during an iteration
				itr.remove();
			}
		}
		System.out.println(":MyObjs after interation and actions is: "+ myObjs);
	}

}
