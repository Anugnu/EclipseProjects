package com.datatypes;

public class StringExample {

	public static void main(String[] args) {

		String s = "hello";

		s = s + " world";

		String result = s.substring(3);
		
		String secondresult = s.substring(2, 4);

		System.out.println("string value is -->" + secondresult);

	}

}
