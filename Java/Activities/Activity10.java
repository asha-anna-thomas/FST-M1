package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {
	
	public static void main (String[] args) {
		
		//Create a HashSet named hs.
		Set<Integer> hs = new HashSet<Integer>();
		
		//Add 6 objects using add() method to the HashSet.
		hs.add(2);
		hs.add(1);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(6);
		
		//Then print the size of the HashSet using the size() method.
		System.out.println(hs.size());
		
		//Remove an element using the remove() method.
		hs.remove(6);
		//Also try to remove an element that is not present in the Set.
		if(hs.remove(8)) {
			System.out.println("element is found and removed");
		}else {
			System.out.println("element not found to be removed");
		}
		
		//Use the contains() method to check if an item is in the Set or not.
		if(hs.contains(2)) {
			System.out.println("element found");
		} else {
			System.out.println("not found");
		}
		
		//Print the updated set.
		System.out.println(hs);
	}

}
