package day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList06 {

	public static void main(String[] args) {
//		Create a method to delete odd elements and increase the even elements 
//		by multiplying 5
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(21);
		list1.add(32);
		list1.add(25);
		list1.add(90);
//		
		System.out.println(deleteOddIncreaseEvens(list1));
		
		}

	public static List<Integer> deleteOddIncreaseEvens(List<Integer> list1) {

		for(int i=0;i<list1.size();i++) {
			
			if(list1.get(i)%2==1) {
				
				list1.remove(i);
				
				i--;
				
			}else {
				 list1.set(i, list1.get(i)*5);
				 
				
				
			}
		}
		
		
		
		return list1;
	}
		
	
	
		
		
		
		
		
		
		
	
////	If you are sure, you will use a method in main method, make it static. Otherwise you will get Compile Time Error
//	public static List<Integer> deleteOddIncreaseEvens(List<Integer>list){
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i)%2!=0) {
//				list.remove(i);
//				i--;
//				
//			}if(list.get(i)%2==0) {
//				list.set(i, list.get(i)*5);
//			}
//		}
//		
//		
//		return list;


		
	

	
	
}
