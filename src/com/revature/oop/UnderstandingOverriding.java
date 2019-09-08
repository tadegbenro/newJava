package com.revature.oop;

public class UnderstandingOverriding {
	/*
	 * When overriding methods, we cannot override private 
	 * methods as they only live within the class theyre 
	 * declared in 
	 * We can NOT make an overridden method more private than 
	 * its superclass's method. it can only be of the same level
	 * of access or more public 
	 */
	
	public static void main(String[] args) {
		A a = new A();
		//a.doThings(); // won't work
		a.doThings2();
		B b = new B();
		b.doThings();
		b.doThings2();
		A c = new B();
		//c.doThings(); //won't work
		c.doThings2();
	
	}

}

class A{
	private void doThings() {
		System.out.println("this method has default access");
	}
	void doThings2() {
		System.out.println("this method is public");
	}
}

class B extends A{
	public void doThings() {
		System.out.println("this method has default access when overridden in B");
	}
}
