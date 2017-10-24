package com.abstractfinal;

public  final class FinalParent {//final class

	final int a = 100;//final variable
	
	public static void main(String[] args){
		//FinalParent parent = new FinalParent();
		//parent.a = 200;	
	}
	
	public final void show(){//final method
		System.out.println("in parent show method");
	}
	
}
