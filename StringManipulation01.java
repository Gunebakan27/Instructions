package day08loops;

import java.util.Scanner;

public class StringManipulation01 {

	public static void main(String[] args) {

//		Ask user to enter SSN (9 digits)
//	     Print the SSN on the console after converting first 5 digits to *
//	     Ex: 123456789 ==> *****6789	

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your SSN");
		String ssn=scan.next();
		
		String las4Digits=ssn.substring(5);
		String first5Digits="*****";
		System.out.println(first5Digits+las4Digits);
		
		
		scan.close();
	}

}
