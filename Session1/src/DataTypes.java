
public class DataTypes {

	public static void main(String[] args) {
		
		int i = 100;
		// i is the name of single value container
		// type of container is integer
		// size of container is 32 bits
		// 100 is the data. Literal
		
		byte b = 20;
		
		int j = 100;
		
		long l = 100000000L;
		
		byte c = (byte)256;
		
		System.out.println("c is: "+c);
		
		int k = (int)l;
		
		char ch = 'A'; // Write Operation
		System.out.println(ch); // Read Operation
		
		ch = 65;
		System.out.println("ch now is: "+ch);
		
		ch = '\u0A13';
		System.out.println("ch now is: "+ch);
		
		ch = '\u20b9';
		System.out.println("ch now is: "+ch);
				
		double f = 2.2;
		float g = 2.2f;
		
		float h = (float)2.2;

		boolean flag = true;
		flag = false;
		
		float pi = 3.14f;
		
		String name = "John Watson";
	}

}
