package com.oop.java;

public class StaticBlock {
	
	
	// static block always executed before main method
	static {
		
		System.out.println("Hello World from static 1");
	}

	public static void main(String[] args) {
		System.out.println("Hello world from main");
	}
	
	static {
		
		System.out.println("Hello World from static 2");
	}
}
