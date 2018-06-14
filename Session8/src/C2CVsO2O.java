class CA{

	int x;
	int y;
	
	static int z;
	
	CA(){
		x = 10;
		y = 20;
		System.out.println("==CA Object Constructed==");
	}
	
	void show(){
		System.out.println("x and y : "+x+" , "+y);
	}
	
	static void showAgain(){
		System.out.println("z is: "+z);
	}
}

class CB extends CA{
	
	int p;
	int q;
	static int r;
	
	CB(){
		System.out.println("==CB Object Constructed==");
	}
	
}

public class C2CVsO2O {

	public static void main(String[] args) {
		
		CB cRef = new CB();		

	}

}
