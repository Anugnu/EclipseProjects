package com.Hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class SelectUsingCriteria {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("address","Iowa" ));   //restriction
		List employeeList = criteria.list();

		System.out.println("Number of employees : " + employeeList.size());

		Iterator iterator = employeeList.iterator();
		while (iterator.hasNext()) {
			Employee employee = (Employee) iterator.next();
			System.out.println("Employee details : " +employee.getName()+ " --- " +employee.getAddress());
		}
		session.close();
	}
}
