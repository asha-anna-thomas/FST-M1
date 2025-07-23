package activities;

public class Activity3 {
	public static void main (String[] args) {
		double seconds = 1000000000;
		double EarthSeconds = 31557600;
		double MercurySeconds = 0.2408467;
		double VenusSeconds = 0.61519726;
		double MarsSeconds = 1.8808158;
		double JupiterSeconds = 11.862615;
		double SaturnSeconds = 29.447498;
		double UranusSeconds = 84.016846;
		double NeptuneSeconds = 164.79132;
		
		double ageonEarth = seconds / EarthSeconds;
		double ageonMerc = ageonEarth / MercurySeconds;
		double ageonVenus = ageonEarth / VenusSeconds;
		double ageonMars = ageonEarth / MarsSeconds;
		double ageonJup = ageonEarth /JupiterSeconds;
		double ageonSat = ageonEarth /SaturnSeconds;
		double ageonUran = ageonEarth / UranusSeconds;
		double ageonNept = ageonEarth /NeptuneSeconds;
		
		System.out.println("Age on Earth: " + ageonEarth + " years");
        System.out.println("Age on Mercury: " + ageonMerc + " years");
        System.out.println("Age on Venus: " + ageonVenus + " years");
        System.out.println("Age on Mars: " + ageonMars + " years");
        System.out.println("Age on Jupiter: " + ageonJup + " years");
        System.out.println("Age on Saturn: " + ageonSat + " years");
        System.out.println("Age on Uranus: " + ageonUran + " years");
        System.out.println("Age on Neptune: " + ageonNept + " years");
		
	}

}
