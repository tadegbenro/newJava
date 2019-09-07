package com.revature.codingchallenges;
/*
 * Write a program that prints the numbers from 1 to a desired number
 * and for multiples of '3' print 'Fizz', instead of the number  and 
 * for the multiples of '5' print 'Buzz'
 */
import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		//fizzBuzz(15);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number (n) for fizzbuzz");
		String numString = scanner.nextLine();
		int num = Integer.parseInt(numString); //but what happens if we didin't pass in something that can be parsed?
		fizzBuzz(num);
		scanner.close();
		
	}
	
	static void fizzBuzz(int num) {
		for (int i = 1; i <= num; i++) {
			if (i % 15 ==0) System.out.println("FizzBuzz");
			else if (i %3 == 0) System.out.println("Fizz");
			else if (i % 5 == 0) System.out.println("Buzz");
			else System.out.println(i);
		}
	}

}
