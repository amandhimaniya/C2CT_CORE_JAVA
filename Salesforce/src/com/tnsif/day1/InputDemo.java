package com.tnsif.day1;

import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first Number :-");
		num1=sc.nextInt();
		System.out.print("Enter the Second Number :-");
		num2=sc.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println("The Sum of "+ num1 +" and "+ num2 +" :- "+ sum);
		
		
	}

}
