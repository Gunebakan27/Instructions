package day21accessmodifiersstringbuilder;

public class Varargs01 {
	/*
	 * 1)In a method, you can not use multiple varargs.
	 * 2)In a method, after the varargs you cannot use any other parameter. So varargs must be the last parameter.
	 * 3)Before the varargs you can put many multiple parameters, no limitation.
	 * 4)Varargs must be the last element.
	 */

	public static void main(String[] args) {
		System.out.println("The sum: "+add(2,3,4));
		
		System.out.println(join('A', 'l', 'i','y','e'));

		
	}
//	Varargs is unlimited capacity array

	public static int add(int... a) {
		int sum=0;
		for(int w:a) {
			sum=sum+w;
		}
		return sum;
	}
	public static String join(char...c) {
		String name="";
		for(char w:c) {
			name=name+w;
			name=name.toUpperCase();
		}
		return name;
	}
}
