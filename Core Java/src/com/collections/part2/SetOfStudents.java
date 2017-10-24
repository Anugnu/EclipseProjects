package com.collections.part2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetOfStudents {

	public static void main(String[] args) {
		
		HashSet<Student> students = new HashSet<Student>();

		Student student1 = new Student();
		student1.setId(1);
		student1.setName("vinay");
		student1.setCity("kansas");
		students.add(student1);

		Student student2 = new Student();
		student2.setId(2);
		student2.setName("karthik");
		student2.setCity("california");
		students.add(student2);

		Student student3 = new Student();
		student3.setId(3);
		student3.setName("srinivas");
		student3.setCity("newyork");
		students.add(student3);

		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()){
			Student student = iterator.next();
			System.out.println("student details are : " +student.getId() +" "+student.getName() + " " +student.getCity());
		}
	}

}
