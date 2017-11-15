package com.basics.java;

public class ShiftOperator {
	
	public static void main(String[] args) {
		
		int a = 25;      // 1 1 0 0 1
		
		int b = a << 2;  // 1 1 0 0 1 0 0
		
		int c = a >> 2;  // 1 1 0 . .  
		
		System.out.println(b);
		
		System.out.println(c);
	}

}
