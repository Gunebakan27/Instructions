package day19arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Slayt156Q {

	public static void main(String[] args) {
//			For-each Question 1:
//			Create an integer array find the sum of all elements by using for-each loop
//			and print the sum on the console.
//		int arr[]= {2,5,9};
//		int sum=0;
//		for(int w:arr) {
//			if(w%2==1) {
//				sum=sum+w;
//			}
//			
//		}
//		System.out.println(sum);
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int arr[]= {1,2,3};
//		int sum = 0;
//		for(int w:arr) {
//			sum=sum+w;
//		}
//		System.out.println(sum);
//	
//		
////			For-each Question 2:
////			Create a list find the sum of all elements by using for-each loop
////			and print the sum on the console.
		
//		List<Integer>list=new ArrayList<>();
//		
//		list.add(3);
//		list.add(7);
//		list.add(10);
//		
//		int sum=0;
//		
//		for(int w:list) {
//			sum=sum+w;
//		}
//		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
//		List<Integer>list=new ArrayList<>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		sum=0;
//		for(int w:list) {
//			sum=sum+w;
//		}
//		
//System.out.println(sum);		
//	
//		
////			For-each Question 3:
////			Write a Java program to find the common elements between two
////			arrays (string values).
//
//		String arr1[]= {"A", "B","C", "D"};
//		String arr2[]= {"E","K","L","N"};
//		
//		
//		for(String w:arr1) {
//			for(String x:arr2) {
//				if(w==x) {
//					System.out.println(w);
//				}
//			}
//	
//		}
//		System.out.println("No common");
		
		/*
		 * we will split an int array into two but we will put odd numbers into one array and even numbers into another. 
		 * Also we will split them according to their index numbers: 
		 * Elements with odd index numbers will be one array and those with even index numbers will be the other.

		 */
		
		
//		int arr[]= {0,1,2,3,4,5,6,7};
//		List <Integer>list=new ArrayList<>();
//		for(int w:arr) {
//			list.add(w);
//		}
//	
//		List<Integer>listOdd=new ArrayList<>();
//	
//		for(int i=0;i<list.size();i++) {
//			if(i%2==1) {
//					
//				listOdd.add(list.get(i));
//			}
//		}
//		
//		System.out.println(listOdd);
//		
//for(int i=0;i<list.size();i++) {
//			
//			if(list.get(i)%2==1) {
//				
//				list.remove(i);
//				
//				i--;
//		}
//}
//		System.out.println(list);
		int arr[] = {0, 1, 2, 3, 4, 5, 6, 7};
	
		
		        List<Integer> list = new ArrayList<>();
		        for (int w : arr) {
		            list.add(w);
		        }
		            List<Integer> listOdd = new ArrayList<>();
		            for (int i = 0; i < list.size(); i++) {
		
		                if (list.get(i) % 2 == 1) {
		                    listOdd.add(list.get(i));
		                   list.remove(list.get(i));
		
		                } else {
		                    list.set(i, i);
		                }
		            }System.out.println(list);
		        System.out.println(listOdd);	
		
		
	
		
	
//		for(int w:arr) {
//			
//			if(w%2==0){
//			even++;	
//			}}
//		int arr1[]=new int[even];
//		int arr2[]=new int[arr.length-even];
//		int idx=0;
//		int idxEven=0;
//		for(int w:arr) {
//			
//			if(w%2!=0) {
//				
//				arr2[idx]=w;
//				idx++;
//			
//			}else {
//				arr1[idxEven]=w;
//				idxEven++;
//			}
//	
//		}
//		
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr2));
		
//			System.out.println(odd);
//			System.out.println(Arrays.toString(arr1));
		
		
		
		
		
		
		
		
		
		
		
		
		
//String arr1[]= {"A","B","C"};
//String arr2[]= {"X","Y", "C"};
//
//for(String w:arr1) {
//	for(String x:arr2) {
//		if(w==x) {
//System.out.println(x); //Else doesnt work..
//	}}
//		
//	
//	 
//	 
//}
	}

}
