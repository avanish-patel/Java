package com.Array.java;

import java.util.Random;

public class Array3 {

	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		
		int values[] = new int[50];
		
		for (int i =0; i< values.length;i++){
			
			values[i] = r.nextInt(200);
			
		}
		
		for (int i : values){
			
			System.out.println(i);
		}
	}
}
