package day10loops;

import java.util.Scanner;

public class Whileloop06 {

	public static void main(String[] args) {

		/*
		 * Get string from user and print just vowels(a,e,i,o,u) inside the string on the console
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String...");
		String s=scan.nextLine();
		
		int idx=0;
		s=s.toLowerCase();
		int counter=0;		
		while(idx<s.length()) {
			char c=s.charAt(idx);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				counter++;
		
				System.out.print(c+" ");
			}
			
			idx++;
		}
		System.out.println();
		System.out.println(counter);
		

//		int idx=0;
//		
//		while(idx<s.length()) {
//			
//			char c=s.charAt(idx);
//			if(c=='a'||c=='i'||c=='o'||c=='u'||c=='e');
//			System.out.println(c);
//			}
//			
//			idx++;
//			
		scan.close();
		}
	}
		


	
	


