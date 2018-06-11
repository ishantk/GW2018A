class Counter{
	
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
		
		c1.showCount();
		c2.showCount();
		c3.showCount();
	}

}
