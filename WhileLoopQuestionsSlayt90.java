package day10loops;

//import java.util.Scanner;

public class WhileLoopQuestionsSlayt90 {

	public static void main(String[] args) {
		
		String[] cars = {"Volvo", "BMW", "Ford"};
		for
		 (String i : 
		cars
		) {
		  System.out.println(i);
		}
//	1) Type java code by using while loop,
//	Write a program to print numbers from 1 to 5.
		
//		int i=1;
//		while(i<7) {
//			System.out.print(i+" ");
//			i++;
//		}
////	2)Type java code by using while loop,
////	Write a program that prompts the user to input a positive integer.
////	It should then print the multiplication table of that number.
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter a positive integer..");
//		int num=scan.nextInt();
//		
//		int j=1;
//		while(j<11) {
//			System.out.println(num+"x"+j+"="+num*j);
//			j++;
//		}
//		
//	3)Type java code by using while loop.
//	Write a program that types first 30 consecutive odd integers.
//		
//		int odd=0;
//		int counter=0;
//		
//		while(odd<=61) {
//				
//				if(odd%2!=0) {
//					System.out.print(odd+" ");
//					
//					counter++;	
//				}
//				odd++;
//		}
////		
		int counter=0;
		int i=0;
		while(counter<30) {
			if(i%2!=0) {
				System.out.print(i+" ");
		counter++;
			}
			i++;
		}
		System.out.println();
		System.out.println(counter);
//	
		
//	4)Type java code by using while loop,
//	Write a program that prompts the user to input a positive integer.
//	It should then print factorial of that number.
		
//		{
//	5)Type java code by using while loop,
//	Write a program to count the factors of an integer which is entered by user.
		
		
//	6)Type java code by using while loop,
//	Write a program that prompts the user to input an integer.
//	It should then find sum of the digits of that number.

//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter a positive integer");
//		int num=scan.nextInt();
//		
//		int sum=0;
//		while(num!=0) {
//			sum=sum+num%10;
//			num=num/10;
//					
//		}
//System.out.println(sum);
	}

}
