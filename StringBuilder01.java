package day21accessmodifiersstringbuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
		
//		How to create StringBuilder object
//		1.Way
		StringBuilder sb1=new StringBuilder();
		System.out.println("sb2 is: "+sb1);//Empty
		
		System.out.println("sb1 length: "+sb1.length());
		
	System.out.println("Capacity sb1: "+sb1.capacity());
	sb1.append("addadadsddahgfhfga");
	System.out.println("sb1 length: "+sb1.length());
	System.out.println("Capacity sb1: "+sb1.capacity());
			
		//Although, I didnt do assignment, original value of sb1 is updated to "Ali", it means StrinBuilder is "mutable".
		sb1.append("Ali");
		System.out.println("sb1 is: "+sb1);//sb1 is: Ali
		
		sb1.append(" Can");
		System.out.println("sb1 is: "+sb1);//sb1 is: Ali Can
		
		sb1.append(", how").append(" are").append(" you?");
				System.out.println("sb1 is: "+sb1);

//		
////		2.Way
		StringBuilder sb2=new StringBuilder("Ali Can");
		System.out.println("sb2 is: "+sb2);
		
		System.out.println("sb2 capacity: "+sb2.capacity());//23 is coming from 16+7
		
		sb2.append(" went to school.");
		System.out.println("sb2 is: "+sb2);

////		3.Way:
		StringBuilder sb3=new StringBuilder(9);//5 is the capacity of the StringBuilder. Default capacity is 16
		System.out.println("sb3 is: "+sb3);
		
		System.out.println(sb3.capacity());
		
		sb3.append("1234");
		System.out.println("sb3 is: "+sb3);
		
		sb3.append("56789");
		System.out.println("sb3 is: "+sb3);
		
		
		
		sb3.append("Wooow!");
		System.out.println("sb3 is: "+sb3);
		
		System.out.println(sb3.capacity());//9*2+2=20     11*2+2=24
		
	}

}
