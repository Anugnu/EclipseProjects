package com.abstractfinal;

public class CompareExample {

	public static void main(String[] args) {
		String s ="abc";
		
		String s1 = new String("abc");
		
		String s2 = "abc";
		
		if(s==s1){//== compare reference location
			System.out.println("Strings are same using ==");
		} else {
			System.out.println("Strings are not same using ==");
		}
		
		if(s==s2){
			System.out.println("Strings are same using ==");
		} else {
			System.out.println("Strings are not same using ==");
		}
		
		if(s.equals(s1)){//.equals compare value exactly present within string
			System.out.println("Strings are same using ==");
		} else {
			System.out.println("Strings are not same using ==");
		}
		
		if(s.equals(s2)){
			System.out.println("Strings are same using ==");
		} else {
			System.out.println("Strings are not same using ==");
		}
	}

}
