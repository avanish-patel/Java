package com.oop.java;

public class StaticKeyWord {
	
	public static void main(String[] args) {
		
		Pqr obj = new Pqr();    // to access non static method we need to create an object
		obj.show();
		obj.i = 10;
		
		Xyz.Display();          // to access static method we don't need to create an object
		Xyz.j = 15;
		
	}

}


class Pqr {
	
	int i;
	public void show(){               // non static method
		
		System.out.println("Hi");
	}
}

class Xyz{
	static int j;                      // static variable
	public static void Display(){      // static method
		
		System.out.println("Hello");
		}
}