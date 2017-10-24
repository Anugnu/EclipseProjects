package com.statements;

public class IfConditionalExample {

	public static void main(String[] args) {
		int a = 40;
		int b = 30;
		int c = 5;
		
		if(a < b){
			System.out.println("a less than b");
			
		}else if(c > a) {
			System.out.println("do other");
			
		}else {
			System.out.println("none of the conditions pass");
		}
	}

}
