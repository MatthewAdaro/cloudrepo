package org.ssglobal.training.codes.itemA;

public class Temperature {
	public static void main(String[] args) {
		double tempF = 98.6;
		double tempC = 0.0;

		conversion(tempF, tempC);
		System.out.println("Body temp in C is: " + tempC);
	}
	
	/* Converts Fahrenheit temperatures to Celsius. */
	public static void conversion(double tempF, double tempC) {
		tempC = (tempF - 32) * 5 / 9;
	}

}
