package org.ssglobal.training.codes.itemF;

import java.text.DecimalFormat;

public class Fraction {
	public int numerator;
	public int denominator;
	
	/* Blank Constructor
	 */
	public Fraction() {
		
	}
	
	/* Constructor Parameter
	 */
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	/* Getters
	 */
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	/* Print the numerator and denominator of the class
	 */
	public void printRational() {
		System.out.println(getNumerator() + "/" + getDenominator());
	}
	
	/* add the two fractions from the summand parameter variable
	 */
	public Fraction add(Fraction summand) {
		int	numerator = this.numerator * summand.getDenominator() 
					  + this.denominator * summand.getNumerator();
		int denominator = this.denominator * summand.getDenominator();
		
		return new Fraction(numerator, denominator);
	}

	/* multiply the two fractions from the factor parameter variable
	 */
	public Fraction multiply(Fraction factor) {
		int numerator = this.numerator * factor.getNumerator();
		int denominator = this.denominator * factor.getDenominator();
		
		return new Fraction(numerator, denominator);
	}

	/* compare the two fractions if equal from the comp parameter variable
	 */
	public boolean greaterEqual(Fraction comp) {
		DecimalFormat df = new DecimalFormat("#.00");  
		float fractionValue1 = (float) this.numerator / this.denominator;
		float fractionValue2 = (float) comp.getNumerator() / comp.getDenominator();
		float formatFraction1 = Float.valueOf(df.format(fractionValue1));
		float formatFraction2 = Float.valueOf(df.format(fractionValue2));
		
		return formatFraction1 >= formatFraction2 ? true : false;
	}
	
}
