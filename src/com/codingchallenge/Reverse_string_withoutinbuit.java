package com.codingchallenge;

public class Reverse_string_withoutinbuit {

	public static void main(String arg[]) {

		String Str1 = "Good morning";
		int size = Str1.length();
		char[] Str2=Str1.toCharArray(); // Convert it into character Array
		char[] reverse;

		for(int i=size-1;i>=0;--i) {
		System.out.println(Str2[i]);

		}


	}
}
