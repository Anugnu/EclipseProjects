package com.oops;

public class CompileTimeExample {//method overloading

	public static void main(String[] args) {

		CompileTimeExample polyExample = new CompileTimeExample();
		int result = polyExample.addNumbers(10, 20);
		System.out.println("addition of integers:"+result);
		
		float floatresult = polyExample.addNumbers(10.22f, 12.13f);
		System.out.println("addition of float:"+floatresult);
		
		double doubleresult = polyExample.addNumbers(112.15, 220.25);
		System.out.println("addition of double:"+doubleresult);
	}

	public int addNumbers(int a, int b) {//method name should be same
		return a + b;//return type and type of arguments should not be same
	}

	public float addNumbers(float a, float b) {
		return a + b;
	}

	public double addNumbers(double a, double b) {
		return a + b;
	}
}
