package com.tnsif.day2;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		EncapsulationDemo laptop1 = new EncapsulationDemo();
		System.out.println("Please..! Enter the Laptop Details");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Laptop Name :- ");
		laptop1.setLaptopName(sc.nextLine());
		
		System.out.println("Enter the Serial number :- ");
		laptop1.setLaptopSerialno(sc.nextInt());
		
		System.out.println("Enter the Laptop price :- ");
		laptop1.setLaptopPrice(sc.nextInt());
		
		System.out.println("Your Laptop details are :- "+laptop1);

	}


}
