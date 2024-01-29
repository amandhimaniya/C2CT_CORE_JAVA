package com.tnsif.day6;

public class ClientStatic {

	public static void main(String[] args) {
		// we can not Create Objects When we have static method we can directly accessed by class

		System.out.println("When both are Integer "+	MethodOverloadingStatic.addition(5, 10));
		System.out.println("When both are Float "+	MethodOverloadingStatic.addition(5.6f, 10.1f));
		System.out.println("When both are Integer "+	MethodOverloadingStatic.addition(5.6f, 10));
		System.out.println("When both are Integer "+	MethodOverloadingStatic.addition(5, 11.f));
		System.out.println("When both are Integer "+	MethodOverloadingStatic.addition("Aman", "Kumar"));
		

	}

}
