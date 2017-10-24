package com.datatypes;

public class StringBufferExample {//synchronized(extra time)

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Hello");
		s.append(" World");
		
		System.out.println("string value is -->" +s);
		
	}

}
