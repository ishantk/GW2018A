package com.auribises;

class SSystem{
	
	private SSystem(){
		
	}
	
	static PPrintStream oout = new PPrintStream();	
}

class PPrintStream{
	
	void pprintln(String msg){
		System.out.println(msg);
	}
	
}

public class SOPDemo {

	public static void main(String[] args) {
		
		SSystem.oout.pprintln("This is Awesome !!");

	}

}
