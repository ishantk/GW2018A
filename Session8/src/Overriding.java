class Father{
	
	//private void purchaseBike(){
	public void purchaseBike(){
		System.out.println("Lets buy Pulsar");
	}
	
	static void purchaseCar(){
		System.out.println("Lets buy Maruti");
	}
	
	static void purchaseHome(){
		
	}
	
}

class Son extends Father{
	
	// Overriding
	public void purchaseBike(){
		super.purchaseBike();
		System.out.println("Lets buy Royal Enfield");
	}
	
	// Hiding
	static void purchaseCar(){
		Father.purchaseCar();
		System.out.println("Lets buy Honda");
	}
	
	// error -> can re-define only whitin C2C or O2O
	/*void purchaseHome(){
		
	}*/
}



public class Overriding {

	public static void main(String[] args) {
		
		Son sRef = new Son();
		sRef.purchaseBike();
		
		Son.purchaseCar();
		
	}

}
