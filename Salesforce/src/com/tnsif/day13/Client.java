package com.tnsif.day13;

public class Client {

	public static void main(String[] args) {
		StudentArray arr[]; // Array Deceleration 
		arr = new StudentArray[5]; // Array creation
		
		arr[0] = new StudentArray(101, "Aman Kumar");
		arr[1] = new StudentArray(102, "Mohit Dhimaniya");
		arr[2] = new StudentArray(103, "Tanya Gupta");
		arr[3] = new StudentArray(104, "Rudrakh");
		arr[4] = new StudentArray(105, "Tushar");
		
		
		for(int i =0;i<=arr.length;i++) {
		System.out.println("Student Details are :- "+arr[i].getRollNumber()+" "+arr[i].getStudentName());
		}

	}

}
