package com.loops.java;

public class Continue2 {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {

			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		

		for (int j = 0; j <= 10; j++) {

			if (j % 2 == 0) {
				continue;
			}
			System.out.println(j+1);
		}
	}

}
