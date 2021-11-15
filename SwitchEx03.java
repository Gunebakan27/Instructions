package day06nestedternary;

import java.util.Scanner;

public class SwitchEx03 {

	public static void main(String[] args) {
//		Type java code by using switch statement.
//		A school has following rules for grading system:
//		1. For 50 - C 2. For 80 - B. 4. For 100 - A
//		Ask user to enter marks and print the corresponding grade.
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter you note..");
		int note=scan.nextInt();
		switch(note) {
		case (100):
			System.out.println("Your Note is: A");
		break;
		case (80):
			System.out.println("Your Note is: B");
		break;
		case (50):
			System.out.println("Your Note is: C");
		break;
	
		}
		scan.close();
	}

}
