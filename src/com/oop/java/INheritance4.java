package com.oop.java;

public class INheritance4 {
	
	public static void main(String[] args) {
		
		F2 obj1 = new F2();
		
		
		System.out.println("\n\n\n");
		
		
		F2 obj2 = new F2(7);
		
	}
	
	
	
	

}

class C1 {                    // parent class
	public C1() {

		System.out.println("In constructor C");
	}

	public C1(int i) {

		System.out.println("In constructor C with parameter i");
	}
}

class F2 extends C1 {          // child class

	public F2() {
		
		// super() is already here by default

		System.out.println("In constructor F");
	}

	public F2(int i) {
		
		super(i);   // super method in sub class call the constructor with parameters from super class

		System.out.println("In constructor F with parameter i");
	}
}