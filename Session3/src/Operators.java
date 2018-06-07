
public class Operators {

	public static void main(String[] args) {
		
		int x = 8; 		// 1 0 0 0
		int y = 10;     // 1 0 1 0
		
		int z = x & y;  // 1 0 0 0   -> 8
		z = x | y;      // 1 0 1 0   - 10
		
		x = 12;
		y = 16;
		z = x & y;
		System.out.println("z is: "+z);
		
		z = x ^ y;
		System.out.println("z is: "+z);
	
		x = -13;			// 1 0 0 0 
		y = x >> 2;     // _ _ 1 0 -> 0 0 1 0
		System.out.println("y is: "+y);
		
		/*
		 * 11 
		 * 1 0 1 1
		 * >>2
		 * _ _ 1 0
		 * 0 0 1 0 -> 2
		 * 
		 * -11
		 * 1 0 1 1
		 * 0 1 0 0 
		 *       1
		 * 0 1 0 1 -> -11
		 * >>2
		 * _ _ 0 1
		 * 1 1 0 1
		 * 0 0 1 0
		 *       1 
		 * 0 0 1 1 -> -3           
		 */
		
		// -4, -3, -5, 3 
		
		// >>> -> works only on positive numbers
		
		x = 8; 		// 0 0 1 0 0 0 0 0
		y = x << 2;
		System.out.println("y is: "+y);
		
		
		int data = 16;
		int senderSecretKey = 2;
		int sentData = data >> senderSecretKey;
		
		System.out.println("Sent Data is : "+sentData);
	
		int rcvdData = 4;
		int receiverSecretKey = 2;
		int actualData = rcvdData << receiverSecretKey;
		
		System.out.println("Data Received is: "+actualData);
		
	}

}
