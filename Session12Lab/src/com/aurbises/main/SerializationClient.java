package com.aurbises.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.aurbises.model.Student;

public class SerializationClient {

	public static void main(String[] args) {
		
		// Serialization
			// to save the state of an object in file
			// state : values of attributes in an object
		
		// De-Serialization
			// to read the state of an object from file and create an object
					
		
		//Student s1 = new Student(101,"John","john@example.com",30,"Redwood Shores");

		try {
			
			/*File file = new File("/Users/ishantkumar/Downloads/students.dat");
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(s1);
			
			System.out.println("Object Written");
			
			oos.close();
			fos.close();*/
			
			File file = new File("/Users/ishantkumar/Downloads/students.dat");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Student sRef = (Student)ois.readObject();
			System.out.println(sRef);
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
	}

}
