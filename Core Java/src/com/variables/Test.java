package com.variables;

public class Test {

	int a = 10;
	int b = 20;

	static void m1() {
		Test t = new Test();
		System.out.println(t.a);
		System.out.println(t.b);
	}

	static void m2() {
		Test t = new Test();
		System.out.println(t.a);
		System.out.println(t.b);
	}

	public static void main(String[] args) {
		Test.m1();
		Test.m2();

	}

}
