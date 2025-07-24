package activities;

public class Activity6 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Plane plane = new Plane(10);
		//Add names to the passengers list using the onboard method.
		
		plane.onboard("asha");
		plane.onboard("anna");
		plane.onboard("thomas");
		
		//Print the take-off time using the takeOff() method.
		System.out.println(plane.takeOff());
		
		//Print the list of passengers using the getPassengers() method.
		System.out.println(plane.getPassengers());
		
		//Add a Thread.sleep() method to pause execution for 5 seconds. This is to emulate plane in flight.
		Thread.sleep(5000);
		
		//Land() the plane and print the time of landing using getLastTimeLanded() method.
		plane.land();
		System.out.println(plane.getLastTimeLanded());
		System.out.println(plane.getPassengers());
	}

}
