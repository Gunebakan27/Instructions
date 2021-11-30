package day16arraysforeachloop;

import java.util.Arrays;


public class Arrays03 {

	//Check if a specific element exists in an array
	
	public static void main(String[] args) {
		
		int arr[]= {-1,2,3,4,2};
		
		int expEl=2;
		int counter=0;
		for(int i=0;i<arr.length;i++) {
			if(expEl==arr[i]) {
			counter++;
			break;
			}}
		
			if(counter==1) {
				System.out.println("yes");
			}else {System.out.println("no");
			
			}
//2. Way
			Arrays.sort(arr);
			System.out.println("Result: "+Arrays.binarySearch(arr, expEl));
			
//		int arr[]= {36,12,21,34,21};
//		
//		//1.Way:
//		int expectedElement=21;
//		int counter=0;
//		for(int i=0;i<arr.length;i++) {
//			if(expectedElement==arr[i]) {
//				counter++;
//				break;
//			}
//		}
//		if(counter==1) {
//			System.out.println(expectedElement+" exist in the array");
//		}else {
//			System.out.println(expectedElement+" does not exist in the array");
//		}
			
	//2. Way:
	//a) binaraySearch() returns the index of the expected element if the element exist
	//b) binaraySearch() returns negative integers for non-existing elements. The value represents the order number
	//if the element exist
	//c) before using binaraySearch() you have to use "sort" method. otherwise the output you got does not have any meaning
	//d) binaraySearch() does not give stable outputs for repeated values		
//		Arrays.sort(arr);
//		System.out.println("Result: "+Arrays.binarySearch(arr, expectedElement));
//			
//			
			
			
		}
	}


