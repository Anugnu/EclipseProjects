package com.constructors;

public class Default {

	void m1(){//instance method
		System.out.println("m1 method");
	}
	
	/*default constructor
	Test(){
		//empty implementation
	}
	*/
	
	public static void main(String[] args) {
		Default d = new Default();
		d.m1();
		System.out.println("default constructor");
	}

}
