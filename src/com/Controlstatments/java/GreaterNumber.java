package com.Controlstatments.java;

import java.util.Scanner;

public class GreaterNumber {
	
	public static void main(String[] args) {
		
		int a , b, c;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the first number : ");
		
		a = obj.nextInt();
		
        System.out.println("Enter the second number : ");
		
		b = obj.nextInt();
		
        System.out.println("Enter the third number : ");
		
		c = obj.nextInt();
		
		
		if (a>b && a>c) {
			
			System.out.println(a + " is the biggest number.");
			
		}
		else if (b>c){
			
			System.out.println(b + " is the biggest number.");
		}
		else {
			
			System.out.println(c +" is the biggest number.");
		}
	}

}
