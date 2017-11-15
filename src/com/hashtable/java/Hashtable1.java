package com.hashtable.java;

import java.util.Hashtable;
import java.util.Map;

public class Hashtable1 {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		
		
		hm.put(101, "Avanish");
		hm.put(102, "Dixit");
		hm.put(103, "Primal");
		
		for(Map.Entry m : hm.entrySet()){
			
			System.out.println(m.getKey()+" "+ m.getValue());
		}
	}
}
