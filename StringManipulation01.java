package day07stringmanipulations;

public class StringManipulation01 {
/*
 Regex: Regular Expression: is used to declare a group of characters.
 i)All lower case letters ==>[a-z]
 ii)All upper case letters ==>[A-Z]
 iii)All upper case and lower case letters ==> [a-zA-Z]
 iv)All characters different from space character ==> \\S
 v) Space character ==>\\s
 vi) All characters different from digits ==>\\D or [^0-9]
 vii)All digits ==>\\d or [0-9]
 viii) Non-alphabetical characters ==> [^a-zA-Z]
 ix)Characters from a to z, from A to Z, from 0 to 9 and _ ==>"\\w"
 x)Characters different from a to z, from A to Z, from 0 to 9 and _ ==>"\\W"
 */
	public static void main(String[] args) {
//1)Type code to find the number of space character in a String
//	String s1="Ali went to the school.";
//	
//	String updateds1=s1.replaceAll("\\S", "");
//	System.out.println(updateds1.length());	
//	
////	2)Type code to find the number of characters different from space character
////1. Way
//	System.out.println(s1.length()-updateds1.length());
//
////2.Way
//	String upds1=(s1.replaceAll("\\s", ""));
//	System.out.println(upds1.length());
//
////	3)Type code to  find the number of digits, number of letters, and characters different from digits 
////	and numbers.
//	
	String s2="Ali Can: 1234567890!!!?.";
	String s2upd=s2.replaceAll("\\D", "");
	System.out.println(s2upd.length());
	
	String s2upds2=s2.replaceAll("[^a-zA-Z]", "");
	System.out.println(s2upds2.length());
	
	String s2upd3=s2.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(s2upd3.length());
//	4)Check the password according to the given rule
//	a)No space character at the beginning and at the end
//	b)It must contain at least 1 digit
//	c)It must contain at least 1 lowercase letter
//	d)It must contain at least 1 uppercase letter
//	e)It must contain at least 1 character different from digits and letters

	String pwd="123sadA";
	boolean isFirstCharSpace=pwd.startsWith(" ");
	System.out.println(isFirstCharSpace);
	
	boolean isLastCharSpace=pwd.endsWith(" ");
	System.out.println(isLastCharSpace);
	
	int numOfDigitCharacters=pwd.replaceAll("\\D", "").length();
	
	int numOfLowercaseChars=pwd.replaceAll("[^a-z]", "").length();
	
	int numOfUppercaseChars=pwd.replaceAll("[^A-Z]", "").length();
	
	int numOfCharsDifferentFromLetterAndDigits=pwd.replaceAll("[a-zA-Z0-9]", "").length();
	
	if(isFirstCharSpace) {
		System.out.println("Your Password is invalid. Do not use Space at the beginning");
		}
if(isLastCharSpace) {
	System.out.println("Your Password is invalid. Do not use Space at the end");
}
if(numOfDigitCharacters==0) {
	System.out.println("Your Password is invalid. Use at least 1 digit");
}
if(numOfLowercaseChars==0) {
	System.out.println("Your Password is invalid. Use at least 1 lower case");
}

	if(numOfUppercaseChars==0) {
		System.out.println("Your Password is invalid. Use at least 1 uper case");
	}

if (numOfCharsDifferentFromLetterAndDigits==0) {
	System.out.println("Your Password is invalid. Use at least 1 character different form letters and digits");
}

	}

}
