package org.ssglobal.training.codes.itemD;

public class Overflow {
	
	/* Return true if x + y causes an overflow to the byte’s range of
	   values (e.g., -128 to 127), and false otherwise
	 */
	public static boolean sumOverflow(byte x, byte y) {
		short sum = (short) (x + y);
		
		return ((sum < 127) && (sum >= -128)) ? false : true;
	}
	
}
