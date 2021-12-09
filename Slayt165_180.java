package day21accessmodifiersstringbuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//public class Slayt165_180 {
//
//	public static void main(String[] args) {
		
//1)		
//		String a = "";
//		a += 2;
//		a += 'c';
//		a += false;
//		if ( a == "2cfalse") 
//			System.out.println("==");
//		 if ( a.equals("2cfalse")) 
//			 System.out.println("equals");
//		
////2)
//		 List<String> list = new ArrayList<String> (); 
//		 list.add("one"); 
//		 list.add("two"); 
//		 list.add(7); 
//		 for(String s : list) 
//			 System.out.print(s);
		
//3)
//		ArrayList<Integer> values = new ArrayList<>(); 
//		values.add(4); 
//		values.add(5); 
//		values.set(1, 6); 
//		values.remove(0); 
//		for (Integer v: values) 
//			System.out.print(v);
//		
//4)
//		int[] random = { 6, -4, 12, 0, -10 }; 
//		int x = 12; 
//		int y = Arrays.binarySearch(random, x); 
//		System.out.println(y);
		
		
//180-1)
//		StringBuilder sb = new StringBuilder(); 
//		sb.append("aaa").insert(1, "bb").insert(4, "ccc"); 
//		System.out.println(sb);

//2)
//		String s1 = "java"; 
//		StringBuilder s2 = new StringBuilder("java"); 
//		if (s1 == s2)
//			System.out.print("1"); 
//		if (s1.equals(s2)) System.out.print("2");
		
//3)
//		String numbers = "012345678"; 
//		System.out.println(numbers.substring(1, 3)); 
//		System.out.println(numbers.substring(7, 7)); 
//		System.out.println(numbers.substring(7));
//		
		
//4))
//		int total = 0; 
//		StringBuilder letters = new StringBuilder("abcdefg"); 
//		total += letters.substring(1, 2).length(); 
//		total += letters.substring(6, 6).length(); 
//		total += letters.substring(6, 5).length(); 
//		System.out.println(total);
//		
//5)
//		public void moreA (int... nums) {} 
//		public void moreB(String values, int... nums) {} 
//		public void moreC(int... nums, String values) {} 
//		public void moreD (String... values, int... nums) {} 
//		public void moreE(String[] values, ...int nums) {} 
//		public void moreF(String... values, int[] nums) {} 
//		public void moreG(String[] values, int[] nums) {}
		


//public class Slayt165_180 { 
//	
//	public static void swing() {
//
//System.out.print("swing ");
//	}
//public void climb () {
//	
//System.out.println("climb ");
//}
//public static void play () {
//swing(); 
////climb();
//}
//
//public static void main(String[] args) {
//	
//
//Slayt165_180 rope = new Slayt165_180(); 
//rope.play(); 
//
//Slayt165_180 rope2 = null; 
//rope2.play();


public class Slayt165_180 { 
	public static long square(int x) {

long y = x * (long) x; 
x = -1; 
return y;
	}
public static void main(String[] args) {
	
int value = 9; 
long result = square(value);
System.out.println(value); 

	}

}
