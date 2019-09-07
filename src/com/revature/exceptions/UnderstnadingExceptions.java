package com.revature.exceptions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UnderstnadingExceptions {
	/*
	 * 
	 */
	
	static Scanner scanner = new Scanner(System.in);
	
	//In thsi case the exception is being handled here in main
	
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException, IOException {
		//run();
		//runB();
		//runC();
		int[ ]arr = {1,2,3,4};
		throwsRuntime(arr);
		
	}
	
	static void run() {
		System.out.println("Enter a number");
		try {
			int num = scanner.nextInt();
			System.out.println("you entered "+ num);
		}catch(InputMismatchException e) {
			System.out.println("Input invalid");
		}
	}
	
	static void runB() {
			System.out.println("Enter a number");
			String numString = scanner.nextLine();
			try {
				int num = Integer.parseInt(numString);
				//System.out.println("you entered "+ num);
			}catch(NumberFormatException e) {
				System.out.println("you entered an invalid value, try again");
				runB();
			}
	}
	
	static void runC() {
		System.out.println("Enter a number");
		String newArray[] = {"tomi", "jane", "Matthew"};
		try {
			newArray[3] = "Kim";
			//System.out.println("you entered "+ num);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Out of Bounds, try again");
			//runC(); //keeps running
		}
	}
	static void throwsRuntime(int[] arr) throws IOException, ArrayIndexOutOfBoundsException{
		System.out.println(arr[10]);
	}

}
