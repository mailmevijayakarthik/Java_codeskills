package com.testing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String arg[]) {

		Pattern p = Pattern.compile("m.");
		Matcher m = p.matcher("mc");
		Boolean b = m.matches();
		System.out.println(b);
		
	}
}
