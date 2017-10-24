package com.oops;

public class TestInheritance {

	public static void main(String[] args) {
		Programmer programmer = new Programmer();
		
		System.out.println("total salary of programmer is:"+(programmer.salary + programmer.bonus));
	
		Tester tester = new Tester();
		
		System.out.println("total salary of tester is :"+ (tester.salary + tester.bonus));
	
	}
	

}
