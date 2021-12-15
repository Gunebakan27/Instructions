package day25interface;

public abstract class ElectricalVehicles implements AirCondition {

	@Override
	public void climateAc() {

		System.out.println("The electrical vehicle climate AC..");
	}

	@Override
	public void run() {
		System.out.println("The electrical vehicle runs the best..");
		
	}



	
}
