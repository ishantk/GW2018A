
public class Arrays {

	public static void main(String[] args) {
		
		int a = 10; // SVC
		
		// Array - Homogeneous
		// Implicit Way -> compiler converts it as int[] arr1 = new int[]{10,20,30,40,50};
		int[] arr1 = {10,20,30,40,50}; // MVC
		
		// Explicit Way
		int[] arr2 = new int[]{30,40,50,60,70};
		// new is an operator which creates the array at run time
		
		System.out.println("a is: "+a); // a contains data
		System.out.println("arr1 is: "+arr1); // arr1 contains address| arr is a reference variable

		int b = a; // Value Copy
		int[] arr3 = arr1; // Reference Copy
		
	}

}
