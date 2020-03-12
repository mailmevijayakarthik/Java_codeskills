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
	
	
//	ArrayList<String> list = new ArrayList<String>();
//	
//	for(int i=0;i<number.length;i++) {
//		list.add(Integer.toString(number[i]));
//	}
	
	HashSet<Integer> uniqueset = new HashSet<Integer>();
	HashSet<Integer> duplicateset = new HashSet<Integer>();
	
	for(int element : number) {
		if(!uniqueset.add(element)) {
			duplicateset.add(element);
		}
		
	}
	
	System.out.println(uniqueset);
	System.out.println("Duplicate Elements :" + duplicateset);
	
	
	
	
}
	
}
