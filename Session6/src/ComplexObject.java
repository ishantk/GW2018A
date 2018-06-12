class Person{
	// Attributes
	String name;
	String phone;
	String email;
	byte age;
	char gender;
	
	Address adrs; // HAS-A Relation in OOPS | 1 to 1 Relation
	Address[] arr; // HAS-A Relation in OOPS| 1 to many Relation
	
	void showPerson(){
		System.out.println(name+" is "+age+" years old !!");
		adrs.showAddress();
	}
}

class Address{
	// Attributes
	String adrsLine;
	String city;
	String state;
	int zipCode;
	
	void showAddress(){
		System.out.println(adrsLine+" is in "+city);
	}
}

public class ComplexObject {

	public static void main(String[] args) {
		
		// Write Operation
		Address aRef = new Address();
		aRef.adrsLine = "Country Homes";
		aRef.city = "Bengaluru";
		aRef.state = "Karnataka";
		aRef.zipCode = 520001;
		
		Person pRef = new Person();
		pRef.name = "John";
		pRef.phone = "+91 99999 88888";
		pRef.email = "john@example.com";
		pRef.gender = 'M';
		pRef.age = 30;
		
		pRef.adrs = aRef; // Reference Copy
		
		//pRef.adrs.adrsLine = "Country Homes North";
		//System.out.println(aRef.adrsLine);
		
		// Read Operation
		//System.out.println(pRef.name+" resides at "+pRef.adrs.adrsLine);
		
		pRef.showPerson();
	}

}
 