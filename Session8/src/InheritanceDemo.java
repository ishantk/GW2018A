class Parent{
	
	// Non Static
	
	// Attributes
	int a;
	int b;
	
	// Constructor
	Parent(){
		a = 1;
		b = 1;
		System.out.println("==Parent Object Constructed==");
	}
	
	// Methods
	void setData(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	void showData(){
		System.out.println("A and B are "+a+" : "+b);
	}
		
}

class Child extends Parent{
	
	Child(){
		System.out.println("**Child Object Constructed**");
	}
}




public class InheritanceDemo {

	public static void main(String[] args) {
		
		/*Parent pRef = new Parent(); // Object Construction Statement
		System.out.println("pRef is: "+pRef);
		
		pRef.setData(100, 200);
		pRef.showData();*/

		
		Child cRef = new Child();
		cRef.setData(100, 200);
		cRef.showData();
	}

}

