package com.multithreading.java;

class Count{
	
	int count;
	
	public synchronized void increment(){
		
		// synchronized method will wait until thread t1 finished executing than it will call thread t2 to execute 
		// by using we will execute both the methods one by one
		// this will tell thread to execute one at a time
		
		count++;
	}
	
	
	
	
}


public class SynchronizedMultithreading {

	public static void main(String[] args) throws InterruptedException {
		
		Count c = new Count();
		
		Thread t1 = new Thread(()->{
			
			for (int i = 0; i < 1000; i++) {
			
				c.increment();
			}
			
		});
		
		
		Thread t2 = new Thread(()->{
			
			for (int i = 0; i < 1000; i++) {
				
				c.increment();
			}
			
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		
		System.out.println("Count is "+ c.count);
		
		
		
		
		
		
	}
}
