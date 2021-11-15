package day06nestedternary;

import java.util.Scanner;

public class ReviewQ07 {

	public static void main(String[] args) {
//		Ask user to enter password, if the password is okay for the following conditions output will be
//		“Your password is created successfully.” If the password is not okay for any of the following conditions
//		Output will be “Enter a new password according to the give conditions”
//		1.First letter must be uppercase
//		2.Last letter must be lowercase
//		3.Password must contain 6 characters
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a password with the following conditions:\n"
		+ "1.First letter must be uppercase\n"
				+ "2.Last letter must be lowercase\n"
				+ "3.Password must contain 6 characters\n");
		String psw=scan.next();
		if((psw.length()==6) && (psw.charAt(0)<='Z') && (psw.charAt(0)>='A') && (psw.charAt(psw.length()-1)>='a')
		&& (psw.charAt(psw.length()-1)<'z')){
			System.out.println("Your password is created successfully");
		}else {System.out.println("Enter a new password according to the give conditions");
		
		scan.close();
		
	}

}
}