package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulatedExm {

	public static void main(String[] args) {
//		Write a program to check if the word 'orange' is present in the "This is orange juice".
		
String str2 = "This is orAnge juice";
int idx=str2.toLowerCase().indexOf("orange");
if (idx==-1) {
	System.out.println(str2+" has no orange");
}else {System.out.println(str2+" has orange");
	}
	
//Write a program to find the first and the last occurence of the letter 'o' and character ',' in "Hello, World".
String str1="Hello, World";
int idx1=str1.indexOf("o");
int idx2=str1.lastIndexOf("o");
int idx3=str1.indexOf(",");
System.out.println(""+idx1+idx3+idx2);

//Write a program that takes your full name as input and displays the abbreviations of the first and middle names except the last name 
//which is displayed as it is. For example, if your name is Robert Brett Roser, then the output should be R.B.Roser.
Scanner scan=new Scanner(System.in);
System.out.println("Enter your name..");
String name=scan.nextLine();
char fn=name.charAt(0); 
char mn=name.charAt(name.indexOf(" ")+1);
String ln=name.substring(name.lastIndexOf(" ")+1);
System.out.println(fn+"."+mn+"."+ln);

//Print the first and last character of the given String on the console. "Java is easy" ==> Jy	
String str="Java is easy";
System.out.println(""+str.charAt(0)+str.charAt(str.length()-1));

//Print the index of first occurence of of a specific character. If the character does not exist print " No 'a' ".

int a=str.indexOf('a');
if(a==-1) {
	System.out.println("is not exist");
}else {
System.out.println(a+" is index");
}
//Print the index of last occurence of a specific character.
int l=str.lastIndexOf('a');
System.out.println(l+"is last index");

//Check if a given character is unique in a String or not?		
char c='a';
int fo=str.indexOf(c);
int lo=str.lastIndexOf(c);
if(fo==-1) {
	System.out.println(c+" is not exist");
}else if(fo==lo) {
		System.out.println(c+" is unique");
	}else {System.out.println(c+" is not unique");}

		
	
		
		
scan.close();	
	}
}
