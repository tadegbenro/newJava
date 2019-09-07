/*
 * the package is always the FIRST line of a Java class (outside of comments 
 * 
 * Java is package centric - every class you make should be in an appropriately
 * named package
 * 
 * com.revature.intro.sub is NOT considered to be a "sub package" of com.revature.intro
 * when we do things like import with *, it is its own package
 */
package com.revature.intro;

import java.util.Arrays;

// Here is where we list all our imports
public class ClassBasics {
	int x;
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public static void main(String[] args) {
		/*
		 * the main block has to be inside of a public class 
		 * and MUST follow the sequence 'public static void main(String [] args)'
		 */
		
		ClassBasics basic = new ClassBasics();
		basic.learnJava();
		//basic.sortNums(1,3, 5,2, 9, 19,4);
		//System.out.println(basic);
	}
	void sortNums(int... nums) { //'int...' means variable int arguments
		Arrays.sort(nums);
	}
	void learnJava() {
		sortNums();
		sortNums(1,3, 5,2, 9, 19,4);
	}
	

}

class AnotherClass {
	//You can have  another class in the file BUT only one can be public
}