package com.revature.junit;

public class Methods {

	public int add(int ...nums) {
		int sum = 0;
		for (int n : nums) {
			sum+=n;
		}
		return sum;
	}

	boolean anagram(String a, String b) {
		return false;
	}

}
