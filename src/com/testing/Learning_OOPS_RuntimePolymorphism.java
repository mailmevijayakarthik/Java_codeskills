package com.testing;

class Shape{
void draw() {
System.out.println("Drawing the shape...");
}
}

class Rectange extends Shape{
	void draw() {
		System.out.println("Drawing the Rectange...");
		}
}
class Square extends Shape{
	void draw() {
		System.out.println("Drawing the Square...");
		}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Drawing the Circle...");
		}
}

public class Learning_OOPS_RuntimePolymorphism {

public static void main(String arg[]) {
	//// RUN TIME POLYMORPHISM
 Shape s ;
 s= new Shape() ;
 s.draw();
 s= new Rectange();
 s.draw();
}
}
