package com.multithreading.java;



class C implements Runnable{
	
	public void run() {
		
		for(int i=0;i<=5;i++){
		System.out.println("Hello");
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
		}
	}
}

class D implements Runnable{
	
	public void run() {
		
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
public class Multithreading2 {

	
	public static void main(String[] args) {
		
		
		Runnable obj1 = new C();
		
		Runnable obj2 = new D();
		
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
		
		
		
	}
}
