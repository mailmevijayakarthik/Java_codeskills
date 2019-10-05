package com.codingchallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Print_Primenumbers {

	public static void main(String arg[]) {

		String message = "Please enter how many Prime number you need to Print";
		System.out.println(message);
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.println("Print the first "+ number + " Prime numbers ");
		boolean prime  ;

		int count = 1 ;
		int d = 2;
		ArrayList<Integer> Primelist = new ArrayList<Integer>();

		/*Prime Number :  Number (n) not dividable by any number (<n) & dividable only by n */
		for (int i =2 ; count<=number ;i ++ ) {
			prime = true ;
			if(i==2) {
				Primelist.add(i);
				count ++ ;
			}

			if (i!=2) {

				for (d = 2; i>d; d ++) {

					if(i%d==0) {

						prime = false ;
						break;
					}
				}
				if(prime == true ) {
					Primelist.add(i);
					count ++ ;
				}

			}


		}

		System.out.println("Printing the list of Prime numbers "+ Primelist);
	}
}
