package com.auribises;

//import java.util.concurrent.*;

class Message{
	
	int i;
	volatile long l;
	
	String msg;
	
	Message(){
		msg = "No Message Available";
	}
	
	void writeMessage(String msg){
		this.msg = msg;
		System.out.println("==Message Written==");
	}
	
	void readMessage(){
		System.out.println("Message is: "+msg);
	}
	
}

class ReaderThread extends Thread{
	
	Message mRef;
	
	ReaderThread(Message mRef){
		this.mRef = mRef;
	}
	
	public void run() {
		synchronized (mRef) {
			
			try {
				mRef.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			mRef.readMessage();
			
		}
	}
}

class WriterThread extends Thread{
	
	Message mRef;
	
	WriterThread(Message mRef){
		this.mRef = mRef;
	}
	
	public void run() {
		synchronized (mRef) {
			mRef.writeMessage("Seacrh the candle rather that cursing the darkness !!");
			//mRef.notify();
			mRef.notifyAll();
		}
	}
}

public class WNDemo {

	public static void main(String[] args) {
		
		Message mRef = new Message();
		/*mRef.readMessage();
		mRef.writeMessage("be exceptional !!");
		mRef.readMessage();*/

		ReaderThread rt1 = new ReaderThread(mRef);
		ReaderThread rt2 = new ReaderThread(mRef);
		
		WriterThread wt = new WriterThread(mRef);
		
		rt1.start();
		rt2.start();
		
		wt.start();
		
	}

}
