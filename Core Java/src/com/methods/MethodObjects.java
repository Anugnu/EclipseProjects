package com.methods;

class X{}
class Emp{}
class Y{}
class Student{}
public class MethodObjects {
	
	void m1(X x,Emp e){
		System.out.println("m1 method");
	}

	static void m2(Y y,Student s){
		System.out.println("m2 method");
	}
	public static void main(String[] args) {
	
		MethodObjects mp = new MethodObjects();
		X x = new X();
		Emp e = new Emp();
		mp.m1(x, e);//mp.m1(new X(),new Emp());

		Y y = new Y();
		Student s = new Student();
		MethodObjects.m2(y, s);//MethodObjects.m2(new Y(),new Student());
	}

}
