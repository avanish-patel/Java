package com.oop.java;

public class INheritance2 {
	
	
	public static void main(String[] args) {
		
		addSubMulty obj = new addSubMulty();
		
		obj.i = 10;
		obj.j = 5;
		
		obj.sum();
		obj.sub();
		obj.multy();
		
	}

}



class add1{           // parent class , super class ,base class
	
	int i,j,sum;
	
	public void sum(){
		
		System.out.println(sum = i+j);
	}
}


class addSub1 extends add1{      // child class , sub class , derived class
	
	int sub;
	public void sub(){
		System.out.println(sub = i-j);
	}
}

class addSubMulty extends addSub1 {    // multi level inheritance
	
	int multy;
	public void multy(){
		
		System.out.println(multy = i*j);
	}
}