package com.oop.java;

interface SBank{           // interface
	
	void intrestRate();
}


public class InrerfaceWithAnonymsClass {
	
	public static void main(String[] args) {
		
		
		SBank obj = new SBank() {                  // creating the obj of an interface and using anonymous class
			
			@Override
			public void intrestRate() {
				
				System.out.println("The rate is 10%");
				
			}
		};
		
		obj.intrestRate();
	}

}
