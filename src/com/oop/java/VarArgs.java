package com.oop.java;

public class VarArgs {

	public static void main(String[] args) {

		Display obj = new Display();

		obj.show(2, 4, 5, 6, 7, 8);  // printing variable numbers of arguments

		obj.show(2);
	}

}

class Display {

	public void show( int ... a){   // by putting 3 dots its create an array of arguments
		
		for(int i:a){   // by using enhanced for loop printing all the elements
			
			System.out.println(i);
		}
	
	
	}
}
