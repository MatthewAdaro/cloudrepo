package org.ssglobal.training.codes.itemF;

public class AssignMe {
	public static void main(String[] args) {
		int x;		// first integer for interchanging the value
		int y;		// second integer for interchanging the value
		
		x = 3;
		y = x + x;
		x = x + y; 	
		y = x - y; 
		x = x - y; 
		System.out.println(x);
		System.out.println(y);
	}

}
