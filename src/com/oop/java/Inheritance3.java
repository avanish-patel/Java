package com.oop.java;

public class Inheritance3 {

	public static void main(String[] args) {

		F obj1 = new F();     // when we create an object of child class with no parameters than it will call the default constructor from both the class 

		System.out.println("\n\n\n\n\n");

		F obj2 = new F(4);   // when we create an object of child class with  parameters than it will call the default constructor from the parent class and constructor with parameter from child class

	}

}

class C {                    // parent class
	public C() {

		System.out.println("In constructor C");
	}

	public C(int i) {

		System.out.println("In constructor C with parameter i");
	}
}

class F extends C {          // child class

	public F() {

		System.out.println("In constructor F");
	}

	public F(int i) {
		
		

		System.out.println("In constructor F with parameter i");
	}
}