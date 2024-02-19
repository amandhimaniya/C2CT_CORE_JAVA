package com.tnsif.practices;

public class CompareObjects {

	public static void main(String[] args) {
		
		Double x = new Double(143.45755);  
		 
		Long y = new Long(93234);  
		
		
		System.out.println("Objects are not equal, " + x.equals(y));  
		System.out.println("Objects are equal, " + x.equals(143.45755));
		

	}

}
