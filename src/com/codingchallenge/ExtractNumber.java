package com.codingchallenge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumber {

	public static void main(String arg[]) {
		String result = "Your order is confirmed with number 24.56$ . Thanks for your purchase";
		
		Pattern pat = Pattern.compile("[0-9]+[.]+[0-9]+");
		Matcher match = pat.matcher(result);
		while(match.find()) {
			System.out.println(result.substring(match.start(), match.end()));
		}
			
		
	}
}

