package day03scannerincrementdecrement;

import java.util.Scanner;

public class Day03Homeworks {

	public static void main(String[] args) {

		//Write a program to assign a value of 100.235 to a double variable
		//and then convert it to int. Print it on the console.
		double n1=100.235;
		int n2 =(int)n1;
		System.out.println(n2);
		
	//Write a program to add an integer variable having value 5
	//and a double variable having value 6.2. Print the sum on the console.
		int i1=5;
		double d1=6.2;
		System.out.println(i1+d1);
		
	//Create an integer variable and increase it by 1, by using three different ways,
	//then type every result on the console.
		int i2=6;//6
		int i3=(i2+1);//7
		System.out.println(i2);
		System.out.println(i3);
		i3 ++;//8
		System.out.println(i3);
		i3 +=1;//9
		System.out.println(i3);
	
	//Create an integer variable and decrease it by 1, by using three different ways,
	//then type every result on the console.
		int i4=10;
		int i5=(i4-1);//9
		System.out.println(i5);
		i5--;//8
		System.out.println(i5);
		i5-=1;//7
		System.out.println(i5);
		
	/*
	 Type a program like;
Ask user to enter two integer values, the first will be greater than the second.
The remainder when you divide the first by the second will be the width,
and the sum of the two numbers will be the length of a rectangle.
Then calculate the area and the perimeter of the rectangle, and print them
on the console.
	 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter two integer values, the first will be greater than the second.. ");
		System.out.println(("First value? "));
		double first=scan.nextDouble();
		System.out.println("Second value (smaller than first)...");
		double second=scan.nextDouble();
		double width = first%second;
		double length = first+second;
		System.out.println("Area of Rectangle is: "+ width*length);
		System.out.println("Perimeter of Rectangle is: "+2*(width+length));
		
//Ask user to enter two integer values. Write a Java Program to swap
//two numbers by using the third variable.
		System.out.println("Enter first integer:  ");
		int v1=scan.nextInt();
		System.out.println("Enter second integer:  ");
		int v2=scan.nextInt();
		System.out.println("Before swap: "+v1+"-"+v2);
		
		int temporary=0;
		temporary=v1;
		v1=v2;
		v2=temporary;
		System.out.println("After swap: "+v1+"-"+v2+"-"+temporary);
		
		//Ask user to enter two integer values. Write a Java Program to swap
		//two numbers without using the third variable.
		System.out.println("Enter first integer:  ");
		int s1=scan.nextInt();
		System.out.println("Enter second integer:  ");
		int s2=scan.nextInt();
		System.out.println("Before swap: "+s1+"-"+s2);
		
		s1=s1+s2;
		s2=s1-s2;
		s1=s1-s2;
		System.out.println("After swap: "+s1+"-"+s2);
		
		scan.close();
				
		
		
		
	}

}
