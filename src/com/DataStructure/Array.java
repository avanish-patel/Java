package com.DataStructure;

public class Array {
	
	public static void main(String[] args) {
		
		int array[] = new int[5];
		
		array[0] = 23;
		array[1] = 12;
		array[2]= 21;
		array[3]= 29;
		array[4]= 43;

		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println("At index "+i + " Element"+ array[i]);
		}
		
	}

}
