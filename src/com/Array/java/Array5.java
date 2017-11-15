package com.Array.java;

public class Array5 {
	
	
	public static void main(String[] args) {
		
		// 2 Dimensional array
		
		
		/*     a[] = {2,3,4,5}
		 *     b[] = {3,4,5,6}
		 *     c[] = {4,5,6,7}
		 *     
		 *     d[] [] = {{2,3,4,5},{3,4,5,6},{4,5,6,7}}
		 *     
		 *     it is the array of array
		 *     
		 *     d[0][0] = 2;
		 *     d[0][1] = 3;
		 *     d[0][2] = 4;
		 *     d[0][3] = 5;
		 *     d[1][0] = 3;
		 *     d[1][1] = 4;
		 *     d[1][2] = 5;
		 *     .
		 *     .
		 *     .
		 *     .
		 */
		
		int d[][] = {
				    
				{2,3,4,5},
				{3,4,5,6}, 
				{4,5,6,7}
				
		            };
		for (int i = 0; i<3 ; i++){   // for number of row 3
			
			for (int j = 0; j<4; j++){ // for number of column 4
				
				System.out.print(d[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
