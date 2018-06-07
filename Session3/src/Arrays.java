
public class Arrays {

	public static void main(String[] args) {
		
		int bjpPunjab = 120;
		int congPunjab = 124;
		
		bjpPunjab = 130;
		
		int bjpUp = 345;
		int congUp = 134;
		
		//
		//....
		
		// Arrays
		// Are Collection of Single Value Containers
		// Homogeneous in Nature (Type must be same)
		
		// Implicit Way -> int[] bjp = new int[]{120,345,567,120,5673,12356,178,543,755};
		int[] bjp = {120,345,567,120,5673,12356,178,543,755};
		
		// Explicit Way
		int[] cong = new int[]{345,321,444,120,567,12356,178,133,789};
		
		System.out.println("bjpPunjab is: "+bjpPunjab);
		System.out.println("congPunjab is: "+congPunjab);
		
		// bjp or cong are reference variables
		
		System.out.println("bjp is: "+bjp);
		System.out.println("cong is: "+cong);
		
		//int i = 0;
		//int[] arr = null;
		
		// Read from Array
		System.out.println(bjp[0]);
		
		// Write/Update in Array
		bjp[0] = 130;
		System.out.println(bjp[0]);
		
		System.out.println("bjp size: "+bjp.length);
		
		// Read All
		int bjpCount = 0;
		for(int i=0;i<bjp.length;i++){
			System.out.print(bjp[i]+" ");
			bjpCount = bjpCount + bjp[i];
		}

		System.out.println();
		
		System.out.println("bjp vote count is: "+bjpCount);
	}

}
