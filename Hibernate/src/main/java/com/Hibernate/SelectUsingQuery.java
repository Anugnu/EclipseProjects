package com.Hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectUsingQuery {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		String sql = "from Employee where id = :id";
		Query query = session.createQuery(sql);
		query.setParameter("id", 2);
		List employeeList = query.list();
		
		Iterator iterator = employeeList.iterator();
		while (iterator.hasNext()) {
			Employee employee = (Employee) iterator.next();
			System.out.println("Employee details : " +employee.getName()+ " --- " +employee.getAddress());
		}
		session.close();
		

	}

}
