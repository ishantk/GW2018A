package com.auribises;

/*
 * Throwable
 * 		Error
 * 			StackOverflowError
 * 			..
 * 			...
 * 		Exception
 * 			RuntimeException 						UNCHECKED EXCEPTIONS
 * 				NullPointerException
 * 				ArrayIndexOutOfBoundsException
 * 				ArithmeticException
 * 				..
 * 				... 			
 * 			IOException 								CHECKED EXCEPTIONS
 * 				FileNotFoundException
 * 			SQLException
 * 			..
 * 			...
 */

public class ExcDemo {

	public static void main(String[] args) {
	
		System.out.println("==Main Started==");
		
		int a = 10;
		int b = 0;
		int c = 0;
		
		int[] arr = {10,20,30,40,50};
		
		try{
			
			c = a/b;
			
			System.out.println("arr[30] is: "+arr[30]);
			
				
		}/*catch(ArithmeticException aRef){
			System.out.println("Something went wrong !!"+aRef);
		}catch(ArrayIndexOutOfBoundsException aRef){
			System.out.println("Something went wrong !!"+aRef);
		}*/catch(Exception e){
			System.out.println("Some Exception: "+e);
			//e.printStackTrace();
		}finally{
			System.out.println("This is Awesome !!");
		}
		
		System.out.println("c is: "+c);
		
		System.out.println("==Main Finished==");

	}

}
