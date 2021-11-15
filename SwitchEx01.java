package day06nestedternary;

import java.util.Scanner;

public class SwitchEx01 {
	
	public static void main(String[] args) {
//		If the user pressed 1, 2, 3 the program will print the number that is pressed;
//		otherwise, program will print "Not allowed".
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number..");
		int num=scan.nextInt();
		switch (num) {
		case 1:
			System.out.println("It is one");
			break;
		case 2:
			System.out.println("It is two");
			break;
		case 3:
			System.out.println("It is three");
			break;
			default:
				System.out.println("Not allowed");
		}
		scan.close();

	}

}
