package day06nestedternary;

import java.util.Scanner;

public class SwitchEx04 {

	public static void main(String[] args) {
//		Ask user to enter one of the ‘U’, ’S’, and ‘A’.
//		Then type a program by using “switch statement” to print “United” for ‘U’
//		”States” for ’S’, and “America” for ‘A’
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter one of the 'U', 'S', and 'A'");
		char a=scan.next().charAt(0);
		switch (a) {
		case ('U'):
			System.out.println("United");
		break;
		case ('S'):
			System.out.println("States");
		break;
		case ('A'):
			System.out.println("America");
		}
		scan.close();
	}

}
