package day19arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {

	public static void main(String[] args) {
		
//		Ask user to enter a letter
//	 	If the letter exists in list1 convert it to “Got it”
//	 	otherwise add the element which user entered into the list1
//		
		List <String>list1=new ArrayList<>();
		list1.add("A");
		list1.add("M");
		list1.add("C");
		list1.add("K");
		list1.add("B");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a letter..");
		String letter=scan.next();
		
		if(list1.contains(letter)) {
			list1.set(list1.indexOf(letter), "Got it");
		}else {list1.add(letter);
		
	
		}
			
		System.out.println(list1);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter a letter..");
//		String s=scan.next();
//		
//		List<String>list=new ArrayList<>();
//		list.add("M");
//		list.add("K");
//		list.add("P");
//		
//		if(list.contains(s)) {
//			list.set(list.indexOf(s), "Got it");
//		}else {
//			list.add(s);
//			
//		}
//		System.out.println(list);
//		
//		scan.close();
	}

}
