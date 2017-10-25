package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		//checks xml document
		//it will create instances to singleton beans
		System.out.println("document valid ...");
		ap.getBean("t");
		ap.getBean("t");
		ap.getBean("t");
	}

}
