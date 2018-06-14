class Maths{
	
	void addNumbers(int num1, int num2){
		int num3 = num1+num2;
		System.out.println(num1+" and "+num2+" addition is: "+num3);
	}
	
	//error
	/*void addNumbers(int a1, int a2){
		int a3 = a1+a2;
		System.out.println(a1+" and "+a2+" addition is: "+a3);
	}*/
	
	//error
	/*int addNumbers(int a1, int a2){
		int a3 = a1+a2;
		retunr a3;
	}*/
	
	void addNumbers(double num1, double num2){
		double num3 = num1+num2;
		System.out.println(num1+" and "+num2+" addition is: "+num3);
	}
	
	// Rules to Overloading
	// 1. Method Name should be Same
	// 2. Return Type (Ack) has no role to play
	// 3. Inputs should be different i.e. unique
	// 		3.1. Inputs can increase or decrease in number
	// 		3.2. Inputs can be different as in types
	//      3.3. Sequence can be different
	
	void fun(){
		
	}
	
	void fun(int a){
		
	}
	
	void fun(int a, int b){
		
	}
	
	void fun(char a, char b){
		
	}
	
	void fun(float a, float b){
		
	}
	
	void fun(int a, float b){
		
	}
	
	void fun(float a, int b){
		
	}
}


public class Overloading {

	public static void main(String[] args) {
		
		Maths mRef = new Maths();
		mRef.addNumbers(10, 20);
		mRef.addNumbers(12, 56);
		mRef.addNumbers(15, 77);
		
		mRef.addNumbers(2.2, 3.3);

	}

}
