package com.auribises;

interface Inf1{
	void show();
	void fun();
}

/*class CA implements Inf1{
	public void show(){
		System.out.println("This is show");
	}
}*/

public class AnonymousDemo {

	public static void main(String[] args) {

		//Inf1 i1 = new CA();
		//i1.show();
		
		// Anonymous Class in Java
		Inf1 i1 = new Inf1() {
			
			{
				
			}
			
			public void show(){
				System.out.println("This is show");
			}
			
			public void fun(){
				System.out.println("This is fun");
			}
		};
		i1.show();
		i1.fun();
	}

}
