package com.tnsif.day3;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Costumer c1 = new Costumer("Aman Kumar","Gurugram");
		Costumer c2 = new Costumer();
		System.out.println(c1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter costumer name");
		c2.setCostumerName(sc.nextLine());
		
		System.out.println("Enter costumer Address");
		c2.setCostumerAddress(sc.nextLine());
		
		System.out.println(c2);
		
		
		

	}

}
