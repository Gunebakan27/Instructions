package day10loops;

import java.util.Scanner;

public class WhileLoop03 {

	public static void main(String[] args) {

		//Type code to find the sum of the digits of an integer.
//		123===> 1+2+3=6
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an integer to find the sum of digits...");
		int num=scan.nextInt();
		
		if(num<0) {
			num=-1*num;
		}
		
		int sum=0;
		while(num!=0) {
			sum=sum+num%10;
						
			num=num/10;
		}
		System.out.println(sum);
						
//		if(num<0) {
//			num=-1*num;
//		}
//		int sum=0;
//		
//		while(num!=0) {
//			sum=sum+num%10;
//			num=num/10;
//		}
//		System.out.println(sum);
		
		scan.close();
	}

}
