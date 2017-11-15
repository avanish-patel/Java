package com.oop.java;

public class Polymorphism2 {
	
	public static void main(String[] args) {
		
		
		// method overidding, dynamic binding , runtime polymorhism
		
		I obj = new I();
		obj.show();
		
	}

}

class H {
	
	public void show(){
		
		System.out.println("From H");
	}
	
}

class I extends H{
	
	public void show(){
		
		System.out.println("From I");
	}
}