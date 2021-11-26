package day14statickeywordarrays;
/*
 * 1) Static Block is a code block. it is used to initialize "static(class) variables"
 * 2) If you use "static block" to initialize "static variables", they will be initialized before everything inside the class.
 * 3) If you gave multiple "static blocks", java will execute them from top to down.
 * 
 */
public class CircleColculator {
	static String nameOfShape="Circle";
	static double pi;
	static int value;
	static String unit;
	static {
		value=12;
		unit="cm";
		System.out.println("Static block 2");
	}
	static {
		pi=3.14;
		System.out.println("Static block 1");
		
	}

	public CircleColculator() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		add();
		CircleColculator cc = new CircleColculator();
		
		
	}
	public static void add() {
		System.out.println("Add Method..");
		
		
	}

}
