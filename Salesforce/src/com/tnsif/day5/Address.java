package com.tnsif.day5;

public class Address {
	private int personHouseno;
	private int personStreetno;
	private String personCity;
	private String personDistrict;
	private String personState;
	
	// Constructor
	
	public Address(int personHouseno, int personStreetno, String personCity, String personDistrict,
			String personState) {
		super();
		this.personHouseno = personHouseno;
		this.personStreetno = personStreetno;
		this.personCity = personCity;
		this.personDistrict = personDistrict;
		this.personState = personState;
	}
	// Getter and Setter Method
	public int getPersonHouseno() {
		return personHouseno;
	}
	public void setPersonHouseno(int personHouseno) {
		this.personHouseno = personHouseno;
	}
	public int getPersonStreetno() {
		return personStreetno;
	}
	public void setPersonStreetno(int personStreetno) {
		this.personStreetno = personStreetno;
	}
	public String getPersonCity() {
		return personCity;
	}
	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}
	public String getPersonDistrict() {
		return personDistrict;
	}
	public void setPersonDistrict(String personDistrict) {
		this.personDistrict = personDistrict;
	}
	public String getPersonState() {
		return personState;
	}
	public void setPersonState(String personState) {
		this.personState = personState;
	}
	@Override
	public String toString() {
		return "Address [personHouseno=" + personHouseno + ", personStreetno=" + personStreetno + ", personCity="
				+ personCity + ", personDistrict=" + personDistrict + ", personState=" + personState + "]";
	}
	
	

}
