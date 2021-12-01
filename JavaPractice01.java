package day17foreachloopmultidimensionalarray;

import java.util.Scanner;

public class JavaPractice01 {

	public static void main(String[] args) {
//Find the factorial of a number
//4!=4*3*2*1=24
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter a number to calculate the factorial");
//		int num=scan.nextInt();
//		
//		int mul=1;
//		
//		for(int i=num;i>0;i--) {
//			mul=mul*i;
//		}
//		System.out.println(mul);
		
//Print "Boom" if the digit 7 is displayed in an array
//		{1,3,7}->"Boom"
//		{1,3,27}->"Boom"
//		{1,4,6}->"There is no 7 in the array"
		
//		int[] arr= {2,15,9};
//		int flag=0;
//		
//		for(int i=0;i<arr.length;i++) {
//			int temp=arr[i];
//			String temp_string=String.valueOf(temp);
//			if(temp_string.contains("7")) {
//				System.out.println("Boom");
//				flag=1;
//				break;	
//			}
//		
//		}
//		if(flag==0) {
//		System.out.println("no 7");
//	}
	
//Find the highest common factor of 2 numbers
// 12= 1,2,3,4,6,12
		
// 6=1,2,3,4,6
		//it is: 6		
//12%1=0
//12%2=0
//12%3=0
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter first number");
//		int num1=scan.nextInt();
//		System.out.println("Enter second number");
//		int num2=scan.nextInt();
//		
//		int hcf=0;
//		for(int i=1;i<=num1||i<=num2;i++) {
//			if(num1%i==0&&num2%i==0) {
//				hcf=i;
//			}
//			
//		}
//
//		System.out.println(hcf);
		
		//Find the n vowels in a sentence
		//"elanur Selcuk"-5 vowels
		//print the first 2 vowels-ea
		//print the first 4 vowels -eaue
		
		String str="elanur Selcuk";
		int n=4;
		String vowel="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vowel = vowel+str.charAt(i);
			}
			if(vowel.length()==n) {
				break;
			}
		}
		System.out.println(vowel);
		//or without if
		//System.out.println(vowel.substring(0,n));
		
	}
}
