package com.javalearning;

public class Learnstatic {
	static int i = 100;
	  static String s = "Beginnersbook";
	  static String v = "my name ";
	  static void myname() {
		  System.out.println(v);
		 
	  }
	  //Static method
	  static void display()
	  {
	     System.out.println("i:"+i);
	     System.out.println("i:"+s);
	  }

	  //non-static method
	  void funcn()
	  {
	      //Static method called in non-static method
	      display();
	  }
	  //static method
	  public static void main(String args[])
	  {
		  Learnstatic obj = new Learnstatic();
		  //You need to have object to call this non-static method
		  obj.funcn();
		  
	      //Static method called in another static method
	      display();
	   }
}
