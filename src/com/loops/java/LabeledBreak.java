package com.loops.java;

public class LabeledBreak {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 4; j++) {

				System.out.print("* ");
			}
			System.out.println("");
		}

		////////////////////// unlabeled
		System.out.println("/////////////////");
		System.out.println("/////////////////");
		System.out.println("/////////////////");
		System.out.println("/////////////////");
		System.out.println("/////////////////");

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 4; j++) {

				if (i == 3) {
					break;    // this is break only inner loop not the outer loop
				}

				System.out.print("* ");
			}
			System.out.println("");
		}

		////////////////////// labeled
		System.out.println("/////////////////");
		System.out.println("/////////////////");
		System.out.println("/////////////////");
		System.out.println("/////////////////");
		System.out.println("/////////////////");
		
		avy:      // give name and labeling the outer loop
		for (int k = 1; k <= 4; k++) {

			for (int l = 1; l <= 4; l++) {

				if (k == 3) {
					break avy ;
				}

				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
