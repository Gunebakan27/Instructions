package day02variablesscanner;

public class Day02TypeCasting {

	/*
	 	Type Casting: We want to convert a number primitive data type to another number primitive type
	 	Number Primitive Data Types: byte<short<int<long<float<double
	
	 */
	public static void main(String[] args) {
		//Auto Widening Type Casting: If you change small primitive data type to larger it is called Auto Widining Type Casting

		byte b1=127;
		
		short s1=b1;
		System.out.println(s1);
		
		int i1=123;
		float f1=i1;
		
		double d1=2.34;
		float f2=(float)d1;
		//Explicit Narrowing Type Casting: If you change large primitive data type to smaller it is called Explicit Narrowing Type Casting
		
		
		long l1=234;
		byte b2=(byte)l1;
		System.out.println(l1);
		System.out.println(b2);
		
		//How to convert "primitive data type" to "Wrapper Class"
		// int ===> Integer							Integer===>int
		
		// If you convert primitive to wrapper it is called "Auto Boxing"
		int i2=123;		
		Integer i1Wrapper=i2;
		
		// If you convert "Wrapper" to "Primitive" it is called "Unboxing"
		Integer i3Wrapper=234;
		int i3=i3Wrapper;
		
		
	}

}
