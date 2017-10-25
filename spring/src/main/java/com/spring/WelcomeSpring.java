package com.spring;

public class WelcomeSpring {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printWelcome(){
		System.out.println("Welcome " +name);
		
	}
}
