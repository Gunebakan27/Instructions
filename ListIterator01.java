package practice;
import java.util.*;
public class ListIterator01{

		   public static void main(String... l) {
	
			   List<String> li = new ArrayList<String>();
		        li.add("Hello");
		        li.add("Madam");
		        ListIterator i = li.listIterator();
		        while (i.hasNext()) {
		            i.add("Hi");
		            i.next();
		            i.add("Hll");
		            
		        }System.out.println(li);
		       
			   
			   
			   
//		        List<String> li = new ArrayList<String>();
//		        li.add("Hai");
//		        li.add("Hello");
//		        
//		        ListIterator i = li.listIterator();
//		        
//		        while (i.hasNext()) {
//		            i.next();
//		        	i.add("Hi"); // Line 1
//		                }
//		        System.out.println(li);
//		    

	
		
		
//List<Integer> list = new ArrayList<Integer>(); 
//
//java.util.ListIterator <Integer> listIterator = null; 
//
//list.add(23); list.add(98); list.add(29); list.add(71); list.add(5); 
//
//listIterator = list.listIterator (); 
// 
////System.out.println(listIterator);
//System.out.println("Elements in backward direction:"); 
//
////while(listIterator.hasNext()) {
////	listIterator.next();
//	
////}
// while(listIterator.hasPrevious()){
//
//System.out.println(" xxx"+listIterator.previous());
// }
//public class King {
//    public static void main(String[] args) {
//        King k = new King();
//        Elephant e = k.new Elephant();
//        System.out.print("Output = ");
//        System.out.print(e.step2(2, 3));
//        
//       
//        
//       
//    }
//    interface Queen {
//        float step2(int low, int high);
//    }
//    interface Pawn {
//        float step3(int a, int b, int c);
//    }
//   
//    class Elephant implements Queen {
//        public float step2(int x, int y) {
//            return 2;
//        }
//    }
//}
//interface SixesMachine {
//    void hitSixes();
//}
//abstract class DhoniInTheMaking implements SixesMachine {
//    public String numberOfSixes() {
//    	 System.out.println("bos");
//        return "6 0 6 3 6 6 6 6";
//       
//    }
//    public void printRunsTrail(String runsAndRuns) {
//        System.out.println(runsAndRuns);
//    }
//}
//public class Dhoni extends DhoniInTheMaking {
//    public static void main(String args[]) {
//        DhoniInTheMaking outputClass = new Dhoni();
//        outputClass.hitSixes();
//    }
//    public void hitSixes() {
//        numberOfSixes();
//        printRunsTrail(numberOfSixes());
//    }
//}
//class I1 {
//    public static void main(String[] args) {
//        A a = new A();
//        a.m1();
//        a.m4();
//        B.class.m2();
//    }
//}
//interface I {
//    void m1();
//    void m4();
//}
//interface I2 {
//    void m2();
//}
//class A implements I {
//    public void m1() {    System.out.print("1");    }
//    public void m4() {    System.out.print("2");    }
//    public void m2();
//}
//abstract class B implements I2 {
//    public void m1() {    }
//    public void m2() {    System.out.print("3");    }
//    void m3() {    }
//}
//public class Revolution2020 {
//    public static void main(String[] args) throws Exception {
//        Love love = new Love();
//        love.aarti();
//        Ambition gopal = new Corruption();
//        Ambition raghav = new Ambition() {
//            public String goal() {
//                return "Pen Is Powerful ";
//            }
//            public void aarti() {
//                System.out.print("Respect ");
//            }
//        };
//        gopal.aarti(); gopal.goal();
//        raghav.aarti(); raghav.goal();
//        System.out.print(((Corruption) gopal).shukla());
//    }
//}
//class Love {
//    void aarti() { System.out.print("Beautiful ");    }
//}
//interface Ambition {
//    String goal();
//    void aarti();
//}
//class Corruption extends Love implements Ambition {
//    int shukla() throws Exception { return 2020; }
//    public String goal() { return "Get Rich "; }
//    public void aarti() { System.out.print("Confused "); }
//}
//public class SmileyTest {
//    public static void main(String[] args) {
//        Smile a = new Smile();
//        talk(a);
//        a.frown();
//    }
//    public static void talk(ISmile ia1) {
//        System.out.print(" :-0 ");
//        ia1.smile();
//    }
//}
//
//interface ISmile {
//    void smile();
//}
//
//class Smile implements ISmile {
//  void smile() {
//        System.out.print(" :-) ");
//    }
//    void frown() {
//        ISmile a1 = new Smile();
//        a1.smile();
//        System.out.print(" :-[ ");
//    }
//}
//interface I1 {
//    void m1();
//}
//
//interface I2 extends I1 {
//    void m2();
//}
//
//abstract class A implements I1 {
//    public void m1() {}
//    public void m2() {}
//}
//
//abstract class B implements I2 {}
//
//class C extends A implements I1, I2 {}
//
//class D extends A {}

//interface I1
//{
//    void m1();
//}
//
//interface I2 extends I1
//{
//    void m2();
//}
//
//class A implements I1, I2
//{
//    public void m2()
//    {
//
//    }
//
//    public void m()
//    {
//
//    }
//}
//
//class B implements I2
//{
//
//}
//
//class C extends A implements I1, I2
//{
//
//}
//
//class D extends A
//{
//
//}

//interface I1
//{
//    void I1m1();
//}
//
//interface I2 extends I1
//{
//    void I2m2();
//}
//
//abstract class A implements I1, I2
//{
//    public void I2m2()
//    {
//
//    }
//
//    public void I1m1()
//    {
//
//    }
//}
//
//abstract class B
//{
//
//}
//
//class C extends A implements I1, I2
//{
//
//}
//
//class D extends A
//{
//
//}

//public class SmileyTest
//{
//    public static void main(String[] args)
//    {
//        ISmile a = new Smile();
//        
//        talk(a);
//        ((Smile)a).frown();
//    }
//
//    public static void talk(ISmile a)
//    {
//        System.out.print(" :-0 ");
//        a.smile();
//    }
//}
//
//interface ISmile
//
//{
//	
//    public void smile();
//}
//
//class Smile implements ISmile
//{
//    public void smile()
//    {
//        System.out.print(" :-) ");
//    }
//
//    void frown()
//    {
//        ISmile a1 = new Smile();
//        a1.smile();
//        System.out.print(" :-[ ");
    }
}