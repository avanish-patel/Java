package com.basics.java;

public class Casting {

	
	
	public static void main(String[] args) {
		
		
		// widening or automatic casting from small to large
		
		int i = 100;
		
		long l = i;
		
		float f = l;
		
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		
		
		// narrowing or explicit casting
		
		
		double d = 100.04;
		
		long k = (long)d;
		
		int j = (int)k;
		
		System.out.println(d);
		
		System.out.println(k);
		
		System.out.println(j);
	}
}
