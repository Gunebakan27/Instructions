package day21accessmodifiersstringbuilder;

//public class Test {
//
//	public static void main(String[] args) {
//		class Test{ 
//
//		    int x; 
//
//		    Test(int i) { x = i; } 
//
//		    Test()      { x = 0; } 
//
//		} 
//
//		  
//
//		class A{ 
//
//		    public static void main(String[] args){ 
//
//		        Test t = new Test(5);  
//
//		        change(t); 
//
//		        System.out.println(t.x); 
//
//		    } 
//
//		    public static void change(Test t){ 
//
//		        t = new Test(); 
//
//		        t.x = 10; 
//
//		    } 
//
//		} 
//	}
//	Test 05
	class Test{ 

	    int x; 

	    Test(int i) { x = i; } 

	    Test()      { x = 0; } 

	} 

	  

	class A{ 

	    public static void main(String[] args){ 

	        Test t = new Test(5);  

	        change(t); 

	        System.out.println(t.x); 

	    } 

	    public static void change(Test t){ 

	        t.x = 10; 

	    } 

	} 

