package activities;

public class Activity1 {
	
	public static void main(String[] args) {

	Car carName = new Car("Black", 2014, "Manual");
	
	carName.displayCharacteristics();
	carName.accelerate();
	carName.brake();
	
}
}
