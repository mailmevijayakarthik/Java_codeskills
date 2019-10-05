package com.javalearning;

import org.testng.annotations.Test;

import com.javalearning.Class1AboutEmp;
import com.javalearning.Class2Empfav;
import com.testing.String_testing;

public class MyTestClass extends String_testing{



@Test
public void Employee() {
	Class1AboutEmp mine = new Class1AboutEmp();
	int Age = mine.getEmpAge();
	System.out.println(Age);
}

@Test
public void MethodfromOtherPackage() {
	
	String_testing str = new String_testing();
	str.getNumbersfromString();
}

}
