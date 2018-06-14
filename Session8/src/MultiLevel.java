class A{
	
	A(){
		System.out.println("**A Object Constructed**");
	}
	
}

class B extends A{
	
	int x;
	private int y;
	
	B(){
		System.out.println("**B Object Constructed**");
	}
	
	void showX(){
		System.out.println("x is: "+x);
	}
	
	private void showY(){
		System.out.println("y is: "+y);
	}
}

class C extends B{
	C(){
		System.out.println("**C Object Constructed**");
	}
}


public class MultiLevel {

	public static void main(String[] args) {
		
		C cRef = new C();
		cRef.x = 100;
		cRef.showX();
		
		//cRef.y = 100; -> Error
		//cRef.showY(); -> Error

	}

}
