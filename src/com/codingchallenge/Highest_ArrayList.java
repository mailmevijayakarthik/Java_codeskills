package com.codingchallenge;

import java.util.ArrayList;

public class Highest_ArrayList {

	public static void main(String arg[]) {




		int arr[] = {60,2000,1000,50,3000,4000};

		int High = arr[0];

		for(int i =1 ; i<arr.length; i++) {

			if(arr[i]>High) {

				High = arr[i];
			}
		}
		System.out.println(High);
	}

}
