package com.multithreading.java;



class A extends Thread {     // extends thread class
	
	public void run(){                 // run method 
		
		for(int i=0; i<=5;i++){
			
			System.out.println("Hello");
			
			try {
				Thread.sleep(1000);      // it will sleep the thread for 1000ms
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class B extends Thread{            // extends thread class
	
	public void run(){                // run method
		
		for(int i=0;i<=5;i++){
			
			System.out.println("Hi");
			
			try {
				Thread.sleep(1000);
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}	
	}
}


public class Multithreading1 {
	
	public static void main(String[] args) {
		
		
		
		A obj1 = new A();              //    objects of both classes
		B obj2 = new B();
		
		obj1.start();               // obj.start to start threads
		obj2.start();
		
		
	}
}
