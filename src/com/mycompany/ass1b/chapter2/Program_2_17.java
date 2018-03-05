package com.mycompany.ass1b.chapter2;

import java.util.Scanner;

public class Program_2_17 {
	private static Scanner input = new Scanner(System.in);
	public static void main (String [] args)
	{
		largest();
		avg();
		smallest();
		
	}
	
	public static void smallest ()
	{
		
		int smallest = Integer.MAX_VALUE;
		for(int i = 0; i < 3; i++)
		{
			System.out.println("Enter number: " );
			 int number = input.nextInt();
			 if(number < smallest)
			 {
				 smallest = number;
			 }
			 
			 
		}
		System.out.println("Smallest number is: " + smallest);
		input.close();
		
	}
	
	public static void avg ()
	{
	
		int avg;
		System.out.println("Enter first number: " );
		int num1 = input.nextInt();
		System.out.println("Enter second number: ");
		int num2 = input.nextInt();
		System.out.println("Enter third number");
		int num3 = input.nextInt();
		avg = (num1 + num2 + num3) / 3;
		
		System.out.println("Avg: " + avg);
		
	}
	
	public static void largest ()
	{
		
		int largest = Integer.MIN_VALUE;
		for(int i = 0; i < 3; i++)
		{
			System.out.println("Enter number: " );
			 int number = input.nextInt();
			 if(number > largest)
			 {
				 largest = number;
			 }
			 
			 
		}
		System.out.println("Largest number is: " + largest);
	
	}

}
