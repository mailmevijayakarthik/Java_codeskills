package com.leetcode.challenge;

public class Diff_Diagonal {
	
	public static void main(String[] arg) {
		
		{ 
	        int n = 3; 
	           
	        int arr[][] = 
	        { 
	            {11, 2, 4}, 
	            {4 , 5, 6}, 
	            {10, 8, 12} 
	        }; 
	       
	        System.out.print(difference(arr, n)); 
	         
	    } 
		
	}

	private static int difference(int[][] arr, int n) {
		
		int D1 =0;
		int D2 =0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
				if(i==j) {
					D1=D1+arr[i][j];
				}
			}
			
		
		}
		
		int x = n-1 ; 
		int y =0;
		
		while(y<=n-1) {
			D2= arr[x][y]+ D2;
			x--;
			y++;
		};
		
		
		
		return D1-D2;
		
	}
	
	

}
