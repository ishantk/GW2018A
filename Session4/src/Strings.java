
public class Strings {

	public static void main(String[] args) {
		
		char[] chArr = {'A','P','P','L','E'};
		System.out.println(chArr);
		System.out.println("chArr is: "+chArr);
		System.out.println("chArr length is: "+chArr.length);
		
		// Interned Way
		String s1 = "Apple";
		String s2 = "Apple";
		
		System.out.println("s1 is: "+s1);
		System.out.println(s2);
		
		// Object Way
		String s3 = new String("Apple");
		String s4 = new String("APPLE");
		
		System.out.println("s3 is: "+s3);
		System.out.println(s4);
		
		// We are comparing Reference Variables i.e. Addresses within them
		if(s1 == s2){
			System.out.println("s1 == s2");
		}else{
			System.out.println("s1 != s2");
		}
		
		if(s3 == s4){
			System.out.println("s3 == s4");
		}else{
			System.out.println("s3 != s4");
		}
		
		if(s1 == s3){
			System.out.println("s1 == s3");
		}else{
			System.out.println("s1 != s3");
		}

		// In Strings we dont see addresses. Because of toString()
		
		// Strings are IMMUTABLE. They cannot be changed
		String str1 = "John, Jennie, Jim, Jack, John, Joe";
		String str2 = str1.toUpperCase();
		
		// str1 = str1.toUpperCase(); // This is BAD
		
		System.out.println("str1 is: "+str1);
		System.out.println("str2 is: "+str2);
		
		// API's from String
		char ch = str1.charAt(27);
		System.out.println("ch is: "+ch);
		
		int len = str1.length();
		System.out.println("len is: "+len);
		
		int idx = str1.indexOf('e');
		idx = str1.indexOf("John");
		idx = str1.lastIndexOf('J');
		idx = str1.lastIndexOf("John");
		System.out.println("idx is: "+idx);
		
		//String str3 = str1.substring(6);
		String str3 = str1.substring(6, 12); // start from 6 < 12
		System.out.println("str3 is: "+str3);
		
		if(str1.contains("John")){
			System.out.println("John is in");
		}
		
		if(s1.equals(s2)){
			System.out.println("s1 is equal to s2");
		}else{
			System.out.println("s1 is not equal to s2");
		}
		if(s3.equalsIgnoreCase(s4)){
			System.out.println("s3 is equal to s4");
		}else{
			System.out.println("s3 is not equal to s4");
		}
		if(s1.equals(s3)){
			System.out.println("s1 is equal to s3");
		}else{
			System.out.println("s1 is not equal to s3");
		}
		
		if(s1.compareTo(s2) == 0){
			System.out.println("s1 is compare to s2");
		}else{
			System.out.println("s1 is not compare to s2");
		}
		if(s3.compareToIgnoreCase(s4) == 0){
			System.out.println("s3 is compare to s4");
		}else{
			System.out.println("s3 is not compare to s4");
		}
		if(s1.compareTo(s3) == 0){
			System.out.println("s1 is compare to s3");
		}else{
			System.out.println("s1 is not compare to s3");
		}
		
		int count = 0;
		char[] chr = str1.toCharArray();
		for(char c : chr){
			if(c=='J'){
				count++;
			}
			System.out.print(c+" ");
		}
		System.out.println();
		System.out.println("J Appears "+count+" times");
		
		if(str1.endsWith("Joe")){ // startsWith
			System.out.println("Joe is in the end");
		}
		
		//String email = "john@example.com";
		String email = "";
		if(email.isEmpty()){
			System.out.println("Please Enter the Email");
		}else{
			if(email.contains("@") && email.endsWith(".com")){
				System.out.println("Correct Email");
			}else{
				System.out.println("Incorrect Email");			
			}
		}
		
		String[] names = str1.split(",");
		for(String n : names){
			System.out.println(n.trim());
		}
	}

}
