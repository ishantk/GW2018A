class MyBlock{
	
	static int iVar;
	
	static{
		System.out.println("MyBlock Satic Block");
		iVar = 10;
	}
	
	{
		System.out.println("MyBlock Block");
		iVar = 1;
	}
	
	MyBlock() {
		System.out.println("MyBlock Constructed..");
		iVar = 20;
	}
	
}

public class BlockTest {

	public static void main(String[] args) {
		System.out.println("Main Started");

		MyBlock mb1 = new MyBlock();
		
		System.out.println(MyBlock.iVar);
		
		MyBlock.iVar = 123;
		
		MyBlock mb2 = new MyBlock();
				
		System.out.println(MyBlock.iVar);
		
		System.out.println("Main Finished");
	}

}
