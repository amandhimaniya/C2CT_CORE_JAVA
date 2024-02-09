package com.tnsif.day11;

public class Array1D {

	public static void main(String[] args) {
		int[] arr1 = new int[5];
		byte[] arr2 = new byte[5];
		float[] arr3 = new float[5];
		double[] arr4 = new double[5];
		boolean[] arr5 = new boolean[5];
		
		
		System.out.println(arr1.getClass().getName()); // that function provide the object type 
		System.out.println(arr2.getClass().getName());
		System.out.println(arr3.getClass().getName());
		System.out.println(arr4.getClass().getName());
		System.out.println(arr5.getClass().getName());
		
		int[] arr6 = new int[]{5,6,7,8,9};
		System.out.println(arr6); // we cannot directly access the element of Array
		
		// we iterate the array by using indexing of array by access the element of array
		for(int i=arr6[0];i<=arr6[4];i++) 
		{	
			System.out.print(i+" ");
		}
		System.out.print("\n");
		// we  using index number of array by access the element of array
		System.out.println("The second elemnt of array is :- "+ arr6[1]);
		
		
		
		
		// second method of creating the array
		int[] arr7 = {1,2,3,4,5};
		for(int i=arr7[0];i<=arr7[4];i++) 
		{	
			System.out.print(i+" ");
		}
		
		

	}

}
