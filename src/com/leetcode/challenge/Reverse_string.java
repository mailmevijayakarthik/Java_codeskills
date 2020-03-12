package com.leetcode.challenge;

/**
 * @author vijayakarthikeyanarul
 *
 */
public class Reverse_string {

	/*
	 * Write a function that reverses a string. The input string is given as an
	 * array of characters char[].
	 * 
	 * Do not allocate extra space for another array, you must do this by modifying
	 * the input array in-place with O(1) extra memory.
	 * 
	 * You may assume all the characters consist of printable ascii characters.
	 */
public static void main(String arg[]) {
	
	String mystring ="Karthik";
	char[] myarray= mystring.toCharArray();
	
	reverseString(myarray);
}

public static void reverseString(char[] s) {
	
	//s  = new char[s.length];
	for(int i=0;i<s.length;i++) {
		
		s[i]=s[s.length-i-1];
		
	}
	
	
}
}
