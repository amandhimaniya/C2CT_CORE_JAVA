package com.tnsif.day7;

public class HdfcBank extends ReserveBankOfIndia {

	@Override
	public float rateofinterest() {
		// TODO Auto-generated method stub
		return 8.5f;
	}

	@Override
	public String toString() {
		return "HdfcBank [rateofinterest()=" + rateofinterest() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
