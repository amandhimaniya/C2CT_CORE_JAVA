package com.tnsif.practices;
/*
******
*    *
*    *
*    *
*    *
******
 */
import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
			int num;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the number !! ");
			num=sc.nextInt();
			for(int i=0;i<=num;i++) {
				for(int j=0;j<=num;j++) {
					if(i==0||j==0||i==num||j==num) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
					
					
				}
				System.out.print("\n");
			}

		}

}

