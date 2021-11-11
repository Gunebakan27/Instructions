package day04concanitationandifstatement;

import java.util.Scanner;

public class Day04Homeworks {

	public static void main(String[] args) {
//
// 19) 
//int numA = 2;
//int numB = 3;
//String str1 = “Study”
//String str2 = “Hard”
//
//Type a program to see the following outputs on the console
//by using “concatenation” operation.
//
//A) Study Hard B) 5 Study C) Hard23 D) Hard1
//
//Note: Be careful about the spaces between the variables

	int numA = 2;
		int numB = 3;
		String str1 = "Study";
		String str2 = "Hard";
		System.out.println(str1.concat(" ").concat(str2));
		System.out.println(numA+numB+" "+str1.concat(""));
		System.out.println(str2.concat("")+numA+numB);
		System.out.println(str2.concat("")+(numB-numA));

//Type a program to see “61Study-1” as output on the console
//by using “concatenation” operation.
//Note: Use just variable names, do not use any number
 
		System.out.println(numA*numB+""+(numB-numA)+str1+(numA-numB));
/*
1) Type java code, if an integer is even, output will be “The integer is even”.
If the integer is odd, output will be “The integer is odd”.
*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int i1=scan.nextInt();

		if(i1%2==0) {
			System.out.println("Thes integer is: Even");
		}
		else {
			System.out.println("The integer is: Odd");				
		}

		/*Type java code by using if statement. When you enter the initial of the day of a week,
output should be all possible names of the days.
For example; if the initial is ’S’ output should be “Saturday or Sunday”	
		 */


		System.out.println("Enter the initial of the weekday...");
		String weekDay=scan.next();
		if(weekDay.startsWith("M")||(weekDay.startsWith("m"))) {
			System.out.println("Monday");
		}
		else if(weekDay.startsWith("T")||(weekDay.startsWith("t"))) {
			System.out.println("Tuesday or Thursday");
		}
		else if(weekDay.startsWith("W")||(weekDay.startsWith("w"))) {
			System.out.println("Wednesday");
		}
		else if(weekDay.startsWith("F")||(weekDay.startsWith("f"))) {
			System.out.println("Friday");
		}
		else if(weekDay.startsWith("S")||(weekDay.startsWith("s"))) {
			System.out.println("Saturday or Sunday");
		}
		else {
			System.out.println("Are you sure that is a weekday name?");

		}

		/*
Type java code by using if statement. When you enter the name of the day of a week,
output will be “Weekday” or “Weekend day” according to the name of the day.		
		 */
		System.out.println("Enter a name of day...");
		String wD=scan.next();
		if(wD.equalsIgnoreCase("Monday")||(wD.equalsIgnoreCase("Tuesday")||(wD.equalsIgnoreCase("Wednesday")||
				(wD.equalsIgnoreCase("Thursday")||(wD.equalsIgnoreCase("Friday")))))) {
			System.out.println("Weekday");
		}
		else if(wD.equalsIgnoreCase("Sunday")||(wD.equalsIgnoreCase("Saturday"))) {
			System.out.println("Weekendday");
		}
		else {
			System.out.println("Are you sure that is a dayname?");
		}
		/*
Ask user to enter the values of length and width of a rectangle, then check if it is square or not.		
		 */
		System.out.println("Please enter the length of a rectangle..");
		double l=scan.nextDouble();
		System.out.println("Please enter the width of a rectangle..");
		double w=scan.nextDouble();
		if(l==w) {
			System.out.println("It is a square");
		}
		else {
			System.out.println("It is not a square");
		}
		//		Ask user to enter his/her age. If the age is between 18 and 65 then output will be “You should work”,
		//		else output will be “No need to work”
		System.out.println("Enter your age...");
		int age=scan.nextInt();
		if(age>=18&age<=65) {
			System.out.println("You should work");
		}
		else {
			System.out.println("Sorry you're too young or old for working");
		}
//	Ask user to enter his/her age and gender. If the age is more than 65 and the gender is male
//	then output will be “Hey man you retired!” else output will be “No need to work”	
		System.out.println("Please enter your age..");
		int age1=scan.nextInt();
		System.out.println("Are you Male or Female?");
		String gender=scan.next();
		if(age1>65&gender.equalsIgnoreCase("Male")) {
			System.out.println("Hey man you retired!");
		}
		else {
			System.out.println("No need to work");
		}
//		Ask user to enter a character, then check whether the character is alphabet or not
		System.out.println("Enter a character...");
		char ch=scan.next().charAt(0);
		if((ch>='a'&ch<='z'||ch>='A'&ch<='Z')) {
			System.out.println(ch+" is an alphabet");
		}
		else {
			System.out.println(ch+" is not an alphabet");
		}
		
//		Ask user ta enter any name of the week, then get second ,fourth,
//		and sixth letter of the day name and print them on the console,
//		in the same line.
//		For example; if the user enters “Monday” output will be “ody”
		System.out.println("Enter a day name...");
		String d=scan.next();
		System.out.println(d.charAt(1)+""+d.charAt(3)+""+d.charAt(5));
		
//		Type java code by using if-else statement,
//		if the password is “JavaLearner”, output will be “The password is true”.
//		Otherwise, output will be “The password is false”.
		
		System.out.println("Enter the password...");
		String p=scan.next();
		if(p.equals("JavaLearner")) {
			System.out.println("The password is true");
		}
		else {
			System.out.println("The password is false");
		}
		
//		Type java code by using if-else statement,
//		Write a program to print absolute value of a number entered by user.
//		Absolute Value: If the number is positive or zero return the number itself
//		If the number is negative return the number after multiplying by -1
	
		System.out.println("Enter a number..");
		double a=scan.nextDouble();
		if(a>=0) {
			System.out.println(a);
		}
		else if(a<0) {
			System.out.println(a*-1);
		}
//		
//		Type java code by using if-else statement.
//		A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//		Ask user for quantity and unit price then judge and print total cost for user.
//		If the quantity is less than 1000 output will be “No discount.”
		
		System.out.println("Please enter the price of product..");
		double p1=scan.nextDouble();
		System.out.println("Please enter the quantity of producjt..");
		int q=scan.nextInt();
		if(q>1000) {
			System.out.println("Total cost is: "+ (p1*q*0.9));
		}
		else {
			System.out.println("No discount");
		}
		
		
		scan.close();
		
		
	}
	
}
