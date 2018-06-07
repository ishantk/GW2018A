
public class MultiDimeArray {

	public static void main(String[] args) {
		
		// Array is not a matrix
		
		int[] party1 = {123,456,8673,2346,9875};
		int[] party2 = {678,456,234,2346,2345};
		
		
		// 2-D Array-> Which is Array of Arrays
		int[][] votes = {
							{123,456,8673,2346,9875}, //0
							{678,456,234,2346,2345},  //1
							{678,456,234}			  //2
					    };

		System.out.println("party1 is: "+party1);
		System.out.println("party1 size is: "+party1.length);
		
		System.out.println("votes is: "+votes);
		System.out.println("votes size is: "+votes.length);
		
		System.out.println("votes[0] is: "+votes[0]);
		System.out.println("votes[0] size is: "+votes[0].length);
		System.out.println("votes[0][0] is: "+votes[0][0]);
		System.out.println("votes[0][0] is: "+votes[2][2]);
		
		
		int[][] arr1 = new int[5][3];
		// 5 1-D Arrays, with each Array having 3 elements
		
		int[][] arr2 = new int[3][];
		
		// 3 1-D Arrays
		arr2[0] = new int[5];
		arr2[1] = new int[10];
		arr2[2] = new int[20];
		
		// Need to print 2-D Array using For and Enhanced For
		
		int[][][] arrr = {
								{
									{123,456,8673,2346,9875}, //0
									{678,456,234,2346,2345},  //1 		// 0
									{678,456,234}			  //2
							    },
								{
									{123,456,8673,2346,9875}, //0
									{678,456,234,2346,2345},  //1		//1
									{678,456,234}			  //2
							    }
						 };
		
		// N-D Array is a Collection of N-1D Arrays
		System.out.println("arrr size is: "+arrr.length);
		System.out.println(arrr[0][1][2]); // ?
	}

}
