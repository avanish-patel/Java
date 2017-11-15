package com.Array.java;

import java.util.Random;

public class Array4 {
	public static void main(String[] args) {
		
        Random r = new Random();
		
		
		int values[] = new int[50];
		
		for (int i =0; i< values.length;i++){
			
			values[i] = r.nextInt(200);
			
		}
		
		// Handling the exception 
		
		try {
		System.out.println(values[54]);
		}
		catch(Exception e){
			System.out.println("The velue entered is larger than range");
		}
		
		
		for (int i : values){
			
			System.out.println(i);
		}
	}

}
