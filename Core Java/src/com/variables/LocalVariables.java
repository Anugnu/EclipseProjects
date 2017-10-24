package com.variables;

public class LocalVariables {

	public static void main(String[] args) {
		int a=10;// local variables
		int b=20;
		System.out.println(a);
		
		LocalVariables variable = new LocalVariables();
		variable.m1();
		
	}

	void m1() {
		int a = 10;//variables should be declared in every method if they are given inside the method 
		System.out.println(a);
	}
}
