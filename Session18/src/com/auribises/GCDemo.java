package com.auribises;

class Point{
	
	Point(){
		System.out.println("Point Object Constructed");
	}
	
	int x;
	int y;
	
	// Executed before Object's Destruction
	@Override
	protected void finalize() throws Throwable {
		System.out.println("==Finalize Executed==");
	}
}

// SINGLETON
class Connection{
	
	private static Connection con = new Connection();
	
	private Connection(){
		
	}
	
	public static Connection getConnection(){
		return con;
	}
	
}

public class GCDemo {

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point();
		
		Runtime rt = Runtime.getRuntime();
		
		System.out.println("=================================");
		System.out.println("Free Memory: "+rt.freeMemory());
		System.out.println("Max Memory: "+rt.maxMemory());
		System.out.println("Total Memory: "+rt.totalMemory());
		System.out.println("=================================");
		
		p1 = null;
		p2 = null;
		
		rt.gc(); // Call Garbage Collector
		
		
		System.out.println("=================================");
		System.out.println("Free Memory: "+rt.freeMemory());
		System.out.println("Max Memory: "+rt.maxMemory());
		System.out.println("Total Memory: "+rt.totalMemory());
		System.out.println("=================================");

		// error
		//Connection con1 = new Connection();
		Connection con1 = Connection.getConnection();
		Connection con2 = Connection.getConnection();
		
		System.out.println(con1);
		System.out.println(con2);
		
	}

}
