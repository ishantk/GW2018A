package com.auribises;

/*class MyTask{
	void executeTask(){
		for(int i=1;i<=10;i++){
			System.out.println(" **MyTask** "+i);
		}
	}
}*/

class MyTask extends Thread{
	public void run(){
		
		System.out.println("**"+getState()+"**");
		
		for(int i=1;i<=10;i++){
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(" **MyTask** "+i);
		}
	}
}

class A{
	
}

class YourTask extends A implements Runnable{
	public void run(){
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(" ##YourTask## "+i);
		}
	}
}

public class App {

	public static void main(String[] args) {
		
		System.out.println("==App Started==");
		
		//MyTask mRef = new MyTask();
		//mRef.executeTask();
		
		MyTask mRef = new MyTask();
		
		System.out.println("=="+mRef.getState()+"==");		
		
		Runnable r = new YourTask(); // Polymorphic Statement
		Thread th = new Thread(r);
		
		mRef.setName("Charlie");
		th.setName("Shawn");
		Thread.currentThread().setName("Awesome");
		
		mRef.setPriority(Thread.MAX_PRIORITY); // 10
		th.setPriority(Thread.MIN_PRIORITY); // 1
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY); // 5
		
		mRef.start(); // start method internally calls the run method
		// Why So? Because we have states of a thread.
		
		// Immediately after mRef started call join method
		
		try {
			mRef.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		th.start();
		
		th.yield();
				
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(" ==Main== "+i);
		}
		
		System.out.println("MyTask Name: "+mRef.getName()+" Priority "+mRef.getPriority());
		System.out.println("YourTask Name: "+th.getName()+" Priority "+th.getPriority());
		System.out.println("Main Name: "+Thread.currentThread().getName()+" Priority "+Thread.currentThread().getPriority());
		
		System.out.println("==App Finished==");
		
		System.out.println("=="+mRef.getState()+"==");

	}

}
