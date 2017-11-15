package com.oop.java;


public class Polymorphism {
	
	// method overloading , early binding , compile time polymorphism
	
	public static void main(String[] args) {
		
		G obj = new G();
		
		obj.show();
		
		
		obj.show(5);
		
	}

}



class G {                     // This is call method overloading that we have many methods of same name but different parameters in a same class 
	
	public void show(){
		
		System.out.println("From G with no parameters");
	}
	
	public void show(int i){
		
		System.out.println("from G with "+ i);
	}
}