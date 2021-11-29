package day15arrays;

import java.util.Arrays;

public class ArraysExercises {

	public static void main(String[] args) {
//		2. Write a Java program to sum values of an array
		
//		int arr[]= {1,2,3};
//		int sum=0;
//		for(int i=0;i<arr.length;i++) {
//			sum=sum+arr[i];
//		}
//		System.out.println(sum);
		
//		Write a Java program to print the following grid.
//
//		Expected Output :
//
//		- - - - - - - - - -                                                                                           
//		- - - - - - - - - -                                                                                           
//		- - - - - - - - - -                                                                                           
//		- - - - - - - - - -                                                                                           
//		- - - - - - - - - -                                                                                           
//		- - - - - - - - - -                                                                                           
//		- - - - - - - - - -                                                                                           
//		- - - - - - - - - -                                                                                           
//		- - - - - - - - - -                                                                                           
//		- - - - - - - - - -  
		
//		String arr[]=new String[9];
//		
//		for(int i=0;i<9;i++) {
//			arr[i]="- ";
//			
//			
//			for(int j=0;j<9;j++) {
//				arr[j]="- ";
//			
//			System.out.print(arr[j]);
//			}
//			
//			System.out.println(arr[i]);
//			}
//			
//		Write a Java program to calculate the average value of array elements. 
		
//		int arr[]= {1,2,3};
//		int sum=0;
//	
//		for(int i=0;i<arr.length;i++) {
//			sum=sum+arr[i];
//		}
//		System.out.println(sum/arr.length);

//		Write a Java program to test if an array contains a specific value.
//		Write a Java program to find the index of an array element.	
//		int arr[]= {0,1,2,3,2};
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==2) {
//		
//			System.out.println(Arrays.toString(arr)+" Index of 2 is: "+i);
//			
//			Write a Java program to remove a specific element from an array. 
			
			int arr[]= {0,1,2,3,2};
			int brr[]=new int [arr.length-1];
			int idx=0;
			for(int i=0;i<arr.length;i++) {
				
				if(arr[i]==2) {
					brr[idx]=arr[i];
					idx++;
			}
				System.out.println(Arrays.toString(brr));	
		}
	
		

		
		
		
		
		
		
		
		
	}}
