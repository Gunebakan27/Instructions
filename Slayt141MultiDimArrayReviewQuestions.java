package day18multidimensionalarraylists;

import java.util.Arrays;


public class Slayt141MultiDimArrayReviewQuestions {

	public static void main(String[] args) {

//		1) Find the sum of all elements in the multi dimensional array { {1,2,3}, {4,5,6} }
		
//		int arrM[][]= { {1,2,3}, {4,5,6} };
//		
//		
//		int sum=0;
//		for(int[] w:arrM) {
//			for(int x:w) {
//				sum=sum+x;
//			}
//			
//		}
//		System.out.println(sum);
//		
		
//		2) Find the product of the last elements in the array elements of the
//	given multi dimensional array { {1,2,3}, {4,5}, {6} }
		
//		int arr[][]={ {1,2,3}, {4,5}, {6} };
//		
//		int mul=1;
//		
//		for(int[] w:arr) {
//			System.out.println(Arrays.toString(w));
//		mul=mul*w[w.length-1];
//	
//			
//		}
//		System.out.println(mul);
//		
//		3) Find the sum of the elements whose indexes are same in the given two multi dimensional arrays
//	    int arr1[][] = { {1,2}, {3,4,5}, {6} };
//	    int arr2[][] = { {7,8,9}, {10,11}, {12} };
//	    int sumArr[] = new int[arr1.length];
//	    
//	    for (int i=0; i<arr1.length; i++){
//	      int sum1 = 0;
//	      for (int j=0; j<arr1[i].length; j++){
//	        sum1 = sum1 + arr1[i][j];  
//	      }
//	      sumArr[i] = sum1;
//	    
//	    }
//	    
//	    for (int i=0; i<arr2.length; i++){
//	      int sum2 = 0;
//	      for (int j=0; j<arr2[i].length; j++){
//	        sum2 = sum2 + arr2[i][j];  
//	        
//	      }
//	      sumArr[i] = sumArr[i] + sum2;
//	  
//	    }
//	    
//	    System.out.println(Arrays.toString(sumArr));
		
//		4) Find the sum of the elements in the array elements of the given multi dimensional array
//	{ {1,2,3}, {4,5}, {6,7} } and return an array.
//	For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13}
	
			int arr[][]={ {1,2,3}, {4,5}, {6,7} };
			int sum=0;
			int arr1[]=new int[arr.length];
			
			for(int i=0;i<arr.length;i++) {
				
				for(int k=0;k<arr[i].length;k++) 
			
					sum=sum+arr[i][k];
				
				arr1[i]=sum;
			
			
			}
			System.out.println(Arrays.toString(arr1));
//				
//	    5) Ask user to enter long two sentences. Then type a program to count all “words” in the sentences.
//	    For example; if user enters “Java is easy, if you study. Nothing is easy, if you do not study” output will be 14.
//	    Hint: Use split()
				
//		String str="Java is easy, if you study. Nothing is easy, if you do not study";
//		String arr[]=str.split(" ");
//		System.out.println(arr.length);
			
//		6) Write a Java program to remove a specific element from an array.
//		
//		int arr[]= {1,2,3};
//		int removedIdx=1;
//		int idxArrNew=0;
//		int arrNew[]=new int[arr.length-1];
//		
//		for(int i=0;i<arr.length;i++) {
//			
//			if(i!=removedIdx) 
//			{	
//				arrNew[idxArrNew]=arr[i];	
//				idxArrNew++;
//	
//			}
//	
//			}
//		System.out.println(Arrays.toString(arrNew));
	}
	
}
