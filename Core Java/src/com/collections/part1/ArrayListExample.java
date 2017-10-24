package com.collections.part1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {//index based

	public static void main(String[] args) {
	
		ArrayList numbersList = new ArrayList();
		//guarantees same order
		
		numbersList.add("3");//0
		numbersList.add("1");//1
		numbersList.add("2");//2
		numbersList.add("5");//3
		numbersList.add("4");
		
		numbersList.add("5");//allows duplicates
		numbersList.add(null);//allows null value
		numbersList.add(null);
		
		System.out.println("I want the element from 3rd location: " +numbersList.get(3));
		//index based
		
		
		Iterator iterator = numbersList.iterator();//for retrieving elements
		//used instead of for,while & do while
		
		long beginTime = System.currentTimeMillis();
		while(iterator.hasNext()){//hasNext()->checks till it has last element
			System.out.println("elements in numbers list: " +iterator.next());
		}
		long endTime = System.currentTimeMillis();
		System.out.println("time it took using while loop:" +(endTime-beginTime));

		System.out.println("array list size : " +numbersList.size());
		
		long forBeginTime = System.currentTimeMillis();
		for(int i=0; i< numbersList.size();i++){
			System.out.println("elements in arraylist numbers list : " +numbersList.get(i));
		}
		long forEndTime = System.currentTimeMillis();
		System.out.println("time it took using for loop:" +(forEndTime-forBeginTime));
	}

}
