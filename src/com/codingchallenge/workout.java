package com.codingchallenge;

import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class workout {

	public static void main(String args[]) {
		//splitwords();
		//reverseString();
		//reversewords();
		checkStringpalindrom();
	}
	
	public static void splitwords() {
		String sentence = "I am VK from Austin";
		
		Pattern p = Pattern.compile("\\s");
		String[] words = p.split(sentence);
		for (String mywords:words) {
			System.out.println(mywords);
		}
		
	}
	
	public static void reverseString() {
		String name = "Vijayakarthikeyan";
		int len = name.length();
		String rev ="";
		for (int i=len-1 ; i>=0 ; --i) {
			
			rev = rev + name.charAt(i);
		}
		System.out.println("Reversed :"+ rev);
	}
	
	public static void reversewords() {
		String sentence = "I am VK from Austin";
		
		Pattern p = Pattern.compile("\\s");
		String[] words = p.split(sentence);
		String rev = "";
		for (int i=words.length-1; i>=0;--i) {
			rev= rev +" " +words[i];
		}
		
		System.out.println(rev);
	}
	
	
	public static void checkStringpalindrom() {
		
		for(;;) {
			Scanner scan = new Scanner(System.in);
			String name = scan.next();
			
			int len = name.length();
			String rev ="";
			for (int i=len-1 ; i>=0 ; --i) {
				
				rev = rev + name.charAt(i);
			}
			if(name.equalsIgnoreCase(rev)) {
				System.out.println("A Palindrom ");
			}else {
				System.out.println("Not A palindrom");
			}
		}
		
		
	}
}
