package day19arraylists;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class ArrayList04 {

	public static void main(String[] args) {
//		From an integer list find the closest two elements
		List<Integer> list1 = new ArrayList<>();
        list1.add(25);
        list1.add(17);
        list1.add(21);
        list1.add(16);
        list1.add(67);
        list1.add(35);
        list1.add(120);
        list1.add(168);
        list1.add(12);
        
        System.out.println(list1);
        
        Collections.sort(list1);
        System.out.println(list1);
       
        int diff=0;
        int max=Integer.MAX_VALUE;
        for(int i=0; i<list1.size()-1;i++) {
        	 
        	diff=list1.get(i+1)-list1.get(i);
        	
        	if(diff<max) {
        		max=diff;
        	}}
	
        		for(int i=0;i<list1.size()-1;i++){
        		
        		if(list1.get(i+1)-list1.get(i)==max) {
        			System.out.println(list1.get(i)+" "+list1.get(i+1));
        		
        		}
	
        
               		}
        	}}
        	
     
//        
//        System.out.println(list1);//[2, 13, 31, 21, 12, 16, 67, 35, 120, 168, 12]
//        
//        Collections.sort(list1);
//        
//        System.out.println(list1);//[2, 12, 12, 13, 16, 21, 31, 35, 67, 120, 168]
//        
//        int minDiff=Integer.MAX_VALUE;
//        
//        for(int i=1;i<list1.size();i++) {
//        	minDiff=Math.min(minDiff, list1.get(i)-list1.get(i-1));
//        	
//        }
//        System.out.println(minDiff);
//        
//        for(int i=1;i<list1.size();i++){
//        	if(list1.get(i)-list1.get(i-1)==minDiff) {
//        		System.out.println(list1.get(i)+" and "+list1.get(i-1));
//        	}
//        }
//        
        



