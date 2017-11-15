package com.hashtable.java;

import java.util.Hashtable;
import java.util.Map;

class Book{
	
	int id;
	String name;
	String publisher;
	int quantity;
	
	public Book(int id, String name, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	
	
	
}

public class Hashtable3 {
	
	public static void main(String[] args) {
		
		
		Hashtable<Integer, Book> hashtable = new Hashtable<>();
		
		Book b1 = new Book(102, "Java", "O'really", 4);
		Book b2 = new Book(102, "Python", "Willey", 5);
		Book b3 = new Book(103, "GO", "GOOGLE", 12);
		
		
		hashtable.put(1, b1);
		hashtable.put(2, b2);
		hashtable.put(3, b3);
		
		for(Map.Entry<Integer, Book> map : hashtable.entrySet()){
			
			int key = map.getKey();
			Book b = map.getValue();
			
			System.out.println(key+ " Details: ");
			System.out.println(b.id +" "+b.name+" "+b.publisher+" "+b.quantity);
		}
		
		
		
	}
	
	
}


