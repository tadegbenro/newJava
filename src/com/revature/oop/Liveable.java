package com.revature.oop;

public interface Liveable {
	int x = 10;
	/* an interface is an abstract method with no implementation
	 * They are referred to as "contracts"
	 * Since Java 8 we now have the ability to give methods 
	 * default implementation. We can also make static methods in interfaces
	 */
 
	
	int reproduce();
	String communicate();
	String consume();
	//String consume() {} is not ABSTRACT because of the curly braces
	
	/* 
	 * DEFAULT METHODS IN JAVA
	 * - new features since Java 8 allows us to implement methods in interfaces 
	 * - used so that we can update interfaces without having to rewrite all classes that implement that interface 
	 * - these methods can still be overridden if you wish
	 */
	
	default void survive() { //default methods in a interface
		
		System.out.println("staying alive");
		
	}
}
