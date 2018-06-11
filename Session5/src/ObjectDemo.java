// Textual Representation of User Object
class User{
	
	// Attributes
	// They belong to Object and not to class | Property of Object
	String name;
	private String phone;
	String email;
	byte age;
	char gender;
	String address;
	
	// They belong to Class and not to Object | Property of Class
	static String company;
	
	// Methods - Non Static
	// Non Static Methods are the Property of Object and Not of Class
	
	// Setter Method -> Write Operation
	void setPhone(String p){
		if(!p.isEmpty() && p.length()<=12){
			phone = p;
		}else{
			phone = "NA";
		}
	}
	
	// Getter Method -> Read Operation
	String getPhone(){
		return phone;
	}
	
	
	// Methods - Static
	// Static Methods are the Property of Class and Not of Object
		
	static void showCompanyName(){
		System.out.println(company+" is an IT Company");
	}
	
}


public class ObjectDemo {

	public static void main(String[] args) {
	
		// Object Construction Statement
		User uRef1 = new User();
		User uRef2 = new User();
		User uRef3 = uRef1; // Reference Copy
		
		int i = 10;
		int j = i; // Value Copy
		System.out.println("i is: "+i);
		System.out.println("uRef1 is: "+uRef1);
		System.out.println("uRef2 is: "+uRef2);
		
		// uRef1 and uRef2 are Reference Variables and not Objects
		// They will point to the Objects created in the heap
		
		// new will construct the Object in the Heap at Run Time
		
		// Write Operation - Writing the data in object
		uRef1.name = "John Watson";
		uRef3.email = "john@example.com";
		//uRef1.phone = "+91 99999 99999";
		uRef1.setPhone("+91 99999 99999");
		uRef3.age = 30;
		uRef1.gender = 'M';
		uRef1.address = "Redwood Shores";
		
		uRef2.name = "Jennie Watson";
		uRef2.email = "jennie@example.com";
		//uRef2.phone = "+91 99999 88888";
		uRef2.setPhone("+91 99999 88888");
		uRef2.age = 20;
		uRef2.gender = 'F';
		uRef2.address = "Country Homes";
		
		//Read Operation - Reading data from Object
		//System.out.println(uRef1.name+" lives in "+uRef1.address+" can be contacted at "+uRef1.phone);
		//System.out.println(uRef2.name+" lives in "+uRef2.address+" can be contacted at "+uRef2.phone);
		
		System.out.println(uRef1.name+" lives in "+uRef1.address+" can be contacted at "+uRef1.getPhone());
		System.out.println(uRef2.name+" lives in "+uRef2.address+" can be contacted at "+uRef2.getPhone());

		User.company = "Auribises";
		User.showCompanyName();
	}

}
