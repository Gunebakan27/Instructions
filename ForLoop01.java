package day09loops;

public class ForLoop01 {

	public static void main(String[] args) {

		//Type code to print all unique characters on the console from a given String
				// samame ==> se
		
	String str="ali veli can";
	for(int i=0;i<str.length();i++) {
		char c=str.charAt(i);
		if(str.indexOf(c)==str.lastIndexOf(c)) {
			System.out.print(c);
		}
		}
		
		//		
//		String s1="Annar Maria";
//	
//	for(int i=0; i<s1.length(); i++) {
//		
//		char c=s1.charAt(i);
//		
//		if(s1.indexOf(c)==s1.lastIndexOf(c)) {
//			System.out.print(c);
//		}
//	}
//System.out.println();
//// 2) Type code to print a String in reverse order after removing spaces	
//		
	System.out.println();
	
	String str1="read it from back";
	String reverse="";
	for (int i=str1.length()-1;i>-1;i--) {
		char c=str1.charAt(i);
	
		reverse = reverse+c;
	}
		System.out.print(reverse);
		
//		String s2="Ali Can";//"naCilA"
//		String reversed="";
//		
//		for(int i=s2.length()-1; i>=0; i--) {
//			String c=s2.substring(i, i+1); 
//			
//			if(c.equals(" ")) {
//				s2=s2.replace(" ", "");
//				
//			}
//			else {
//			reversed=reversed+c;
//			}
//		}
//		System.out.print(reversed);
//		
//		System.out.println();
//// 3) Type code to find the sum of the integers from 12 to 231
System.out.println();

		int sumin=0;
		for(int i=0;i<232;i++) {
			sumin= sumin+i;
		}
	System.out.print(sumin);	
//		int sum=0;
//		
//		for(int i=2;i<8;i++){
//			sum=sum+i;
//		}
//		System.out.println(sum);
System.out.println();
//	//	3) Type code to find the multiplication of the integers from 12 to 231	
//		
	int mult=1;
	for(int i=12;i<26;i++) {
		mult=mult*i;
	}
	System.out.print(mult);
	
	
	
	System.out.println();
	
	
	
int mul=1;
		
		for(int i=12;i<22;i++){
			mul=mul*i;
		}
		System.out.println(mul);
//		
////5) Type code to check if a given String is Palindrome or not.
		String strP="anna";
		String reversedd="";
		for(int i=strP.length()-1;i>=0;i--) {
			char c=strP.charAt(i);
			reversedd=reversedd+c;
			if(strP==reversedd) {
				System.out.println(reversedd);
			}
		}
		
		
		
		
		
		
//// String: anna  Reversed String: anna
//// Integer: 12321 Reversed Integer: 12321
//		
//		String s3="123215";
//		String reversed1="";
//		
//		for(int i=s3.length()-1;i>=0;i--) {
//			reversed1=reversed1+s3.charAt(i);
//			
//		}
//		System.out.println(reversed1);
//		
//		if(s3.equals(reversed1)) {
//			System.out.println(s3+" is Palindrome");
//		}else {
//			System.out.println(s3+" is not polidrome");
//		}
//		
////6) Type code to find the sum of the digits of an integer.
//		int sumOfDigits=0;
//		
//		for(int n=1234565648;n>0;n=n/10) {
//			
//			sumOfDigits=sumOfDigits+n%10;
//						
//		}
//		System.out.println(sumOfDigits);
//	//7) Type code to find the sum of the unique digits of an integer.
//		
//		String in="2523";
//		int sum3=0;
//		
//		for(int i=0;i<in.length();i++) {
//			char ci=in.charAt(i);
//			
//			if(in.indexOf(ci)==in.lastIndexOf(ci)) {
//				String cstr=""+ci;
//				sum3= sum3+Integer.valueOf(cstr);
//			}
//				
//			System.out.println(sum3);
//		}
//		
//		
		
	}

}
