package com.revature.intro;

public class WhileEx {
	public static void main(String[] args) {
		decToHex(190);
		
	}
	//While loop example
	//Convert a decimal number to an Hexadecimal
	static String decToHex(int x){
	//String decToHex (int x){
		String out = "";
		int rem =0;;
		//char hexDex[100];
		
		while (x>0) {
			//num = x/16;
			rem= x%16;
			//
			out = ""+ (rem > 9 ? Character.toString((char)(rem+87)) : rem) + out; //
			x/=16;
			//System.out.println(out);
			//System.out.println(out);
			//System.out.println(rem);
		}
		System.out.println(out);
		return out;
	}

}
