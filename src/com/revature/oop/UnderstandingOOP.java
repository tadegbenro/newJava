package com.revature.oop;

public class UnderstandingOOP {
	public static void main(String[] args) {
		//Creating an Instance with Dog
		Dog myDog = new Dog();
		
		System.out.println("My Dog: "+ myDog.animalVar);
		myDog.move();
		myDog.forDogsOnly();
		System.out.println("MyDog consumes: "+ myDog.consume());
		System.out.println("MyDog is type: "+ myDog.type);
		System.out.println("MyDog communicates "+ myDog.communicate());
		
		//Creating an instance with Animal
		Animal otherDog = new Dog();
		
		System.out.println("Other Dog: "+ otherDog.animalVar);
		otherDog.move(); //takes on Dog class method because it is abstract in Animal calss
		//otherDog.forDogsOnly(); //This is an error as the method does not exist in the Animal class
		System.out.println("OtherDog consumes: "+ otherDog.consume());
		System.out.println("OtherDog is type: "+ otherDog.type);
		System.out.println("OtherDog communicates "+ otherDog.communicate());
		
		//Extra Bonus
		otherDog.survive();
	}
	
}
	


