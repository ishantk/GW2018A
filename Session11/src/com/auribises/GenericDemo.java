package com.auribises;

// Generics | Templates
//class Point<T>{
class Point<T,U>{
	
	T x;
	T y;
	U z;
	
	Point(T x, T y, U z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	void showPoint(){
		System.out.println("point is: "+x+" : "+y+" : "+z);
	}
}

public class GenericDemo {

	public static void main(String[] args) {
		
		Point<Integer,Integer> p1 = new Point<Integer,Integer>(10, 20, 30);
		Point<Double,Integer> p2 = new Point<Double,Integer>(2.2, 3.3, 30);
		Point<String,Float> p3 = new Point<String,Float>("Hello", "Bye", 2.2F);
		
		p1.showPoint();
		p2.showPoint();
		p3.showPoint();

	}

}
