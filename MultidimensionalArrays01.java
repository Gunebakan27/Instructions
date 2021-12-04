package day18multidimensionalarraylists;

import java.util.Arrays;

public class MultidimensionalArrays01 {

	//Convert 2 dimensional array to 1 dimensional array
	public static void main(String[] args) {
/*
 * Logic:
 * 1)Create 1 dimensional array and transfer all elements from 2 dimensioanl array to 1 dimensional array
 * i)to create a 1 dimensional array you need the number of elements you will put in.
 * ii)to get the number of elements in 2 dimensional array, you need to add the lengths of the inner arrays.
 * 
 */
		int arr[][]= {{1,2},{3,4,5},{6,7,9,10}};
		
		int sum=0;
		for(int[] w:arr) {
			sum=sum+w.length;
			System.out.println(sum);
		}
		int brr[]=new int[sum];
		int idx=0;
		for(int[] w:arr) {
			for(int x:w) {
						
			brr[idx]=x;
			idx++;
				
			}
		}
		System.out.println(Arrays.toString(brr));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int sum=0;
//		for(int[] w:arr) {
//			sum=sum+w.length;
//		
//		}
//		int brr[]=new int[sum];
//		int idx=0;
//		for(int[] w:arr) {
//			for(int x:w) {
//				brr[idx]=x;
//				idx++;
//				
//			}
//		}
//		System.out.println(Arrays.toString(brr));
	}

}
