package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {

	public static void main(String[] args) {

//Get the array elements from user and create an array
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements..");
		int length=scan.nextInt();
		String arr[]=new String[length];
		
		for(int i=0;i<length;i++) {
			System.out.println("Enter an element..");
			arr[i]=scan.next();			
		}
		System.out.println(Arrays.toString(arr));
	
//		System.out.println("Enter the length of the array..");
//		int length=scan.nextInt();
//		
//		String sArr[]=new String[length];
//		
//		for(int i=0;i<length; i++) {
//			System.out.println("Enter " + (i+1)+". element");
//			sArr[i]=scan.next();			
//		}
//		System.out.println(Arrays.toString(sArr));
////Make 2nd element 1st, 1st element last, last element 2nd.
////[Ali, Veli, Samil]==> [Veli, Samil, Ali]
		String arrNew[]=new String[length];
		arrNew[0]=arr[1];
		arrNew[length-1]=arr[0];
		arrNew[1]=arr[length-1];
		
	
		for(int i=0;i<length;i++) {
			
			if(i==0||i==1||i==length-1) {
				continue;
			}
			arrNew[i]=arr[i];
		}
		
		System.out.println(Arrays.toString(arrNew));
		
//		String sArrNew[]=new String[length];
//		sArrNew[0]=sArr[1];
//		sArrNew[length-1]=sArr[0];
//		sArrNew[1]=sArr[length-1];
//		
//		for(int i=0;i<length;i++) {
//			
//			if(i==0||i==1||i==(length-1)) {
//				continue;
//			}
//			sArrNew[i]=sArr[i];
//		}
//	
//		System.out.println(Arrays.toString(sArrNew));
		
		
		
		
	}

}
