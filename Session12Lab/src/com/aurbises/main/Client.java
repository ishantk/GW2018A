package com.aurbises.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

import com.aurbises.model.Student;

public class Client {

	public static void main(String[] args) {
		
		//Student s1 = new Student(101,"John","john@example.com",30,"Redwood Shores");
		//Student s2 = new Student(102,"Fionna","fionna@example.com",32,"Country Homes");
		
		//String str1 = s1.toString()+"\n";
		//String str2 = s2.toString()+"\n";
		
		//System.out.println(str1);
		//System.out.println(str2);
		
		try {
			
			//File file = new File("/Users/ishantkumar/Downloads/morningstudents.txt");
			/*if(file.exists()){
				System.out.println(file.getName()+" Exists !!");
			}else{
				System.out.println(file.getName()+" does not Exists !!");
			}*/
			// Write Operation as Bytes
			//FileOutputStream fos = new FileOutputStream(file);
			/*FileOutputStream fos = new FileOutputStream(file,true); // true is append mode
			fos.write(str2.getBytes());
			fos.close(); // Release the memory resources*/
			
			// Write Operation as Text
			//FileWriter writer = new FileWriter(file);
			/*FileWriter writer = new FileWriter(file,true);
			writer.write(str1);
			writer.write(str2);
			writer.close();*/
			
			File file = new File("/Users/ishantkumar/Downloads/Conditions.java");
			
			// Read the file as bytes
			/*FileInputStream fis = new FileInputStream(file);
			
			int i = 0;
			
			while( (i = fis.read()) != -1 ){
				char ch = (char)i;
				System.out.print(ch);
			}
			
			fis.close();*/
			
			// Read the file as text
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader);
			
			String line = "";
			
			int count = 0;
			
			while( (line = buffer.readLine()) != null){
				System.out.println(line);
				if(line.contains("int")){
					count++;
				}
			}
			
			System.out.println("int found: "+count);
			
			buffer.close();
			reader.close();
			
			//System.out.println("--Contents Written--");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}

	}

}
