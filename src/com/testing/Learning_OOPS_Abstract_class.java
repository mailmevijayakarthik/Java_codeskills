package com.testing;

/*class Shape {
	void draw() {
		System.out.println("Drawing the shape...");
	}
}*/

abstract class Shape1 {
//	 Abstract class cant have an Object
//	  But run time envi will create an Object
	Shape1(){
		System.out.println("Shape is constructed");
	}

	abstract void draw();
	// Abstract method dont need an method definition
}

class Rectange1 extends Shape1{  // Object to Object Inheritance
	void draw() {
		System.out.println("Drawing the Rectange...");
		}
}
class Square1 extends Shape1{
	void draw() {
		System.out.println("Drawing the Square...");
		}
}
class Circle1 extends Shape1{
	void draw() {
		System.out.println("Drawing the Circle...");
		}
}

public class Learning_OOPS_Abstract_class {

public static void main(String arg[]) {
	//// RUN TIME POLYMORPHISM
 Shape s ;
 s= new Shape() ;
 s.draw();
 s= new Rectange();
 s.draw();
}
}
