package day06nestedternary;

import java.util.Scanner;

public class Switch02 {
/*
 Ask user to enter month number.
 Your code will print all month names starts with the month whose number is given by user.
 11==>November December

 
 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a month number..");
		
		//For whole numbers you can not use "long, boolean, double, float" in switch.
		int monthNumber=scan.nextInt();
		
		switch(monthNumber) {
		case 1:
			System.out.println("January");
		case 2:
			System.out.println("February");
		case 3:
			System.out.println("March");
		case 4:
			System.out.println("April");
		case 5:
			System.out.println("May");
		case 6:
			System.out.println("June");
		case 7:
			System.out.println("July");
		case 8:
			System.out.println("August");
		case 9:
			System.out.println("September");
		case 10:
			System.out.println("October");
		case 11:
			System.out.println("November");
		case 12:
			System.out.println("December");
		default:
			System.out.println("r u ok?");
			
		}

		scan.close();
	}

}
