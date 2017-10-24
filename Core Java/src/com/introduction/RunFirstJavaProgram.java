package com.introduction;

public class RunFirstJavaProgram {

	public static void main(String[] args) {// main method(2)

		System.out.println("Hello My First Program");
	}

	static { // first static block executes(1)

		System.out.println("before main starts");
		System.out.println("second static");
	}
	// object executes(3)
}
