package day10loops;

import java.util.Scanner;

public class WhileLoop05 {

	public static void main(String[] args) {

		/*
		 * Ask user enter the number of rows to create following image
		 * if user gives you 4
		 * A1
		 * AB2
		 * ABC3
		 * ABCD4
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of rows...");
		int num=Math.abs(scan.nextInt());
		
		char c='A';
		int i=1;
		while(i<=num) {
			for(int j=1;j<=i;j++) {
				System.out.print(c);
				c++;
				
			}
			System.out.println(i);
			c='A';
			i++;
		}


//		int i=1;
//		
//		char c='A';
//		while(i<=num) {
//			
//			for(int j=1;j<=i;j++) {
//				
//				System.out.print(c);
//				c++;
//			}
//		
//			c='A';
//			System.out.println(i);
//			i++;
//		}
		
		scan.close();
	}

}
