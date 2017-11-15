package com.oop.java;

public class Constructor {
	
	public static void main(String[] args) {
		
		Abc obj = new Abc();   // whenever we create an object it will call default constructor
		
	}

}

class Abc {
	
	
	public Abc(){   // constructor has same name as class name
		
		System.out.println("This is the default constructor");
	}
}