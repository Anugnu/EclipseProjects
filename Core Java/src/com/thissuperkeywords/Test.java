package com.thissuperkeywords;

public class Test {

	Test(){
		this(10);//used to call constructor overloading
	
		System.out.println("default constructor");
	}
	Test(int a){
		this(10,20);
		System.out.println("1-arg constructor");
	}
	Test(int a,int b){
		System.out.println("2-arg constructor");
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		Test t1 = new Test(10);
		Test t2 = new Test(10,20);

	}

}
