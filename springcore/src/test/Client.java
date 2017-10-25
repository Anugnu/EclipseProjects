package test;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

public class Client {

	public static void main(String[] args) {
		//find xml
		Resource r = new ClassPathResource("resources/spring.xml");
		
		//load xml into container
		BeanFactory factory = new XmlBeanFactory(r);
		
		//create test class object
		Test t = (Test) factory.getBean("t");
		Test t1 = (Test) factory.getBean("t");
		Test t2 = (Test) factory.getBean("t");
		
		System.out.println(t==t1);
		System.out.println(t1==t2);
	
		t.hello();
		t1.hello1();
		t2.hello();

	}

}
