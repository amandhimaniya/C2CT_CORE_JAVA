package com.tnsif.day6;

public class MethodOverloading {
	// Creating methods for addition
	int addition(int a,int b)  // When Both Values are integer
	{
		return a+b;
	}
	
	float addition(float a,float b)  // When Both values are float
	{
		return a+b;
	}
	
	float addition(float a,int b)  // When first is float and second is integer type
	{
		return a+b;
	}
	
	float addition(int a,float b)  // When first is integer type and second is float type
	{
		return a+b;
	}
	
	String addition(String a,String b)  // When Both are String type
	{
		return a+b;
	}
	
}
