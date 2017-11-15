package com.oop.java;

public class SuperKeyword {
	
	public static void main(String[] args) {
		
		sub obj = new sub();
		
		obj.abc();
		
  }

}


// we use super keyword to call the variables and methods from the super class


class sup {
	
	int i = 5;
	
	public void abc(){
		
		System.out.println("From super class");
	}
	
}

class sub extends sup{
	
	int i =4;
	
	public void abc(){
		System.out.println(super.i);         // super.i class the value of i from sup class not from the sub
		
		
		System.out.println("From subclass");
		super.abc();                          // super.abc() call  abc() from sup class
		
	}
}