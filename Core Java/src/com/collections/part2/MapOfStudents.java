package com.collections.part2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MapOfStudents {

	public static void main(String[] args) {
		
		HashMap<Integer, Student> studentsMap = new HashMap<Integer, Student>();
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("vinay");
		student1.setCity("kansas");
		studentsMap.put(1, student1);

		Student student2 = new Student();
		student2.setId(2);
		student2.setName("karthik");
		student2.setCity("california");
		studentsMap.put(2, student2);

		Student student3 = new Student();
		student3.setId(3);
		student3.setName("srinivas");
		student3.setCity("newyork");
		studentsMap.put(3, student3);
		
		Iterator<Entry<Integer, Student>> iterator = studentsMap.entrySet().iterator();
		while(iterator.hasNext()){
			Student student = (Student) iterator.next();
			System.out.println("student details are : " +student.getId() +" "+student.getName() + " " + student.getCity());
		}
	}

}
