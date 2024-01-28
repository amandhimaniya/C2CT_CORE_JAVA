package com.tnsif.practices;
/*
1
01
101
0101
10101
 */

import java.util.Scanner;

public class Patttern4 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number !! ");
		num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				if((i+j)%2==0) {
					System.out.print(1);
				}
				else {
					System.out.print(0);
				}
				
				
			}
			System.out.print("\n");
		}

	}

}
