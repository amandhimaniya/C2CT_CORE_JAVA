package com.tnsif.practices;

import java.util.Scanner;

public class FabonacciSeriesExecutor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of terms in Fabonacci Series:- ");
		int n = sc.nextInt();
		FabonacciSeries fs = new FabonacciSeries();
		fs.Series(n);

	}

}
