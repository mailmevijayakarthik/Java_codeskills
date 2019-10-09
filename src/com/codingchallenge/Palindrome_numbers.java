package com.codingchallenge;

import java.util.Scanner;

public class Palindrome_numbers {
public static void main(String arg[]) {

for(;;) {
	System.out.println("\nEnter the word to check Palindrome");
	Scanner scan = new Scanner(System.in);
	long number = scan.nextLong();
	long original=number;
	long revnumber = 0;
	while(number!=0) {
	 revnumber = (revnumber*10)+(number%10);
	 number = number/10;
	}
	
	System.out.println(revnumber);
	
	if(original==revnumber) {
		System.out.println("Given number is Palindrome");
	}else {
		System.out.println("Given number is Not Palindrome");
	}

}

}
}
