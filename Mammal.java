package day22inheritance;

public class Mammal extends Animal{
	public Mammal(boolean isFeed) {
		System.out.println("Boolean mammam constructor..");
	}
	public Mammal() {
		super("Dog");
		System.out.println("Nor parameter Mammal constructor..");
	}
	
	public void giveBirth() {
		System.out.println("They give birth");
	}
	public void feedWithMilk() {
		System.out.println("They feed their babies with milk..");
	}

}
