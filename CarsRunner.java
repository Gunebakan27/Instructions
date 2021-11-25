package day13statickeyword;

public class CarsRunner {

	public static void main(String[] args) {
//inside the cars class, we have 6 variables.
//but by using class name you can access just static variables
		System.out.println(Cars.numOfCars);
//To access instance variable you have to create object		
		Cars c1=new Cars();
		System.out.println(c1.make);
		System.out.println(c1.model);
		System.out.println(c1.price);
		System.out.println(c1.vin);
		System.out.println(c1.year);
//Static variables can be accessed by using objects but it is not recommended 
//because static variable is not related with object. Therefore you are getting yellow underline.
		System.out.println(c1.numOfCars);
//engine() method is static method, because of that we can access to it by using just class name
		System.out.println(Cars.engine());
//drive method is non-static method. Because of that to access drive method, i used c1 object.
		c1.drive();
//Static method can be accessed by using objects but it is not recommended 
//because static method is not related with object. Therefore you are getting yellow underline.
		System.out.println(c1.engine());
		
		Cars c2=new Cars("Honda", "Civic", 7000, 2012);
		String vinC2=Cars.createVin(c2);
		System.out.println(vinC2);
		
		Cars c3=new Cars("Audi", "R8", 57000, 2021);
		String vinC3=Cars.createVin(c3);
		System.out.println(vinC3);
	}

}
