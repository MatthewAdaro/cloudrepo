package org.ssglobal.training.codes.itemB;

public class ArithmeticX {
	
	/* Prints the average by adding all the number divide by 3
	 */
	public void compute() {
		// declare variables
		float number1;
		float number2;
		float number3;
		
		// input data
		number1 = 1.1f;
		number2 = 2.2f;
		number3 = 3.3f;
		// calculate average
		float average = number1 + number2 + number3 / 3;
		// print results
		System.out.print(number1 + ", " + number2 + " & " + number3);
		System.out.println(" averages to " + average);
	}
}
