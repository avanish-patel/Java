package com.multithreading.java;

public class MultithreadingLambda2 {

	public static void main(String[] args) {
		
		
		Thread t1 = new Thread(() ->{              //  everything inside thread
			for(int i=0;i<=5;i++){
				
				System.out.println("Hello");
				
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
	    });
		Thread t2 = new Thread(() ->{
			
			for(int i=0;i<=5;i++){
				
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
	    });
		
		t1.start();
		t2.start();
		
		
		
	}
}
