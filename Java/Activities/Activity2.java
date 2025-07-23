package activities;

public class Activity2 {
	
	public static void main (String[] args) {
		int[] test = {10, 77, 10, 54, -11, 10};
		
		int temp = 0;
		
		for (int i=0;i<test.length; i++) {
			
			if(test[i]==10) {
				temp = temp + test[i];
			}			
		}
			
		if (temp == 30) {
			System.out.println("Value is 30");
		}
		
	}

}
