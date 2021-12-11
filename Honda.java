package day23inheritanceoverriding;

public class Honda extends Car {
	public void havingHybridEngine() {
		System.out.println("Honda cars have hybrid engine option..");
	}

	@Override
	public void move() {
		System.out.println("Honda moves fast..");
	}

	@Override
	public int price() {
		
		return 30000;
	}

	@Override
	public Honda name() {
		
		return new Honda();


	}

	@Override
	public Integer age() {
		
		return 1;
	}

}
