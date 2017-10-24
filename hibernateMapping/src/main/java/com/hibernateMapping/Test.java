package com.hibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		System.out.println("Hibernate one to one (XML mapping)");
		Configuration cfg = new Configuration();
		cfg = cfg.configure("com/hibernateMapping/hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		session.beginTransaction();

		Address address1 = new Address();
		address1.setStreet("OMR ROAD");
		address1.setCity("Chennai");
		address1.setState("TN");
		address1.setZipcode("600097");

		Address address2 = new Address();
		address1.setStreet("Ring ROAD");
		address1.setCity("Banglore");
		address1.setState("Karnataka");
		address1.setZipcode("560000");

		Student student1 = new Student();
		student1.setStudentName("Eshwar");
		student1.setStudentAddress(address1);

		Student student2 = new Student();
		student1.setStudentName("Joe");
		student1.setStudentAddress(address2);

		session.save(student1);
		session.save(student2);
		
		session.getTransaction().commit();

		System.out.println("Done");

	}

}
