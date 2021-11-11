package day04concanitationandifstatement;

import java.util.Scanner;

public class IfStatement01 {
/*
 "If it rains, I will cancel the picnic." in English
 "if (it rains) {I will cancel the picnic}" in Java
 
 Note: The code to check if a number is an even or not, you will use number%2==0
 */
	public static void main(String[] args) {

		
		//1. Example: Get a number from user. If the number is even, print "Even" on the console.
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an Integer...");
		int num=scan.nextInt();
		System.out.println("Enter one more integer..");
		int num2=scan.nextInt();
		
		
		if(num%2==0) {
			System.out.println(num + " is Even");
	
			//2. Example: Get a number from user. If the number is odd, print "Odd" on the console.	
		}
		if(num%2!=0) {
			System.out.println(num + " is Odd");
			
		}
		
		//3. Example: Get 2 numbers from user. If they equal to each other, print "square" on the console.
		if(num==num2) {
			System.out.println("Square, because "+num+"="+num2);
			
		}
		
	scan.close();
		
	}
	}
	
