package day12variabletypesmethodoverloadingconstructors;
/*
 * Tehere are three main variable types in java.
 * 1)Local Variables: Variables created in method body.
 * 					  "age" and "sum" are local variables
 * 				Note 1: Local variables can be used just inside the method body, which you created it in.
 * 				Note 2: Don't use Local Variables without initializing(assigning a value) otherwise,
 * 				you get compile time error.
 * 2)Instance(Object) Variables: Variables are created outside of all methods and inside the class without using
 * 			"static" keyword.
 * 			"name" is an instance(object) variable
 * 				Note1: If you want initialize the instance variable, if you want don't initialize.
 * 				If you don't initialize, java put "default values" for the instance variables.
 * 			Default Values:
 * 			String==>null
 *			byte-short-int-long-float-double==>0
 * 			boolean==>false
 * 			char==>nothing==>''
 * 				Note2: Instance Variables are attached to every object.
 * 3)Class(Static) Variables: Variables are created by using "static" keyword, "id" is a class variable.
 * 				Note1: Class(Static) Variables are common for all objects created from class like moon).
 * 				Note2: Every update on Class Variables will be visible by all objects (like splitting moon)
 * 				Note3: If you need a variable which all objects need to share, make it "class(static) variable"
 * 				If you need all objects should see every update on a variable, 
 * 				make the variable"Class(Static) variable"
 * Note for Instance and Static Variables: To access an "Instance Variable" from another class you have to create "Object"
 * 				but to access "Class Variable" from another class no need to create object, you can access to a "Class Variable"
				by using just class name.
 */
public class VariableTypes01 {

	String name="Ali Can";
	boolean isOld;
	
	static String id;
	
	
	public static void main(String[] args) {

		int age;
		age=12;
		System.out.println(age);
		
	}

	public static int add(int a, int b) {
		int sum=a+b;
		return sum;
		
	}
}
