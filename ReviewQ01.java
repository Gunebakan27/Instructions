package day06nestedternary;

import java.util.Scanner;

public class ReviewQ01 {

	public static void main(String[] args) {
//		Ask user to enter an integer, if it is less than 10, calculate its square and print it on the console.
//		If it is greater than 10 multiply it by 2 and print it on the console. Otherwise keep the number same
//		and print it on the console.
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an integer..");
		int num=scan.nextInt();
		System.out.println(num<10?(num*num):num>10?(num*2):num);
scan.close();
}
}