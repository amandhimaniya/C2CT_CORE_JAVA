package com.tnsif.day10;

public class StringCompareDemo {
	/* 
	 String are compared by 3 methods
	 1. By comparison operator "=="  - its check references or address of string means belong to same object or not
	 2. By equals() method          - its check content of string and return true or false
	 3. By CompareTo() method 		 - its checks Unicode of string and return positive negative or zero
	 */
	public static void main(String[] args) {
		String s1 = new String("Aman");
		String s2 = new String("Aman");
		String s3 = new String("Aman");
		String s4 = new String("Aman");
		String s5 = "Tanya";
		String s6 = "Tanya";
		
		
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1==s2);
		System.out.println(s1==s3); 
		System.out.println(s5==s6); 
		System.out.println(s1.equals(s2)); 
		System.out.println(s1.compareTo(s2)); 
		System.out.println(s4.subSequence(2, 3)); // Include starting index but not include ending index values
	}

}
