package com.companies.SDETinterview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PhonenumberisUnique {
	
	public static void main(String[] arg) {
		
		Scanner in = new Scanner(System.in);
		long number = in.nextLong();
		boolean uniquephonenumber = true;
		
		int x = 0 ;
		ArrayList<Integer> mylist = new ArrayList<>();
		 Set<Integer> hash_Set = new HashSet<Integer>(); 
		
		while(number!=0) {
			mylist.add((int) (number%10));
			number=number/10;
		}
		
		for(int i : mylist) {
			
			if(!hash_Set.add(i)) {
				uniquephonenumber=false;
			}
			
			
		}
		
		if(uniquephonenumber==true) {
			System.out.println("Its unique");
		}else {
			System.out.println("Its Not unique");
		}

		
		
	}

}
