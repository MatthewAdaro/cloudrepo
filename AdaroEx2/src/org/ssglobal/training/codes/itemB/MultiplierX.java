package org.ssglobal.training.codes.itemB;

public class MultiplierX {
	
	/* Prints the product by computing the firstNum multiply by secondNum
	 */
	public void multiply(){
		// declare data
		double firstNum;
		double secondNum;
		double product;
		
		firstNum = 10;
		secondNum = 20.5;
		// calculate result
		product = firstNum * secondNum;
		// output results
		System.out.print(firstNum + " * ");
		System.out.print(secondNum + " = ");
		System.out.println(product);
	}
}
