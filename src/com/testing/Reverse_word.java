package com.testing;

import java.util.regex.Pattern;

public class Reverse_word {

public static void main(String arg[]) {
String statement = "I am an Engineer";
Pattern p = Pattern.compile("\\s");
String[] actual = p.split(statement);

String revword= "";
int size = actual.length;
System.out.println(size);
for(int i = size-1; i>=0;i--) {
	revword = revword+actual[i]+" ";

}
System.out.println("Actual words :" + statement);
System.out.println("Reverese words :"+ revword);
}
}
