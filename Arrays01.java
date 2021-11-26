package day14statickeywordarrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
//How to create an Array
		int arr1[]=new int[5];//int[] arr1=new int[5];
							  //int []arr1=new int[5];
		
//How to print an Array on the console
		System.out.println(Arrays.toString(arr1));//[0, 0, 0, 0, 0]
//How to add elements into an Array
		arr1[1]=11;
		System.out.println(Arrays.toString(arr1));//[0, 11, 0, 0, 0]
		
		arr1[4]=25;
		System.out.println(Arrays.toString(arr1));//[0, 11, 0, 0, 25]
		
		arr1[0]=23;
		arr1[2]=32;
		arr1[3]=12;
		System.out.println(Arrays.toString(arr1));
		
//How to read specific element from an Array
		System.out.println(arr1[2]);//32
		
		//System.out.println(arr1[5]);//No red underline so no CTE
									//ArrayIndexOutOfBoundsException: Run Time Error
		//System.out.println(arr1.length);
		System.out.println(arr1[arr1.length-1]);
			
		
		
		
	}

}
