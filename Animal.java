package day24abstractclass;
/*
 * 1)Sometimes we need methods without body(Abstract methods). because sometimes we do not use the body of some methods any time.
 * 
 * 2)To create an "abstract method":
 * i)Do not put method body
 * ii)Use "abstract" keyword between access modifier and return type.
 * iii)"abstract methods" can be created just in "abstract classes"
 * Note: To make a class abstract, use "abstract" keyword before "class" keyword
 * 
 * 3)Abstract classes can have both "abstract methods" and "concrete methods"
 * 
 * 4)Abstract MEthods MUST be overridden by all CONCRETE child classes. But it is optional for concrete methods.
 * If you want to make a functionality must for child classes, use abstract method for the functionality.
 * 
 * 5)Abstract keyword and method body cannot be used at the same time in a method.
 * 
 * 6)An abstract class can have "abstract child class"
 * 
 * 7)It is not MUST for "abstract child class" to override "abstract methods" from parents class..
 * 
 * 8)If any abstract method is overridden by any parent class, it will not be MUST for child classes.
 * 
 * 9)abstract methods cannot be "final" because "abstract methods" will have newly updated body in every child class but "final body" means no update in body.
 * 
 * 10)Abstract method cannot be "private" because we create "abstract method" just for child classes usage.
 * but if you make "abstract method" private child classes cannot access to it.
 * 
 */
public abstract class Animal {
	
	public abstract void eat();
	public void drink() {
		System.out.println("Animals drink..");
	}
	

	
}
