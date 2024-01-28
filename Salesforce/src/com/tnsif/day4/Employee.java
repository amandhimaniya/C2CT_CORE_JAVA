package com.tnsif.day4;

public class Employee {
	// Declare Variable
	private int employeeid;
	private String employeeName;
	private String employeeDepartment;
	
	// Constructor
	public Employee(int employeeid, String employeeName, String employeeDepartment) {
		super();
		this.employeeid = employeeid;
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
	}
	// Getter And Setter
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	// To String Method
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeeName=" + employeeName + ", employeeDepartment="
				+ employeeDepartment + "]";
	}
	
	

}
