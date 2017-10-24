package com.collections.part1;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {//keys are unique
      //not synchronized(no extra logic)-->less time
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		
		map.put("e", "anvesh");
		map.put("b", "bharath");
		map.put("a", "praveen");
		map.put("c", "yashwanth");
		map.put("d", "sumanth");
		map.put("f", "kapil");
		
		map.put("c", null);//key should not be duplicate
							//allows null value
		map.put("g", "praveen" );//value can be duplicate
		map.put(null, "vinay");//allows only one null key
		map.put(null, "venky");
		
		
		System.out.println("size of the HashMap: " + map.size());

		Iterator iterator = map.entrySet().iterator();// for retrieving elements
		
		// used instead of for,while & do while

		while (iterator.hasNext()) {// hasNext()->checks till it has last
									// element
			System.out.println("elements in map : " + iterator.next());
		}
	}

}
