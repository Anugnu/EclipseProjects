package com.abstractfinal;

public abstract class AbstractExample {//abstract class(complete+incomplete)

	public void show(){
		System.out.println("Im in show method of Abstract Class");
	}
	
	public abstract void display();//abstract method(doesn't have definition and body)
}
// abstract(which is not complete)
//if class has one (abstract method) change class to (abstract)

//if class is (abstract) no need to change method as (abstract)