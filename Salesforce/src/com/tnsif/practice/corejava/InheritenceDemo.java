package com.tnsif.practice.corejava;
//Inherited class
public class InheritenceDemo {

	public static void main(String[] args) {
		MountainBike mountainbike = new MountainBike(20,1,10);
		System.out.println("Gear is :- "+ mountainbike.gear);
		System.out.println("Seatheight is in cm :- "+ mountainbike.seatHeight);
		System.out.println("Speed is :- "+ mountainbike.speed);
		
		mountainbike.applybrake(2);
		System.out.println("Bike Speed after apply brake :- "+ mountainbike.speed);
		

	}

}
