package com.collections.part1;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {// (ordering + sorting)

	public static void main(String[] args) {

		TreeSet namesSet = new TreeSet();
		try {


			namesSet.add("vinay");
			namesSet.add("prashanth");
			namesSet.add("suman");
			namesSet.add("goutham");
			namesSet.add("sumanth");
			namesSet.add("akshith");

			namesSet.add("vinay");// will not allow duplicates
			namesSet.add(null);//will not allow even single null value

			System.out.println("size of TreeSet: " + namesSet.size());

			Iterator iterator = namesSet.iterator();// for retrieving elements
			// used instead of for,while & do while

			while (iterator.hasNext()) {// hasNext()->checks till it has last
										// element
				System.out.println("elements in namesSet : " + iterator.next());

			}
			
		} catch (NullPointerException e) {
			System.out.println("dont try to add null values to TreeSet");
		}finally{
			
			System.out.println("size of TreeSet: " + namesSet.size());

			Iterator iterator = namesSet.iterator();// for retrieving elements
			// used instead of for,while & do while

			while (iterator.hasNext()) {// hasNext()->checks till it has last
										// element
				System.out.println("elements in namesSet : " + iterator.next());

			}
		}
	}

}
