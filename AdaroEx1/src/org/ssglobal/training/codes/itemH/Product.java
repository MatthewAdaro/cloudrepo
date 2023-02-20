package org.ssglobal.training.codes.itemH;

public class Product {
	String productName;
	int quantity;
	
	/* Increase the quantity by the value pass in the increment variable*/
	public void downLoad(int increment) {
		this.quantity += increment;
	}
	
	/* Decrease the quantity by the value pass in the decrement variable*/
	public void upLoad(int decrement) {
		this.quantity -= decrement;
	}
	
	/* return the product name and quantity as a string */
	public String print() {
		return this.productName + ", " + this.quantity + " pieces" ;
	}
}
