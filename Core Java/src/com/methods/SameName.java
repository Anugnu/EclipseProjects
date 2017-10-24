package com.methods;

public class SameName {
	
	int x=100;//instance variables
	int y=200;
	
	void add(int x,int y){//local variables
		System.out.println(x+y);//local
		System.out.println(this.x+this.y);//instance using 'this' keyword
	}

	public static void main(String[] args) {
		SameName sn = new SameName();
		sn.add(1000, 2000);

	}

}
