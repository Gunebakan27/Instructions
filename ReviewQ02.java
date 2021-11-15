package day06nestedternary;

import java.util.Scanner;

public class ReviewQ02 {

	public static void main(String[] args) {
//		Ask user to enter his kid’s name, if the name contains “a” output will be “This name contains ‘a’.”
//		if the name contains “z” output will be “This name contains ‘z’.” Otherwise, output will be
//		“This name contains neither ‘a’ nor ‘z’.”
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your kid's name..");
		String kid=scan.next().toLowerCase();
	
		
		System.out.println(kid.contains("a")?"This name contains ‘a’.":kid.contains("z")?"This name contains ‘z’.":
			"This name contains neither‘a’ nor 'z'.");
		scan.close();
	}

}
