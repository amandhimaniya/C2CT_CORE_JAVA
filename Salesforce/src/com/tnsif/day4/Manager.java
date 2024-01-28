package com.tnsif.day4;

public class Manager extends Employee {
	private String teamSize;
	
	// Constructor
	public Manager(int employeeid, String employeeName, String employeeDepartment, String teamSize) {
		super(employeeid, employeeName, employeeDepartment);
		this.teamSize = teamSize;
	}

	//Getter and Setter
	public String getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(String teamSize) {
		this.teamSize = teamSize;
	}

	// To string
	@Override
	public String toString() {
		return "Manager [teamSize=" + teamSize + ", getEmployeeid()=" + getEmployeeid() + ", getEmployeeName()="
				+ getEmployeeName() + ", getEmployeeDepartment()=" + getEmployeeDepartment() + "]";
	}
	
	
	

}
