package com.oops;

public class Child extends Parent {

	@Override
	// overriding
	public void show() {
		super.show();
		System.out.println("In child class show method");
	}

	// overridden method can be overloaded
	public void show(int a) {
		System.out.println("Overloaded Method");
	}
	
	public static void main(String[] args) {
		
		Child child = new Child();
		child.show();
		child.show(1);
		
	}
}
// method names should be same

// return types& type of arguments should also be same.
// child method should not be more restrictive than parent

// parent //child

// private //
// protected //protected,public
// public //public