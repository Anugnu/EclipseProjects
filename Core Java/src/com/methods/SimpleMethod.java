package com.methods;

public class SimpleMethod {

	void m1(){
		
		System.out.println("in m1 method");
	}
	static void m2(){
		System.out.println("in m2 method");
		
	}
	public static void main(String[] args) {
		System.out.println("simple method example");

		SimpleMethod sm = new SimpleMethod();
		sm.m1();
		SimpleMethod.m2();
	}

}
