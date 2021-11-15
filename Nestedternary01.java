package day06nestedternary;


import java.util.Scanner;
public class Nestedternary01 {
    
    /*
        Type java code by using nested ternary.
        Write a program to check if a year is leap year or not.
        If the year is divisible by 100 then it must be divisible by 400.
        If a year is not divisible by 100 then it must be divisible by 4.
    */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year...");
        int year1=scan.nextInt();
        System.out.println((year1%100==0) && (year1%400==0) ? "It is a leap year" : (year1%4==0) ? "It is a weak leap year" : " not leap");
          
        
        
        
        
        
        
        System.out.println("Enter a year...");
        int year = scan.nextInt();
        
        String result = (year%100==0) ? ( (year%400==0) ? ("leap year") : ("not leap year") ) : ( (year%4==0) ? ("leap year") : ("not leap year") );
        System.out.println(year + " is a " +  result);
        
        scan.close();
    }
}
