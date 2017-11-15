package com.oop.java;

public class StaticBlock2 {
	
	static String s="";
	
	static {
		
		s = "Heeloo Aliens";
	}

	public static void main(String[] args) {
		System.out.println(s);
	}
}
