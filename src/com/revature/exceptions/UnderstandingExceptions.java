package com.revature.exceptions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UnderstandingExceptions {
	/*
	 * Exceptions in Java are objects that are thrown 
	 * up the stack at runtime halting the execution of 
	 * your application when something goes wrong 
	 * They are typically recoverable if handled properly
	 * 
	 * An exception can be "handled" by either catching 
	 * it at the moment it's thrown or by having the 
	 * method that it is thrown in further throw it up 
	 * the stack or "propagate" it. (also known as ducking)
	 * 
	 * Topics to cover:
	 * - Throwable API
	 * - Errors vs Exceptions 
	 * - RuntimeExceptions(unchecked) vs compile-time(checked)
	 * - how to handle exceptions - catch vs throw 
	 * - throw vs throws 
	 * - try-catch, try-catch-finally 
	 * - create our own exceptions
	 * - common exceptions to know 
	 */
	
	static Scanner scanner = new Scanner(System.in);
	
	//In this case the exception is being handled here in main
	
	//public static void main(String[] args) throws ArrayIndexOutOfBoundsException, IOException {
	public static void main(String[] args) { //Exceptions finally handled in main
		//run();
		//runB();
		//runC();
		
		int[] arr = {1,2,3,4};
		//throwsRuntime(arr); // This terminates the 
		try {
			throwsRuntime(arr);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of Bounds");
		}
		catch(IOException e) {
			System.out.println("IO Exception");
		}
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
		System.out.println("Enter a String");
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
