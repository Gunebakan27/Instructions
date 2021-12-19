package practice;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {

		//1.Ask user to enter a word. If the word has odd number of characters 
		//length() of characters		
		//and has 3 or more characters, print the character in the middle of the word.
		//Ali--> l
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word..");
		String s=scan.next();
		
		if(s.length()%2==1) {
			System.out.println("The middle character of word is: "+s.charAt(s.length()/2));
		}else {
			System.out.println("It is an even number..");
		}
		
		
	}

}
