package com.mycompany.ass1b.chapter5;


public class Program_5_13_BreakTest {
	
	 public static void main(String[] args)
	 {
	
	 int count; // control variable also used after loop terminates
	
	 for (count = 1; count <= 10; count++) // loop 10 times
	 {
	 if (count == 5)
	
	
	 System.out.printf("%d ", count);
	 }
	
	 System.out.printf("%nBroke out of loop at count = %d%n", count);
	 }
	 } // end class BreakTest

