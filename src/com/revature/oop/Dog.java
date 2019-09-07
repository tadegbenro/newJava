package com.revature.oop;

public class Dog extends Animal{
	/*
	 * Here we do more with Inheritance. Since the abstract class Animal uses the Liveable Interface
	 * Dog being a concrete class must implements all methods in Leveable
	 */
	public String type = "Dog";
	public String animalVar = "Now this is a dog"; //Overriding animalVar in concrete class
	public Dog() {
		//super.animalVar = "Now this is a dog"; //Here we override animalVar in the abstract class
	}
			

	@Override
	public String consume() {
		// Add new function
		System.out.println("DOG CONSUME METHOD");
		return "Bones and Meat";
	}

	@Override
	void move() {
		// Add new function
		System.out.println("Move on 4 Legs");
	}
	
	// Here we add a function exclusive to the Dog Class
	void forDogsOnly() {
		System.out.println("For Dogs Only");
	}


	@Override
	public int reproduce() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String communicate() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
