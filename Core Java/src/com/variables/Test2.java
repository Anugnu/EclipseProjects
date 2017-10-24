package com.variables;

public class Test2 {

	int a=10;
	int b=20;
	static int c=30;
	static int d=40;
	
	void m1(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(Test2.c);
		System.out.println(Test2.d);
	}
	static void m2(){
		Test2 t = new Test2();
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(Test2.c);
		System.out.println(Test2.d);
	}
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.m1();
		Test2.m2();

	}

}
