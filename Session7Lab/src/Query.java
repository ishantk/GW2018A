class ABC{
	static{
		System.out.println("This is static block of ABC");
	}
	
	static void fun(){
		System.out.println("This is fun");
	}
}
public class Query {

	{
		System.out.println("This is Block");
	}
	
	static{
		System.out.println("This is static Block");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main Started...");

		System.out.println("Main Finished...");
		
		ABC.fun();
		
	}

}
