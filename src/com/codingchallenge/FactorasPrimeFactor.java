package com.codingchallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactorasPrimeFactor {

	public static void main(String arg[]) {
		
		System.out.println("Enter the number to find Factor:");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		List<Integer> FactoryList = new ArrayList<Integer>();
		List<Integer> PrimeFactor = new ArrayList<Integer>();
		
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				FactoryList.add(i);
			}
		}
		System.out.println("Factor for the given number is :"+ FactoryList);
		for(int n :FactoryList) {
			boolean isPrime = true;
			for(int j=2;j<n;j++) {
				if(n==2) {
					PrimeFactor.add(n);
					
				}else if(n%j==0) {
					
					isPrime=false;
					
				}
			}
			if(isPrime==true) {
				PrimeFactor.add(n);
			}
		}
		
		System.out.println("List of Prime Factors :"+ PrimeFactor);
	}
}
