package com.auribises;

class Outer{
	
	void show(){
		System.out.println("This is show of Outer");
	}
	
	// Nested Class | Containment
	// Helper Design Pattern
	class Inner{
		void show(){
			System.out.println("This is show of Inner");
		}
	}
}

class CA{

	
	public class CB{
		
	}
	
	static class CC{
		
	}
	
	void fun(){
		// Local Class
		class CD{
			
		}
		
		CD cRef = new CD();
	}
	
	static void sFun(){
		class CC{
			
		}
	}
	
	interface Inf1{
		interface Inf3{
			
		}
	}
	
	static interface Inf2{
		
	}
}

public class Nesting {

	public static void main(String[] args) {
		
		Outer oRef = new Outer();
		oRef.show();
		
		Outer.Inner iRef = oRef.new Inner();
		iRef.show();
		
		System.out.println(oRef);
		System.out.println(iRef);

	}

}
