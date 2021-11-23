package day11loops;

public class DoWhileLoop03 {

	public static void main(String[] args) {
//		For the String “1234_?!abcdef”, type a code to count the number of letters,
//				 the number of digits and the number of others by using do-while loop
//		
		String s="1234_?!aAbcdef";
//		s=s.toLowerCase();
//		
//	int dCount=0;
//	int lCount=0;
//	int oCount=0;
//	
//		
//		int idx=0;
//		do {
//		if(s.charAt(idx)>='a'&&s.charAt(idx)<='z'){
//			lCount++;			
//		}else if(s.charAt(idx)>='0'&&s.charAt(idx)<='9') {
//			dCount++;
//		}else {
//			oCount++;
//		}
//		idx++;	
//			
//		}while(idx<s.length());
//		System.out.println("Letters: "+lCount+" Digits: "+dCount+" Others: "+oCount);
		
		String digits=s.replaceAll("[^0-9]", "");
		System.out.println("Digits: "+digits.length());
		
		String letters=s.replaceAll("[^a-zA-Z]", "");
		System.out.println("Letters: "+letters.length());
		
		String others=s.replaceAll("[a-zA-Z0-9]", "");
		System.out.println("Others: "+others.length());
		
		
		
		

		
		//1.Way
//		s=s.toLowerCase();
//		
//		int digitCounter=0;
//		int letterCounter=0;
//		int othersCounter=0;
//		
//		int idx=0;
//		
//		do {
//			if(s.charAt(idx)>='a'&& s.charAt(idx)<='z') {
//				letterCounter++;
//				
//			}else if(s.charAt(idx)>='0'&& s.charAt(idx)<='9') {
//				digitCounter++;
//				
//			}else {
//				othersCounter++;
//			
//			}
//			idx++;
//			
//		}while(idx<s.length());
//		
//		System.out.println("Letters: "+letterCounter+" Digits: "+digitCounter+" Others: "+othersCounter);
//		
////		2.Way
//		String t="A5b664!";
//		
//		String justDigits=t.replaceAll("[^0-9]", "");
//		System.out.println("Number of Digits: "+justDigits.length());
//		
//		String justLetters=t.replaceAll("[^a-zA-Z]","");
//		System.out.println("Number of Letters: "+justLetters.length());
//		
//		String justOthers=t.replaceAll("[a-zA-Z0-9]","");
//		System.out.println("Number of Others: "+justOthers.length());
//		
		
	}

}
