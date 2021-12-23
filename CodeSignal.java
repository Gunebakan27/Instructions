package practice;

import java.util.Arrays;
import java.util.List;

public class CodeSignal {

	public static void main(String[] args) {
//		Given a string, find out if its characters can be rearranged to form a palindrome.
//
//		Example
//
//		For inputString = "aabb", the output should be
//		solution(inputString) = true.
//
//		We can rearrange "abba" to make "abba", which is a palindrome.
	
		String s="abc";
		String reverse="";
		StringBuilder sb=new StringBuilder(s);
		int count=0;
		
		
		for (int i = 0; i < s.length()-1; i++) {
		System.out.println(s.replace(s.charAt(i), s.charAt(i+1)));
		
				count++;
			}
		System.out.println(count);	

		
	}}
//		You are given an array of integers. 
//		On each move you are allowed to increase exactly one of its element by one. 
//		Find the minimal number of moves required to obtain a strictly increasing sequence from the input.
//
//		Example
//
//		For inputArray = [2, 1, 10, 1], the output should be
//		solution(inputArray) = 12.
//		int arr[]= {3122, -645, 2616, 13213, -8069};
//		
//		int count=0;
//		
//		for (int i = 0; i < arr.length-1; i++) {
//			while (arr[i]>=arr[i+1]) {
//				if(arr[i]>=arr[i+1]) {
//					arr[i+1]++;
//					count++;
//				}	
//			}
//			
//		
//		}System.out.println(count);
//		
//	}}
//		Two arrays are called similar if one can be obtained from another by swapping 
//		at most one pair of elements in one of the arrays.
//
//		Given two arrays a and b, check whether they are similar.
//
//		Example
//
//		For a = [1, 2, 3] and b = [1, 2, 3], the output should be
//		solution(a, b) = true.
//
//		The arrays are equal, no need to swap any elements.
//
//		For a = [1, 2, 3] and b = [2, 1, 3], the output should be
//		solution(a, b) = true.
//
//		We can obtain b from a by swapping 2 and 1 in b.
//
//		For a = [1, 2, 2] and b = [2, 1, 1], the output should be
//		solution(a, b) = false.
//
//		Any swap of any two elements either in a or in b won't make a and b equal.
//		
//		int a[]= {4, 6, 3};
//		int b[]= {3, 4, 6};
//		
////		Arrays.sort(a);
////		Arrays.sort(b);
//		int count=0;
//		int sumA=0;
//		int sumB=0;
//		for (int i = 0; i < b.length; i++) {
//			sumA+=a[i];
//			sumB+=b[i];
//			
//			if(a[i]==b[i]) {
//				count++;
//			}
//			
//		}
//		
//		if(count>b.length-2&&sumA==sumB) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
//		
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(b));
//		System.out.println(sumA);
//		System.out.println(sumB);
//
//	}}
//		Given a rectangular matrix of characters, add a border of asterisks(*) to it.
//
//		Example
//
//		For
//
//		picture = ["abc",
//		           "ded"]
//		the output should be
//
//		solution(picture) = ["*****",
//		                      "*abc*",
//		                      "*ded*",
//		                      "*****"]
//		String picture[]= {"a"};
//		
//		  String[] result = new String[picture.length + 2];
//		    
//		    for (int i = 0; i < picture.length; i++){
//		        result[i + 1] = "*" + picture[i] + "*";
//		    }
//		    System.out.println(result[1]);
//		    
//		    result[0] = result[1].replaceAll(".", "*");
//		    
//		    result[result.length - 1] = result[0];
//		    
//		    System.out.println(Arrays.toString(picture));
//		    System.out.println(Arrays.toString(result));
//		    
//	}}	
		
	
//		for (int i = 0; i < arr.length; i++) {
//				arr[i]="*"+arr[i].substring(0,arr[i].length())+"*";	
//		}
//		
//		String pic[]=new String[arr.length+2];
//		pic[0]="";
//		for (int i = 0; i < arr[0].length(); i++) {
//			pic[0]+="*";
//		}
//		pic[pic.length-1]="";
//		for (int i = 0; i < arr[0].length(); i++) {
//			pic[pic.length-1]+="*";
//		}
//		for (int i = 0; i < arr.length; i++) {
//			pic[i+1]=arr[i];
//		}
	
		
//	System.out.println(Arrays.toString(arr));
//	System.out.println(Arrays.toString(pic));
//	}}
		
//		Several people are standing in a row and need to be divided into two teams. 
//		The first person goes into team 1, the second goes into team 2, the third goes into team 1 again, the fourth into team 2, and so on.
//
//		You are given an array of positive integers - the weights of the people. 
//		Return an array of two integers, where the first element is the total weight of team 1, and the second element is the total weight of team 2 after the division is complete.
//
//		Example
//
//		For a = [50, 60, 60, 45, 70], the output should be
//		solution(a) = [180, 105].
//		int arr[]= {50, 60, 60, 45, 70};
//		System.out.println(Arrays.toString(solution(arr)));
//	
//	}
//
//	public static int[] solution(int[] arr) {
//		int team[]=new int[2];
//		
//		int count=0;
//		for (int i = 0; i < arr.length; i++) {
//		if(count%2==0) {
//			team[0]+=arr[i];
//		}else {
//			team[1]+=arr[i];
//		}count++;
//		}
//		
//		return team;		
//	}}
		
//		Write a function that reverses characters in (possibly nested) parentheses in the input string.
//		Input strings will always be well-formed with matching ()s.
//		Example
//		For inputString = "(bar)", the output should be
//		solution(inputString) = "rab";
//		For inputString = "foo(bar)baz", the output should be
//		solution(inputString) = "foorabbaz";
//		For inputString = "foo(bar)baz(blim)", the output should be
//		solution(inputString) = "foorabbazmilb";
//		For inputString = "foo(bar(baz))blim", the output should be
//		solution(inputString) = "foobazrabblim".
//		Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
//
//StringBuilder str = new StringBuilder("(bar(ba((ab)z)))");
//int start, end;
//while(str.indexOf("(") != -1){
//    start = str.lastIndexOf("(");
//    end = str.indexOf(")");
//    
//    str.replace(start, end + 1, new StringBuilder(str.substring(start+1, end)).reverse().toString());
//    System.out.println(str.toString());
//}
//
//    }}
//		
//		Some people are standing in a row in a park. There are trees between them which cannot be moved. 
//		Your task is to rearrange the people by their heights in a non-descending order without moving the trees. People can be very tall!
//
//		Example
//
//		For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
//		solution(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
//		int arr[]= {-1, 150, 190, 170, -1, -1, 160, 180};
//		
//		System.out.println(solution(arr));
//		
//	
//
//	}
//
//	private static List solution(int[] arr) {
//		List<Integer>list=new ArrayList<>();
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]==-1) {
//				list.add(i);
//		}}
//		
//		Arrays.sort(arr);
//		List<Integer>list2=new ArrayList<>();
//		
//		for (int i = 0; i < arr.length; i++) {
//			list2.add(arr[i]);
//		}
//	
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]==-1) {
//				list2.remove(i-i);
//				
//			}
//		}
//		for (int j = 0; j < list.size(); j++) {
//			list2.add(list.get(j), -1);
//		}
//		return list2;		
//	}}
//		Ticket numbers usually consist of an even number of digits.
//A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.
//
//		Given a ticket number n, determine if it's lucky or not.
//
//		Example
//
//		For n = 1230, the output should be
//		solution(n) = true;
//		For n = 239017, the output should be
//		solution(n) = false.
//		
//		int n=1230;
//		System.out.println(solution(n));
//		
//		String strN=""+n;
//		String firstHalf=strN.substring(0,(strN.length()/2));
//		System.out.println(firstHalf);
//		String lastHalf=strN.substring((strN.length()/2) );
//		System.out.println(lastHalf);
//		
//		int sum1=0;
//		int sum2=0;
//		int fHalf=Integer.parseInt(firstHalf);
//		int lHalf=Integer.parseInt(lastHalf);
//		for (; fHalf >0; fHalf/=10) 
//			sum1+= fHalf%10;
//		for(;lHalf>0;lHalf/=10)
//			sum2+=lHalf%10;
//		sum1==sum2
//		System.out.println(sum1);
//		System.out.println(sum2);
//		
//	}
//
//	private static boolean solution(int n) {
//		String strN=""+n;
//		String firstHalf=strN.substring(0,(strN.length()/2));
//	
//		String lastHalf=strN.substring((strN.length()/2) );
//	
//		
//		int sum1=0;
//		int sum2=0;
//		int fHalf=Integer.parseInt(firstHalf);
//		int lHalf=Integer.parseInt(lastHalf);
//		for (; fHalf >0; fHalf/=10) 
//			sum1+= fHalf%10;
//		for(;lHalf>0;lHalf/=10)
//			sum2+=lHalf%10;
//		return sum1==sum2;
//		
//	}}
//		Given two strings, find the number of common characters between them.
//
//		Example
//
//		For s1 = "aabcc" and s2 = "adcaa", the output should be
//		solution(s1, s2) = 3.
//
//		Strings have 3 common characters - 2 "a"s and 1 "c".	
//		String s1 = "aabcc";
//		String s2 = "adcccaa";
//		System.out.println(commonChar(s1, s2));
//		
//	}
//
//	public static int commonChar(String s1, String s2) {
//		int sum=0;
//		int s1arr[]=new int [256];
//		int s2arr[]=new int [256];
//		for (int i = 0; i < s1.length(); i++) {
//			s1arr[s1.charAt(i)]++;
//		}
//		for (int i = 0; i < s2.length(); i++) {
//			s2arr[s2.charAt(i)]++;
//		}
//		for (int i = 0; i < s2arr.length; i++) {
//			if(s1arr[i]>0&&s2arr[i]>0) {
//				if(s1arr[i]<=s2arr[i]) {
//					sum+=s1arr[i];}
//				
//					if(s1arr[i]>s2arr[i]) {
//						sum+=s2arr[i];
//					}{
//					System.out.println(sum);
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(s1arr));
//		System.out.println(Arrays.toString(s2arr));
//		System.out.println(sum);
//		return sum;
//		
//	}}
//		Given an array of strings, return another array containing all of its longest strings.
//
//				Example
//
//				For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
//				solution(inputArray) = ["aba", "vcd", "aba"].
//		String arr[]= {"abc", 
//				 "eeee", 
//				 "abcd", 
//				 "dcd"};
//		List<String>list=new ArrayList<>();
//		
//		
//		int len=0;
//		
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i].length()>len) {
//				len=arr[i].length();
//			}}
//			for (int j = 0; j < arr.length; j++) {
//				if(arr[j].length()==len) {
//					list.add(arr[j]);
//				}
//			}
//		
//		
//		System.out.println(list);
//		
//	}
//
//	private static List result(List<String> list) {
//		return list;
//		// TODO Auto-generated method stub
//		
//	}}
//		After becoming famous, the CodeBots decided to move into a new building together. Each of the rooms has a different cost, and some of them are free, but there's a rumour that all the free rooms are haunted! Since the CodeBots are quite superstitious, they refuse to stay in any of the free rooms, or any of the rooms below any of the free rooms.
//
//		Given matrix, a rectangular matrix of integers, where each value represents the cost of the room, your task is to return the total sum of all rooms that are suitable for the CodeBots (ie: add up all the values that don't appear below a 0).
//				For
//
//				matrix = [[0, 1, 1, 2], 
//				          [0, 5, 1, 0], 
//				          [2, 0, 3, 3]]
//				the output should be
//				solution(matrix) = 9.	
		
//		int arr[][]= {{0, 1, 1, 2},{0, 5, 0, 0},{2, 0, 3, 3}};
//		
//		System.out.println(matrix(arr));
//	}
//
//	private static int matrix(int[][] arr) {
//		int sum=0;
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				if(i==0) {
//					sum+=arr[i][j];
//				}else if(i==1) {
//					if(arr[0][j]>0) {
//						sum+=arr[i][j];
//					}}
//				else if(i==2) {
//					if(arr[0][j]>0) {
//						if(arr[1][j]>0) {
//						sum+=arr[i][j];
//					}}}
//				
//			}
//		}
//		
//		
//		return sum;
//		// TODO Auto-generated method stub
//		
//	}
//}
//		Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.
//
//		Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an. Sequence containing only one element is also considered to be strictly increasing.
//
//		Example
//
//		For sequence = [1, 3, 2, 1], the output should be
//		solution(sequence) = false.
//
//		There is no one element in this array that can be removed in order to get a strictly increasing sequence.
//
//		For sequence = [1, 3, 2], the output should be
//		solution(sequence) = true.
//
//		You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].

//		int arr[]= {1,3,2};
//		System.out.println(almostIncreasingSequence(arr));
//		
//	}
//
//	static boolean almostIncreasingSequence(int[] sequence) {
//		 int c = 0;
//		    for (int i = 0; i < sequence.length - 1; i++) {
//		        if (sequence[i] >= sequence[i+1]) {c++;}
//		        if (i+2 < sequence.length && sequence[i] >= sequence[i+2]) {c++;}}
//		    return c < 3;
//	}}

//	Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, 
//	each statue having an non-negative integer size. Since he likes to make things perfect, 
//	he wants to arrange them from smallest to largest so that each statue will be bigger than the previous one 
//	exactly by 1. He may need some additional statues to be able to accomplish that. 
//	Help him figure out the minimum number of additional statues needed.
//
//	Example
//
//	For statues = [6, 2, 3, 8], the output should be
//	solution(statues) = 3.
//
//	Ratiorg needs statues of sizes 4, 5 and 7.
	
//	int arr[]= {6, 2, 3, 8};
//	System.out.println(result(arr));
//	
//}
//
//	public static int result(int[] arr) {
//		int i=0;
//		Arrays.sort(arr);
//		for (int j = arr.length-1; j >0 ; j--) {
//			i+=arr[j]-arr[j-1]-1;
//			
//		}
//		
//		return i;
//		
//		
//	}
//}
