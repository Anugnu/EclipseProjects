package com.oops;

public class Programmer extends Employee {//inheritance
            //child class	
	float bonus = 5000;

	public static void main(String[] args) {

		Programmer programmer = new Programmer();
		
		System.out.println("programmer salary is :" + programmer.salary);
		
		System.out.println("programmer bonus is :" + programmer.bonus);
	}
}
