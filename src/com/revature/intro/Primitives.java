package com.revature.intro;

public class Primitives {
	int i; //hold 4 byte
	boolean b; //t or f
	char ch; // a single character held in ''
	double d; // decimal values 8 bytes
	long l; // whole numbers - 8 bytes
	float f;// doubles but smaller but more precision - 4 bytes
	short s;// 2 bytes
	byte byt; // 8 bits
	
	Integer intWrap = new Integer(10);
	Boolean boolWrap = b; //AUTOBOXING
	Character charWrap = new Character('c');
	Double doubleWrap = d;
	
	public static void main(String[] args) {
		//numberBases();
		//casting();
		System.out.println(numToChar(2));
	}
	static void numberBases() {
		int dec = 10;
		System.out.println(dec);
		
		//BINARY starts with 0b to identify the binary digits
		int binary = 0b101110;
		System.out.println(binary);
		
		//OCTAL (base 8)
		int octal = 010; //always start with zero
		System.out.println(octal);
		
		//HEX (base 16) starts with 0x to identify the hexadecimal digits
		int hex = 0xa314f;
		System.out.println(hex);
	}
	
	static void numberFormatting( ) {
		int largeNum = 100_000_000;
		//int wrong =_1_;
		
		double rightDouble = 101.31_94;
		//double wrongDouble = 102_.3194;
		
		long max = 21474836470L;
		
		System.out.println("Large NUm :" + largeNum+" "+"rightDouble :"+ rightDouble);
		System.out.println("Long max :" + max);	
		
	}
	static void casting() {
		/*
		 * Casting is the process of making a variable behave as
		 * a vairable of anther type. We can cast between primitives of the same
		 * literal type or objects on the same inheritance tree
		 * We can either explicitly cast or implicitly cast
		 */
		int x = 32768; //max value for short
		long lon = x; //implicitly casting into a larger reference type
		short sh = (short) x;
		System.out.println("SHort is "+ sh);
		System.out.println("Lon is "+ lon);
	}
	
	static int charToNUM(char c) {
		return c;
	}
	static char numToChar(int num) {
		return (char) num;
	}

}
