package day17foreachloopmultidimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionsOfMultiDimensionalArrays {

	public static void main(String[] args) {
//		1) Find the sum of all elements in the multi dimensional array { {1,2,3}, {4,5,6} }
		
//		int arr[][]={ {1,2,3}, {4,5,6} };
//		
//		int sum=0;
//		for(int[] w:arr) {
//			for(int x:w) {
//				sum=sum+x;
//				}
//			}
//	System.out.println(sum);
//		
		
//		2) Find the product of the last elements in the array, elements of the
//		given multi dimensional array { {1,2,3}, {4,5}, {6} }
		int arr[][]={ {1,2,3}, {4,5}, {6} };
		
		int mul=1;
		for(int[] w:arr) {
		
		mul=mul*w[w.length-1];
		
		}
		System.out.println(mul);

//		3) Find the sum of the elements whose indexes are same in the given two multi dimensional arrays
//		arr1 = { {1,2}, {3,4,5}, {6} } and arr2 = { {7,8,9}, {10,11}, {12} }
//		int arr1[][]={ {1,2}, {3,4,5}, {6} };
//		int arr2[][]={ {7,8,9}, {10,11}, {12} };
//		
//		int sum1=0;
//		int sum2=0;
//		for(int[] w:arr1) {
//			for(int x:w) {
//				sum1=sum1+x;
//			}
//		}
//		for(int[] w:arr2) {
//			for(int x:w) {
//				sum2=sum2+x;
//			}
//		}
//		System.out.println(sum1);
//		System.out.println(sum2);
		
//		4) Find the sum of the elements in the array elements of the given multi dimensional array
//		{ {1,2,3}, {4,5}, {6,7} } and return an array.
//		For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13}
//		int arr[][]={ {1,2,3}, {4,5}, {6,7} };
//		
//		int sum1=0;
//		int sum2=0;
//		int sum3=0;
//		
//		for(int[] w:arr) {
//			
//			sum1=sum1+w[0];
//			System.out.println(sum1);
//			
//		}
	
//		5) Ask user to enter long two sentences. Then type a program to count all “words” in the sentences.
//		For example; if user enters “Java is easy, if you study. Nothing is easy, if you do not study” output will be 14.
//		Hint: Use split()
		
//		String str="Java is easy, if you study. Nothing is easy, if you do not study";
//		String arr[]=str.split(" ");
//		System.out.println(arr.length);
			
//		6) Write a Java program to remove a specific element from an array.
		
//		int arr[]= {1,2,3};
//		int remove=1;
//	
//		for(int i=0;i<arr.length;i++) {
//			int arr1[]=new int[arr.length-1];
//			arr1[i]=arr[remove];
//			
//			
//			System.out.println(Arrays.toString(arr1));
//			
//			}
//			
		
		
		
		
		
		
}}
