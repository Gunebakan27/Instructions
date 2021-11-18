package day08loops;

public class ReviewLoop {

	public static void main(String[] args) {
//	1) Write a program to print counting numbers from 10 to 57 on the console by using for-loop.
		for(int i=10;i<58;i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
//	2) Write a program to print even counting numbers from 100 to 43 on the console by using for-loop.
		for(int i=100;i>42;i--) {
			System.out.print(i%2==0?(i+" "):"");
		}
		System.out.println();
//	3) Write a program to print odd counting numbers from 200 to 33 on the console by using for-loop.
		for(int i=200;i>32;i--) {
			System.out.print(i%2!=0?(i+" "):"");
		}
		System.out.println();
//	4) Write a program to add counting numbers from 23 to 57 by using for-loop.
//	Print the sum on the console
		int sum=0;
				
		for(int i=23;i<58;i++) {
			
			System.out.print((sum+=i)+" ");
		}
		System.out.println();
//	5)Write a program to multiply counting numbers from 7 to 15 by using for-loop.
//	Print the multiplication on the console
		int mul=1;
		
		for(int i=7;i<16;i++) {
			
			System.out.print((mul*=i)+" ");
		}
		System.out.println();
		
		
//	6)Write a program to print counting numbers which are less than 200 and divisible by 5
//	On the console by using for-loop.
		for(int i=1;i<200;i++) {
			System.out.print(i%5==0?i+" ":"");
		}
		
		
		
	}

}
