package com.auribises.rtp;

interface I1{
	int i = 10; // public static final int = 10;
}

interface I2{
	int i = 100; // public static final int = 10;
}

class C implements I1,I2{
	
}



public class InfVars {

	public static void main(String[] args) {
		
		System.out.println("I1.i = "+I1.i);
		System.out.println("I2.i = "+I2.i);
		//System.out.println("C.i = "+C.i); error
		
	}

}
