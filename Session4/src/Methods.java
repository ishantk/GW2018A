
public class Methods {

	// non static methods have no association with static
	boolean canVote(int age){
		return (age>18);
	}
	
	void addNumbers(int num1, int num2){
		int num3 = num1 + num2;
		System.out.println("num3 is: "+num3);
	}
	
	int addNumbersAgain(int num1, int num2){
		int num3 = num1 + num2;
		return num3;
	}
	
	void sayHello(String name){
		System.out.println("Hello, "+name);
	}
	
	// static methods will have keyword static written in the beginning
	static void calculateArea(int length, int width){
		int area = length * width;
		System.out.println("Area is: "+area);
	}
	
	public static void main(String[] args) {
	
		// We will execute our methods here
		
		//1. Non Static Methods
		Methods m = new Methods(); // Object Construction Statement
		
		m.addNumbers(10, 20);
		m.addNumbers(13, 15);
		
		int result = m.addNumbersAgain(15, 45);
		System.out.println("result is: "+result);
		
		if(result%2 == 0){
			System.out.println("result is even");
		}
		
		int johnsAge = 10;
		
		if(m.canVote(johnsAge)){
			System.out.println("John Can Vote");
		}else{
			System.out.println("Wait for "+(18-johnsAge)+" years !!");
		}
		
		//2. Static Methods
		Methods.calculateArea(20, 20);

		String str1 = "Hello";
		String str2 = "Hi";
		str2 = str1;
	}

}
