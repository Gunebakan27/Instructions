package day06nestedternary;

import java.util.Scanner;

public class ReviewQ4 {

	public static void main(String[] args) {
//		Ask user to enter his/her first and last name. If the first name is longer
//		output will be “First name is longer.” If the length of last name is equal
//		To the length of last name output will be “First name and last name
//		have same length.” Otherwise, output will be “Last name is longer”
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter you first name..");
		String fName=scan.nextLine();
		System.out.println("Enter you last name..");
		String lName=scan.nextLine();
		
		if(lName.length()<fName.length()) {
			System.out.println("First name is longer.");
		}else if(lName.length()==fName.length()) {
			System.out.println("They are same");
		}else {
			System.out.println("Last name is longer");
		}
		scan.close();
	}

}
