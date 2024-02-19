package com.tnsif.practices;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		String gender;
		int age;
		System.out.println("Enter Your Gender");
		Scanner sc = new Scanner(System.in);
		gender = sc.next();
		System.out.println("Enter Your Age");
		age = sc.nextInt();
		
		if(gender.equals("Male") || gender.equals("male") || gender.equals("MALE")) 
		{
			if(age <= 10 || age > 60) // corrected logical operator from '&' to '&&'
			{
				System.out.println("You are child/Senior citizen your travelling is free");
			}
			else
			{
				System.out.println("You are Adult male you are not getting any discount"); // corrected typo
			}
		}
		else if(gender.equals("Female") || gender.equals("female") || gender.equals("FEMALE"))
		{
			if(age <= 10 || age > 60) 
			{
				System.out.println("You are child/Senior citizen your travelling is free");
			}
			else
			{
				System.out.println("You are Adult Female, you are getting 25% discount"); // corrected typo
			}
		}
		else if(gender.equals("Transgender") || gender.equals("TRANSGENDER") || gender.equals("transgender"))
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
			System.out.println("You are not getting any discount");
		}
			
	
	}
}
