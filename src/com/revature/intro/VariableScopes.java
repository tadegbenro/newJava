package com.revature.intro;

public class VariableScopes {
	/*
	 * the scope of a variable is simply where the variable is accessible 
	 * within a class, based on where and how the variable is declared
	 * 
	 * instance/object - accessible from all INSTANCE METHODS
	 *  cannot access instance scoped entities from non 
	 *  instance scoped entities without an instance
	 *  - these are fields declared outside of any method 
	 *  and without the static keyword 
	 *  
	 * static/class - accessible everywhere within a class. 
	 * 	also able to be accessed from the class name itself 
	 *  without an instance from other classes
	 *  - declared outside of any method or block WITH 
	 *  the static keyword 
	 *  
	 * method scope - declared within method OR passed in 
	 * 	as parameter to method
	 * 
	 * block - within curly braces(loops, if statements, 
	 * 	static blocks, etc)
	 */
	
	
	public static void main(String[] args) {
		String myName = "Genesis"; //METHOD SCOPE 
	
		for(int i=0; i < 3; i++) { //BLOCK SCOPE
		System.out.println(myName);
		int temp =0;
		System.out.println(temp);
		
		VariableScopes.test();
		}
		//System.out.println(temp); // This won't work outside the for loop scope
		VariableScopes.test(); // Testing outside of block
		VariableScopes a = new VariableScopes();
}
	
	//Understanding Blocks Scopes
	/*
	 * The examples below demonstrate that the word "static" in front of 
	 * a block makes its methods accessible via the class. No need to
	 * instantiate the class
	 */
	static {
		System.out.println("static block - runs without object instantiation");
	}
	
	{
		System.out.println("instance scoped block - requires an object of class to be instantiated");
	}
	
		
	public static void test() {
		//System.out.println(myName);
		//The statement above will not work
		String myStaticName = "Exodus";
		System.out.println(myStaticName);
		
	}
}

