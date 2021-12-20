package practice;

import java.util.Arrays;

public class Settar31_10 {

	public static void main(String[] args) {
//
////		1) Palindrome
//	/*   Palindrome   Create a program checks if a string is palindrome or not    */
//		
////		StringBuilder stb=new StringBuilder();
//		String name="civic";
//		
//		palindrome(name);
//		
////		
////		stb.append("civic");
////		System.out.println(stb.toString().equalsIgnoreCase(stb.reverse().toString()));
//	}
//
//	public static void palindrome(String name) {
//		
//		String reversed="";
//		
//		for(int i=name.length()-1;i>=0;i--) {
//			
////			reversed+=name.charAt(i);
//			reversed+=name.substring(i,i+1);
//			
//		}if(name.equalsIgnoreCase(reversed)) {
//			System.out.println("Palindrome");
//		}else {
//			System.out.println("not palindrome");
//		}
//	
		/*
	    Type a program that will print all Fibonacci Sequence on the console
	    0, 1, 1, 2, 3, 5, 8 etc..
	     */
//		int n=10;
//		int firstTerm=0;
//		int secondTerm=1;
//		
//		for(int i=0;i<=n;i++) {
//			System.out.print(firstTerm+",");//0,1
//			
//			int temp=firstTerm+secondTerm;//1
//			firstTerm=secondTerm;
//			secondTerm=temp;
//		
//		}
//		
		/*
	       Please find the biggest element in the given array
	         */
//	        int [] array = {1,24,2,342,123,543,54,3,2};
//	        int max=Integer.MIN_VALUE;
//	        
//	        Arrays.sort(array);
//	        
////	        System.out.println(array[array.length-1]);
//	        
//	        for(int w:array) {
//	        	if(w>max) {
//	        		max=w;
//	        	}
//	        }
//		System.out.println(max);
		
//		sort array elements in ascending and descending order
		
//		int [] array = {1,24,2,342,123,543,54,3,2};
//		
//		for(int i=0;i<array.length;i++) {
//			for(int j=i+1;j<array.length;j++) {
//				
//				if(array[i]>=array[j]) {//"<" shows us descending order..
//					int temp=array[i];
//					array[i]=array[j];
//					array[j]=temp;
//					
//					
//				}
//				
//			}
//			
//		}
//		System.out.println(Arrays.toString(array));
//		Arrays.sort(array);
//		System.out.println(Arrays.toString(array));
//		int idx=0;
//		for(int i=array.length-1;i>=0;i--) {
//			System.out.print(array[i]+" ");
//		}
//		
		
		
		
		
		
	}
}
