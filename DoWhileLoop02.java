package day11loops;

import java.util.Scanner;

public class DoWhileLoop02 {

	public static void main(String[] args) {
//		Ask user to enter an integer.
//		  If the integer is less than 100, tell user “Won!”
//		  Otherwise tell user “Lost!”
	
		Scanner scan=new Scanner(System.in);
		
		int i=0;
		int num=145;
		
		do {
			System.out.println("Enter an integer");
			i=scan.nextInt();
			
			if(i>num) {
				System.out.println("Enter a smaller number");
			}else if(i<num) {
					System.out.println("Enter a bigger number");
			}
						
		}while(i<num||i>num);
		System.out.println("Bravo!!");
		
	
//		Scanner scan=new Scanner(System.in);
//		
//		int n=0;
//	
//		do {
//			System.out.println("Enter an integer");
//			n=scan.nextInt();
//			
//			if(n<100) {
//				System.out.println("Won!");
//			}
//			
//		}while(n<100);
//		System.out.println("Lost!");
//		
		scan.close();	
		
		
		
	}

}
