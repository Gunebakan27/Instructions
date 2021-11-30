package day16arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {

	public static void main(String[] args) {
		//Type code to find the number of words in a String
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String s=scan.nextLine();
		
		String words[]=s.split(" ");
		System.out.println(Arrays.toString(words));
		System.out.println(words.length);
		
		int counter=0;
		for(int i=0;i<words.length;i++) {
			if(words[i].startsWith("a")) {
				counter++;
			}
		}
		if(counter==0) {
			System.out.println("no a");
		}else {
			System.out.println(counter+" a");
		}
	
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter String..");
//		String s=scan.nextLine();
////How to split a String by using any character
//		String words[]=s.split(" ");
//		System.out.println(Arrays.toString(words));//[Ali, Can, went, to, school]
//		System.out.println("The number of words is: "+words.length);
//	
//	//Count how many words starts with "a"
//		int counter=0;
//		for(int i=0; i<words.length;i++) {
//			if(words[i].startsWith("a")) {
//				counter++;
//			}
//		}
//		
//		System.out.println("The number of words start with a: "+counter);

		
	}

}
