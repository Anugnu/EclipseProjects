package com.oops;

public class TestOverriding {//method overriding

	public static void main(String[] args) {
		Child c = new Child();//
		c.show();
		
		Parent p = new Parent();
		p.show();
		
		//Child child1 = new Parent();//can't create  instance of parent
				
		Parent parent1 = new Child();//instance of child
		parent1.show();
	}

}
