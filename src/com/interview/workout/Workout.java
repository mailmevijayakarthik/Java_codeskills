package com.interview.workout;

import java.util.Arrays;

public class Workout {

	public static void main(String[] args) {
		
		sortandFindsmallest();
	}
	
	public void checkPalindrom() {

		// TODO Auto-generated method stub
		String name = "madam";
		
		String rev = "";
		
		int len = name.length();
		for (int i=len-1;i>=0;i--) {
			rev= rev+name.charAt(i);
		}

		System.out.println(rev);
		if(name.equalsIgnoreCase(rev)) {
			System.out.println("Its a Palindrom");
		}else {
			System.out.println("Its  Not a Palindrom");
		}
	}
	
	public static void sortandFindsmallest() {
		Integer[] num = {12,23,33,646,34,2,34};
		Arrays.sort(num);
		System.out.println(num[0]);
		
	}

}
