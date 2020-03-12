package com.codingchallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String arg[]) {
		System.out.println("\nHow many Fibonacci series you need to print");
		Scanner scan = new Scanner(System.in);
		Integer number = scan.nextInt();
		int count = 1;
		int a=0,b=0,c=1;
		ArrayList<Integer> fib = new ArrayList<Integer>();
		 for(int i=0;i<=number;i++) {
		  a=b;
		  b=c;
		  c=a+b;
		  //System.out.println(a);
		  fib.add(a);
		  
		 }
		 System.out.println(fib);

	}
}
