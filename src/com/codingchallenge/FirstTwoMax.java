package com.codingchallenge;

import java.util.ArrayList;

public class FirstTwoMax {
	/*
	
*/
	public static void main(String arg[]){
		int[] mylist= {20,40,30,500,25,100,27};
		int max1=0;
		int max2=0;
		
		
		for(int i=0;i<mylist.length;i++) {
			if(mylist[i]>max1) {
				max2=max1;
				max1=mylist[i];
			
			}else if(mylist[i]>max2) {
				max2=mylist[i];
			}
			
		}
		
		System.out.println("First Max is " + max1 + " Second Max is "+ max2);
		
	}
}
