package com.constructors;

public class Parameterized {
//userdefined
	
	void m1(){//instance method
		System.out.println("m1 method");
	}
	
	Parameterized(){
		System.out.println("0 args constructor");
	}
	Parameterized(int a){
		System.out.println("1 args constructor");//logic
	}
	
	public static void main(String[] args) {
		Parameterized p = new Parameterized();
		Parameterized p1 = new Parameterized(10);
		p.m1();
		p1.m1();
	}

}
