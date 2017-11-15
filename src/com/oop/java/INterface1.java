package com.oop.java;

interface Bank{                  // interface
	
	void rateOfIntrest();
	
}

class BankOfIndia implements Bank{         // implementation of interface in the class
                                           // class can implements more than one interfaces
	@Override                              //interface can extends more than one interfaces 
	public void rateOfIntrest() {
		
		System.out.println("The rate is 5%");
		
	}

}


public class INterface1 {
	
	public static void main(String[] args) {
		
		Bank obj = new BankOfIndia();        // creating the reference of interface and object of class
		obj.rateOfIntrest();
	}
}
