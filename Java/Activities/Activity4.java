package activities;

import java.util.Arrays;

public class Activity4 {
	
	public static void main(String[] args) {
		
		int[] nums = {100, 67, 1, 98, 1345};
		
		ascendingSort(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void ascendingSort(int[] array) {
		
		for (int i =1; i< array.length; i ++) {
			
			for (int j = 0; j <array.length - i; j++) {
				if (array[j]>array[j + 1]) {
					int temp = array[j];
		            array[j] = array[j + 1];
		            array[j + 1] = temp;
				}
			}
		}
	}

}
