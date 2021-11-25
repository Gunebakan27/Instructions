package day13statickeyword;

public class Cars {
	public String make;
	public String model;
	public int price;
	public int year;
	
	public static int numOfCars=0;
	public String vin;
	
	public Cars() {
		
	}
	
	public Cars(String make, String model,int price,int year) {
	this.make=make;
	this.model=model;
	this.year=year;
	this.price=price;
	numOfCars++;
	}

//If you dont use static keyword between access modifier and returntype,
//the method will be instance method
	public void drive() {
		System.out.println("Iam driving the car..");
	}
	
	public static String engine() {
		return "Engine exists..";
		
	}
	public static String createVin(Cars c) {
		String vin=c.make.substring(0,3)+c.model.charAt(0)+c.year+numOfCars;
				
		return vin;
	}

}
