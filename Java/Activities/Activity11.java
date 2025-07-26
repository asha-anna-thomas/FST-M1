package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
	
	public static void main (String[] args) {
		
		Map<Integer, String> colors = new HashMap<Integer, String>();
		
		//Add 5 random colours to it and print the Map to the console.
		colors.put(1, "Black");
		colors.put(2, "White");
		colors.put(3, "Orange");
		colors.put(4, "brown");
		colors.put(5, "red");
		System.out.println(colors);
		
		//Remove one colour using the remove() method.
		colors.remove(5);
		
		//Check if the colour green exists in the Map using the containsValue() method.
		if(colors.containsValue("green")) {
			System.out.println("element found");
		} else {
			System.out.println("element not found");
		}
		
		//Print the size of the Map using the size() method.
		System.out.println(colors.size());
	}

}
