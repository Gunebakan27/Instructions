package day23inheritanceoverriding;
/*
 * 1)Multiple parents for a child class is called "Multiple Inheritance" and it is not supported by Java.
 * 2)Child-->Parent-->Grand Parent...is called "Multi Level Inheritance" and Java supports them.
 * 3)If a parent class has multiple child classes, it is cold "Hierarchical Inheritance". Java supports it.
 * 
 * 1)The method inside the child class(Overridden) can not have narrower access modifier.
 * It means the method in child class can have same or wider access modifier.
 * Other wise you will get Compile Time Error.
 * Note: The method inside the parent class is called "Overriding" method.
 * 
 * Note:If the method in parent class has
 * i)"default"access modifier then overridden method can have "default","protected" and "public"
 * ii)"protected"access modifier then overridden method can have "protected" and "public"
 * ii)"public"access modifier then overridden method can have "public"
 * 
 * 2)Private methods cannot be overridden.
 * 
 * 3)i)If the return type in the "Overriding Method" is void,
 * "Overridden Method" must have "void" as return type.
 * ii)If the return type in the "Overriding Method" is primitive,
 * "Overridden Method" must have same return type.
 * iii)If the return type is "non-primitive", you must have "is a" relationship from the return type of
 * "Overridden Method" to return type of "Overriding Method"
 * iv)If the return type is "Wrapper Class", you can not use different return types in overriding.
 * Because Java did not create "is-a" relationship between "Wrapper Classes".
 * 
 * 4)"static" methods can not be overridden. Because implementation of a static method is common for all objects.
 * You can not specify the implementation for a single class.
 * 
 * 5)"final method" means, implementation(code inside the body) cannot be changed.#
 * But we override a method to change the codes inside body. This is contradiction. because of that Java 
 * does not let us to override final methods. 
 * 
 * "final variable" means, the value of the variable cannot be changed.
 * 
 * final int age=41;
 * age=42; ==> That code gives Compile Time Error
 * 
 * "final class" means the class cannot have any child class.
 * if a class "final class", no class can extend to it.
 * "final class" cannot be "parent class", it can be "child class"
 * 
 * "finalize" means process Garbage Collector applies before destroying objects.
 * 
 * How to select variables in parent-child relationship
1) To understand which variable will be used in parent-child relationship; look at the data type of the object, if the object data type is “A” use the variable from class A
2) If parent and grand-parent classes have the same variable use the variable from the parent not from the grand parent.
3) When you create an object you can use the class itself and all parents as “data type” of the object
4) When you call a method in parent-child relationship you should look at the constructor.

 *  */
public class Vehicle {
	public void move() {
		System.out.println("All vehicles move..");
	}
	public int price() {
		return 2000;
	}
	public Vehicle name() {
		return new Vehicle();
	}
	public Integer age() {
		return 0;
	}
public final String modelName() {
	return "Honda Civic";
}
}
