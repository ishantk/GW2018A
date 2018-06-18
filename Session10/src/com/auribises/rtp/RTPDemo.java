package com.auribises.rtp;

/*class Cab{
	
	Cab(){
		System.out.println("Cab Object Constructed");
	}
	
	void bookCab(){
		System.out.println("Cab Booked !!");
	}
}*/

/*abstract class Cab{
	
	Cab(){
		System.out.println("Cab Object Constructed");
	}
	
	// Acts as a Rule/Protocol
	abstract void bookCab();
	
	void hello(){
		System.out.println("This is hello");
	}
}*/

interface Cab{
	
	// Because interface they cannot have objects.
	/*Cab(){
		System.out.println("Cab Object Constructed");
	}*/
	
	// Acts as a Rule/Protocol
	void bookCab(); // public abstract void bookCab();
	
}

class MicroCab implements Cab{//extends Cab{ // IS-A
	
	MicroCab(){
		System.out.println("MicroCab Object Constructed");
	}
	
	public void bookCab(){
		System.out.println("MicroCab Booked !!");
	}
	
	void fun(){
		System.out.println("This is fun");
	}
}

class MiniCab implements Cab{//extends Cab{ // IS-A
	
	MiniCab(){
		System.out.println("MiniCab Object Constructed");
	}
	
	public void bookCab(){
		System.out.println("MiniCab Booked !!");
	}
}

class LuxuryCab implements Cab{//extends Cab{ // IS-A
	
	LuxuryCab(){
		System.out.println("LuxuryCab Object Constructed");
	}
	
	public void bookCab(){
		System.out.println("LuxuryCab Booked !!");
	}
}

public class RTPDemo {

	public static void main(String[] args) {
		
		/*Cab cRef;
		cRef = new Cab(); // Object Construction
		cRef.bookCab();*/
		
		/*MicroCab mRef;
		mRef = new MicroCab();
		mRef.bookCab();*/
		
		Cab cRef;
		cRef = new MicroCab(); // Polymorphic Statement
		cRef.bookCab();
		//cRef.fun(); // error
		
		//MicroCab mRef = (MicroCab)cRef; // DOWN-CASTING
		//mRef.fun();
		
		System.out.println("======================");
		
		cRef = new MiniCab();
		cRef.bookCab();
		
		System.out.println("======================");
		
		cRef = new LuxuryCab();
		cRef.bookCab();
			
		System.out.println("======================");
		
//		cRef = new Cab(); // Is It Required? NO | error
//		cRef.bookCab();   // Is It Required? NO
		
	}

}
