package day15arrays;

import java.util.Arrays;

public class _Arrays03 {

	public static void main(String[] args) {
// [0,2,3,0,12,0] put the zeros to the end
		int arr[]={0,2,3,0,12,0,1};
		
		int brr[]=new int[arr.length];
		int idx=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]!=0) {
				brr[idx]=arr[i];
				idx++;
			}
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(brr));
	
//		int arr[]= {0,2,3,0,12,0,13,0,3,4};
//		int brr[]=new int[arr.length];
//		int idx=0;
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]!=0) {
//				brr[idx]=arr[i];
//				idx++;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(brr));
		
	}

}
