package com.codingchallenge;

import java.util.Scanner;

public class Palindrome {
public static void main(String arg[]) {

for(;;) {
	System.out.println("\nEnter the word to check Palindrome");
	Scanner scan = new Scanner(System.in);
	String Message = scan.nextLine();

	char[] chararr = Message.toLowerCase().toCharArray();
	String revMessage="";
	for(int i = Message.length()-1;i>=0;--i) {
		revMessage=revMessage+chararr[i];
	}

	if(Message.equalsIgnoreCase(revMessage)) {
		System.out.println("Given sting is an Palindrome");
	}else {
		System.out.println("Given sting is NOT Palindrome");
	}

	}
}

}
