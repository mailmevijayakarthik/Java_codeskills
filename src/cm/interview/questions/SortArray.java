package cm.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArray {

	public static void main(String arg[]) {
		
		String orginalArray[]= {"Vijay","Karthik","Arul","Xaviour","Zebraaaaaaa"};
		
		List<String> newArray = new ArrayList<String>();
		Arrays.sort(orginalArray);
	//	Arrays.sort(orginalArray,Collections.reverseOrder());
		System.out.println(orginalArray);
		
		for(String s :orginalArray) {
			System.out.println(s);
			newArray.add(s);
		}
		System.out.println(newArray);
	}
}
