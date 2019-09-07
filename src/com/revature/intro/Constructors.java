package com.revature.intro;

public class Constructors {
	
	public static void main (String[] args) {
		C c = new C();
		
	}
}

class A{
	A(){
		//super (); //is implicitly called
		System.out.println("IN CLASS A CONSTRUCTOR");
	}
}

class B extends A{
	B(){
		//super (); //is implicitly called
		System.out.println("IN CLASS B CONSTRUCTOR");
	}
}

class C extends B{
	C(){
		//super (); //is implicitly called
		System.out.println("IN CLASS C CONSTRUCTOR");
	}
	
	
}


