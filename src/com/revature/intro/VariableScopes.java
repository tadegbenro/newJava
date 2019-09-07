package com.revature.intro;

public class VariableScopes {
	/* The scope of a variable is simply where the variable is accessible within a class
	 * instance - accessible from all INSTANCE METHODS
	 * 
	 * static/calss -  accesible everywhere within a class. Also able to be accessed from the class
	 */
	public static void main(String[] args) {
	String myName = "Genesis"; //METHOD SCOPE 
	
	for(int i=0; i < 10; i++) { //BLOCK SCOPE
		System.out.println(myName);
		int temp =0;
	}
}
	
	
	
		
	public static void test() {
	//System.out.println(myName);
	//The statement above will not work
	}
}

