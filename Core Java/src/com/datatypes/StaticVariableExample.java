package com.datatypes;

public class StaticVariableExample {

	static int a = 10;
	static int b = 20;
	static int c = a + b;//static variables so no need of object creation

	public static void main(String[] args) {

		System.out.println("result is-->" + c);
	}

}
