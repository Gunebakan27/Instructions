package day02variablesscanner;

public class Variables01 {
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
	c)byte: It is used for "whole numbers" between -128 and 127 
			It uses 8 bits from memory
			If you are not sure the value will be between -128 and 127, dont use byte as a data type.
	d)short: It is used for "whole numbers" between -32765 and 32767
	 		It uses 16 bits from the memory.
	 		If you are not sure the value will be between -32765 and 32767, dont use short as a data type.
	e)int: It is used for "whole numbers" between -2,147,483,648 and 2,147,483,647
	 		It uses 32 bits from the memory.
	f)long: It is used for "whole numbers" between -9,223,372,036,854,755,808 to 9,223,372,036,854,755,807
			It uses 64 bits from the memory
			Note: Every whole number is "int" for Java as default. When you create a "long" variable. you have to put "L" or "l" to end to inform Java, 
			the number is not "int" it is "long". Otherwise you will get error.
	g)float: It is used for "Decimal Numbers".
	 		It uses 32 bits from memory.
	 		You can have 7 digits in decimal part at most.
	 		Note: Every decimal number is "double" for Java as default. We have to put "f" or "F" end of the value.
	 		
	h)double: It is used for "decimal numbers".
				It uses 64 bits from memory.
				You can have 16 digits in decimal part at most.
	
	NOTE: "=" is used to assign value to a variable
	"==" is used to compare 2 values if they are equal to each other.
	"!=" means not equal to
	
	Note: If all values in an operation is intiger, the result will be integer in Java.
		If the result is decimal in Math, Java converts the decimal to integer just by removing decimal part. Java do not do rounding operation.
	- 8 data types
	2)Non-primitive data types:
	String: It is used for "Multiple Characters".
	
	Note: The difference between "primitive and Non-primitive data types are:
		a) Primitive names are typed just by using a lower cases, but non-primitive data types use upper case at the beginning.
		b) Primitive data types are just 8, but non-primitive data types are unlimited.
		c) Primitive data types were created by Java, we can not create them.
			But non-primitive data types can be created by java and by developers.2
		d) Primitive are stored in "Stack Memory" and non-primitive are stored in "Heap Memory"
		
	
		 */
	public static void main(String[] args) {
		byte age = 13;
				System.out.println("Age: "+age);
short populationOfAVillage = 2000;
System.out.println("Population: "+populationOfAVillage);
int profit=2000000000;
System.out.println("The Profit: $"+profit);
long numberOfCellsInAHuman = 156554654656455646L;
System.out.println("The Number of Cells in Human: "+numberOfCellsInAHuman);
float f =1.2f;
System.out.println("The Value: "+f);
double d=1.2;
System.out.println("The Value: "+d);
String stdName="Ali Can";








		
	}

}
