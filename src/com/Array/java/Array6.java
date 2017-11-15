package com.Array.java;

public class Array6 {
	public static void main(String[] args) {
		
		int d[][] = {
			    
				{2,3,4,5},
				{3,4,5,6}, 
				{4,5,6,7}
				
		            };
		
		for (int i[] : d){
			
			for (int j : i){
				
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}

}
