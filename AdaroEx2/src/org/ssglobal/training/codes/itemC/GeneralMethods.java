package org.ssglobal.training.codes.itemC;

public class GeneralMethods {
	
	/* Prints the first 10 powers of 2 (starting with 2)
	 */
	public void powersOfTwo() {
		final byte POWER_OF_TWO = 2;
		short value = 2;
		for(byte counter = 1; counter <= 10; counter++) {
			value *= POWER_OF_TWO;
			System.out.print(value + " ");
		}
	}
	
	/* Prints the word "Alarm!" multiple times on separate lines
	 */
	public void alarm(int length) {
		for(int count = 1; count <= length; count++) {
			System.out.print("\nAlarm!");
		}
	}
	
	/* Returns the sum of the integers from 1 to 100
	 */
	public short sum100() {
		short sum = 0;
		
		for(byte count = 1; count <= 100; count++) {
			sum += count;
		}
		return sum;
	}
	
	/* Accepts two integer parameters that represent a range
	 */
	public int sumRange(int firstInteger, int secondInteger) {
		int sum = 0;
		
		for(int count = firstInteger; count <= secondInteger; count++) {
			sum += count;
		}
		return sum;
	}
	
	/* Accepts two integer parameters and returns the larger of the two
	 */
	public int maxOfTwo(int firstInteger, int secondInteger) {
		return (firstInteger > secondInteger) ? firstInteger : secondInteger;
	}
	
	/* Accepts two floating point parameters (of type double) and
	returns true if the first parameter is greater than the second, 
	and false otherwise
	 */
	public boolean larger(double firstInteger, double secondInteger) {
		return (firstInteger > secondInteger) ? true : false;
	}
	
	/* Accepts two integer parameters and returns true if the first parameter 
	  is evenly divisible by the second, or vice-versa, and false otherwise
	 */
	public boolean evenlyDivisible(int firstInteger, int secondInteger) {
		return (firstInteger % secondInteger == 0) ? true : false;
	}
	
	
	
}
