package com.tnsif.practice.corejava;
// Super Class
public class BicycleInheritence {
	protected int gear;
	protected int speed;
	
	public BicycleInheritence(int startGear, int startSpeed) {
		super();
		this.gear = startGear;
		this.speed = startSpeed;
	}
	
	public void setgear(int newValue) {
		gear = newValue;
	}
	
	public void applybrake(int decrement) {
		speed -= decrement;
	}
	public void speedup(int increment) {
		speed += increment;
	}

}
