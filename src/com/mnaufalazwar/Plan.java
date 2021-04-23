package com.mnaufalazwar;

abstract class Plan {
	
	protected double rate;
	abstract void getRate();
	
	public void calculateBill(int units) {
		System.out.println("bill = " + units*rate);
	}

}
