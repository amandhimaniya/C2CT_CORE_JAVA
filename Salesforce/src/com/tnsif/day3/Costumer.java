package com.tnsif.day3;

// TO understand the concept of constructor
public class Costumer {
	// Variable Declaration
	private String costumerName;
	private String costumerAddress;

	// Non-Arg Constructor
	public Costumer() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor
	public Costumer(String costumerName, String costumerAddress) {
		super();
		this.costumerName = costumerName;
		this.costumerAddress = costumerAddress;
	}

	// Getter and setter
	public String getCostumerName() {
		return costumerName;
	}

	public void setCostumerName(String costumerName) {
		this.costumerName = costumerName;
	}

	public String getCostumerAddress() {
		return costumerAddress;
	}

	public void setCostumerAddress(String costumerAddress) {
		this.costumerAddress = costumerAddress;
	}

	// To string method
	@Override
	public String toString() {
		return "Costumer [costumerName=" + costumerName + ", costumerAddress=" + costumerAddress + "]";
	}
	
	
	

}
