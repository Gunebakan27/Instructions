package day17foreachloopmultidimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class ForEachLoop01 {

	public static void main(String[] args) {

		//1.Ex: Find the vowels in a String by using arrays
		String s="Learn Java, earn money.";
		
		
		String[] words=s.split(" ");
		System.out.println(Arrays.toString(words));
		
		System.out.println(words.length);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String s="Learn Java, earn money.";
//		String chars[]=s.split("");
//		System.out.println(Arrays.toString(chars));
//		
//		for(String w:chars) {
//			if(!(w.equalsIgnoreCase("a")||w.equalsIgnoreCase("a")||w.equalsIgnoreCase("e")||w.equalsIgnoreCase("i")||
//					w.equalsIgnoreCase("o")||w.equalsIgnoreCase("u"))) {
//				System.out.print(w+" ");
//			}
//		}
//		System.out.println();
//		//2.Ex: Print the words ending with "n"
//		String t="Learn Java, earn! money.";
//		t=t.replaceAll("\\p{Punct}", "");
//		System.out.println(t);
//		
//		String n[]=t.split(" ");
//		
//		for(String w:n) {
//			if(w.endsWith("a")) {
//				System.out.print(w+" ");
//			}
//		}
//		System.out.println();
////3. Ex: Find the sum of the digits of an integer given by user by using arrays
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter an integer..");
//		String num=scan.next();
//		String digits[]=num.split("");
//		System.out.println(Arrays.toString(digits));
//		int sum=0;
//		for(String w:digits) {
//			sum=sum+Integer.valueOf(w);
//		}
//		System.out.println(sum);
	}

}
