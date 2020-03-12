package com.codingchallenge;

public class FirstTwoMax {

	public static void main(String arg[]){
		int[] mylist= {20,40,30,50,25,100,270};
		
		int max1 =0;
		int max2 =0; 
		
		for(int i=0;i<mylist.length;i++) {
			if(mylist[i]>max1) {
				max2=max1;
				max1=mylist[i];
			}else if(mylist[i]>max2) {
				max2=mylist[i];
				
				
			}
		}
		
		System.out.println("First : "+ max1+ "Second :"+ max2);
		
	}
}
