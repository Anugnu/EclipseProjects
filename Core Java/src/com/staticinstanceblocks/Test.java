package com.staticinstanceblocks;

public class Test {

	{//executes for every object creation
		System.out.println("instance block-1");
	}
	{
		System.out.println("instance block-2");
	}
	static {//executes only once and first
		System.out.println("static block-1");
	}
	static {
		System.out.println("static block-2");
	}
	
	Test(){
		System.out.println("constructor-1");
	}
	Test(int a){
		System.out.println("constructor-2");
	}
	public static void main(String[] args) {
		
	Test t = new Test();
	Test t1 = new Test(10);
	

	}

}
