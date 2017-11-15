package com.oop.java;

public class Inheritance {
	
	public static void main(String[] args) {
		
		addSub obj = new addSub();
		
		obj.i = 10;
		obj.j =5;
		
		obj.sum();
		System.out.println(obj.sum);
		
		obj.sub();
		System.out.println(obj.sub);
	}

}



class add{           // parent class , super class ,base class
	
	int i,j,sum;
	
	public void sum(){
		
		sum = i+j;
	}
}


class addSub extends add{      // child class , sub class , derived class
	
	int sub;
	public void sub(){
		sub = i-j;
	}
}