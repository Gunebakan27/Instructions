package day12variabletypesmethodoverloadingconstructors;
/*
 * 1)Constructor is for creating object from a class
 * 2)Every class has default constructor, default constructors are invisible
 * 3)When you create a constructor, java removes the default constructor.
 * 4)How to create our own constructor
 * 		i)Type Access Modifier make it "public" most of the times.
 * 		ii)Type the class name
 * 		iii)Open-Close parenthesis
 * 		iv)Open-Close curly braces
 * 5)Default constructor is like;	public Car() { }
 * 6)Constructor don't have "return type" because of that constructors are not method.
 * 7)Constructors names MUST MATCH with the class names.
 * 
 */
public class Car {
	
	String make;
	String model;
	int price;
	int year;
//Constructors can be overloaded as well
	public Car() {
		this.make="Honda";
		this.model="Pilot";
		this.price=40000;
		this.year=2021;
	}
	public Car(String make, String model, int price, int year) {
		this.make=make;
		this.model=model;
		this.price=price;
		this.year=year;
		
	}

	public static void main(String[] args) {
}

}
