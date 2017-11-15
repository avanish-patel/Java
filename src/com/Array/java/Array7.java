package com.Array.java;

public class Array7 {

	public static void main(String[] args) {
		
		// jagged array - different numbers of column in each row 
		
		int k[][] = {
				
				{2,3,4,5},
				{3,4},
				{5,6,7}	
		};
		
		
		for ( int i[] : k){
			
			for (int j: i){
				
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
		/*    int k[][] = new int [3][]
		 * 
		 *    k[0] = new int [4];
		 *    k[1] = new int [2];
		 *    k[2] = new int [3];
		 *    
		 */
		
		
	}
}
