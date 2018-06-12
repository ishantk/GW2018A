
public class Block {

	static int i = 10;
	int j = 10;
	
	Block(){
		// i = 10; // BAD 
		System.out.println("Block Constructed...");
	}

	{
		System.out.println("Block...");
	}
	
	static {
		i = 10; // OK
		System.out.println("Static Block...");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main Started...");
			
		Block b1 = new Block();
		System.out.println("^^^^^^^^^^^^^^^^^^^^");
		
		Block.i = 100;
		
		Block b2 = new Block();

		System.out.println("Main Finished...");
	}

}
