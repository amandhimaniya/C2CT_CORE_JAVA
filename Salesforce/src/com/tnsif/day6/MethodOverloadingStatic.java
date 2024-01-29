package com.tnsif.day6;

public class MethodOverloadingStatic {
	public static int addition(int a,int b)  // When Both Values are integer
	{
		return a+b;
	}
	
	public static float addition(float a,float b)  // When Both values are float
	{
		return a+b;
	}
	
	public static float addition(float a,int b)  // When first is float and second is integer type
	{
		return a+b;
	}
	
	public static float addition(int a,float b)  // When first is integer type and second is float type
	{
		return a+b;
	}
	
	public static String addition(String a,String b)  // When Both are String type
	{
		return a+b;
	}

}
