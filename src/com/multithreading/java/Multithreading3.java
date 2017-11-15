package com.multithreading.java;




public class Multithreading3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		// using the lambda expression to assign the anonymous class
		Runnable obj1 = ()->{
			
			for (int i=0;i<100;i++){
				
				System.out.println("From obj1");
			}
		};
		
		Runnable obj2 = ()->{
			
			for (int i = 0; i < 100; i++) {
				
				System.out.println("From obj2");
				
			}
			
		};
		
		
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		// check weather is thread is live or dead
		System.out.println(t1.isAlive());
		
		// set the name of the thread
		t1.setName("t1 thread");
		t2.setName("t2 thread");
		
		// get the name of the thread
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		
		// start the thread
		t1.start();
		t2.start();
		
		// join thread to main thread
		t1.join();
		t2.join();
		
		// this will print after joining the thread
		System.out.println("bye");
		
	}

}
