package com.datatypes;

public class OutsideVariableExample {

	int a=10;
	int b =20;//instance variables
	int c=a+b;//if the variables are declared outside the method 
			  //then object must be created
	
	public static void main(String[] args) {
		
		OutsideVariableExample out = new OutsideVariableExample();
		System.out.println("result is-->" +out.c);
	}

}
