package com.variables;

public class InstanceVariablesMethods {

	int a = 10;// instance variables
	int b = 20;

	public static void main(String[] args) {// static method

		InstanceVariablesMethods method = new InstanceVariablesMethods();
		System.out.println(method.a);
		method.m1();
		// static area
	}

	void m1() {// instance method

		System.out.println(a);
		// instance area
	}

}
