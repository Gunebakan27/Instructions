package day11loops;

import java.util.Scanner;

public class DoWhileLoop04 {

	public static void main(String[] args) {
/*
 * Username is "admin", Password is"pwd123"
 * Ask user to enter username and password
 * "Enter your username and password"
 * If he enters correct credentials he should get "You are in your account!" message
 * otherwise, he should see "Enter your username and password" messages 3 time´s
 * After 3 times he should get"Your account is blocked!"
 */
		Scanner scan=new Scanner(System.in);
		
		
		int count=0;
		do {
			if(count==3) {
			System.out.println("Your account is blocked");
			break;
			}
			System.out.println("Enter your user name: ");
			String username=scan.next();
			System.out.println("Enter your password: ");
			String pwd=scan.next();
			
			if(username.equals("admin")&& pwd.equals("password")) {
				System.out.println("You are in your account");
				break;
			}
		count++;	
			
		}while(count<3);
		
//		
//		String userName="";
//		String passWord="";
//		int counter=0;
//	
//		do {
//			if(counter==3) {
//				System.out.println("Your account is blocked!");
//				
//				break;
//			}
//			
//			System.out.println("Enter your username and password");
//			userName=scan.next();
//			passWord=scan.next();
//			
//		if(userName.equals("admin")&&passWord.equals("pwd123")) {
//			System.out.println("You are in your account!");
//				break;
//		}
//	
//			counter++;
//		}while(true);
//		

	scan.close();	
	}

}
