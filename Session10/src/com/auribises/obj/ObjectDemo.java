package com.auribises.obj;

class A{ //-> class A extends Object{
	
}

class B{
	
}

class C extends B{
	
}

class X{
	
	public String toString(){
		String str = "This is Awesome";
		return str;
	}
	
}

public class ObjectDemo {

	public static void main(String[] args) {
		
		Object oRef;
		oRef = new A();
		oRef = new B();
		oRef = new C();
		
		X xRef = new X();
		X x = xRef; // Ref Copy
		System.out.println(xRef);
		System.out.println(xRef.toString());
		
		String str = new String("Hello");
		System.out.println(str); // Because toStirng method of Object class is overrided

		System.out.println(xRef.getClass());
		System.out.println(xRef.getClass().getName());
		System.out.println(xRef.getClass().getSimpleName());
		
		System.out.println(xRef.hashCode());
		System.out.println(x.hashCode());
		
	}

}
