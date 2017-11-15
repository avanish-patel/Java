package com.hashtable.java;

import java.util.Hashtable;

public class HashTable2 {
	
	public static void main(String[] args) {
		
		Hashtable<Integer, String> hashtable = new Hashtable<>();
		
		hashtable.put(101, "Avanish");
		hashtable.put(102, "Dixit");
		hashtable.put(103, "Primal");
		
		System.out.println("The hash table before remove : "+ hashtable);
		
		
		hashtable.remove(102);
		
		System.out.println("The hash table after remove : "+ hashtable);
		
	}
	
	

}
