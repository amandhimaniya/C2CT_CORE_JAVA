package com.tnsif.day5;

public class Person {
	private String personId;
	private String personName;
	private Address personAddress;
	
	// Constructor
	public Person(String personId, String personName, Address personAddress) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personAddress = personAddress;
	}
	// Getter and Setter 
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public Address getPersonAddress() {
		return personAddress;
	}
	public void setPersonAddress(Address personAddress) {
		this.personAddress = personAddress;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personAddress=" + personAddress
				+ "]";
	}
	
	

}
