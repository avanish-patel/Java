package com.loops.java;

public class BreakStatment {

	
	public static void main(String[] args) {
		
		for (int i = 0; i <= 10 ; i++){
			
			if (i == 5){   // terminate the loop when i = 5 , nothing is printed after 5
				break;
			}
			System.out.println(i);
		}
	}
}
