package day06nestedternary;

import java.util.Scanner;

public class ReviewQ08 {

	public static void main(String[] args) {
//		Ask user to enter his/her first name, last name and Social Security Number.
//		Then type a program which makes
//		a) initials of the first name and the last name in uppercase,
//		other characters will be in lowercase.
//		b) all characters except last 4 characters of the Social Security Number “ * ”.
//		For example; Suleyman Alptekin *****5678
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your Firstname: ");
		String f=scan.nextLine();
		System.out.println("Enter yyour last name: ");
		String l=scan.next();
		System.out.println("Enter your SSN: ");
		String s=scan.next();
		System.out.println(f.substring(0,1).toUpperCase()+f.substring(1).toLowerCase()+" "+
				l.substring(0, 1).toUpperCase()+l.substring(1).toLowerCase()+" "+
				"******"+s.substring(5));
	scan.close();
	
		
	}

}
