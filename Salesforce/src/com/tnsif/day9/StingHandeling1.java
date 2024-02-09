package com.tnsif.day9;

public class StingHandeling1 {

	public static void main(String[] args) {
		String s1 = new String("Aman");
		StringBuffer s2 = new StringBuffer("Tanya");
		
		// String are immutable
		s1.concat("Kumar");
		System.out.println(s1);
		
		//StringBuffer are Mutable
		s2.append("Gupta");
		System.out.println(s2);
		s2.delete(3, 6);
		System.out.println(s2);

	}

}
