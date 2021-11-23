package day11loops;

import java.util.Scanner;

public class day11Questions {

	public static void main(String[] args) {
//	1) Write a program to print numbers from 1 to 5 on the console by using do-while loop.
		int i=1;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<6);

System.out.println();
//	2)Write a program to print numbers from 10 to 3 on the console by using do-while loop.
		int j=10;
		do {
			System.out.print(j+" ");
			j--;
		}while(j>2);
System.out.println();	
//3)	Write a program to print numbers which are divisible by 5 between 1 and 100 on the console
//	by using do-while loop.
		
		int k=1;
		do {
			if(k%5==0) {
			System.out.print(k+" ");
			}
			k++;
		}while(k<111);
System.out.println();		
//	4) Write a program to print letters from c to m on the console by using do-while loop.

char c='c';
do {
System.out.print(c+" ");
c++;
}while(c<'n');
System.out.println();
//	5) Ask user to enter a number.
//	If the number is divisible by 10 then print "Won!" on the console
//	otherwise ask user to enter another number.
//	Use do-while loop.

Scanner scan=new Scanner(System.in);

//int num=0;
//do {
//	System.out.println("Enter a number: ");
//	num=scan.nextInt();
//	if(num==10) {
//		System.out.println("Won!");
//	}
//	
//}while(num!=10);

System.out.println();
//	6) Ask user to enter a name.
//	If the name contains the letter ‘a’ then print "Won!" on the console
//	otherwise ask user to enter another name.
//	Use do-while loop.
//String name="";
//do {
//	System.out.println("Enter a name:");
//	name=scan.next().toLowerCase();
//
//	if (name.contains("a")) {
//		System.out.println("Won!");
//		break;
//	}
//}while(true);

//	7)Ask user to enter a String
//	Print the characters whose indexes are odd on the console
//	For example; Germany ==> e m n

int odd=0;
String oddC="";
System.out.println("Enter a string: ");
oddC=scan.next();
	
do {
	if(odd%2!=0) {
		System.out.print(oddC.charAt(odd)+" ");
	}
	odd++;
}while(odd<oddC.length());

//String str="";
//System.out.println("Enter a string:");
//str = scan.next();
//int counter = 0;
//do {			
//	
//	if (counter%2!=0) {
//			System.out.print(str.charAt(counter) + " ");;
//	}
//	counter++;
//} while (counter<str.length());		
//scan.close();

	}

}
