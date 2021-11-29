package day15arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {

	//create a String Array and print the elements in alphabetical order on the console in different lines
		
//		String sArr[]=new String[5];
//		System.out.println(Arrays.toString(sArr));
//		sArr[0]="Ali";
//		sArr[1]="Bekir";
//		sArr[2]="Zehra";
//		sArr[3]="Yasin";
//		sArr[4]="Mary";
		
		String arr[]= {"Ali","Veli","Deli"};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
//		String sArr[]= {"Ali", "Yasin", "Bekir", "Mary", "Zehra"};
//		System.out.println(Arrays.toString(sArr));
////How to sort Array elements
//		Arrays.sort(sArr);
//		System.out.println(Arrays.toString(sArr));
//		
//		for(int i=0;i<sArr.length;i++) {
//			System.out.println(sArr[i]);
//		}
//		for(int i=sArr.length-1;i>=0;i--) {
//			System.out.println(sArr[i]);
//		}



		
	}

}
