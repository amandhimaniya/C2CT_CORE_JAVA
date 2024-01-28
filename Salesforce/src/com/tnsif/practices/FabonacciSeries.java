package com.tnsif.practices;

public class FabonacciSeries {
	private int a=0;
	private int b=1;
	private int c;
	
	void Series(int n)
	{
		System.out.print("0 1 ");
		int i=2;
		while(n>i)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			i++;
		}
	}
	

}
