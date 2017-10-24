package com.methods;

public class MethodParameters {

	void m1(int a ,char ch){
		System.out.println("in m1 method");
		System.out.println(a);
		System.out.println(ch);
	}
	static void m2(String str, double d){
		System.out.println("in m2 method");
		System.out.println(str);
		System.out.println(d);
	}
	public static void main(String[] args) {

		MethodParameters mp = new MethodParameters();
		mp.m1(4, 'm');
		MethodParameters.m2("vinay", 3.14);

	}

}
