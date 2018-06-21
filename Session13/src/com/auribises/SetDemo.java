package com.auribises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("John");
		list.add("Jennie");
		list.add("John");
		list.add("Jim");
		list.add("Jennie");
		list.add("Jack");
		list.add("Joe");
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Mike");
		list1.add("Leo");
		list1.add("Harry");
		list1.add("George");
		
		System.out.println(list);
		
		list1.addAll(list);
		
		System.out.println(list1);
		
		System.out.println("==============================");
		
		//HashSet<String> set = new HashSet<String>();
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("John");
		set.add("Jennie");
		set.add("John");
		set.add("Jim");
		set.add("Jennie");
		set.add("Jack");
		set.add("Joe");
		
		System.out.println(set);
		
		if(set.contains("Jennie")){
			System.out.println("Jennie is in the Set");
		}
		
		set.remove("Jennie");
		
		System.out.println(set);
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			String name = itr.next();
			System.out.println(name);
		}
		
		set.clear();
		list.clear();
		
		System.out.println(set);
		System.out.println(list);
	}

}
