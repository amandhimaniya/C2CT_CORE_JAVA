package com.tnsif.day7;

// Super Class
public class PunjabNationalBank extends ReserveBankOfIndia {

	@Override
	public float rateofinterest() {
		// TODO Auto-generated method stub
		return 8.0f;
	}

	@Override
	public String toString() {
		return "PunjabNationalBank [rateofinterest()=" + rateofinterest() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
