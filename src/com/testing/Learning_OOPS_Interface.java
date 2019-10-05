package com.testing;

/*class Shape {
	void draw() {
		System.out.println("Drawing the shape...");
	}
}*/

interface Shape2 {
//	 Abstract class cant have an Object
//	  But run time envi will create an Object


	void draw(); // By Default its a Public
	// Abstract method dont need an method definition
}

class Rectange2 implements Shape2{  // Object to Object Inheritance
  public void draw() {
		System.out.println("Drawing the Rectange...");
		}
}
class Square2 implements Shape2{
	public void draw() {
		System.out.println("Drawing the Square...");
		}
}
class Circle2 implements Shape2{
	public void draw() {
		System.out.println("Drawing the Circle...");
		}
}

public class Learning_OOPS_Interface {

public static void main(String arg[]) {
	//// RUN TIME POLYMORPHISM
 Shape s ;
 s= new Shape() ;
 s.draw();
 s= new Rectange();
 s.draw();
}
}
