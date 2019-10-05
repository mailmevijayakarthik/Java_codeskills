package com.testing;

import org.testng.annotations.Test;

public class String_testing {

	String first = "Vijayakarthikeyan";
	String last = "Arul";
	private String String;

/// *********************
	protected void stringconcat() {
String myname = first+last;
String s = first.concat(last);
System.out.println(myname);
System.out.println(s);
}


/// *********************

protected void findmypostion() {

String source = first;
String s = "i";
int i = findletter(source,s);

System.out.println("Position : "+ i);
}


protected int findletter(String source , String l) {
	source = "Arul";
	int position = source.indexOf(l);
	return position;
}

/// *********************

@Test
public  void getNumbersfromString() {
	String confirmationmessage = "Congrats ! Your order 234242455000000000 is successfully places ";
	String numberOnly= confirmationmessage.replaceAll("[^0-9]","");
	//long value = Long.parseLong(numberOnly);
	 int value = Integer.parseInt(numberOnly);
	 

	System.out.println(value);

}

}
