package com.revature.intro;

import java.util.Arrays;

public class ClassBasics2 {
	
	//Here is where static and instance variables go
	private String aboutMe;

	//below is a no argument constructor. This is set implicitly by Java. Calls super()
	ClassBasics2(){}
	
	public ClassBasics2(String aboutMe) {
		super(); // include this to reinstate the overridden implicit constructor
		this.aboutMe = aboutMe; //another constructor initializing itself
	}
	
	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}
	
	public static void main(String[] args) {
		/* we will instantiate the object here
		 * 
		 */
		ClassBasics2 basic2 = new ClassBasics2("John");
		System.out.println(basic2.aboutMe); //Cannot work outside the class
		System.out.println(basic2.getAboutMe()); //Works everywhere 
	}

}



