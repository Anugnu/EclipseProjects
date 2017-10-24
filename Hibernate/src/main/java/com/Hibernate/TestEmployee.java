package com.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestEmployee {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession(); 
		
		session.beginTransaction();
		
		Employee employee = new Employee();
		employee.setName("Sathya");
		employee.setAddress("Des Moines");
		employee.setGender("female");
		
		Department department = new Department();
		department.setName("social");
		
		employee.setDepartment(department);
		
		session.save(employee);
		session.save(department);
		
		session.getTransaction().commit();

	}

}
