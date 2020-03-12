package com.codingchallenge;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class FirstTwoMaxNegative {
	
//	Finding max two numbers in the negative range 
	
	public static void main(String arg[]) {
		findfirsttwobigbysorting();
		
	}
	
	public static void findfirstTwoBigbyComparing() {
		int[] n = {50,-10,-20,-10,-15,-30,-51};
		int max1 = n[0];
		int max2 = n[1];
//		if(max2>max1) {
//			max2=n[0];
//			max1=n[1];
//		}
		for(int i : n) {
			if(i>max1) {
				max2=max1;
				max1=i;
				
			}else if(i>max2) {
				max2=i;
			}
		}
		
		System.out.println("First max "+ max1 + " Second max"+ max2);
		
	}
	
	public static void findfirsttwobigbysorting() {
		int[] n = {50,-10,-20,-10,-15,-30,-51};
		
		Integer[] num = new Integer[]{-50,10,20,-10,15,30,51}; 
		
		
		
		Arrays.sort(num,Collections.reverseOrder());
		System.out.println("First Max"+ num[0] + "Second Max :"+ num[1]);
		
	}

}
