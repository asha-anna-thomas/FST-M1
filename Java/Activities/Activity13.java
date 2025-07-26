package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
	
	public static void main(String[] args) {
		//Create a Scanner object named scan.
		Scanner scan = new Scanner(System.in);
		//Create an ArrayList object named list
		ArrayList<Integer> list = new ArrayList<Integer>();
		//Create a Random class object named indexGen.
		Random indexGen = new Random();
		
		System.out.println("enter the numbers (non-integer to stop): ");
				
		//Add a scan statement with nextInt() to accept only integer values, inside a loop to accept multiple values.
		while(scan.hasNextInt()) {
			list.add(scan.nextInt());
		}
		
		scan.close();
		
		//To print the number from an array, we convert the ArrayList into an array using the toArray() method
		Integer nums[] = list.toArray(new Integer[0]);
		
		//Use indexGen to generate an integer value with the bounds set to the length of nums array.
		int arraylength = indexGen.nextInt(nums.length);
		
		//Print the index value that was generated and the value in the array at that index value.
		System.out.println("generated index : " + arraylength);
		System.out.println("value at index " + arraylength + " : " + nums[arraylength]);
		
		
	}
	
	
	
}
