package day06nestedternary;

import java.util.Scanner;

public class Switch01 {
/*
 If you have many conditions, prefer to use switch instead of "if-else-if".
 */
/*
Type a code to print the day names when the day number is entered.
 
 */
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter day number..");
		int dn=scan.nextInt();
		
		switch(dn) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
					
		}
		
		
		int dayNumber=scan.nextInt();
		
		switch(dayNumber) {
		case 1:
			System.out.println("Sunday");
			break;// takes you outside the switch statement
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default: //is like "else" in if statement.
			System.out.println("Are u Ok?");
		
		}

		
		scan.close();
		
		
	}

}
