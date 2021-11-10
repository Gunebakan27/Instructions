package day03scannerincrementdecrement;

import java.util.Scanner;

public class ModulusOperator01 {

	//When do we need remainder in division operation we use "modulus operator"
	//The symbol of modulus operator is "%"
	
	public static void main(String[] args) {

		/*
		 Ask user to enter two integer values, the first will be greater than the second.
The remainder when you divide the first by the second will be the width, 
and the sum of the two numbers will be the length of a rectangle. 
Then calculate the area and the perimeter of the rectangle, and print them 
on the console.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 Integers, make the first greater..");
		int bigInt=scan.nextInt();
		int smallInt=scan.nextInt();
		
		int width=bigInt%smallInt;
		int length=bigInt+smallInt;
		
		System.out.println("Area is: "+width*length);
		System.out.println("Perimiter is: "+(width+length)*2);
		
		scan.close();
		
		
	}

}
