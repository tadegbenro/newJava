package com.revature.assignments;

import java.util.Scanner;

/*
 * Write a program to display the first 25 Fibonacci numbers beginning at 0
 */

public class CoreJavaHW1Q2 {
	
	static int FibMethod1 (int n) { //Recursion Method
		if (n <=1)
			return n;
		return FibMethod1(n-1) + FibMethod1(n-2);
		
	}
	
	static int FibMethod2(int n) {
		int num1 =0, num2=1, sum;
		if (n==0)
			return num1;
		for (int i = 2; i<= n; i++) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
		return num2;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number (n) for nth number in Fibonacci Series: ");
		String numString = scanner.nextLine();
		int number = Integer.parseInt(numString); //Using method to convert string to integer
		//int number = 5;
		System.out.println("Using Fibonacci Method #1: "+ FibMethod1(number));
		System.out.println("Using Fibonacci Method #2: "+ FibMethod2(number));
	}
}

