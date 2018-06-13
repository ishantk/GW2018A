class Counter{
	
	// By Default count and sCount will be 0
	int count;
	static int sCount;
	
	void incrementCount(){
		count++;
		sCount++; // Property of Class can be Accessed by Property of Object
	}
	
	void showCount(){
		System.out.println("count is: "+count);
		System.out.println("sCount is: "+sCount);
	}
	
	// Property of Class
	static void someFun(){
		// error
		//count++; // Property of Object cannot be accessed here
	}
	
}
public class StaticDemo {

	public static void main(String[] args) {
		
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = c1;
		
		c1.incrementCount();
		c2.incrementCount();
		c3.incrementCount();
		
		c1.incrementCount();
		c2.incrementCount();
		c2.incrementCount();
		
		c3.incrementCount();
		c2.incrementCount();
		c2.incrementCount();
		
		Counter.sCount = 121;
						//  count 	sCount
		c1.showCount(); //	4  		9		
		c2.showCount(); //	5 		9
		c3.showCount(); //  4    	9
	}

}
