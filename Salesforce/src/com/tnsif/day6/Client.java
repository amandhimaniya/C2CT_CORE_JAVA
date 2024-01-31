package com.tnsif.day6;

public class Client {

	public static void main(String[] args) {
		// We have to created the object to access the method and member
		MethodOverloading m = new MethodOverloading();
		System.out.println(m.addition(5.5f, 6));
		System.out.println(m.addition(5, 6));

	}

}
