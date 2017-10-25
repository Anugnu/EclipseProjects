package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		WelcomeSpring welcome = (WelcomeSpring) context.getBean("welcomeSpring");
		
		welcome.printWelcome();

	}

}
