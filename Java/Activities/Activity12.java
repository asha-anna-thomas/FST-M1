package activities;

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * In this main method, create two variables, both of type Addable(the interface).
			One variable, say ad1, contains a lambda expression(no body), that saves the result of num1 plus num2.
			The other variable, say ad2, contains a lambda function(has a body), that also saves the result of num1 plus num2.
		 */
		Addable ad1 = (num1, num2) -> (num1 + num2);
		System.out.println(ad1.add(10, 110));
		
		Addable ad2 = (int x, int y)->{
			return x+y;
		};
		System.out.println(ad2.add(1000, 9880));
	}

}
