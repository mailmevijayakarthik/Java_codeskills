package com.leetcode.challenge;
/*
Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. 
If there are less than k characters left, reverse all of them. 
If there are less than 2k but greater than or equal to k characters, 
then reverse the first k characters and left the other as original.
Example:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Restrictions:
The string consists of lower English letters only.
Length of the given string and k will in the range [1, 10000]
*/
public class String_handling {
	public static void main(String arg[]) {
		String s="krmyfshbspcgtesxnnljhfursyissjnsocgdhgfxubewllxzqhpasguvlrxtkgatzfybprfmmfithphckksnvjkcvnsqgsgosfxc";
		int k = 20;
		reverseStr(s, k);
	
		
	}
	
	public static String reverseStr(String s, int k) {
	
		if(s.toCharArray().length>=2*k) {
		String firstpart = s.substring(0,2*k);
		
		String leftover = s.substring(2*k);
		char[] leftcount=leftover.toCharArray();
		if(leftcount.length<k) {
			leftover=reverse(leftover);
		}else if(leftcount.length>k && leftcount.length<=2*k) {
			leftover=reverse_n_characters(leftover, k);
		}else if (leftcount.length>=2*k) {
			leftover=reverse_n_characters(leftover, k);
		}
		
		firstpart=reverse_n_characters(firstpart, k);
		s=firstpart+leftover;
		System.out.println(s);
        
        
    }else if(s.toCharArray().length>k && s.toCharArray().length<2*k){
		s=reverse_n_characters(s, k);
		
	}else if(s.toCharArray().length<=k) {
		s=reverse(s);
		System.out.println(s);
	}
		return s;
	}
	
	public static String reverse(String mystring) {
		String rev = "";
		char[] listchar = mystring.toCharArray();
		for(int i=listchar.length-1;i>=0;i--) {
			rev= rev+mystring.charAt(i);
			
		}
		
		return rev;
	}
	
	public static String reverse_n_characters(String mystring, int n) {
		
		String first = mystring.substring(0, n);
		String remaining = mystring.substring(n);
		
		if(remaining.toCharArray().length>n) {
			
		}
		mystring= reverse(first)+remaining;
		
		return mystring;
	}
}
