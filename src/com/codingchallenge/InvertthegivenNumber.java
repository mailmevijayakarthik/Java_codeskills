package com.codingchallenge;

import java.util.Scanner;

public class InvertthegivenNumber {

	public static void main(String arg[]) {
	
		System.out.println("Enter the number :");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int inverted = 0;
	    do {
	    	 inverted = 0;
	    	inverted=inverted+(number%10);
	    	number=number/10;
	    	
	    }while(number!=0);
	    
	    System.out.println("Inverted number :"+ inverted);
	    
		
		
	}
}
