package com.loops.java;

public class ContinueStatment {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i++){
			
			if (i == 4){   // it skip the i = 4 , then continues later
				continue;
			}
			System.out.println(i);
		}
	}
}
