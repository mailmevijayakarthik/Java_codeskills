package com.companies.SDETinterview;

public class Matrix {
	
	/*Rotate a matrix by 90 degree*/
	
	public static void main(String[] arg) {
		
		int arr[][]= {{1,3,5},
				     {6,7,8},
				     {9,10,11}};
		
		printMatrix(arr);
		System.out.println();
		transposeMatrix(arr);
		System.out.println();
		rotate90degree(arr);
		
	}
	
	public static void printMatrix(int arr[][]) {
		
		/* i for row 
		 * j for column
		*/
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j] + " ");
				
			}
			System.out.println();
		}
		
	}
	
	public static void transposeMatrix(int arr[][]) {
		/* i for row 
		 * j for column
		 * 
		 * swaping numbers 
		 * a=b;
		 * b=c;
		 * c=a;
		*/
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int temp = arr[j][i];
				arr[j][i]=arr[i][j];
				arr[i][j]=temp;
				
			}
			
		}
		
		printMatrix(arr);
	}
	
	public static void rotate90degree(int arr[][]) {
		
		/* Columnwise swapping 
		 * 
		 * k - within column using the reverse concept 
		 * 
		 * a=b
		 * b=c
		 * c=a
		 * 
		 * */
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0,k=arr.length-1;j<k;j++,k--) {
				int temp = arr[j][i];
				arr[j][i]=arr[k][i];
				arr[k][i]=temp;
			}
			
		}
		
		printMatrix(arr);
	}

}
