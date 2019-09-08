package com.revature.oop;

public abstract class Animal implements Liveable{
	/* Abstract classes in Java are classes that have 
	 * the ABILITY to have abstract methods, and do not 
	 * have the ability to be instantiated
	 * 
	 * In order to be abstract, all we must do is use the 
	 * keyword abstract when declaring our class
	 * 
	 * abstract classes do NOT need to have abstract methods, 
	 * they simply have the ability too 
	 * 
	 * Also, weird note, abstract classes CAN have constructors 
	 * even though they cannot be instantiated
	 * 
	 * More on that here... https://www.java67.com/2013/02/can-abstract-class-have-constructor-in-java.html
	 * 
	 * Furthermore, this abstract class is going to implement and define methods from the Livable  interface
	 */
	
	public String type = "animals";
	public String animalVar = "all animals";
	@Override
	public String consume() {
		// TODO Auto-generated method stub
		return "Not sure what I eat yet!";
	}
	
	public String communicate() {
		return "With its mouth";
	}
	abstract void move(); // introduced in the Animal Class
	
		
		
	
}


