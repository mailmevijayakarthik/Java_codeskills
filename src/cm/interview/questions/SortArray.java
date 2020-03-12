package cm.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArray {

	public static void main(String arg[]) {
		
		String orginalArray[]= {"Vijay","Karthik","Arul","Xaviour","Zebraaaaaaa"};
		Arrays.sort(orginalArray);
		System.out.println("New Sorted String Array "+orginalArray);
		
		
		List<String> newArray = new ArrayList<String>();
		
	//	Arrays.sort(orginalArray,Collections.reverseOrder());
		
		for(String s :orginalArray) {
			System.out.println(s);
			newArray.add(s);
		}
		System.out.println("Actual Array List after sorting "+ newArray);
	}
}
