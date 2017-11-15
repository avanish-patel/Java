package com.oop.java;


interface Mbank{            // interface
	
	void exchangeRate();
}


public class INterfaceWithLambdaExx {
	
	public static void main(String[] args) {
		
		Mbank obj = () -> {               // using lambda expression to implement the method 
			
			System.out.println("The exchange rate is 5%");
		};
		
		obj.exchangeRate();
	}
	
	

}
