package com.collections.part1;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapExample {//sorting order

	public static void main(String[] args) {
	
		TreeMap map = new TreeMap();
		
	
		map.put("f", "anvesh");
		map.put("c", "bharath");
		map.put("e", "praveen");
		map.put("a", "yashwanth");
		map.put("d", "sumanth");
		map.put("b", "kapil");
		
		map.put("c", "ravi");//key should not be duplicate
		map.put("g", "praveen" );//value can be duplicate
		
							//doesn't allows null key
	
		
		System.out.println("size of the TreeMap: " + map.size());

		Iterator iterator = map.entrySet().iterator();// for retrieving elements
		
		// used instead of for,while & do while

		while (iterator.hasNext()) {// hasNext()->checks till it has last
									// element
			System.out.println("elements in map : " + iterator.next());
		}
		
	}

}
