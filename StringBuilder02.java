package day21accessmodifiersstringbuilder;

public class StringBuilder02 {

	public static void main(String[] args) {

		StringBuilder sb1=new StringBuilder("Java");
		StringBuilder sb2=new StringBuilder("Java");
		
		System.out.println(sb1.charAt(2));//v
		
//		compareTo() compares the StringBuilders alphabetic order.
//		"0" mean completely same
//		"Negative numbers" mean, first StringBuilder is before the second one
//		"positive numbers" mean first StringBuilder is after the second one.
		System.out.println(sb1.compareTo(sb2));
		
		sb1.delete(1, 3);
		System.out.println(sb1);
		
		sb2.deleteCharAt(3);
		System.out.println(sb2);
		
		System.out.println(sb2.equals(sb1));
		
		System.out.println(sb2.indexOf("v"));
		
		System.out.println(sb2.indexOf("v", 3));
		
//		The greatest first parameter can be the length. If you use number more than length in the first parameter, you will get Run Time Error
		System.out.println(sb2.insert(0, "s"));
		
		sb2.insert(3, "XYZY", 0, 4);
		System.out.println(sb2);
		
		System.out.println(sb2.lastIndexOf("Y"));
		
		System.out.println(sb2.lastIndexOf("Y", 7));
		
		sb2.replace(1, 4, "-");
		System.out.println(sb2);
		
		sb2.reverse();
		System.out.println(sb2);
		
		sb2.setCharAt(0, '*');
		System.out.println(sb2);
		
		System.out.println(sb2.subSequence(1, 3));//-->CharSequence object
		
		System.out.println(sb2.substring(1, 3));//"YZ"--> String object
		
//		String s1=sb2.toString().replace("Y", "y");//convert StringBuilder to String
//		System.out.println(s1);
//		
//		sb2=new StringBuilder(s1);
		System.out.println(sb2);
//		or
		sb2=new StringBuilder(sb2.toString().replace("Y", "y"));
		System.out.println(sb2);
		
	
	}

}
