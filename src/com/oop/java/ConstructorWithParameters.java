package com.oop.java;

public class ConstructorWithParameters {
	
	public static void main(String[] args) {
		
		Ab obj = new Ab(5,4.6);   	
		
		System.out.println(" ");
		
		Ab obj2 = new Ab(5);
		
		System.out.println(" ");
		
		Ab obj3 = new Ab();
		
	}
	

}


class Ab {
	
	public Ab(){
		
		System.out.println("default constructor");
	}
	
	public Ab(int i){
		
		System.out.println("constructor with one parameters");
		System.out.println(i);
	}
	
	public Ab(int i, double k){
		
		System.out.println("Constructor with two parameters");
		
		System.out.printf(i +" and "+k);
	}
}