package com.Controlstatments.java;

import java.util.Scanner;

public class IfElse {
	
	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the nember : ");
		
		num = sc.nextInt();
		
		
		
		
		
		
		if (num%2 == 0 ){
			
			System.out.println("The nember is even");
			
		}
		
		else {
			
			System.out.println("The nember is odd");
		}
		
	}

}
