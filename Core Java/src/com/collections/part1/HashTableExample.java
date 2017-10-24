package com.collections.part1;

import java.util.Hashtable;
import java.util.Iterator;

public class HashTableExample {//keys are unique
    //synchronized(extra logic)-->more time

	public static void main(String[] args) {
		long beginTime = System.currentTimeMillis();

		
		Hashtable hashTable = new Hashtable();
		
		hashTable.put(1, "anvesh");
		hashTable.put(2, "bharath");
		hashTable.put(3, "praveen");
		hashTable.put(4, "yashwanth");
		hashTable.put(5, "sumanth");
		hashTable.put(6, "kapil");
		
		hashTable.put(2, "ravi");//key should not be duplicate
		hashTable.put(7, "vinay" );//value can be duplicate
							
		//doesn't allows null key
		//doesn't allows null value
		
		
		System.out.println("size of the HashMap: " + hashTable.size());

		Iterator iterator = hashTable.entrySet().iterator();// for retrieving elements
		
		// used instead of for,while & do while

		while (iterator.hasNext()) {// hasNext()->checks till it has last
									// element
			System.out.println("elements in hashTable : " + iterator.next());
		}
		long endTime = System.currentTimeMillis();
		System.out.println("time it took for Hashtable processing:" +(endTime - beginTime));
	}

}
