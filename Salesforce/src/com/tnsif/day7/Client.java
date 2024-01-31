package com.tnsif.day7;

public class Client {

	public static void main(String[] args) {
		ReserveBankOfIndia r = new ReserveBankOfIndia();
		StateBankOfIndia s = new StateBankOfIndia();
		AxisBank a = new AxisBank();
		HdfcBank h = new HdfcBank();
		PunjabNationalBank p = new PunjabNationalBank();
		System.out.println(r);
		System.out.println(s);
		System.out.println(a);
		System.out.println(h);
		System.out.println(p);

	}

}
