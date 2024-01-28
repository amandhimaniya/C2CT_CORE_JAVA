package com.tnsif.day5;

public class Client {

	public static void main(String[] args) {
		Address address1 = new Address(113,3,"Manesar","Gurugram","Haryana");
		Person person1 = new Person("101b","Aman Kumar",address1);
		
		System.out.println(person1);

	}

}
