package com.auribises;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
	
		//HashMap map = new HashMap();
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "John");
		map.put(234, "Jennie");
		map.put(567, "Jim");
		map.put(211, "Jack");
		map.put(789, "Joe");
		
		map.put(101, "Sia"); // update of key already exists
		map.remove(101);
		
		map.put(null, "Fionna");
		
		System.out.println(map);
		String name = map.get(101);
		System.out.println(name);
		
		System.out.println(map.size());
		
		if(map.containsKey(234)){
			System.out.println("234 key exists");
		}
		
		if(map.containsValue("Fionna")){
			System.out.println("Fionna exists in map");
		}
		
		// Iteration in map
		Set<Integer> set = map.keySet(); // Obtain all the keys from Map
		System.out.println(set);
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()){
			Integer key = itr.next();
			String value = map.get(key);
			System.out.println(key+"   -   "+value);
		}
		
		// THREAD-SAFE
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(101, "John");
		table.put(234, "Jennie");
		table.put(567, "Jim");
		table.put(211, "Jack");
		//table.put(null, "Jack"); null key not allowed
		//table.put(111, null);    null value not allowed
		
		System.out.println(table);
	}

}
