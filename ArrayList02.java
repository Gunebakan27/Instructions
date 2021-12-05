package day19arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
//		How to check if multiple elements exists in a List
//		["A","M,"C,"K","B"]-->If "A" and "C" and "K" exist in the list
		
		List <String>list1=new ArrayList<>();
		list1.add("A");
		list1.add("M");
		list1.add("C");
		list1.add("K");
		list1.add("B");
		
		List <String>list2=new ArrayList<>();
		list2.add("A");
		list2.add("C");
		list2.add("K");
		
		System.out.println(list1.containsAll(list2));
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		
//		List<String>list1=new ArrayList<>();
//		list1.add("A");
//		list1.add("M");
//		list1.add("C");
//		list1.add("K");
//		list1.add("B");
//		
////		1.Way
//		List<String>list2=new ArrayList<>();
//		list2.add("A");
//		list2.add("C");
//		list2.add("K");
////		Returns true if this list contains all of the elements of the
////	    list2. Otherwise it will return false
//		System.out.println(list1.containsAll(list2));
//		
////		2.Way:
//		System.out.println(list1.containsAll(Arrays.asList("A","C","K")));
///*
// * Note: When you use Arrays.asList() method, you should be careful about not to change the length
// */
//		List<Integer>list3=Arrays.asList(2,5,3,4);
////		list3.add(7);//UnsupportedOperationException
////		list3.remove(1);
////		list3.clear();//remove all elements//UnsupportedOperationException
//		System.out.println(list3.contains(3));
////		Remove M and put S in the place of M
////		[A,M,C,K,B]-->[A,S,C,K,B]
////		
		System.out.println(list1);
		
		list1.set(list1.indexOf("M"), "S");
		
		System.out.println(list1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		1.Way: Not Recommended
//		
//		int idxOfM=list1.indexOf("M");
////		list1.remove("M");
////		System.out.println(list1);
////		list1.add(idxOfM, "S");
////		System.out.println(list1);
//		
////		2.Way:
////		set() method is used to update an element at a specific index
//		list1.set(idxOfM, "S");
//		System.out.println(list1);
//		
//		

	}

}
