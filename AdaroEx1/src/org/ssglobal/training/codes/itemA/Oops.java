package org.ssglobal.training.codes.itemA;

public class Oops {
	public static void main(String[] args) {
		int a = 7;		//first integer for comparison
		int b = 42;     //second integer for comparison
		int smaller = minimum(a, b);	
		
		if (smaller == a) {
			System.out.println("a is the smallest!");
		} else {
			
		}
		
	}
	
	/* This method returns which integer is smaller */	
	public static int minimum(int a, int b) {
		int smaller;
		
		if (a < b) {
			smaller = a;
		} else {
			smaller = b;
		}
		return smaller;
	}
	
}
