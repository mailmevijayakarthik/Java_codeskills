package com.leetcode.challenge;

import java.util.ArrayList;
import java.util.List;

public class Leet_handlingstring {
	public  static void main(String arg[]) {
		String s="krmyfshbspcgtesxnnljhfursyissjnsocgdhgfxubewllxzqhpasguvlrxtkgatzfybprfmmfithphckksnvjkcvnsqgsgosfxc";
		int k = 20;
		
		String needed = reverseStr(s, k);
		System.out.println(needed);
	
		}

	private static String reverseStr(String s, int k) {
		
		String neededrev="";
		if(s.toCharArray().length>2*k) {
			String mysplit=s.substring(0, 2*k);
			String leftover=s.substring(2*k);
			neededrev=replace_n_characters(mysplit,k);
			
		//	s=leftover;
		//	reverseStr(s,k);
			while(leftover.toCharArray().length>0) {
			
			if(leftover.toCharArray().length>2*k) {
				String leftsplit1=leftover.substring(0, 2*k);
				String leftsplitrest=leftover.substring(2*k);
				neededrev=neededrev+replace_n_characters(leftsplit1,k);
			}else if(leftover.toCharArray().length>k && leftover.toCharArray().length<2*k) {
				neededrev=neededrev+replace_n_characters(leftover,k);
			}else if(leftover.toCharArray().length<k) {
				neededrev=neededrev+reversestring(leftover);
			}
			}
			
		}else if(s.toCharArray().length>k && s.toCharArray().length<2*k ) {
			String split1=s.substring(0, k);
			String splitrest=s.substring(k);
			neededrev=neededrev+reversestring(split1)+splitrest;
			
		}else if(s.toCharArray().length<k) {
			neededrev=neededrev+reversestring(s);
		}
		
		return neededrev;
	}

	private static String replace_n_characters(String mysplit, int k) {
		// TODO Auto-generated method stub
		String first = mysplit.substring(0, k);
		String remaining = mysplit.substring(k);
		
		mysplit=reversestring(first)+remaining;
		return mysplit;
	}
	
	private static String reversestring(String reverse) {
		String rev = "";
		char[] listchar = reverse.toCharArray();
		for(int i=listchar.length-1;i>=0;i--) {
			rev= rev+reverse.charAt(i);
			
		}
		
		return rev;
	}
}
