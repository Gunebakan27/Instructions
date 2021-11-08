package day01variables;

public class Variables02 {

	/*
	Data Types in Java
	Note: In Java there are two main data types.
	1)Primitive data types: 
	a)boolean: Has 2 different values which are "true" and "false"
			   Every boolean variable uses a single "bit" in memory.
			   booleans have "false" as default value.
	b)char: It is used for single characters.
			Value must b eput between single quotes like 'S'
			Every char uses 16 bits in the memory.
	c)byte 
	d)short 
	e)int 
	f)long 
	g)float 
	h)double 
	
	NOTE: "=" is used to assign value to a variable
	"==" is used to compare 2 values if they are equal to each other.
	"!=" means not equal to
	
	Note: If all values in an operation is intiger, the result will be integer in Java.
		If the result is decimal in Math, Java converts the decimal to integer just by removing decimal part. Java do not do rounding operation.
	- 8 data types
	2)Non-primitive data types:
		 */
	
	public static void main(String[]args) {
		boolean isExpensive = true;
		boolean isOld = false;
		boolean isRetired;
		
		char initialOfFirstName = 'S';
		char initialOfLastName = 'A';
		
		System.out.println(initialOfFirstName);
		System.out.println(initialOfFirstName > 5);
		System.out.println(initialOfFirstName == 5);
		System.out.println(initialOfFirstName != 5); //"!=" means not equal to
		System.out.println(initialOfFirstName / initialOfLastName);//SA or 148
		System.out.println(29/2);
		
	}
	
}
