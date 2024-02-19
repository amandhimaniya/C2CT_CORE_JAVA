package com.tnsif.day14;

public class FinalKeywordDemo {
	public static void main(String[] args) {
		
// Final keyword are use in Variables , class , methods.
		// Variables - if we use final at variables then JVM considered that variables as constant.
		// Class - if we use final at class , we cannot perform inheritance or extend the class
		// Method - if we use final at method it means that we cannot override that method
		
		// FOR VARIABLES
		
		int num = 15;
		num = 18;
		
		final int num1 = 45;
//		num1 = 43;				// it pop error bcz it consider num1 as constant values
		
		
		
		// FOR CLASS
		
		class Parents{
			void property(){
				System.out.println("Plots , cash , Gold ");
			}
		}
		
		class Child extends Parents{
			void property() {
				
			}
			
		}
		
		
		
		final class Parents1{
			void properties(){
				System.out.println("Plots , cash , Gold ");
			}
		}
		
//		class Child1 extends Parents1{  // it pops error
	//		void properties() {
				
	//		}
			
	//	}
		
		// Methods
		
		
		class Parents2{
			void property(){
				System.out.println("Plots , cash , Gold ");
			}
			
			final void marry() {
				System.out.println("Marry with siya");
			}
		}
		
		class aman extends Parents2{
	//		void marry() {									// it pop up error because we cannot override that method
	//			System.out.println("Marry with Tanu");
	//		}
			
		}
		
	}

}
