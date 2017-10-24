package com.abstractfinal;

public class TestInterface {

	public static void main(String[] args) {
		//InterfaceExample interfaceexample = new InterfaceExample();
		//cannot create object for interface
		// can only create object that is implemented.
		
		//AbstractExample abstractexample = new AbstractExample();
		//cannot create object for abstract
		//can create object that is extended.
		
		InterfaceChild1Test child1test = new InterfaceChild1Test();
		child1test.show();
		child1test.display();
		
		InterfaceChild2Test child2test = new InterfaceChild2Test();
		child2test.show();
		child2test.display();

	}

}
