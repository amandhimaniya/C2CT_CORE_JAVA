package com.tnsif.practices;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number !! ");
		num=sc.nextInt();
		
		if(num%2==0)
			System.out.println("The number is Even");
		else
			System.out.println("The Number is Odd");

	}

}
