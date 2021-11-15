package day06nestedternary;

import java.util.Scanner;

public class ReviewQ5 {

	public static void main(String[] args) {
//		Ask user to enter a word which has 4 letters and output will be inverse of the word.
//		For example; if user enters “MARK” output will be “KRAM”
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a 4 digit word");
		String word=scan.next();
		System.out.println(""+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));
		
//		Ask user to enter a String and output will be the number of the characters in the String.
		System.out.println("Enter a String");
		String numOfChar=scan.next();
		System.out.println(numOfChar.length());
		scan.close();
	}

}
