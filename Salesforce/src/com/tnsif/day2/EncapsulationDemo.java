package com.tnsif.day2;

public class EncapsulationDemo {
	// Declaration of Variables
	private String laptopName;
	private int laptopSerialno;
	private int laptopPrice;
	
	// Getter and Setter 
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	public int getLaptopSerialno() {
		return laptopSerialno;
	}
	public void setLaptopSerialno(int laptopSerialno) {
		this.laptopSerialno = laptopSerialno;
	}
	public int getLaptopPrice() {
		return laptopPrice;
	}
	public void setLaptopPrice(int laptopPrice) {
		this.laptopPrice = laptopPrice;
	}
	@Override
	public String toString() {
		return "EncapsulationDemo [laptopName=" + laptopName + ", laptopSerialno=" + laptopSerialno + ", laptopPrice="
				+ laptopPrice + "]";
	}
	

}
