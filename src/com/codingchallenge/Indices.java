package com.codingchallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Indices {
	
	public static void main(String arg[]) {
		int[] nums = {2,7,9,11};
		System.out.println("Actual numbers :"+ Arrays.toString(nums));
		int target = 9;
		int[] expectednum= twoSum(nums,target);
		System.out.println("Expected number is "+ Arrays.toString(expectednum));
	}
	
public static int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int first ;
        int expectedsecond;
        //List<Integer> IndicesList = new ArrayList<>();
        
        int[] expectednum = new int[2];
        
        for (int i=0;i<size;i++) {
        	first = nums[i];
        	expectedsecond=target-first;
        	for (int j=0;j<size;j++) {
        		if(nums[j]==expectedsecond) {
        			expectednum[0]=first;
        			expectednum[1]=expectedsecond;
        	
        		}
        	}
        	
        }
		return expectednum;
		
          
    }
}
