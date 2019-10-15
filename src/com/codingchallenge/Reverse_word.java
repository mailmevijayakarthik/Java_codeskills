package com.codingchallenge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reverse_word {

public static void main(String arg[]) {

 String Message = "I am vijayakarthikeyan" ;
 String reverse ="";

 Pattern p = Pattern.compile("\\s");
 String[] statement = p.split(Message);

 
for(int x=statement.length-1;x>=0;--x) {
	reverse=reverse+statement[x];
}

System.out.println(reverse);
}


}
