package com.constructors;

public class Test {

	int eid;
	String ename;
	float esal;
	
	//user defined execution during object creation
	
	Test(int eid,String ename,float esal){
	
		this.eid=eid;//this keyword to instance variables if both local and instance variables are same
		this.ename=ename;
		this.esal=esal;
	}
	
	void display(){
		System.out.println("employee id:" +eid);
		System.out.println("employee name:" +ename);
		System.out.println("employee salary:" +esal);
	}
	
	public static void main(String[] args) {

		Test t = new Test(534,"vinay",2000);
		t.display();
		
		Test t1 = new Test(435,"anil",3000);
		t1.display();

	}

}
