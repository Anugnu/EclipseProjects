package com.abstractfinal;

public class ChildAbstractExample extends AbstractExample{

	public static void main(String[] args) {
		ChildAbstractExample example = new ChildAbstractExample();
		example.display();
		example.show();
	}

	@Override
	public void display() {
		System.out.println("In display method of child class");
		
	}

}
