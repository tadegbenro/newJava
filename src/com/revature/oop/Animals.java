package com.revature.oop;

public class Animals {
	/* 
	 * Here we explore Inheritance. In Inheritance, there is a IS-A relationship 
	 * between a parent class and a child class. Here the object acquires all the properties 
	 * of a parent object.
	 */
	int numLegs;
	String name;
	//Reintroducing default constructor
	public Animals () {
		super();
	}
	public Animals (int numLegs, String name) {
		this.numLegs = numLegs;
		this.name = name;
	}
	public static void main(String[] args) {
		Birds a = new Birds("tweety", 2);
		System.out.println("This is " +a.name+". She has "+a.numLegs+" legs.");
		Birds b = new Birds("woody");
		System.out.println("This is " +b.name+". She has "+b.numLegs+" legs.");
	}
}
		

//Inheritance examples
class Birds extends Animals{
	Birds(String name, int numLegs) {
		super(numLegs, name);
		this.name = name;
		this.numLegs = numLegs;
	}
	
	Birds(String name){
		super();
		this.name = name;
		this.numLegs = 2;
	}
	
}
		


