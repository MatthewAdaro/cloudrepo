package org.ssglobal.training.codes.itemI;

public class FahrenheitToCelsiusx {
	public static void main(String[] args) {
		// declare and initialize data
		double Fahrenheit = 22.6;
		// calculate celsius equivalent
		double celsius = (Fahrenheit - 32) * 5 / 9;
		
		// output results
		System.out.println(Fahrenheit + "\u00b0F");
		System.out.println(celsius + "\u00b0C");
	}

}

/*
 Compiler Error
 	1. Type mismatch cannot convert double to float on line 6
 	2. Type mismatch cannot convert double to float on line 7
 	3. fahrenheit variable does not exist on line 9
 	4. fahrenheit variable in the output does not exist on line 11
 	5. celcius variable in the output does not exist on line 12
 	6. concatenation error by using "," instead of "+" on line 11
 	7. concatenation error by using "," instead of "+" on line 12
 	8. Invalid escape sequence on line 11
 
 Logic Error
 	1. Celsius variable is redundant because it is already declared in line 6
 	2. Wrong use of operator precedence resulting to a wrong celsius output. 
 	3. The formula should be the (fahrenheit - 32) * 5 / 8
 
 User-Experience Error
 	1. Wrong format code for "\U00B0F =" output on line 11
 	2. Wrong format code for "u00B0C" output on line 12
 	3. Wrong conversion of fahrenheit to celcius
 
 Readability Error
 	1. All binary operators should be separated from their operands by spaces
 	   and there is no space between the first and last value of a parenthesis
 */
