package com.Array.java;

public class Array8 {

	public static void main(String[] args) {

		// 3 Dimensional array

		int p[][][] = new int[4][4][4]; // assigning number of elements in array

		// adding values in this array

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4; j++) {

				for (int k = 0; k < 4; k++) {

					p[i][j][k] = i + j + k;
				}
			}
		}
		// printing values using for loop

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4; j++) {

				for (int k = 0; k < 4; k++) {

					System.out.print(" " + p[i][j][k]);
				}
			}
		}

		System.out.println("");
		System.out.println("");
		
		
		// using enhanced for loop

		for (int i[][] : p) {
			for (int j[] : i) {
				for (int k : j) {
					System.out.print(" " + k);
				}
			}
		}
	}

}
