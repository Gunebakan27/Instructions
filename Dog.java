package day22inheritance;

public class Dog extends Mammal {
	public Dog(int age) {
		System.out.println("Integer constructor");
	}
		
		public Dog() {
	
		super(true);
		System.out.println("Boolean Dog constructor..");
	}
	
	public void bark() {
		System.out.println("Dogs bark..");
	}

}
