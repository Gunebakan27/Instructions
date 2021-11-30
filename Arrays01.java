package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
//Check if 2 arrays are same or not
//If 2 arrays are same; same elements must be in the same index.
		
		int arr1[]= {1,2,4};
		int arr2[]= {1,2,3};
		
		int counter=0;
		if(arr1.length==arr2.length) {
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				counter++;
				break;
			}
				
			}
		if(counter==1) {
			System.out.println("not same");
		}else {
			System.out.println("Same");
		}
		}else {
			System.out.println("not same");
		}
		
		boolean isSame=Arrays.equals(arr1, arr2);
		if(isSame) {
			System.out.println("Same");
		}else {System.out.println("not same");
		
		}
	
		
//		
//		int arr1[]= {5,12,32,11};
//		int arr2[]= {5,12,32,11};
//	//1.Way: 	
//		int counter=0;
//		
//		if(arr1.length==arr2.length) {
//					
//		for(int i=0;i<arr1.length;i++) {
//			
//			if(arr1[i]!=arr2[i]) {
//				counter++;
//				break;
//			}
//		}
//		if (counter==1) {
//			System.out.println("Arrays are not same");
//		}else{System.out.println("Arrays are same");}
//		
//	}else {
//		System.out.println("Arrays are not same");
//	}
//		
//	//2.Way: There is a build in method in Arrays Class to check if the arrays are same or not
//		boolean isSame=Arrays.equals(arr1, arr2);
//		if(isSame)
//	{System.out.println("Arrays are same");
//		
//	}else {
//		System.out.println("Arrays are not same");
//	}
		
		
		}

}
