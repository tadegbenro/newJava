package com.revature.oop;

public class UnderstandingOOP {
	public static void main(String[] args) {
		//Creating an Instance with Dog
		Dog myDog = new Dog();
		
		System.out.println(myDog.animalVar);
		myDog.move();
		myDog.forDogsOnly();
		System.out.println(myDog.consume());
		System.out.println(myDog.type);
		
		//Creating an instance with Animal
		Animal otherDog = new Dog();
		
		System.out.println(otherDog.animalVar);
		otherDog.move();
		//otherDog.forDogsOnly(); //This is an error as the method does not exist in the Animal class
		System.out.println(otherDog.consume());
		System.out.println(otherDog.type);
		
		//Extra Bonus
		otherDog.survive();
	}
	
}
	


