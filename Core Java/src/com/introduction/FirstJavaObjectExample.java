package com.introduction;

public class FirstJavaObjectExample {

	public static void main(String[] args) {//to test class main method is used

		FirstJavaObjectExample example = new FirstJavaObjectExample();
		example.printName();// to call a method, object should be created

	}

	public void printName() {// simple user defined method

		System.out.println("Hello iam in printName method");

	}

}
