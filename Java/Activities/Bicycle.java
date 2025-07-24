package activities;

public class Bicycle implements BicycleParts, BicycleOperations{

	int gears;
	int currentSpeed;
	
	//Initialize the values of gears and currentSpeed in a constructor.
	public Bicycle( int gears, int currentSpeed) {
		this.gears = gears;
		this.currentSpeed = currentSpeed;
	}
	
	//Write the definition of the applyBrake() and speedUp().
	@Override
	public void applyBrake(int decrement) {
		// TODO Auto-generated method stub
		currentSpeed = currentSpeed - decrement;
	}

	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		currentSpeed = currentSpeed + increment;
	}

	//Add another method to the base class - bicycleDesc().
	public String bicycleDesc() {
		return ("gear " + gears + " speed " + maxSpeed);
		
	}
}
