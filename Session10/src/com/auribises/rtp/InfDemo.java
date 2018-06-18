package com.auribises.rtp;

interface Inf1{
	void fun();
	void show();
}


interface Inf2{
	void fun();
	void hello();
}

interface Inf3 extends Inf1,Inf2{ // Multiple Inheritance on Interface Level (I2I)
	int i=100; // public static final int i = 10;
}

class CA implements Inf3{//Inf1,Inf2{ // Multiple Implementation

	public void hello() {
		System.out.println("This is hello");
	}

	public void fun() {
		System.out.println("This is fun");
	}

	public void show() {
		System.out.println("This is show");
	} 
	
	void bye(){
		System.out.println("This is bye");
	}
}

public class InfDemo {

	public static void main(String[] args) {
		
		/*CA cRef = new CA();
		cRef.show();
		cRef.fun();
		cRef.hello();*/
		
		/*Inf1 i1 = new CA();
		i1.fun();
		i1.show();
		//i1.hello(); error
		
		Inf2 i2 = new CA();
		i2.fun();
		i2.hello();
		//i2.show(); // error*/
		
		// Ref Variable of interface can point to the object which implements it
		Inf3 i3 = new CA(); // Polymorphic Statement
		i3.show();
		i3.fun();
		i3.hello();
		
		//Inf3.i = 100;
		
		System.out.println("Inf3 i is "+Inf3.i);
		System.out.println("CA i is "+CA.i);
		
		// i3.bye(); error
		
		// DownCasting
		System.out.println("i3 is: "+i3);
		CA cRef = (CA)i3; 
		System.out.println("cRef is: "+cRef);
		
		cRef.show();
		cRef.fun();
		cRef.hello();
		cRef.bye();
	}

}
