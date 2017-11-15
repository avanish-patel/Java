package com.Numbers.java;

public class Pelindrome {

	public static void main(String[] args) {
		
		int  n = 121;
		int r, s=0;
		
		int t=n;
		
		while(n>0){
			
			r = n%10;
			n = n/10;
			
			s= s*10+r;
			
		}
		
		if(t==s){
			System.out.println("The number is pelindrome");
		}
		else{
			System.out.println("The number is not pelindrome");
		}
	}
}
