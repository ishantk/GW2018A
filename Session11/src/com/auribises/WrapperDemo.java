package com.auribises;

class MyInteger{
	
}

public class WrapperDemo {

	public static void main(String[] args) {
		
		// --HW--
		//MyInteger mRef = new MyInteger(i);
		//int k = mRef.myValue();
		// --HW--
		
		// Wrapper Classes
		/*
		 * int   	Integer
		 * float		Float
		 * double 	Double
		 * char 		Character
		 * long 		Long
		 * boolean	Boolean
		 */
		
		int i = 10; // Primitive Type
		Integer iRef = new Integer(i); // Object i.e. Reference Type
		// Converted a primitive into an Object -> BOXING
		
		char ch = 'A';
		Character cRef = new Character(ch);
		
		double d = 2.2;
		Double dRef = new Double(d);
		
		//  Extracted primitive out of an Object -> UNBOXING
		int j = iRef.intValue(); 
		char ch1 = cRef.charValue();
		double e = dRef.doubleValue();
		
		int x = 10;
		Integer xRef = x; // AUTO-BOXING		 | Integer xRef = new Integer(x);
		
		int y = xRef; 	  // AUTO-UNBOXING 	 | int y = xRef.intValue();

	}

}
