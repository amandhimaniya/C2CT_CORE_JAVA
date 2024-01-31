package com.tnsif.practice.corejava;
//Sub class
public class MountainBike extends BicycleInheritence {
	int seatHeight;
	

	public MountainBike(int startHeight, int startGear, int startSpeed) {
		super(startGear, startSpeed);
		this.seatHeight=startHeight;
		
	
	}
	
	public void setgear(int newValue) {
		seatHeight = newValue;
	
}
}
