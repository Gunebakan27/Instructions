package day04concanitationandifstatement;

import java.util.Scanner;

public class IfStatement03 {

	/*
	 *Type code to print the seasons after getting month names from user
	 */
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a month name...");
		String monthName=scan.next();
		
		if(monthName.equalsIgnoreCase("December")||monthName.equalsIgnoreCase("January")||monthName.equalsIgnoreCase("February")) {
		System.out.println(monthName + " is in winter");
		}
		else if(monthName.equalsIgnoreCase("March")||monthName.equalsIgnoreCase("April")||monthName.equalsIgnoreCase("May")) {
		System.out.println(monthName+" is in Spring");	
		}
		else if(monthName.equalsIgnoreCase("June")||monthName.equalsIgnoreCase("July")||monthName.equalsIgnoreCase("August")) {
			System.out.println(monthName+" is in Sommer");	
			}
		else if(monthName.equalsIgnoreCase("September")||monthName.equalsIgnoreCase("November")||monthName.equalsIgnoreCase("October")) {
			System.out.println(monthName+" is in Fall");	
			}
		else {
			System.out.println("Are you ok?");
		}
		
		scan.close();
	}

}
