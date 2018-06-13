class Address{
	String adrsLine;
	String city;
	
	void showAddress(){
		System.out.println(adrsLine+" is in "+city);
	}
}

class Vehicle{
	String regNumber;
	String color;
	
	void showVehicle(){
		System.out.println(regNumber+" is "+color+" in color");
	}
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
		
		Address a = new Address();
		a.adrsLine = "Redwood Shores";
		a.city = "Ludhiana";
		
		Vehicle v1 = new Vehicle();
		v1.regNumber = "PB10AB0001";
		v1.color = "Black";
		
		Vehicle v2 = new Vehicle();
		v2.regNumber = "PB10XY1000";
		v2.color = "White";
		
		Vehicle[] vArr = new Vehicle[2];
		vArr[0] = v1;
		vArr[1] = v2;
		
		sRef.adrs = a;
		sRef.vehicles = vArr;
		
		
		sRef.show();
		sRef.adrs.showAddress();
		
		for(Vehicle v : sRef.vehicles){
			v.showVehicle();
		}

	}

}
