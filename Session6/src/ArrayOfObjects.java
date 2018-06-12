class Student{
	
	// Attributes
	int roll;
	String name;
	byte age;
	
	// Constructors/Getter, Setter/ Methods
}
public class ArrayOfObjects {

	public static void main(String[] args) {
		
		int i1 = 10;
		int i2 = 20;
		int i3 = 30;
		int i4 = 40;
		int 	i5 = 50;
		
		//int[] arr = {10,20,30,40,50};
		//int[] arr = new int[]{i1,20,i3,40,50};
		
		
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		
		// Array of Reference Variables -> > Array of Objects
		//Student[] sArr = {s1,s2,s3,s4,s5};
		//Student[] sArr = new Student[]{s1,s2,s3,s4,s5};
		
		Student[] sArr = new Student[5];
		sArr[0] = new Student();
		sArr[1] = new Student();
		sArr[2] = new Student();
		sArr[3] = new Student();
		sArr[4] = new Student();
		
	}

}
