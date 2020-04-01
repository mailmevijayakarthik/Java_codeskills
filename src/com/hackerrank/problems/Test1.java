package com.hackerrank.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Test1 {
	
	public static void main(String[] arg) {
		
		
		
	}
	
	public void printHexatoBinary() {
		int mask = 0X000F;
		int value = 0X2222;
		
		System.out.println(Integer.toBinaryString(mask));
		System.out.println(Integer.toBinaryString(value));
		System.out.println(value & mask);
		
		int x = 0010;
		int y =07;
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void getArrayinspecificorder() {
		int arr[]= {2,3,4,5,6,7,8,9,20};
		int n = arr.length;
		Scanner in = new Scanner(System.in);
		
		int d = in.nextInt();
		List<Integer> myarray = new ArrayList<Integer>();
		List<Integer> temp = new ArrayList<Integer>();
		for (int i = 0; i<d;i++) {
			temp.add(arr[i]);
		}
		for (int i = d; i<n;i++) {
			myarray.add(arr[i]);
		}
		System.out.println(myarray);
		System.out.println(temp);
		
		List<Integer> finallist = new ArrayList<Integer>();
		finallist.addAll(myarray);
		finallist.addAll(temp);
		System.out.println(finallist);
		
		 int[] expectedArray = new int[finallist.size()];
	        for(int i = 0; i <finallist.size(); i++ ){
	            expectedArray[i]=finallist.get(0);
	        }
	        
	        System.out.println(expectedArray);
		
		
	}
	
	public static void handlingusingIntArray() {
		
		int arr[]= {2,3,4,5,6,7,8,9,20};
		int nextarr[]= {12,13,14,15};
		List<Integer> mylist = Arrays.asList(2,3,4,5,6,7,8,9,20);
		System.out.println(mylist);
		
	}
	
	
	

}
