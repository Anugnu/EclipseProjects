package com.thissuperkeywords;

public class Bike extends Vehicle {

	Bike(){
		super();//used to call parent class constructor
		System.out.println("bike class created");
	}
	public static void main(String[] args) {
		Bike b = new Bike();

	}

}
