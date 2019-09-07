package com.revature.codingchallenges;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
//import org.apache.commons.lang3.ArrayUtils;

public class Anagram {
	/* W
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first word");
		String first = scanner.nextLine();
		System.out.println("Please enter second word");
		String second = scanner.nextLine();
		scanner.close();
		//anagram(scanner);
		anagram(first, second);
	}
	
	//}
	
	public static boolean anagram(String a, String b) {
		/*
		 * Debugging...
		 * String a,b;
		 *a = "Tom";
		 *b = "moT";
		 */
		
		if (a.length() != b.length()) {
			System.out.println("The strings are not the same length, adn cannot be an Anagram");
			return false;
		}
		
		//To compare two strings, we will convert them into an ArrayList
		ArrayList<Character> comparator = new ArrayList<Character>();

		//Add characters of the comparator word into the ArrayList
		for(int i = 0; i < a.length(); i++) {
			comparator.add(a.charAt(i));
			/*
			 * Debug code
			 * System.out.println(a.charAt(i));
			 */
		}
		
		//Performing the comparing via a For Loop; Case Sensitivity is considered
		for(int i = 0; i < b.length(); i++) {
			Character curr = b.charAt(i);
			if (!comparator.contains(curr)) {
				System.out.println("The string characters don't match hence cannot be an Anagram");
				return false;
			}
			else {
				comparator.remove(curr);
				
			//System.out.println(a.charAt(i));
			}
		}
		
		if(comparator.isEmpty()) {
			System.out.println("Yes these two strings make an Anagram");
			return true;
		}
		else {
			return false;
		}
		
		
	}

}