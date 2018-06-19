package com.auribises;

import java.io.IOException;

// UnChecked User Defined Exception
class MyException extends RuntimeException{
	public MyException(String msg) {
		super(msg);
	}
}

// Checked User Defined Exception
class YourException extends Exception{
	public YourException(String msg) {
		super(msg);
	}
}


class Banking{
	
	int balance = 10000;
	int minBal = 3000;
	int attempts = 0;
	
	void withdraw(int amt){
		balance = balance - amt;
		if(balance <=3000){
			attempts++;
			balance = balance + amt;
			System.out.println("Withdrawl Failure!! Balance is LOW \u20b9"+balance);
		}else{
			System.out.println("Withdrawl Successful and Balance is \u20b9"+balance);
		}
		
		if(attempts==3){
			// UnChecked Exception
			//ArithmeticException aRef = new ArithmeticException("Balance is LOW");
			//throw aRef;
			
			MyException mRef = new MyException("Balance is LOW");
			throw mRef;
		}
	}
	
	void withdrawAgain(int amt) throws IOException,YourException{
		balance = balance - amt;
		if(balance <=3000){
			attempts++;
			balance = balance + amt;
			System.out.println("Withdrawl Failure!! Balance is LOW \u20b9"+balance);
		}else{
			System.out.println("Withdrawl Successful and Balance is \u20b9"+balance);
		}
		
		if(attempts==3){
			// Checked Exception
			//IOException iRef = new IOException("Illegal Attempts with LOW Balance");
			//throw iRef;
			
			YourException yRef  = new YourException("Illegal Attempts with LOW Balance");
			throw yRef;
		}
	}
	
}

public class ThrowThrowsDemo {

	public static void main(String[] args) {
		
		System.out.println("==Banking Started==");
		
		Banking bRef = new Banking();
		/*for(int i=1;i<=100;i++){
			bRef.withdraw(3000);
		}*/
		
		try{
			for(int i=1;i<=100;i++){
				bRef.withdrawAgain(3000);
			}
		}catch(Exception e){
			System.out.println("Some Exception: "+e);
		}
		
		
		System.out.println("==Banking Finished==");
	}

}
