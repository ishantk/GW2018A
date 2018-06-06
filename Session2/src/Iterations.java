
public class Iterations {

	public static void main(String[] args) {
		
		//int num = 5;
		//int i = 1;
		
		/*System.out.println(num+" "+i+"'s are "+(num*i));
		i = i+1;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i = i+1;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i = i+1;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i = i+1;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i = i+1;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i = i+1;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i = i+1;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i = i+1;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i = i+1;
		System.out.println(num+" "+i+"'s are "+(num*i));*/
		
		int num = 5;
		int i = 100;
		
		while(i<=10){
			System.out.println(num+" "+i+"'s are "+(num*i));
			//i = i+1;
			i++;
		}
		
		System.out.println("****************");
		
		num = 7;
		i = 100;
		
		do{
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}while(i<=10);
		
		System.out.println("****************");

		num = 11;
		for(int j=1;j<=10;j++){
			System.out.println(num+" "+j+"'s are "+(num*j));
		}
		
		System.out.println("**************");
		
		for(i=1,num=9;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
		
		int a = 10;
		
		//int b = a++;
		int b = ++a;
		
		System.out.println("a is: "+a);
		System.out.println("b is: "+b);
		
		
	}

}










