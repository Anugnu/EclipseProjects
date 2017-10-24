package com.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHibernate {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession(); 
		
		session.beginTransaction();
		
		Student student = new Student();
		student.setName("sampath");
		student.setCity("newyork");
		student.setZip("64123");
		
		session.save(student);
		
		session.getTransaction().commit();
	}

}
