package day06nestedternary;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {

//		Write a Java program user will choose answer among A, B, C, or D.
//		If the answer is true, output will be “True.” If the answer is false, output will be
//		“False”. Correct answer is ‘C’ for the multiple option question.
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your answer..");
		char a=scan.next().toLowerCase().charAt(0);
		switch (a) {
		case ('a'):
			System.out.println("False");
		break;
		case('b'):
			System.out.println("False");
		break;
		case ('c'):
			System.out.println("True");
		break;
		case ('d'):
			System.out.println("False");
		break;
		}
		scan.close();
	}

}
