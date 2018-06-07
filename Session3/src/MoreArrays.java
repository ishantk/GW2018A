
public class MoreArrays {

	public static void main(String[] args) {
	
		int[] a1 = {10,20,30,40,50};				// I
		int[] a2 = new int[]{10,20,30,40,50}; 	// E
		
		int a3[] = {10,20,30,40,50};				// I
		int a4[] = new int[]{10,20,30,40,50};   // E
		
		// if we create an array with size, all elements will be 0
		int a5[] = new int[5];
		int[] a6 = new int[10];
		
		a5[2] = 123;
		
		for(int i=0;i<a5.length;i++){
			System.out.println(a5[i]);
		}
		
		int a7[],a9;
		a7 = new int[5];
		a9 = 10;
		
		int[] a8,a10;
		a8 = new int[10];
		a10 = new int[12];
		
		int num1 = 10;
		int num2 = num1; // Value Copy
		
		int[] arr1 = {10,20,30};
		int[] arr2 = arr1; // Reference Copy
		
		System.out.println("arr1 is: "+arr1);
		System.out.println("arr2 is: "+arr2);
		
		arr1[1] = 579;
		System.out.println(arr2[1]);
		
		// ENHANCED FOR LOOP
		for(int n : a10){
			System.out.print(n+"  ");
		}
		
	}

}
