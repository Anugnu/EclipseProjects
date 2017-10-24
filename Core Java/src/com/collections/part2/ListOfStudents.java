package com.collections.part2;

import java.util.ArrayList;
import java.util.Iterator;

public class ListOfStudents {

	public static void main(String[] args) {

		ArrayList<Student> studentsList = new ArrayList<Student>();

		// ArrayList studentsList = new ArrayList();

		Student student1 = new Student();
		student1.setId(1);
		student1.setName("vinay");
		student1.setCity("kansas");
		studentsList.add(student1);

		Student student2 = new Student();
		student2.setId(2);
		student2.setName("karthik");
		student2.setCity("california");
		studentsList.add(student2);

		Student student3 = new Student();
		student3.setId(3);
		student3.setName("srinivas");
		student3.setCity("newyork");
		studentsList.add(student3);

		ArrayList<Professor> professorsList = new ArrayList<Professor>();
		Professor professor = new Professor();

		professor.setName("nagraj");
		professor.setCity("virginia");

		professorsList.add(professor);

		ArrayList<ArrayList> combinedList = new ArrayList<ArrayList>();
		combinedList.add(studentsList);
		combinedList.add(professorsList);

		System.out.println("list size of combined list : "
				+ combinedList.size());

		Iterator iterator = combinedList.iterator();
		while(iterator.hasNext()){
			ArrayList lists = (ArrayList) iterator.next();
			System.out.println("list size is : " +lists.size());
		}
		
		/*Iterator iterator = studentsList.iterator();
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			System.out.println("student details are : " + student.getId() + " "
					+ student.getName() + " " + student.getCity());
		}*/
	}

}
