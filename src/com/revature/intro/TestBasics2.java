package com.revature.intro;

public class TestBasics2 {
	public static void main(String[] args) {
		/* 
		 * Good Encapsulation Example as ClassBasics2 is not defined here
		 * It is only accessible via the package com.revature.intro
		 * Only the setter and getter can be used here
		 */
		ClassBasics2 basic3 = new ClassBasics2();
		basic3.setAboutMe("Coolio Jones");
		System.out.println(basic3.getAboutMe()); //CLassBasics 
		//System.out.println(basic3.AboutMe)
		
		//Testing Primitives Class
		//Primitives check = new Primitives();
		Primitives.numberFormatting();
	}
}
	