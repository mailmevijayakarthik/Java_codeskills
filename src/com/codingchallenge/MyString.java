package com.codingchallenge;

import java.util.StringTokenizer;

public class MyString {

	public static void main(String arg[]) {
		
		String myname="Vijaykarthik is an Automation      Engineer";
		/*char[] chararr = myname.toCharArray();
		System.out.println("My char Array :"+ chararr);
		for(char i : chararr) {
			System.out.println(i);
		}*/
		
		toremoveextraspace(myname);
		tosplitaswords(myname);
		
	}
	
	public static void getcharoutofString(String name) {
		char[] chararr = name.toCharArray();
		System.out.println("My char Array :"+ chararr);
		for(char i : chararr) {
			System.out.println(i);
		}
	}
	
	public static void toremoveextraspace(String myname) {
		
		StringTokenizer mywords = new StringTokenizer(myname," ");
		StringBuffer mybufferword = new StringBuffer();
		System.out.println(mywords.countTokens());
		while(mywords.hasMoreElements()) {
			mybufferword.append(mywords.nextElement().toString().toUpperCase()).append(" ");
		}
		
		System.out.println("mybufferword: "+ mybufferword);
	}
	

	public static void tosplitaswords(String myname) {
		
		StringTokenizer mywords = new StringTokenizer(myname);
		//StringBuffer mybufferword = new StringBuffer();
		System.out.println(mywords.countTokens());
		while(mywords.hasMoreTokens()) {
			System.out.println(mywords.nextElement());
			
		}
		
	    }
}
