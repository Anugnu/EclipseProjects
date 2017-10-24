package com.collections.part1;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {//ordering

	public static void main(String[] args) {

		LinkedHashSet namesSet = new LinkedHashSet();

		namesSet.add("vinay");// guarantees the order
		namesSet.add("anil");
		namesSet.add("sampath");
		namesSet.add("srikanth");
		namesSet.add("rajender");
		namesSet.add("deep");
		
		namesSet.add("srikanth");//doesn't allow duplicates
		
		namesSet.add(null);
		namesSet.add(null);//allows only single null value

		System.out.println("size of the LinkedHashSet: " + namesSet.size());

		Iterator iterator = namesSet.iterator();// for retrieving elements
		// used instead of for,while & do while

		while (iterator.hasNext()) {// hasNext()->checks till it has last
									// element
			System.out.println("elements in namesSet : " + iterator.next());
		}
	}

}
