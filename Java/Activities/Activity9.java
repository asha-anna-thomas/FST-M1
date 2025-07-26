package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
	public static void main (String[] args) {
		List<String> myList = new ArrayList<String>();
//		Add 5 names to the ArrayList using add() method.
		myList.add("asha");
		myList.add("anna");
		myList.add("serah");
		myList.add("joe");
		myList.add("alex");
		
		//Then print all the names using for loop
		for(String names : myList) {
			System.out.println(names);
		}
		
		//Then use get() method to retrieve the 3rd name in the ArrayList.
		System.out.println(myList.get(2));
		
		//Use contains() method to check if a name exists in the ArrayList.
		if(myList.contains("asha")) {
			System.out.println("element found");
		}else {
			System.out.println("not found");
		}
		
		//Use size() method to print the number of names in the ArrayList.
		System.out.println("total number of elements are : " + myList.size());
		
		//Use remove() method to remove a name from the list and print the size() of the list again.
		myList.remove(1);
		System.out.println("now the total elements are : " + myList.size());
		
		
	}
	

}
