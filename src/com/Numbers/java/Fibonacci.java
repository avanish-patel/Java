package com.Numbers.java;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a,b;
		a=1;
		b=1;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number until you want Febonnacci series : ");
		int n = obj.nextInt();
		
		int k=0;
		System.out.print("1 1 ");
		while (k<=n){
			k = a+b;
			
			System.out.print(k+" ");
			a=b;
			b=k;
			
			
		}
		
		
	}
}
