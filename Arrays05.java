package day16arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {

	public static void main(String[] args) {
// Find the longest word in a String
		
		String s= "Ali Can went to school to learn";
		String words[]=s.split(" ");
		System.out.println(Arrays.toString(words));
		
		Arrays.sort(words, Comparator.comparingInt(String::length).reversed());
		System.out.println(Arrays.toString(words));
		System.out.println(words[0]);

//		String s="Ali Can went to school to learn";
//		String words[]=s.split(" ");
//		System.out.println(Arrays.toString(words));
//		
//		Arrays.sort(words, Comparator.comparingInt(String::length));
//		System.out.println(Arrays.toString(words));//[to, to, Ali, Can, went, learn, school]
//		
//		System.out.println(words[words.length-1]);
		
	//Get just the year from date in the "mm/dd/yyy" format
		String date="10/10/2010";
		String year[]=date.split("/");
		System.out.println(year[year.length-1]);
		
//		String date="22/10/2021";
//		String year[]=date.split("/");
//		
//		System.out.println(year[2]);
//		
//	//Get the initials of the student names
		String t="Ali Can, Veli Han, Mary Star went to school by bus";
		String u[]=t.split(", ");
		
		String initials="";
		for(int i=0;i<u.length;i++) {
			int idx=u[i].indexOf(" ");
			initials=u[i].substring(0, 1)+u[i].substring(idx+1, idx+2);
			System.out.print(initials+" ");
		}
		
	
//		String u[]=t.split(", ");//[Ali Can, Veli Han, Mary Star went to school by bus]
//		System.out.println(Arrays.toString(u));
//		String initials="";
//		
//		for(int i=0;i<u.length;i++) {
//			int idx=u[i].indexOf(" ");
//			initials=u[i].substring(0, 1)+u[i].substring(idx+1, idx+2);
//		System.out.print(initials+" ");
//		}
//		

	}

}
