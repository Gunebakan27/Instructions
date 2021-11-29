package day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays04 {

	public static void main(String[] args) {
//Sort the String array elements in ascending order according to their lengths.
		
		String srr[]= {"Jacksonville", "Miami","Keywe","Tampa", "Virginia"};
		System.out.println("Before: "+Arrays.toString(srr));
		
		//Sort in ascending by using number of characters
//		Arrays.sort(srr, Comparator.comparingInt(String::length));//Go class, find length, use it
//		System.out.println("After: "+Arrays.toString(srr));
		
		//Sort in descending by using number of characters#
//		Arrays.sort(srr, Comparator.comparingInt(String::length).reversed());
//		System.out.println("After: "+Arrays.toString(srr));

//Sorting in descending order, if there is multiple elements in same length put them in alphabetic order
		Arrays.sort(srr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
		System.out.println("After: "+Arrays.toString(srr));
//		Note:Natural order means i)alphabetic order for strings ii)Ascending order for numbers.
	}

}
