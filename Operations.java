package practice;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		/* * ask user to enter 2 int numbers then ask user to enter which operator they        
		 * want to use if addition then print here is the sum of your operation 7 + 4=         
		 * * 11 Test data: Addition Subtraction Division Multiplication        
		 *  */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type 2 numbers!");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		System.out
				.println("Please provide your operation as 'addition'/ 'subtraction' / 'division' or 'multiplication'");
		String operation = scan.next().toLowerCase();
		
		
		if(operation.equals("addition")) {
			 addition( n1, n2);
		}else if(operation.equals("subtraction")) {
			
			subtraction(n1,n2);
		}else if(operation.equals("division")) {
			division( n1,  n2);
		}else if(operation.equals("multiplication")) {
			
			multiplication(n1,n2);
			
		}else {
			System.out.println("You may have a wrong operation");
		}
	}
	public static void addition(int n1, int n2) {
		System.out.println("here is your operation: " + (n1 + n2));
	}
	public static void subtraction(int n1, int n2) {
		System.out.println("here is your operation: " + (n1 - n2));
	}
	
	public static void division(int n1, int n2) {
		System.out.println("here is your operation: " + (n1 / n2));
	}
	
	
	public static void multiplication(int n1, int n2) {
		System.out.println("here is your operation: " + (n1 * n2));
		
		
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter two numbers..");
//		int n1=scan.nextInt();
//		int n2=scan.nextInt();
//		
//		System.out.println("Which operation do you want to use?");
//		System.out.println("press 1 for addition,"
//				+ " press 2 for subtraction"
//				+ "press 3 for division"
//				+ "press 4 for multiplication");
//		int opp=scan.nextInt();
//		
//		if(opp==1) {
//			add(n1, n2);
//		}
//			
//			else if(opp==2) {
//				sub(n1, n2);
//				
//			}else if(opp==3) {
//				div(n1, n2);
//				
//			}else if(opp==4) {
//				mul(n1, n2);
//				
//			}
//			
//		}
//
//	private static void add(int a, int b) {
//		int result=a+b;
//		System.out.println(result);
//		
//	}
//	private static void sub(int a, int b) {
//		int result=a-b;
//		System.out.println(result);
//		
//	}
//	private static void div(int a, int b) {
//		int result=a/b;
//		System.out.println(result);
//		
//	}
//	private static void mul(int a, int b) {
//		int result=a*b;
//		System.out.println(result);
		
	}

}
