package day01variables;

import java.util.Scanner;

public class NestedTernary {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int year=scan.nextInt();
		
		System.out.println("Enter a year");
		
		// Structure ()?():();
		
		System.out.println((year%100==0)?( (year%400==0)?("Leap Year"):("Not leap year")):(year%4==0)?("yeap year"):("not leap year"));
scan.close();
			

	}

}
