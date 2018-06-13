class Address{
	
}
class Vehicle{
	
}
class Parent{

	// Attributes
	String fname;
	String lname;
	int wealth;
	
	Address adrs; 			// HAS-A Relation 1-1
	Vehicle[] vehicles; 	    // Has-A Relation 1-*
	
	//Methods
	Parent(){
		fname = "George";
		lname = "Watson";
		wealth = 10000;
		System.out.println("**Parent Object Constructed**");
	}
	
	Parent(String fname, String lname, int wealth){
		System.out.println("##Parent Object Constructed##");
		this.fname = fname;
		this.lname = lname;
		this.wealth = wealth;
	}
	
	void show(){
		System.out.println(fname+" "+lname+" has INR "+wealth);
	}
}

class Son extends Parent{ // IS-A Relation is established through extends
	
	Son(){
		System.out.println("==Son Object Constructed==");
	}
	
}

public class ISADemo {

	public static void main(String[] args) {
		
		/*Parent pRef1 = new Parent();
		Parent pRef2 = new Parent("John","Watson",30000);
		
		pRef1.show();
		pRef2.show();*/
		
		Son sRef = new Son();
		sRef.fname = "Mike";
		//sRef.adrs = ?
		//sRef.vehicles = ?
		sRef.show();

	}

}
