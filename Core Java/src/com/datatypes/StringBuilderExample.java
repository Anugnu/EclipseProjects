package com.datatypes;

public class StringBuilderExample {//not synchronized

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("Hello");
		s.append(" World");
		
		System.out.println("string value is -->" +s);
		

	}

}
