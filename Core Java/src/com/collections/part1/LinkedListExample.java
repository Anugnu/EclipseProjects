package com.collections.part1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {//node based(insertions & deletions)

	public static void main(String[] args) {
		
		LinkedList namesList = new LinkedList();
		//guarantess order
		namesList.add("vinay");
		namesList.add("murali");
		namesList.add("varun");
		namesList.add("rakesh");
		namesList.add("karthik");
		namesList.add("santhosh");
		

		namesList.add("varun");//allows duplicates
		namesList.add(null);
		namesList.add(null);//allows null value
		
		System.out.println("particular value: " +namesList.get(2));
		
		namesList.add(2,"sampath");
		
		namesList.addFirst("anil");//insertions and deletions(node based)
		namesList.addLast("sampath");
		namesList.remove(4);
		namesList.removeLast();
		

		
		System.out.println("size of the LinkedList: " +namesList.size());
		
		Iterator iterator = namesList.iterator();//for retrieving elements
		//used instead of for,while & do while
		
		while(iterator.hasNext()){//hasNext()->checks till it has last element
			System.out.println("elements in names list: " +iterator.next());
		}
	}

}
