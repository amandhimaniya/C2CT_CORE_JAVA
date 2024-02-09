package com.tnsif.day9;

public class StringHandeling {

	public static void main(String[] args) {
		// we have to method to create String
		// Method 1
		String name = "Aman kumar"; // Directly allocate in the string constant pool
		System.out.println(name);
		
		String name1 = new String("Ananya"); // Create in heap memory and copy in string constant pool
		System.out.println(name1);
		
		// In heap memory Duplicate object is allowed 
		// in string constant pool duplication is not allowed
		
		String s1 = "Aman Kumar";
		String s2 = "Aman Kumar";
		String s3 = new String("Aman Kumar");   // Here total 2 object are created one in Heap and other in String pool
		String s4 = new String("Aman Kumar");	// Here only oe variable is created only in heap bcz string pool not allowed Duplicate value
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		
		System.out.println(s1.getClass());
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		
		
		
		// there are some method of String.
		String s5 = new String("Tanya");
		String s6 = s5.concat(" Gupta");
		System.out.println(s5);   // it provide Tanya bcz string are immutable thatswhy we store it in another variable 
		System.out.println(s6);
		
		System.out.println(s5.hashCode());

	}

}



	