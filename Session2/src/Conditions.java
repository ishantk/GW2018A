
public class Conditions {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println(a < b);
		
		if(a > b){
			System.out.println("a is greater than b");
		}else{
			System.out.println("b is greater than a");
		}

		boolean isInternetEnabled = true;
		boolean isGPSEnabled = false;
		
		if(isInternetEnabled){
			if(isGPSEnabled){
				System.out.println("You can browse google Maps");
			}else{
				System.out.println("Please Enable GPS and Try Again !!");
			}
		}else{
			System.out.println("Please Enable Internet and Try Again !!");
		}
		
		if(isInternetEnabled && isGPSEnabled){
			System.out.println("You can browse google Maps and Navigate");
		}else{
			System.out.println("Please check Internet/GPS and Try Again !!");
		}
		
		int ph = 80;
		int mt = 90;
		int ch = 70;
		
		int avg = (ph+mt+ch)/3;
		
		if(avg>=90){
			System.out.println("OPT Medical");
		}else if(avg>=80 && avg<90){
			System.out.println("OPT NON Medical "+avg);
		}else if(avg>=70 && avg<80){
			System.out.println("OPT Commerce");
		}else if(avg>=60 && avg<70){
			System.out.println("Arts");
		}else{
			System.out.println("Do Family Business !!");
		}
		
		
		final int miniCabId = 101;
		int microCabId = 201;
		int sedanId = 301;
		int bikeId = 401;
		int autoId = 501;
		
		int userChoice = 101;
		
		/*if(userChoice == miniCabId){
			System.out.println("Mini Cab Booked for you. Arriving Soon !!");
		}else if(userChoice == microCabId){
			System.out.println("Micro Cab Booked for you. Arriving Soon !!");
		}else if(userChoice == sedanId){
			System.out.println("Sedan Cab Booked for you. Arriving Soon !!");
		}else if(userChoice == bikeId){
			System.out.println("Bike Booked for you. Arriving Soon !!");
		}else if(userChoice == autoId){
			System.out.println("Auto Booked for you. Arriving Soon !!");
		}else{
			System.out.println("Select Correct Option !!");
		}*/
				
		switch (userChoice) {
			case miniCabId:
				System.out.println("Mini Cab Booked for you. Arriving Soon !!");
				break;
				
			case 201:
				System.out.println("Micro Cab Booked for you. Arriving Soon !!");
				break;	
	
			default:
				System.out.println("Select Correct Option !!");
				break;
		}
		
	}

}
