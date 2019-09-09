package com.revature.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

/*
 * Reverse a string without using a temporary variable. 
 * Do NOT use reverse() in the 
 * StringBuffer or the StringBuilder APIs
 */

public class CoreJavaHW1Q3 {
	static void reverseString(String s) {
		//Using ArrayList
		ArrayList<Character> characters = new ArrayList<Character>();

		//Add characters of the comparator word into the ArrayList
		for(int i = 0; i < s.length(); i++) {
			characters.add(s.charAt(i));
			/*
			 * Debug code*/
			 System.out.println(s.charAt(i));
		}
		Collections.reverse(characters);
		System.out.println("Reverse String is:" + characters);
		
	}
	
	/*static void reverseString2(String s) {
		//USing Priority Queue
		PriorityQueue<Character>  characters2 = new PriorityQueue<Character>();
		for (int i= s.length()-1; i >= 0; i--) {
		//for (int i= 0; i < s.length(); i++) {
			characters2.add(s.charAt(i));
		}
		System.out.println("Reverse String is:" + characters2);
	}*/
	
	public static void main(String[] args) {
		reverseString("Jihn");
		//reverseString2("Jihn");
	}

}
