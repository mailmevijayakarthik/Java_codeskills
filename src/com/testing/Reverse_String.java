package com.testing;

public class Reverse_String {

public static void main(String arg[]) {
String name = "Vijayakarthikeyan";
String revname= "";
int size = name.length();
System.out.println(size);
for(int i = size-1; i>=0;i--) {
	revname = revname+name.charAt(i);

}
System.out.println("Reverese text :"+ revname);
}
}
