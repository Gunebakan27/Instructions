package day18multidimensionalarraylists;

import java.util.Arrays;

public class MultiDimensionalArrays02 {

	public static void main(String[] args) {
//Find the max element in 2 dimensional array
		/*
* Logic:
* 1) Covert 2 dimensional array to 1 dim. array then sort the elements in ascending order and get the last element
* 
*/
// 1.Way: Covert 2 dimensional array to 1 dim. array then sort the elements in ascending order and get the last element
	
		int a[][]= {{11,21},{-5,34},{65,122,31}};
		
//		int sum=0;
//		for(int[] w:a) {
//			sum=sum+w.length;
//		}
//		
//		int brr[]=new int[sum];
//		int counter=0;
//		for(int[] w:a) {
//			for(int x:w) {
//				
//				brr[counter]=x;
//				counter++;
//			}
//		
//		}
//		System.out.println(Arrays.toString(brr));
//		
//		Arrays.sort(brr);
//		System.out.println(Arrays.toString(brr));
//		System.out.println(brr[brr.length-1]);

//		int a[][]= {{11,21},{-5,34},{65,122,31}};
		int i=Integer.MAX_VALUE;
		
		for(int[] w:a) {
			for(int x:w) {
				
				if(i>x) {
					
				i=x;
				
		
				}
			}
	
		}
		System.out.println(i);
	
		
		
		
		
		
		
		
		
//		int sum=0;
//		
//		for(int[] w:a) {
//			sum=sum+w.length;
//		}
//		int b[]=new int[sum];
//		int idx=0;
//		for(int[] w:a) {
//			for(int x:w) {
//				b[idx]=x;
//				idx++;
//			}
//		}
//		Arrays.sort(b);
//		System.out.println("Max Element: "+b[b.length-1]);
		
//2. Way: We will get the lowest value, then if a value is greater than the lowest value, I will assign the value to lowest one
//		int x=Integer.MIN_VALUE;
//		
//		for(int[] w:a) {
//			for(int y:w) {
//				if(x<y) {
//					x=y;
//				}
//			}
//		}
//		System.out.println("Max Value: "+x);
//		
////		Homework:Find the min value
//		
//		
		
	}

}
