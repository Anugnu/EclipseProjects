package com.collections.part1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {// will not allow duplicates

	public static void main(String[] args) {

		HashSet namesSet = new HashSet();

		namesSet.add("vinay");// doesn't guarantees the order
		namesSet.add("anil");
		namesSet.add("sampath");
		namesSet.add("srikanth");
		namesSet.add("rajender");
		namesSet.add("deep");

		namesSet.add("anil");// doesn't allow duplicates

		namesSet.add(null);// allows only one null value
		namesSet.add(null);

		System.out.println("size of the HashSet: " + namesSet.size());

		Iterator iterator = namesSet.iterator();// for retrieving elements
		// used instead of for,while & do while

		while (iterator.hasNext()) {// hasNext()->checks till it has last
									// element
			System.out.println("elements in namesSet : " + iterator.next());
		}

	}

}
