import java.util.Scanner;

public class LabSession1 {

	public static void main(String[] args) {
		
		// API
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter a Number");
		int num = scanner.nextInt();
		
		System.out.println("You Enetered: "+num);
		
		if(num%2 == 0){
			System.out.println("Its an even number");
		}else{
			System.out.println("Its an odd number");
		}
		
		//Write Logic Here to Convert a number into a binary 
		//......
		
		String bin = "";
		int n = 0;
		while(num>0){
			n = num % 2;
			bin = bin+""+n; // concatenating number in String
			num = num/2;
		}
		
		System.out.println("binary is: "+bin);
		
		//..... | Google to reverse

		// First Gap between 2 of the 1s
		// 100100101		-> 2
		// 1010 			-> 1
		// 0110 			-> 0
		

		
	}

}
