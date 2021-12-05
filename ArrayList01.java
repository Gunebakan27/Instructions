package day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
//		How to Remove Duplicates from ArrayList
/*
 * Logic:
 * 1) Create a new list then transfer the elements if they are not repeated.
 * 2) If an element is repeated transfer it just once.
 * [2,3,2,2,5]-->[2,3,5]
 */
		List <Integer>list=new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(2);
		list.add(5);
		
		
		
		List <Integer>listNew=new ArrayList<>();
		
		for(Integer w:list) {
			
			if(!listNew.contains(w)){
				listNew.add(w);
				
			}
			
		}
		
		System.out.println(listNew);
		
		
		
//		
//		
//		List<Integer>list1=new ArrayList<>();
//		list1.add(2);
//		list1.add(3);
//		list1.add(2);
//		list1.add(2);
//		list1.add(5);
//		
//		List<Integer>list2=new ArrayList<>();//will have unique elements
//		for(Integer w:list1) {
//			if(!list2.contains(w)) {
//				list2.add(w);
//				
//			}
//		}
//
//		System.out.println(list2);
//		
		
		
	}
}
