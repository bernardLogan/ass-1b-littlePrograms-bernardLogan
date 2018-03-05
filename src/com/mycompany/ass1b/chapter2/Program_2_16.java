/**
 * 
 */
package com.mycompany.ass1b.chapter2;

import java.util.Scanner;

/**
 * @author berna
 *
 */
public class Program_2_16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: " );
		int num1 = input.nextInt();
		System.out.println("Enter second number: ");
		int num2 = input.nextInt();
		if(num1 > num2)
		{
			System.out.println(num1 + " is larger ");
		}
		else if (num2 > num1)
		{
			System.out.println(num2 + " is larger ");
		}
		else if(num1 == num2)
		{
			System.out.println("These numbers are equal");
		}
		
	}

}
