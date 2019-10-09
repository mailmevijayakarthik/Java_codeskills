package com.codingchallenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class DuplicateElementsinArray {

public static void main(String arg[]) {

	
	/*Add the numbers as String variables 
	*/
	
	int number[]= {1,20,30,20,50,30,30,40,50};
	
	
	ArrayList<String> list = new ArrayList<String>();
	
	for(int i=0;i<number.length;i++) {
		list.add(Integer.toString(number[i]));
	}
	
	HashSet<String> uniquelist = new HashSet<String>();
	HashSet<String> duplicateelements = new HashSet<String>();
	
	for(String element : list) {
		if(!uniquelist.add(element)) {
			duplicateelements.add(element);
		}
		
	}
	
	System.out.println(uniquelist);
	System.out.println("Duplicate Elements :" + duplicateelements);
	
	
	
	
}
	
}
