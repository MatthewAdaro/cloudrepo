package org.ssglobal.training.codes.itemC;

public class TestGeneralMethods {

	public static void main(String[] args) {
		GeneralMethods general = new GeneralMethods();
		
		general.powersOfTwo();
		general.alarm(10);
		System.out.println();
		System.out.println(general.sum100());	
		System.out.println(general.sumRange(10, 20));
		System.out.println(general.maxOfTwo(100222, 2300));
		System.out.println(general.larger(2300.023, 123.432));
		System.out.println(general.evenlyDivisible(50, 6));
	}

}
