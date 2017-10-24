package com.variables;

public class StaticVariablesMethods {

	static int a = 20;//static variables
	static int b = 20;//initialization of values is optional

	public static void main(String[] args) {//static method
		// static area
		System.out.println(StaticVariablesMethods.a);//directly accessing using class-name
		StaticVariablesMethods method = new StaticVariablesMethods();
		method.m1();
	}

	void m1() {

		System.out.println(StaticVariablesMethods.a);//directly accessing using class-name
		// instance area
	}

}
