package com.tnsif.practices;

import java.util.Scanner;

public class ConditionalStringDemo {

	public static void main(String[] args) {
		String gender;
		int age;
		System.out.println("Enter Your Gender");
		Scanner sc = new Scanner(System.in);
		gender = sc.next();
		System.out.println("Enter Your Age");
		age = sc.nextInt();
		
		if(gender.equalsIgnoreCase("Male")) 
		{
			if(age <= 10 || age > 60) 
			{
				System.out.println("You are child/Senior citizen your travelling is free");
			}
			else
			{
				System.out.println("You are Adult male you are not getting any discount"); 
			}
		}
		else if(gender.equalsIgnoreCase("Female"))
		{
			if(age <= 10 || age > 60) 
			{
				System.out.println("You are child/Senior citizen your travelling is free");
			}
			else
			{
				System.out.println("You are Adult Female, you are getting 25% discount"); 
			}
		}
		else if(gender.equalsIgnoreCase("Transgender"))
		{
			if(age <= 10 || age > 60) 
			{
				System.out.println("You are child/Senior citizen your travelling is free");
			}
			else
			{
				System.out.println("You are Adult Transgender you are getting 50% discount");
			}
		}
		
		else
		{
			System.out.println("You are Getting No discount");
		}
	}
}





