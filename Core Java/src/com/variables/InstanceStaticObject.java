package com.variables;

public class InstanceStaticObject {
	int a = 10;
	static int b = 20;

	public static void main(String[] args) {

		InstanceStaticObject object = new InstanceStaticObject();
		System.out.println(object.a);
		System.out.println(object.b);
		object.a=30;
		object.b=40;
		
		InstanceStaticObject object1 = new InstanceStaticObject();
		System.out.println(object1.a);//every object separate copy
		System.out.println(object1.b);//for all object single copy
		object1.a=50;
		object1.b=60;
		
		InstanceStaticObject object2 = new InstanceStaticObject();
		System.out.println(object2.a);
		System.out.println(object2.b);
		
		
	}

}
