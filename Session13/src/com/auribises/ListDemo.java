package com.auribises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

class Student{
	
	int roll;
	String name;
	
	Student(){
		
	}

	public Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}

}

public class ListDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student(101,"John");
		Student s2 = new Student(201,"Jennie");
		Student s3 = new Student(301,"Sia");
		
		//List<String> list1 = new ArrayList<String>();    //Polymorphic
		
		// Homogeneous
		ArrayList<String> list1 = new ArrayList<String>(); //Direct
		
		// Hetrogeneous
		ArrayList list2 = new ArrayList();	// Raw Type
		
		// Homogeneous
		ArrayList<Student> list3 = new ArrayList<Student>();
		//ArrayList<Integer> list4 = new ArrayList<Integer>();
		
		// Add or Insert Data into ArrayList
		list1.add("John"); //list1.add(0,"John"); //0th
		list1.add("Jennie");
		list1.add("Jim");
		list1.add("John");
		list1.add("Jack");
		list1.add("Joe");
		list1.add("Mike"); 	// n-1, where n is the size
		//list1.add(100); // error
		//list1.add(s1);  // error
		
		
		list2.add("John");
		list2.add(2.2);
		list2.add(s1);
		list2.add(100);
		
		list3.add(s1);
		list3.add(s2);
		list3.add(s3);
		
		// size of list
		System.out.println("list1 size is: "+list1.size());
		System.out.println("list2 size is: "+list2.size());
		System.out.println("list3 size is: "+list3.size());
		
		// get the data from list
		String str = list1.get(2);
		System.out.println(str);
		
		Student s = list3.get(1);
		System.out.println(s);
		
		Object x = list2.get(0);
		System.out.println(x);
		
		// get all the data from list
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
		// update data in list
		list1.set(1, "Fionna");
		System.out.println(list1);
		
		// delete from list
		list1.remove(1);
		System.out.println(list1);
		
		if(list1.contains("Jack")){
			System.out.println("Jack is in the list");
		}
		
		int idx = list1.indexOf("Jack");
		System.out.println("Jack is on index "+idx);
		
		// Iteration
		// 1. For Loop
		System.out.println("========For Loop======");
		for(int i=0;i<list1.size();i++){
			String name = list1.get(i);
			System.out.println(name);
		}
		
		// 2. Enhanced For Loop
		System.out.println("========Enhanced For Loop======");
		for(String name : list1){
			System.out.println(name);
		}
		System.out.println("========");
		for(Object y : list2){
			System.out.println(y);
		}
		System.out.println("========");
		for(Student stu : list3){
			System.out.println(stu);
		}
		
		// 3. Iterator
		System.out.println("========Iterator======");
		Iterator<String> itr = list1.iterator();
		while(itr.hasNext()){
			String name = itr.next();
			System.out.println(name);
			
			/*if(name.equals("Mike")){
				itr.remove();
			}*/
		}
		
		//System.out.println(list1);
		
		// 4. ListIterator
		System.out.println("========ListIterator======");
		ListIterator<String> listItr = list1.listIterator();
		while(listItr.hasNext()){
			String name = listItr.next();
			System.out.println(name);
			
			/*if(name.equals("Mike")){
				itr.remove();
			}*/
		}
		System.out.println("-----");
		while(listItr.hasPrevious()){
			String name = listItr.previous();
			System.out.println(name);
			
			/*if(name.equals("Mike")){
				itr.remove();
			}*/
		}
		
		// 4. Enumeration
		System.out.println("========Enumeration======");
		Enumeration<String> enm = Collections.enumeration(list1);
		while(enm.hasMoreElements()){
			String name = enm.nextElement();
			System.out.println(name);
		}
		
		// THREAD-SAFE
		Vector<String> vector = new Vector<String>();
		vector.add("Jennie");
		vector.add("Jim");
		vector.add("John");
		vector.add("Jack");
		vector.add("Joe");
		
		System.out.println(vector);
	}

}
