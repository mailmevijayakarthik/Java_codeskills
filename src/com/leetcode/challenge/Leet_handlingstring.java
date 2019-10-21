package com.leetcode.challenge;

public class Leet_handlingstring {
	public  void main(String arg[]) {
		String s="krmyfshbspcgtesxnnljhfursyissjnsocgdhgfxubewllxzqhpasguvlrxtkgatzfybprfmmfithphckksnvjkcvnsqgsgosfxc";
		int k = 20;
		String newReverse="";
		reverseStr(s, k);
	
		}

	private void reverseStr(String s, int k) {
		// TODO Auto-generated method stub
		if(s.toCharArray().length>2*k) {
			String mysplit=s.substring(0, 2*k);
			String leftover=s.substring(2*k);
			
			String newReverse = replace_n_characters(mysplit,k);
			s=leftover;
			reverseStr(s,k);
			
			
		}else if(s.toCharArray().length>k && s.toCharArray().length<2*k ) {
			
			
		}else if(s.toCharArray().length<k) {
			
		}
	}

	private  String replace_n_characters(String mysplit, int k) {
		// TODO Auto-generated method stub
		String first = mysplit.substring(0, k);
		String remaining = mysplit.substring(k);
		
		mysplit=reversestring(first)+remaining;
		return mysplit;
	}
	
	private String reversestring(String reverse) {
		String rev = "";
		char[] listchar = reverse.toCharArray();
		for(int i=listchar.length-1;i>=0;i--) {
			rev= rev+reverse.charAt(i);
			
		}
		
		return rev;
	}
}
