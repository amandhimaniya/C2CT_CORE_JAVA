package com.tnsif.day7;

public class StateBankOfIndia extends ReserveBankOfIndia {

	@Override
	public float rateofinterest() {
		// TODO Auto-generated method stub
		return 7.3f;
	}

	@Override
	public String toString() {
		return "StateBankOfIndia [rateofinterest()=" + rateofinterest() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
