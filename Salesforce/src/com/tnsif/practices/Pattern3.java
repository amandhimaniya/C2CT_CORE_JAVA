package com.tnsif.practices;
/*
654321
65432
6543
654
65
6
 */
import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number !! ");
		num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=num;j>=i;j--) {
				System.out.print(j);
				
				
			}
			System.out.print("\n");
		}

	}

}
