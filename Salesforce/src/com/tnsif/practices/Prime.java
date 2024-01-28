package com.tnsif.practices;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int num;
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number !! ");
		num=sc.nextInt();
		
	for(int i=2;i<11;i++) {
		if(num%i==0) {
			System.out.println("The Number is Not Prime");
			break;
		}
		else {
			System.out.println("The Number is Prime");
			break;
		}
	}

	}

}
