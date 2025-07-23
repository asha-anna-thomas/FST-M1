package activities;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public Car(String color, int make, String transmission) {
		this.color=color;
		this.make = make;
		this.transmission = transmission;
		this.tyres =4;
		this.doors =4;
	}
	
	public void displayCharacteristics() {
		System.out.println(this.color);
		System.out.println(this.make);
		System.out.println(this.transmission);
		System.out.println(this.tyres);
		System.out.println(this.doors);
	}
	
	public void accelerate() {
		System.out.println("This car is moving forward");
	}
	
	public void brake() {
		System.out.println("Car has stopped");
	}

}
