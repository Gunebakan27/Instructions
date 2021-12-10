package day22inheritance;
/*
 * 1)Private Class members can not be used by child classes
 * 2)"Default Class" members can be used by child classes,
 * if the child class is in the same package with the parent class
 * 3)"ProtectedClass" members can be used by child classes,
 * even it is in another package.
 * 4)"Public Class" members can be used by child classes.
 * 5)To use "Static" class members, no need to create object, use them by class name.
 * 6)super() is for calling parent constructor.
 * If you dont type super() inside the constructor, java will put it as default but it will be invisible
 * 7)super() must be in the first line inside the constructor.
 * 8)"this()" and "super()" must be in the first line inside a constructor so they can not be used at the same time in a constructor.
 * 9)A child class cannot have multiple parents
 */
public class Animal {
	public Animal(String name) {
		System.out.println("String Animal constructor");
	}
	public Animal() {
		
		System.out.println("No Parameter Animal consructor..");
	}
	int age;
	
	public void eat() {
		System.out.println("They eat..");
	}
	public void drink() {
		System.out.println("They drink..");
	}


}
