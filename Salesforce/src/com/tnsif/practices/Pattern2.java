package com.tnsif.practices;
/*
1
22
333
4444
55555
 */
import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number !! ");
		num=sc.nextInt();
		for(int i=0;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
				
				
			}
			System.out.print("\n");
		}

	}

}
