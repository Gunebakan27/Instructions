package day20passbyvaluedatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import day21accessmodifiersstringbuilder.Student;

public class Date01 extends Student{
/*
 * We can create object in 2 ways;
 * i) by using "new" keyword. For example "int arr[]=new int[3];"
 * ii) We convert a existing object to another object. "List<Integer>list=Arrays.asList(12,13,14);"
 * 
 */
	public static void main(String[] args) {

		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		//How to manipulate date
		LocalDate currentDate=LocalDate.now();
		System.out.println("Before "+currentDate);

		currentDate= currentDate.plusDays(7);
		System.out.println("After: "+currentDate);
		
		System.out.println(currentDate.minusDays(2));
		
		currentDate=currentDate.plusMonths(5);
		System.out.println(currentDate);
		
		currentDate=currentDate.minusYears(6).plusMonths(4).minusDays(5);
		System.out.println(currentDate);
		
		//How to manipulate date
		LocalTime currentTime=LocalTime.now();
		currentTime.getHour();
		
		int hour = currentTime.getHour();
		System.out.println(hour);//21
		
		boolean isAfter = currentTime.isAfter(LocalTime.of(20, 11, 32, 1234));
		System.out.println(isAfter);
		
		System.out.println(currentTime.NOON);//12:00pm
		System.out.println(Integer.MIN_VALUE);
		
		Student std3=new Student();
	
		
		
	}
}
