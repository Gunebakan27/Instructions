package day17foreachloopmultidimensionalarray;

import java.util.Scanner;

public class JavaPractice {

	public static void main(String[] args) {
		// We want to input two numbers in the console and we should get the sum ten the
		//console should want for the next two numbers to be inputed
		// if we give it then it should added
		// but if we give a Number "1" then it should continue the loop.
		
		Scanner scan=new Scanner(System.in);
		int flag=0;
		do {
		System.out.println("Enter first number");
		int num1=scan.nextInt();
		System.out.println("Enter second number");
		int num2=scan.nextInt();
		System.out.println("Sum is: "+(num1+num2));
		System.out.println("Continue? YES press 1, else another key");
		flag=scan.nextInt();

		}
		while(flag==1);
		System.out.println("It is finished");
	    // Input two parameters (start, stop), and print the sum of all even numbers
		System.out.println("Enter start number:..");
		int start=scan.nextInt();
		System.out.println("Enter the last number..");
		int last=scan.nextInt();
		int sum=0;
		for(int i=start;i<=last;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println("Sum is: "+sum);
	}

}
